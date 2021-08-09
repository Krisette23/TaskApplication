package inputOutput;

public class ApiAdapter {

    private static ApiAdapter API_SERVICE;

    public static ApiAdapter getApiService() {


        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);


        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        String baseUrl = "https://localhost:44364/api/assignments";

        if (API_SERVICE == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();
            API_SERVICE = retrofit.create(ApiAdapter.class);
        }

        return API_SERVICE;
    }


}
