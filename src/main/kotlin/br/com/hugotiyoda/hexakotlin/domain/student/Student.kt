package br.com.hugotiyoda.hexakotlin.domain.student

import br.com.hugotiyoda.hexakotlin.adapter.out.entities.StudentEntity

data class Student(
    var id: Long? = null,
    var name: String,
    var age: Int
) {
    fun toEntity(): StudentEntity {
        return StudentEntity(  id = id
            ,name
            ,age)
    }
}