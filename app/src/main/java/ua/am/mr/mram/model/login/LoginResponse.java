package ua.am.mr.mram.model.login;

public class LoginResponse {
    private String authToken;

    public LoginResponse(String authToken) {
        this.authToken = authToken;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
