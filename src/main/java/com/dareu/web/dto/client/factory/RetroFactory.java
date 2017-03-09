package com.dareu.web.dto.client.factory;

import com.dareu.web.dto.client.AccountClientService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class RetroFactory {

    private static Retrofit retrofitInstance;
    private static BaseUrl currentBaseUrl = BaseUrl.SERVER;

    public static Retrofit getInstance() {
        if (retrofitInstance == null) {
            OkHttpClient client = new OkHttpClient() {
                @Override
                public int readTimeoutMillis() {
                    return 300000; // 5 minutes 
                }

                @Override
                public int writeTimeoutMillis() {
                    return 300000; // 5 minutes
                }

                @Override
                public int connectTimeoutMillis() {
                    return 120000; // 2 minutes
                }
            };

            retrofitInstance = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(currentBaseUrl.value)
                    .client(client)
                    .build();
        }
        return retrofitInstance;
    }

    public static Retrofit getInstance(BaseUrl baseUrl) {
        currentBaseUrl = baseUrl;
        if (retrofitInstance == null) {
            OkHttpClient client = new OkHttpClient();

            retrofitInstance = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(baseUrl.value)
                    .client(client)
                    .build();
        }
        return retrofitInstance;
    }

    public static enum BaseUrl {

        DEBUG_SERVER("http://localhost:8080/dareu-services/rest/"), //change this
        SERVER("http://albertoruvel.com/dareu-services/rest/");

        String value;

        BaseUrl(String value) {
            this.value = value;
        }
    }
}
