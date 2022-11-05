package com.example.spinner;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    public static String BASE_URL="https://cricket.sportmonks.com/api/v2.0/";

   public static RetrofitInstance instance;
   RetrofitInterface apiInterface;

    RetrofitInstance(){
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        apiInterface= retrofit.create(RetrofitInterface.class);
    }


    public static RetrofitInstance getInstance(){
          if (instance==null){
              instance= new RetrofitInstance();
          }
          return instance;
    }


}
