package org.louzao.examples.kotlinboot


import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test
import org.louzao.examples.kotlinboot.persistence.Visitor
import org.louzao.examples.kotlinboot.persistence.VisitorRegistry
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager


// User a JPA Test and check the operations
// - With autowired we use an injected instance of VisitorRegistry
@DataJpaTest
class VisitorRegistryTest @Autowired constructor(
    val entityManager: TestEntityManager,
    val visitorRegistry: VisitorRegistry
){


    @AfterEach
    fun dropDatabaseRegistries(){
        entityManager.clear();
    }


    @Test
    fun `Test insert on visitor registry` (){
        val visitant = Visitor("Louzao");
        entityManager.persist(visitant);

        val allVisits = visitorRegistry.findAll()
            .iterator()
            .asSequence()
            .toList();
        assert(allVisits.size == 1);
    }


    @Test
    fun `Should recover a previously inserted registry` () {
        val visitant = Visitor("Louzao");
        entityManager.persist(visitant);

        val allVisits = visitorRegistry.findAll()
                .iterator()
                .asSequence()
                .toList();
        assert(allVisits.size == 1);
    }


}