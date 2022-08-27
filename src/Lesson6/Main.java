package Lesson6;

import okhttp3.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/294021?apikey=SXTJ0oh6bCHzpIetBHIAJAHTY9LHrQbF&language=ru-ru")
                .build();

        Response response = client.newCall(request).execute();

        String body = response.body().string();
        System.out.println(body);
    }
}