package com.patryk.students.controller;

import com.patryk.students.repository.StudentRepository;
import com.patryk.students.model.Student;
import com.patryk.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(@RequestParam(required = false) Student.Status status) {
        return studentService.getStudents(status);
    }

    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
    public Student addStudent(@RequestBody @Valid Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentService.getStudent(id);
    }

    @PutMapping("/{id}")
    public Student putStudent(@PathVariable Long id, @RequestBody @Valid Student student) {
        return studentService.putStudent(id, student);
    }

    @PatchMapping("/{id}")
    public Student patchStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentService.patchStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

    /*@GetMapping("/lastname")
    public List<Student> findStudent(@RequestParam String lastName, @RequestParam int numberOfPage) {
        Pageable pageable = PageRequest.of(numberOfPage, 2, Sort.by("firstName"));
        return studentRepository.findByLastName(lastName, pageable);
    }*/

    /*@GetMapping("/find")
    public List<Student> findStudent2(@RequestParam String lastName, @RequestParam String firstName) {
        return studentRepository.findByLastNameAndFirstNameIsNotLikeAllIgnoreCase(lastName, firstName);
    }*/

    /*@GetMapping("/marian")
    public List<Student> findStudent3() {
        return studentRepository.findStudentsWithNameMarian();
    }*/

    /*@GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            return ResponseEntity.ok(studentOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/

    /*@GetMapping(value = "/hello")
    public String sayHello() {
        return "Witaj!";
    }*/

    /*@GetMapping("/student")
    public Student getStudent() {
        Student student = new Student();
        student.setFirstName("Arnold");
        student.setLastName("Boczek");
        student.setEmail("boczek@gmail.com");
        return student;
    }*/
}
