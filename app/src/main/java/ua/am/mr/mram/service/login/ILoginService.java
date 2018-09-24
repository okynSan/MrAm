package ua.am.mr.mram.service.login;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ua.am.mr.mram.model.login.LoginResponse;
import ua.am.mr.mram.service.BaseService;

public interface ILoginService {

    @POST("/business-app/api/couriers/account/sign-in")
    Call<LoginResponse> getRegisterToken(@Query("username") String userName,
                                         @Query("password") String password);

    @POST("/business-app/api/couriers/app?v=1&type=ios&deviceId=test")
    Call<List<String>> getTestCall();

}
