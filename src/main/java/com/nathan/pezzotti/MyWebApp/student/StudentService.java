package com.nathan.pezzotti.MyWebApp.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> GetStudents() {
        return List.of(
                new Student(
                        1L,
                        "Nathan",
                        "nathan.pezzotti@email.com",
                        LocalDate.of(1993, Month.AUGUST, 22),
                        27
                )
        );
    }
}