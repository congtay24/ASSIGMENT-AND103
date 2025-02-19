package com.example.java_story_bk.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    private static Retrofit retrofit;
    public  static Retrofit getInstance () {
        if(retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl("http://172.20.10.6:5000/")
                    .addConverterFactory(
                    GsonConverterFactory.create()
            ).build();
        }
        return  retrofit;
    }
}
