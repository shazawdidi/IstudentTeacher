package com.tztechs.teacher.NetWork;

import com.tztechs.teacher.Models.BaseResponce;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface NetworkApis {
    @FormUrlEncoded
    @POST("login")
    Call<BaseResponce> requsteOtp(
            @Field("phone") String phone
    );
}
