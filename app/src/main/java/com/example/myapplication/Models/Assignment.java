package com.example.myapplication.Models;

public class Assignment {
    private  int TaskId;
    private int UserId;
    private User user;
    private  Task task;


    public int getTaskId() {
        return TaskId;
    }

    public int getUserId() {
        return UserId;
    }

    public User getUser() {
        return user;
    }
    public Task getTask() {
        return task;
    }
}
