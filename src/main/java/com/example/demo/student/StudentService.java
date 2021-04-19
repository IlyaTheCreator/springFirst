package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service // The same as @Component but better for semantics
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Iluha",
                        21,
                        LocalDate.of(2000, Month.JANUARY, 5),
                        "iluha@iluha.com"
                )
        );
    }
}
