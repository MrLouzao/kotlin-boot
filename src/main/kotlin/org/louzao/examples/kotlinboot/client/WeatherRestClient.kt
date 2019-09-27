package org.louzao.examples.kotlinboot.client

import org.louzao.examples.kotlinboot.client.dto.Weather
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.NullPointerException


class WeatherRestClient: RestClient(BASE_URL) {

    
    companion object {
        const val BASE_URL = "https://www.metaweather.com"
    }


    fun callWeatherApi() {
        val weatherOperationsClient: IWeatherService? = this.retrofitInstance?.create(IWeatherService::class.java)

        if(weatherOperationsClient != null) {
            val responseCallback: Callback<Array<Weather>> = this.createCallback()

            weatherOperationsClient
                    .getWeatherFromLondon()
                    .enqueue(responseCallback)
        }else {
            throw NullPointerException("Cant execute weather operations due to instance of service is null")
        }
    }


    private fun createCallback(): Callback<Array<Weather>> {
        // Callback interface implementation to handle the response
        return object : Callback<Array<Weather>> {
            override fun onResponse(call: Call< Array<Weather>>, response: Response<Array<Weather>>){
                val weatherResponse: Array<Weather>? = response.body()
                weatherResponse?.forEach { item -> println("[${item.created}] -> ${item.weather_state_name}") }
            }
            override fun onFailure(call: Call< Array<Weather>>, t: Throwable){
                println("Error while calling to weather api")
                println(t.message)
            }
        }
    }


}
