package br.com.hugotiyoda.hexakotlin.adapter.out.repositories

import br.com.hugotiyoda.hexakotlin.adapter.out.entities.StudentEntity
import br.com.hugotiyoda.hexakotlin.domain.student.Student
import br.com.hugotiyoda.hexakotlin.domain.student.ports.out.StudentRepository
import org.springframework.data.domain.Page
import org.springframework.stereotype.Repository
import java.awt.print.Pageable

@Repository
class StudentRepositoryImpl(
    private val studentJpaRepository: StudentJpaRepository
) : StudentRepository {
    override fun findAll(): MutableList<StudentEntity> {
        return studentJpaRepository.findAll()
    }

    override fun save(student: Student): Student {
        return studentJpaRepository.save(student.toEntity()).toStudent()
    }

    override fun findById(id: Long): Student? {
        return studentJpaRepository.findById(id).orElse(null)?.toStudent()
    }

    override fun delete(id: Long) {
        return studentJpaRepository.deleteById(id)
    }


}