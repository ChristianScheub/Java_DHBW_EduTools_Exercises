package de.hans.wif.lectures.test.utils.submission.model;

import lombok.Data;

@Data
public class LoginRequestParams {
    private String identifier;
    private String password;
}
