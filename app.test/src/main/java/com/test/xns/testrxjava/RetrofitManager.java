package com.test.xns.testrxjava;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Retrofit的控制类
 */

public class RetrofitManager {

    private RetrofitManager() {

    }

    public static RetrofitManager getInstance() {
        return HolderClass.instance;
    }

    public Retrofit create() {
        return HolderClass.mRetrofit;
    }

    private static class HolderClass {
        private static final RetrofitManager instance = new RetrofitManager();
        private static final Retrofit mRetrofit = new Retrofit.Builder().baseUrl("http://10.0.2.2:8080/Servlet/")
                .client(provideOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        private static OkHttpClient provideOkHttpClient() {
            OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
            builder.readTimeout(10, TimeUnit.SECONDS);
            builder.connectTimeout(9,TimeUnit.SECONDS);

            if (BuildConfig.DEBUG) {
                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                builder.addInterceptor(interceptor);
            }

            return builder.build();
        }
    }
}
