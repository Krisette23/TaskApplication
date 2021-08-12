package com.example.myapplication.Models;

import java.util.Date;
import java.util.List;

public class Task {

    private  int TaskId;
    private  String BeginDateTime;
    private  String DeadlineDateTime;
    private  String Title;
    private  String Requirements;
    private List<Assignment> Assignment;



    public int getTaskId(){
        return TaskId;
    }
    public String getBeginDateTime() {
        return BeginDateTime;
    }

    public String getDeadlineDateTime() {
        return DeadlineDateTime;
    }

    public String getTitle() {
        return Title;
    }

    public String getRequirements() {
        return Requirements;
    }

    public List<Assignment> getAssignment() {
        return Assignment;
    }
}
