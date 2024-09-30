package de.hans.wif.lectures.test.utils;




import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestCase {


    public Map<String, TestCase> getTestSteps() {
        return steps;
    }

    public void setTestSteps(Map<String, TestCase> testSteps) {
        this.steps = testSteps;
    }


    private Map<String, TestCase> steps = new LinkedHashMap<String, TestCase>();
    private String id;
    private String name;

    private String parentTestCaseId;
    private Status status;

    public Map<String, TestCase> getSteps() {
        return steps;
    }

    public void setSteps(Map<String, TestCase> steps) {
        this.steps = steps;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    private Duration duration;

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
        String throwableAsString = this.throwableAsString(throwable);
        this.error = throwableAsString;
    }

    private Throwable throwable;


    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setThrowableAsString(Throwable throwable) {
        String throwableAsString = this.throwableAsString(throwable);
        this.error = throwableAsString;
    }

    private String throwableAsString(Throwable throwable){
            String result = null;
            if(throwable == null){
                return result;
            }

            Throwable e = throwable;
            String trace = e.toString() + "\n";
            for (StackTraceElement e1 : e.getStackTrace()) {
                trace += "\t at " + e1.toString() + "\n";
            }
            while (e.getCause() != null) {
                e = e.getCause();
                trace += "Cause by: " + e.toString() + "\n";
                for (StackTraceElement e1 : e.getStackTrace()) {
                    trace += "\t at " + e1.toString() + "\n";
                }
            }
            return trace;

    }

    public TestCase() {
    }

    public String getParentTestCaseId() {
        return parentTestCaseId;
    }

    public void setParentTestCaseId(String parentTestCaseId) {
        this.parentTestCaseId = parentTestCaseId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }



    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String keyword;
    private String type;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void add(TestCase testCase) {

        steps.put(testCase.getId(), testCase);
        if(testCase.getStatus()!= Status.PASSED){
            this.setStatus(testCase.getStatus());

        }
    }
}
