package testing;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

public class UniGraderTestResultExtension implements TestWatcher, AfterAllCallback
{

	private static final Logger LOG = LoggerFactory.getLogger(UniGraderTestResultExtension.class);

	private List<Status> testResultsStatus = new ArrayList<>();
	private List<TestCase> testCases = new ArrayList<>();

	@Override
	public void testDisabled(final ExtensionContext context, final Optional<String> reason)
	{
		LOG.info("Test Disabled for test {}: with reason :- {}", context.getDisplayName(), reason.orElse("No reason"));

		testResultsStatus.add(Status.DISABLED);
	}

	@Override
	public void testSuccessful(final ExtensionContext context)
	{
		String displayName = context.getDisplayName();
		String id = context.getUniqueId();
		System.out.println("displayName =" + displayName);
		System.out.println("Id =" + id);
		TestCase testCase = new TestCase();
		testCase.setId(context.getUniqueId());
		testCase.setName(displayName);
		testCase.setStatus(Status.PASSED);
		testCases.add(testCase);
		LOG.info("Test Successful for test {}: ", context.getDisplayName());
		testResultsStatus.add(Status.PASSED);
	}

	@Override
	public void testAborted(final ExtensionContext context, final Throwable cause)
	{
		LOG.info("Test Aborted for test {}: ", context.getDisplayName());

		testResultsStatus.add(Status.ABORTED);
	}

	@Override
	public void testFailed(final ExtensionContext context, final Throwable cause)
	{
		LOG.info("Test Failed for test {}: ", context.getDisplayName());

		testResultsStatus.add(Status.FAILED);
		TestCase testCase = new TestCase();
		testCase.setId(context.getUniqueId());
		testCase.setName(context.getDisplayName());

		testCase.setThrowableAsString(cause);
		testCase.setStatus(Status.FAILED);
		testCases.add(testCase);
	}

	@Override
	public void afterAll(final ExtensionContext context) throws Exception
	{
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		ObjectMapper mapper = JsonMapper.builder() // or different mapper for other format
		        .addModule(new ParameterNamesModule()).addModule(new Jdk8Module()).addModule(new JavaTimeModule())
		        .build();
		try
		{
			mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
			String jsonStr = mapper.writeValueAsString(testCases);

			Path path = Paths.get("target", "unitTest-report.json");
			Files.write(path, jsonStr.getBytes());
			mapper.readValue(jsonStr, new TypeReference<List<TestCase>>()
			{
			});
			LOG.info("unit tests fertig!");

		}
		catch (JsonProcessingException e)
		{
			throw new RuntimeException(e);
		}

		Map<Status, Long> summary = testResultsStatus.stream()
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		LOG.info("Test result summary for {} {}", context.getDisplayName(), summary.toString());
	}

}