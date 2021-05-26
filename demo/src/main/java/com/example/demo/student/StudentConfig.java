package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                  "Free","free@free.fr",14,
                  LocalDate.of(2015, Month.JANUARY,5)
            );
            Student alester = new Student(
                    "Alester","alester@gmail.com",21,
                    LocalDate.of(2004, Month.JANUARY,3)
            );

            repository.saveAll(List.of(mariam, alester));
        };
    }
}
