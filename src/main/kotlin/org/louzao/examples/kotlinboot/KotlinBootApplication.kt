package org.louzao.examples.kotlinboot

import org.louzao.examples.kotlinboot.client.RestClient
import org.louzao.examples.kotlinboot.client.WeatherRestClient
import org.louzao.examples.kotlinboot.reactive.TwitterDataObservable
import org.louzao.examples.kotlinboot.reactive.TwitterObserver
import org.louzao.examples.kotlinboot.reactive.TwitterReactiveClient
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBootApplication

fun main(args: Array<String>) {
	runApplication<KotlinBootApplication>(*args){
		setBannerMode(Banner.Mode.OFF);

		// Test the client to weather api
		//WeatherRestClient().callWeatherApi();


		// Create a subscriber to data
		val observer = TwitterObserver()
		TwitterDataObservable.subscribe(observer)

		val twitterReactiveClient = TwitterReactiveClient(TwitterDataObservable)
		twitterReactiveClient.runClient("Prueba");
	}
}
