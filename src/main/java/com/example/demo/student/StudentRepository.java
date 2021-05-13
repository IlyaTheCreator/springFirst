package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// Long is the type of the student's id
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // this is jbql
    @Query("SELECT s FROM student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
