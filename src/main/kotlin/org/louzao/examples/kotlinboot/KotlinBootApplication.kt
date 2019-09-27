package org.louzao.examples.kotlinboot

import org.louzao.examples.kotlinboot.client.RestClient
import org.louzao.examples.kotlinboot.client.WeatherRestClient
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBootApplication

fun main(args: Array<String>) {
	runApplication<KotlinBootApplication>(*args){
		setBannerMode(Banner.Mode.OFF);


		WeatherRestClient().callWeatherApi();
	}
}
