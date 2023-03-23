package br.com.hugotiyoda.hexakotlin.domain.student.services

import br.com.hugotiyoda.hexakotlin.adapter.out.entities.StudentEntity
import br.com.hugotiyoda.hexakotlin.domain.student.Student
import br.com.hugotiyoda.hexakotlin.domain.student.exceptions.StudentNotFoundException
import br.com.hugotiyoda.hexakotlin.domain.student.ports.`in`.StudentService
import br.com.hugotiyoda.hexakotlin.domain.student.ports.out.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentServiceImpl(
    private val studentData: StudentRepository
) : StudentService {
    override fun findAll(): MutableList<StudentEntity> {
        return studentData.findAll()
    }

    override fun save(student: Student): Student {
        return studentData.save(student)
    }

    override fun findById(id: Long): Student {
        return studentData.findById(id) ?: throw StudentNotFoundException("Student Not Found")
    }

    override fun delete(id: Long) {
        return studentData.delete(id)
    }
}