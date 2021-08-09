package Models;

public class Task {

    private final int TaskId;
    private final String Title;
    private final String Requirements;
    private final DateTime BeginDateTime;
    private final DateTime DeadlineDateTime;

    public Task (int TaskId, String Title, String Requirements, DateTime BeginDateTime, DateTime DeadlineDateTime){
        this.TaskId = TaskId;
        this.Title= Title;
        this.Requirements = Requirements;
        this.BeginDateTime = BeginDateTime;
        this.DeadlineDateTime = DeadlineDateTime;
    }

    piblic int getTaskId(){
        return TaskId;
    }

    public String getTitle() {
        return Title;
    }

    public String getRequirements() {
        return Requirements;
    }

    public DateTime getBeginDateTime() {
        return BeginDateTime;
    }

    public DateTime getDeadlineDateTime() {
        return DeadlineDateTime;
    }
}
