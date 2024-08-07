package de.hans.wif.lectures.test.utils.submission.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubmissionResponse {
    private int id;

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
    private User user;
}
