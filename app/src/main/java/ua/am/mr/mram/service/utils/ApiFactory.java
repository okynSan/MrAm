package ua.am.mr.mram.service.utils;

import android.support.annotation.NonNull;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ua.am.mr.mram.service.login.ILoginService;
import ua.am.mr.mram.service.order.IOrderService;

public class ApiFactory {

    private static Retrofit retrofit;
    private static HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();


    private static final OkHttpClient CLIENT = new OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .readTimeout(28, TimeUnit.SECONDS)
            .addNetworkInterceptor(new HeaderInterceptor())
            .addInterceptor(httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY))
            .build();


    @NonNull
    public static ILoginService getLoginService() {
        return getRetrofit().create(ILoginService.class);
    }

    @NonNull
    public static IOrderService getOrderService() {
        return getRetrofit().create(IOrderService.class);
    }

    @NonNull
    private static Retrofit getRetrofit() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://test.mister.am") //Базовая часть адреса
                .client(CLIENT)
                .addConverterFactory(GsonConverterFactory.create(gson)) //Конвертер, необходимый для преобразования JSON'а в объекты
                .build();

        return retrofit;
    }


}
