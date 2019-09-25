package org.louzao.examples.kotlinboot.controller;


import org.louzao.examples.kotlinboot.persistence.Visitor
import org.louzao.examples.kotlinboot.persistence.VisitorRegistrar
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController;


@RestController
class RestController (val visitorRegistrar: VisitorRegistrar){


    @GetMapping("/hello")
    fun sayHello(@RequestParam name: String?): String {
        val visitorName = if (name != null) name else "unknown"
        visitorRegistrar.saveVisit(visitorName)
        return "Hello $visitorName"
    }


    @GetMapping("/visits/all")
    fun getAllVisits(): List<Visitor> {
        return visitorRegistrar
                .findAllVisits()
                .toList()
    }


    @GetMapping("/visits/byName")
    fun getVisitsByName(@RequestParam name: String?): List<Visitor> {
        if(name == null) return listOf<Visitor>()
        return visitorRegistrar
                .findVisitsForUser(name)
                .toList()
    }


}
