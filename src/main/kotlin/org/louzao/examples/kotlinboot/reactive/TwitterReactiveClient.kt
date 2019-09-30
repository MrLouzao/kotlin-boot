package org.louzao.examples.kotlinboot.reactive

import java.util.*
import kotlin.concurrent.schedule


class TwitterReactiveClient(private val observable: TwitterDataObservable) {

    // TODO: call here the streaming API from Twitter


    fun runClient(termToListen: String) {
        // Create a scheduled task to repeat every second
        Timer("Timer trial", false).schedule(0, 1000){
            val timeInMillis = System.currentTimeMillis();
            observable.addTweetToObservable("Now is: $timeInMillis")
        }

    }



}