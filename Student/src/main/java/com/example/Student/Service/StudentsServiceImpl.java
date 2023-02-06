package com.example.Student.Service;

import com.example.Student.Entity.Students;
import com.example.Student.Repository.StudentRepository;

import com.example.Student.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentsServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;
    @Override
    public Students addStudent(Students students) {
        return this.studentRepository.save(students);
    }

    @Override
    public Students updateStudent(Students students) throws ResourceNotFoundException {
        Optional<Students> studentsdb=this.studentRepository.findById(students.getId());
        if(studentsdb.isPresent()){
            Students studentsupdate=studentsdb.get();
            studentsupdate.setId(students.getId());
            studentsupdate.setName(students.getName());
            studentsupdate.setMarks(students.getMarks());
            studentsupdate.setGender(students.getGender());
            studentRepository.save(studentsupdate);
            return studentsupdate;

        }
        else{
            throw new ResourceNotFoundException("Record is not avaliable");
        }


    }

    @Override
    public List<Students> getAllStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public void deleteStudents(long id) throws ResourceNotFoundException {
        Optional<Students> studentsdb=this.studentRepository.findById(id);
        if(studentsdb.isPresent()){
          this.studentRepository.delete(studentsdb.get());
        }else{
            throw new ResourceNotFoundException("Record is not avaliable");

        }

    }

    @Override
    public Students getStudentsById(Long id) throws ResourceNotFoundException {

        Optional<Students> studentsdb=this.studentRepository.findById(id);
        if(studentsdb.isPresent()){
          return studentsdb.get();
        }else{
            throw new ResourceNotFoundException("Record is not avaliable");

        }

    }
}
