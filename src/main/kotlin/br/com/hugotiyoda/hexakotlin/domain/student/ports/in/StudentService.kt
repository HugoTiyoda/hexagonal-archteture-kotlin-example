package br.com.hugotiyoda.hexakotlin.domain.student.ports.`in`

import br.com.hugotiyoda.hexakotlin.adapter.out.entities.StudentEntity
import br.com.hugotiyoda.hexakotlin.domain.student.Student
import org.springframework.data.domain.Page
import java.awt.print.Pageable

interface StudentService {
    fun findAll(): MutableList<StudentEntity>
    fun save(student: Student): Student
    fun findById(id: Long): Student
    fun delete(id: Long)

}