package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import inputOutput.ApiAdapter;
import inputOutput.ApiAdapterI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Call<List<Assignments>> call = ApiAdapter.getApiService().getAssignments();
       call.enqueue();

    }
}