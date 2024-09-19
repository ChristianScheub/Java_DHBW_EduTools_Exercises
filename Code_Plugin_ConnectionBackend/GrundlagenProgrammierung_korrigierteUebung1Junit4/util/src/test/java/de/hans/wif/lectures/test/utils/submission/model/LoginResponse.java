package de.hans.wif.lectures.test.utils.submission.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
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
    private Long userId;
    private List<String> roles;


}
