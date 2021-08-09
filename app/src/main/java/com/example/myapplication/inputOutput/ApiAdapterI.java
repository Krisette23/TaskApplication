package com.example.myapplication.inputOutput.inputOutput;
import com.example.myapplication.Models.Assignment;

import java.util.List;

import com.example.myapplication.Models.Task;
import com.example.myapplication.Models.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiAdapterI {

    @GET("assignments")
    Call<List<Assignment>> getAssignments();

    @GET ("assignments/{id}/tasks")
    Call<List<Task>> getTaskId(@Path("id") int TaskId);

    @GET ("assignments/{id}/users")
    Call<List<User>> getUserId(@Path("id") int UserId);





}
