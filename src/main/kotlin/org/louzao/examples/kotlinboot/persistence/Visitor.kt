package org.louzao.examples.kotlinboot.persistence

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


// Data class that contains its properties separated by commas
@Entity
class Visitor (
    var name: String,
    var addedAt: LocalDateTime = LocalDateTime.now(),
    @Id @GeneratedValue var id: Long? = null
)