package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service // The same as @Component but better for semantics
public class StudentService {
    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());

        if (studentOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }

        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        boolean exists =  studentRepository.existsById(id);

        if (!exists) {
            throw new IllegalStateException("Student with id " + id + "does not exist");
        }

        studentRepository.deleteById(id);
    }

//    public void updateStudent(Student student) {
//        // id check
//        Optional<Student> studentToUpdateOptional = studentRepository.findById(student.getId());
//
//        if (studentToUpdateOptional.isEmpty()) {
//            throw new IllegalStateException("There's no such user");
//        }
//
//        Student studentToUpdate = studentToUpdateOptional.get();
//        // email check
//        Optional<Student> studentWithTheSameEmailOptional = studentRepository.findStudentByEmail(student.getEmail());
//
//        if (studentWithTheSameEmailOptional.isPresent()) {
//            throw new IllegalStateException("A user with the same email already exists");
//        }
//
//        studentToUpdate.setName(student.getName());
//        studentToUpdate.setDob(student.getDob());
//        studentToUpdate.setEmail(student.getEmail());
//
//        studentRepository.save(studentToUpdate);
//    }

    @Transactional // this annotation means that we directly update our database with setters
    public void updateStudent(Long id, String name, String email) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        "Student with id " + id + "is not found"
                ));

        if (name != null && name.length() > 0 && !Objects.equals(student.getName(), name)) {
            student.setName(name);
        }

        if (email != null && email.length() > 0 && !Objects.equals(student.getEmail(), email)) {
            student.setEmail(email);
        }
    }
}
