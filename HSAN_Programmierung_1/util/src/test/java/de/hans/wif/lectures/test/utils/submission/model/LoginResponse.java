package de.hans.wif.lectures.test.utils.submission.model;

import lombok.Data;

import java.util.List;


@Data
public class LoginResponse {
    private int statusCode;
    private String message;
    private String accessToken;
    private String refreshToken;
    private Long loginTime;
    private Long expirationDuration;
    private String userEmail;
    private String firstName;
    private String lastName;
    private List<String> roles;

}
