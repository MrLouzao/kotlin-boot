package org.louzao.examples.kotlinboot.persistence

import org.springframework.stereotype.Component


/**
 * Class in charge of registering visitors on database
 */
@Component
class VisitorRegistrar (private val visitorRegistry: VisitorRegistry) {


    fun saveVisit(nameOfVisitor: String): Visitor {
        println("Saving visitor $nameOfVisitor")
        val visitorToSave: Visitor = Visitor(nameOfVisitor)
        return visitorRegistry.save(visitorToSave)
    }


    fun findAllVisits(): Collection<Visitor> {
        return visitorRegistry.findAll().toList();
    }


    fun findVisitsForUser(nameOfVisitor: String): Collection<Visitor> {
        return visitorRegistry.findAllByNameOrderByAddedAtDesc(nameOfVisitor)
    }


}