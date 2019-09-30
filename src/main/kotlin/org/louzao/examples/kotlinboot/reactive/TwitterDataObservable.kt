package org.louzao.examples.kotlinboot.reactive;

import io.reactivex.Observer
import io.reactivex.subjects.PublishSubject

/**
 * Obversable that contains data of tweets
 */
object TwitterDataObservable {


    private var onAdd: PublishSubject<String> = PublishSubject.create()


    fun addTweetToObservable(tweet: String) {
        this.onAdd.onNext(tweet)
    }


    // Subscribe to observable
    fun subscribe(observer: Observer<String>) {
        this.onAdd
            .subscribe(observer)
    }

}