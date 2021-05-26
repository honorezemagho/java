package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// This interface is responsible for data access
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
