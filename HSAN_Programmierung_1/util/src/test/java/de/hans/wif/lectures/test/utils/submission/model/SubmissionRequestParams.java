package de.hans.wif.lectures.test.utils.submission.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SubmissionRequestParams {

    @JsonProperty("machineHash")
    private String machineHash;

    @JsonProperty("solutionHash")
    private String solutionHash;

    @JsonProperty("testIdentifier")
    private String testIdentifier;

    @JsonProperty("testDetailIdentifier")
    private String testDetailIdentifier;

    @JsonProperty("testPassed")
    private boolean testPassed;

    @JsonProperty("user")
    private int user;

    @JsonProperty("course")
    private int course;
}
