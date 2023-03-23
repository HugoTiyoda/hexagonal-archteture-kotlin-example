package br.com.hugotiyoda.hexakotlin.adapter.dtos

import br.com.hugotiyoda.hexakotlin.domain.student.Student

data class StudentDTO(
    var id: Long?,
    var name: String,
    var age: Int
) {
    fun toStudent() = Student(
        name = name,
        age = age
    )

    companion object {
        fun fromDomain(student: Student): StudentDTO {
            return StudentDTO(
                id = student.id,
                name = student.name,
                age = student.age
            )
        }
    }
}