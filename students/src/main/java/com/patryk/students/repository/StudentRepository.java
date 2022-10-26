package com.patryk.students.repository;

import com.patryk.students.model.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//    List<Student> findByLastName(String lastName, Pageable pageable);
//    List<Student> findByLastNameAndFirstNameIsNotLikeAllIgnoreCase(String lastName, String firstName);
//    @Query("Select s from Student s where s.firstName = 'Marian'")
//    List<Student> findStudentsWithNameMarian();

    boolean existsByEmail(String email);
    List<Student> findAllByStatus(Student.Status status);
}
