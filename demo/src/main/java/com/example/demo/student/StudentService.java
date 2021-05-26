package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
                return List.of(
                        new Student(
                1L,"Free","free@free.fr",14,
                LocalDate.of(2015, Month.JANUARY,5)
        ));
    }
}
