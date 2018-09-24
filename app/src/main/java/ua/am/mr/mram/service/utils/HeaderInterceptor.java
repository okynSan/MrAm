package ua.am.mr.mram.service.utils;


import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import ua.am.mr.mram.model.login.GlobalToken;


public class HeaderInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain)
            throws IOException {
        Request request = chain.request();
        request = request.newBuilder()
                .addHeader("App-Auth-Token", GlobalToken.getToken() == null ? "" : GlobalToken.getToken())
                .build();
        Response response = chain.proceed(request);
        return response;
    }
}