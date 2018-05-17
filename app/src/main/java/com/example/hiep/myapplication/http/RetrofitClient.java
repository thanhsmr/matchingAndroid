package com.example.hiep.myapplication.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Authenticator;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitClient {
    private static Retrofit retrofit = null;
    private static OkHttpClient okClient;

    public static Retrofit getInstance() {
        if (retrofit == null) {
            TokenInterceptor tokenInterceptor = new TokenInterceptor();
            Dispatcher dispatcher = new Dispatcher();
            dispatcher.setMaxRequests(1);

            okClient = new OkHttpClient.Builder().connectTimeout(10/*Constants.CONNECT_TIMEOUT*/,
                            TimeUnit.SECONDS)
                            .readTimeout(10, TimeUnit.SECONDS)
                            .writeTimeout(10, TimeUnit.SECONDS)
                            .authenticator(new Authenticator() {
                                @Override
                                public Request authenticate(Route route, Response response) throws IOException {
                                    return null;
                                }
                            })
                            .addInterceptor(tokenInterceptor)
                            .dispatcher(dispatcher)
                            .build();
            Gson gson = new GsonBuilder().create();
            retrofit = new Retrofit.Builder().baseUrl("Base URL")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(okClient)
                    .build();
        }
        return retrofit;
    }
}
