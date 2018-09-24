package ua.am.mr.mram.model.login;

public class GlobalToken {

    private static String token;

    public static String getToken() {
        return token;
    }

    public static void setToken(String token) {
        GlobalToken.token = token;
    }
}
