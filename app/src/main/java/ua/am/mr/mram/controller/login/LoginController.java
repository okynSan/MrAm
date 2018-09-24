package ua.am.mr.mram.controller.login;

import java.io.IOException;

import retrofit2.Call;
import ua.am.mr.mram.model.login.GlobalToken;
import ua.am.mr.mram.model.login.LoginResponse;
import ua.am.mr.mram.service.login.ILoginService;
import ua.am.mr.mram.service.utils.ApiFactory;

public class LoginController implements ILoginController {

    public Boolean isLogedIn(String username, String password) {
        ILoginService iLoginService = ApiFactory.getLoginService();

        Call<LoginResponse> t = iLoginService.getRegisterToken(username, password);

        try {
            LoginResponse s = t.execute().body();
            if (s != null && s.getAuthToken() != null) {
                GlobalToken.setToken(s.getAuthToken());
            }
        } catch (IOException e) {
            return false;
        }

        return GlobalToken.getToken() == null ? false : true;

    }

}
