package de.hans.wif.lectures.test.utils.submission.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UploadResponse {
    private int id;
    private String name;
    private String hash;
}
