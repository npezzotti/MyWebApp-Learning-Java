package com.nathan.pezzotti.MyWebApp.student;

public class StudentNotFoundException extends RuntimeException {
    StudentNotFoundException(Long id) {
        super("Could not find student with id " + id);
    }
}
