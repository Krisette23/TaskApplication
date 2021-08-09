package inputOutput;
import Models.Assignment;
import java.util.ArrayList;
import java.util.List;

import Models.Task;
import Models.User;
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
