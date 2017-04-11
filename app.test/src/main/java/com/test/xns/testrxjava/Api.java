package com.test.xns.testrxjava;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * 网络访问接口
 */

public interface Api {

    @GET("login")
    Observable<Result> login(@Query("m_user_name") String username, @Query("m_user_password") String password);

    @FormUrlEncoded
    @POST("register")
    Observable<Result> register(@Field("m_user_name") String username,@Field("m_user_password") String password);
}
