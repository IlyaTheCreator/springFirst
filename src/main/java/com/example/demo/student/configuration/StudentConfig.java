package com.example.demo.student.configuration;

import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.JUNE;

@Configuration
public class StudentConfig {
    // we don't need the @Autowired annotation because here we're accesing
    // a bean (Repository (which is a Component)) from another bean (CommandLineRunner)
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student iluha = new Student(
                    "Iluha",
                    LocalDate.of(2000, JANUARY, 5),
                    "iluha@iluha.com"
            );

            Student mariam = new Student(
                    "Mariam",
                    LocalDate.of(2003, JUNE, 5),
                    "mariam@mail.com"
            );

            repository.saveAll(List.of(iluha, mariam));
        };
    }
}
