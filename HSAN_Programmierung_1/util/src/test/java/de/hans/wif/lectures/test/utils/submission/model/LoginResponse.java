package de.hans.wif.lectures.test.utils.submission.model;

import lombok.Data;

@Data
public class LoginResponse {
    private String jwt;
    private User user;
}
