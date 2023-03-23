package br.com.hugotiyoda.hexakotlin.adapter.`in`.controllers

import br.com.hugotiyoda.hexakotlin.adapter.dtos.StudentDTO
import br.com.hugotiyoda.hexakotlin.adapter.out.entities.StudentEntity
import br.com.hugotiyoda.hexakotlin.domain.student.services.StudentServiceImpl
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/student")
class StudentController(
    private val studentService: StudentServiceImpl
) {

    @PostMapping
    fun create(@RequestBody request: StudentDTO): StudentDTO {
        return StudentDTO.fromDomain(studentService.save(request.toStudent()))
    }

    @GetMapping
    fun findAll(): ResponseEntity<MutableList<StudentEntity>> {
        return ResponseEntity.ok(studentService.findAll())
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<StudentDTO> {
        val student = studentService.findById(id)
        return if (student != null) {
            ResponseEntity.ok(StudentDTO.fromDomain(student))
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Unit> {
        return ResponseEntity.ok(studentService.delete(id))

    }
}