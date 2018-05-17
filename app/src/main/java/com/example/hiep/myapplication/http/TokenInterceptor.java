package com.example.hiep.myapplication.http;

import android.support.annotation.NonNull;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

class TokenInterceptor implements Interceptor {

    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        String accessToken = "";
        Request newRequest = chain.request().newBuilder()
                .header("Authorization", "Authorization")
                .header("X-Access-Token", accessToken)
                .build();

        return chain.proceed(newRequest);
    }
}