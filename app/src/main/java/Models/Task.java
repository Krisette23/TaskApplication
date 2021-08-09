package Models;

import java.util.Date;

public class Task {

    private final int TaskId;
    private final String Title;
    private final String Requirements;
    private final Date BeginDateTime;
    private final Date DeadlineDateTime;

    public Task (int TaskId, String Title, String Requirements, Date BeginDateTime, Date DeadlineDateTime){
        this.TaskId = TaskId;
        this.Title= Title;
        this.Requirements = Requirements;
        this.BeginDateTime = BeginDateTime;
        this.DeadlineDateTime = DeadlineDateTime;
    }

    public int getTaskId(){
        return TaskId;
    }

    public String getTitle() {
        return Title;
    }

    public String getRequirements() {
        return Requirements;
    }

    public Date getBeginDateTime() {
        return BeginDateTime;
    }

    public Date getDeadlineDateTime() {
        return DeadlineDateTime;
    }
}
