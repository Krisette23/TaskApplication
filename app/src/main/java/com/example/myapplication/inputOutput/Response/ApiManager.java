package com.example.myapplication.inputOutput.Response;
import java.util.List;

/*import com.example.myapplication.Models.Assignment;*/
import com.example.myapplication.Models.Task;
/*import com.example.myapplication.Models.User;*/

import com.example.myapplication.inputOutput.inputOutput.ApiAdapterI;
import com.example.myapplication.inputOutput.RetrofitService;
import retrofit2.Call;
import retrofit2.Callback;

/* Bind RESTFUL - Retrofit */

public class ApiManager {

    private static ApiAdapterI service;
    private static ApiManager apiManager;

    private ApiManager() {
        service = RetrofitService.Create();
    }
    public static ApiManager getInstance() {
        if (apiManager == null) {
            apiManager = new ApiManager();
        }
        return apiManager;
    }
        public void getTask ( int id, Callback<List<Task>>callback){
            Call<List<Task>> getTaskCall = service.getTaskId(id); /* or int id?*/
        }


    }
