package br.com.hugotiyoda.hexakotlin.adapter.out.repositories

import br.com.hugotiyoda.hexakotlin.adapter.out.entities.StudentEntity
import org.springframework.data.jpa.repository.JpaRepository

interface StudentJpaRepository: JpaRepository<StudentEntity, Long>