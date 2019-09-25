package org.louzao.examples.kotlinboot.persistence

import org.springframework.data.repository.CrudRepository

interface VisitorRegistry: CrudRepository<Visitor, Long> {

    // Get a visitor by name and order by desc timestamp
    fun findAllByNameOrderByAddedAtDesc(name: String): List<Visitor>

}