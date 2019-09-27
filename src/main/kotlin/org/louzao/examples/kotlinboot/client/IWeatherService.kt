package org.louzao.examples.kotlinboot.client;

import org.louzao.examples.kotlinboot.client.dto.Weather;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET;

interface IWeatherService {

    @GET("api/location/44418/2013/4/27/")
    fun getWeatherFromLondon(): Call<Array<Weather>>;

}
