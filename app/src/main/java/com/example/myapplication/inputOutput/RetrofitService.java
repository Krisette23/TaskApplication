package com.example.myapplication.inputOutput;

import com.example.myapplication.inputOutput.ApiAdapterI;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class RetrofitService {

    public static ApiAdapterI Create (){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( "http://155.4.128.206")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
            return retrofit.create(ApiAdapterI.class);
    }


}
