package Lesson6;

import okhttp3.*;

import java.io.*;

public class Main2 {

    public static void main(String[] args) throws IOException{
        OkHttpClient client = new OkHttpClient();

        // Сегментированное построение URL
        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment("295212")
                .addQueryParameter("apikey", "SXTJ0oh6bCHzpIetBHIAJAHTY9LHrQbF")
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "false")
                .build();

        System.out.println(url.toString());

        Request requesthttp = new Request.Builder()
                .url(url)
                .build();

        String jsonResponse = client.newCall(requesthttp).execute().body().string();
        System.out.println(jsonResponse);
    }
}
