package com.example.Student.Service;

import com.example.Student.Entity.Students;
import com.example.Student.exception.ResourceNotFoundException;

import java.util.List;

public interface StudentService {

    Students addStudent(Students students);

    Students updateStudent(Students students) throws ResourceNotFoundException;

    List<Students> getAllStudents();

     void deleteStudents(long id) throws ResourceNotFoundException;

     Students getStudentsById(Long id) throws ResourceNotFoundException;


}
