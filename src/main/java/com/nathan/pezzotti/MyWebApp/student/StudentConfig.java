package com.nathan.pezzotti.MyWebApp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student nathan = new Student(
                    "Nathan",
                    "nathan.pezzotti@email.com",
                    LocalDate.of(1993, Month.AUGUST, 22)
            );
            Student jesse = new Student(
                    "Jesse",
                    "jesse.lee@email.com",
                    LocalDate.of(1994, Month.MARCH, 12)
            );

            repository.saveAll(
                    List.of(nathan, jesse)
            );
        };
    }
}
