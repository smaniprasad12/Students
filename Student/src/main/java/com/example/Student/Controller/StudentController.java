package com.example.Student.Controller;

import com.example.Student.Entity.Students;
import com.example.Student.Service.StudentService;
import com.example.Student.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getall")
    public ResponseEntity<List<Students>> getAllProduct(){
        return ResponseEntity.ok().body(studentService.getAllStudents());
    }
    @PostMapping("/save")
    public ResponseEntity<Students> saveStudent(@RequestBody Students student){
        return ResponseEntity.ok().body(studentService.addStudent(student));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Students> updateStudent(@PathVariable long id,@RequestBody Students student) throws ResourceNotFoundException {
        student.setId(id);
        return ResponseEntity.ok().body(this.studentService.updateStudent(student));

    }

@DeleteMapping("/delete/{id}")
public HttpStatus delete(@PathVariable long id) throws ResourceNotFoundException {
    this.studentService.deleteStudents(id);
    return HttpStatus.OK;
}
@GetMapping("get/{id}")
    public ResponseEntity<Students> getbyid(@PathVariable long id) throws ResourceNotFoundException {
        return ResponseEntity.ok().body(this.studentService.getStudentsById(id));
}

}
