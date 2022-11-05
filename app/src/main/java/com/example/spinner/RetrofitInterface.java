package com.example.spinner;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("continents")
    Call<MainDataClass> getData(@Query("api_token") String token);

}
