package de.hans.wif.lectures.test.utils;

import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import lombok.Getter;
import org.benf.cfr.reader.api.CfrDriver;
import org.benf.cfr.reader.api.OutputSinkFactory;


import java.net.URL;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class DecompilerBasedBaseTest extends AbstractBaseTest {

    public DecompilerBasedBaseTest() {}

    public DecompilerBasedBaseTest(Class<?> classToBeTested) {
        org.junit.jupiter.api.Assertions.assertNotNull(classToBeTested, "Internal error: class to be tested may not be null!");
        //Assert.assertNotNull("Internal error: class to be tested may not be null!", classToBeTested);
        this.theClazz = classToBeTested;
    }

    @Getter
    private Class<?> theClazz;

    protected DecompilerBasedBaseTest setTheClazz(Class<?> theClazz) {
        this.theClazz = theClazz;
        return this;
    }

    public String getMethodBody(final String method) {
        Map<String, String> options = Maps.newHashMap();
        options.put("methodname", method);

        final StringBuilder sbResult = new StringBuilder();

        OutputSinkFactory outputSinkFactory = new OutputSinkFactory() {
            @Override
            public List<SinkClass> getSupportedSinks(SinkType sinkType, Collection<SinkClass> available) {
                return Collections.singletonList(SinkClass.STRING);
            }

            @Override
            public <T> Sink<T> getSink(SinkType sinkType, SinkClass sinkClass) {
                return SinkType.JAVA.equals(sinkType) ? sbResult::append : ignore -> {};
            }
        };

        CfrDriver cfrDriver = new CfrDriver.Builder()
                    .withOutputSink(outputSinkFactory)
                    .withOptions(options)
                    .build();

        URL resourceUrl = getTheClazz().getResource("/" + getTheClazz().getCanonicalName().replace(".", "/") + ".class");
        String classFile = URLDecoder.decode(resourceUrl.toString().replace("file:", ""), Charsets.UTF_8);

        cfrDriver.analyse(Collections.singletonList(
                classFile
        ));

        return sbResult.toString();
    }
}
