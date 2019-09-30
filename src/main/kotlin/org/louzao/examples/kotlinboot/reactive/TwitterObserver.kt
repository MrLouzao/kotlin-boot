package org.louzao.examples.kotlinboot.reactive

import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * Observer to process tweets when listening
 */
class TwitterObserver:Observer<String> {


    override fun onComplete() {
        println("[OBSERVER] Finished!!!")
    }

    override fun onSubscribe(p0: Disposable) {
        println("[OBSERVER] Subscribed to flow...")
    }

    override fun onNext(p0: String) {
        println("[OBSERVER] Recibido: $p0")
    }

    override fun onError(p0: Throwable) {
        println("[OBSERVER] Something went wrong")
    }


}