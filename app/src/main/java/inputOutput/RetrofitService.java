package inputOutput;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitService {

    public static ApiAdapterI Create (){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl()
                .addConverterFactory(GsonConverterFactory.Create())
                .build();
            return retrofit.create(ApiAdapterI.class);


    }


}
