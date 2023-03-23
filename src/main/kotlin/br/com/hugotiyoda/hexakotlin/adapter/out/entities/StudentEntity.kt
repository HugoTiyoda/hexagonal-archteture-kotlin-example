package br.com.hugotiyoda.hexakotlin.adapter.out.entities

import br.com.hugotiyoda.hexakotlin.domain.student.Student
import jakarta.persistence.*

@Entity(name = "students")
data class StudentEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column
    var name: String,
    @Column
    var age: Int
) {
    constructor() : this(null,"",0)

    fun toStudent() =  Student(id, name, age)


}

