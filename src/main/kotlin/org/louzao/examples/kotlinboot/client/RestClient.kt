package org.louzao.examples.kotlinboot.client


import org.louzao.examples.kotlinboot.client.dto.Weather;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.Arrays;


// When define an attribute with private val on consutrctor, this fields is stored as a private attribute
abstract class RestClient(private  val baseUrl: String)  {


    protected var retrofitInstance: Retrofit ? = null;

    init {
        this.retrofitInstance = Retrofit.Builder()
                .baseUrl(this.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }



/*
    fun callWeatherApi() {

        val requestClient = retrofit.create(IWeatherService.class);

        requestClient.getWeatherFromLondon().enqueue(new Callback<Weather[]>() {
            @Override
            public void onResponse(Call<Weather[]> call, Response<Weather[]> response) {
                System.out.println(response);
                System.out.println(response.body());
                Weather[] result = response.body();
                Arrays.stream(result)
                        .forEach(wea -> {
                            System.out.println("[Date: "+ wea.getCreated() + "] " + wea.getWeather_state_name());
                        });
            }


            @Override
            public void onFailure(Call<Weather[]> call, Throwable t) {
                System.out.println("FALLAO!");
                System.out.println(call);
                System.out.println(t.getMessage());
            }
        });
    }
*/

}
