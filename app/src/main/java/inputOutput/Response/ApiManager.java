package inputOutput.Response;
import java.util.List;

/*import Models.Assignment;*/
import Models.Task;
/*import Models.User;*/

import inputOutput.ApiAdapterI;
import inputOutput.RetrofitService;
import retrofit2.Call;
import retrofit2.Callback;

/* Bind RESTFUL - Retrofit */

public class ApiManager {

    private static ApiAdapterI service;
    private static ApiManager apiManager;

    private ApiManager (){

        service = RetrofitService.Create();
    }

    public static ApiManager getInstance() {
        if (apiManager == null) {
            apiManager = new ApiManager();
        }
        return apiManager;
    }
        private void getTask ( int id, Callback<List<Task>>callback){
            Call<List<Task>> getTaskCall = service.getTaskId(id); /* or int id?*/
        }


    }
