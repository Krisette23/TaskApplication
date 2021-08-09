package Models;

public class Assignment {
    public final int TaskId;
    public final int UserId;
    public final Task task;
    public Assignment(int TaskId, int UserId, Task task){
        this.task = task;
        this.TaskId = TaskId;
        this.UserId = UserId;
    }

    public int getTaskId() {
        return TaskId;
    }

    public int getUserId() {
        return UserId;
    }
}
