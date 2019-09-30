package org.louzao.examples.kotlinboot;

import io.reactivex.Observable
import io.reactivex.rxkotlin.toCompletable
import io.reactivex.rxkotlin.toFlowable
import io.reactivex.rxkotlin.toObservable
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class RxKotlinTest {

    @Test
    fun `Observable instance ok`(){
        val observable = listOf(1,1,2,2,3).toObservable();
        observable.test().assertValues(1,1,2,2,3);
    }


    @Test
    fun `⛓️⛓️⛓️🐶⛓️🐶😀 🐶🐶Flowable instance ok`(){
        val flowable = listOf(1,1,2,2,3).toFlowable();
        flowable.test().assertValues(1,1,2,2,3);
    }


    @Test
    fun `⚡ Check completable instance ok` () {
        var value = 0
        val completable = {value = 3}.toCompletable()
        Assertions.assertFalse(completable.test().isCancelled())
        Assertions.assertEquals(3, value)
    }


    @Test
    fun `Tutorial check creation of observable` () {
        // Creation of observable that emitsa generic instance before completing.
        // Observable will get the information byimplementen the observer interface and then call subscribe to the observable
        var result: String? = null
        val observable: Observable<String> = Observable.just("Hello");
        observable.subscribe{s -> result = s};

        Assertions.assertTrue(result.equals("Hello"))
    }


    @Test
    fun `Test the methods of observable` (){
        val letters = arrayOf("a", "b", "c", "d", "e", "f", "g")
        val observable: Observable<String> = Observable.fromArray(*letters);
        var result = ""
        observable.subscribe(
                { i -> result += i }, //OnNext
                (Throwable::printStackTrace), //OnError
                {result += "_Completed"} //OnCompleted
        );
        println(result)
        Assertions.assertTrue(result.equals("abcdefg_Completed"));
    }


    @Test
    fun `Test operation map` () {
        // Transforms emited items to another item
        var result = ""
        val letters = arrayOf("a", "b", "c", "d", "e", "f", "g")
        Observable
                .fromArray(*letters)
                .map( String::toUpperCase )
                .subscribe{ letter -> result += letter }

        Assertions.assertTrue(result.equals("ABCDEFG"));
    }


    @Test
    fun `Test Scan ooperation` (){
        // Similar to reduce?
        var result = ""
        val letters = arrayOf("a", "b", "c")
        Observable
                .fromArray(*letters)
                .scan(StringBuilder(), StringBuilder::append)
                .subscribe{total -> result += total.toString()};

        println(result)
        Assertions.assertTrue(result.equals("aababc"));
    }


    @Test
    fun `Test GroupBy operation` (){
        // Group by even and odd
        var EVEN: String = ""
        var ODD: String = ""

        val numbers = arrayOf(0,1,2,3,4,5,6,7,8,9,10)
        numbers
                .toObservable()
                .groupBy { i -> if(0 == (i%2)) "EVEN" else "ODD" }
                .subscribe{ group ->
                    println(group);

                    group.subscribe { number ->
                                if(group.key.toString().equals("EVEN")){
                                    EVEN += number
                                }
                                else {
                                    ODD += number
                                }
                        }
                }

        Assertions.assertTrue(EVEN.equals("0246810"));
        Assertions.assertTrue(ODD.equals("13579"));
    }


    @Test
    fun `Test Filter operation` (){
        // Group by even and odd
        var result = ""
        val numbers = arrayOf(0,1,2,3,4,5,6,7,8,9,10)
        numbers
                .toObservable()
                .filter{i -> (i%2 == 1)}
                .subscribe{ i -> result += i}

        Assertions.assertTrue(result.equals("13579"));
    }


    @Test
    fun `Test Empty observable operation` (){
        // Group by even and odd
        var result = ""
        Observable
                .empty<String>()
                .defaultIfEmpty("The observable is empty")
                .subscribe{s -> result += s}


        Assertions.assertTrue(result.equals("The observable is empty"));
    }



    @Test
    fun `Test TakeWhile operation` (){
        // Group by even and odd
        var result = ""
        val numbers = arrayOf(0,1,2,3,4,5,6,7,8,9,10)
        numbers
                .toObservable()
                .takeWhile{i -> i<5}
                .subscribe{ i -> result += i}
        Assertions.assertTrue(result.equals("01234"));
    }



}
