package br.com.hugotiyoda.hexakotlin.domain.student.ports.out

import br.com.hugotiyoda.hexakotlin.adapter.out.entities.StudentEntity
import br.com.hugotiyoda.hexakotlin.domain.student.Student

interface StudentRepository {
    fun findAll(): MutableList<StudentEntity>
    fun save(student: Student): Student
    fun findById(id: Long): Student?
    fun delete(id: Long)
}