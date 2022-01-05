package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.asdasd@gmailcom",
                    LocalDate.of(2000, JANUARY,5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex.sanderasdasd@gmailcom",
                    LocalDate.of(2004, FEBRUARY,5)

            );

            studentRepository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
