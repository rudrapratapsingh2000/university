package com.university.university.controller;

import com.university.university.model.StudentModel;
import com.university.university.model.enums.Department;
import com.university.university.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/student-app")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add-api")
    public String addStudent(@RequestBody StudentModel studentModel){
        return studentService.addStudent(studentModel);
    }
    @PutMapping("/update-api/id/{id}/department/{department}")
    public String updateStudentDepartment(@PathVariable Integer id, @PathVariable Department department){
        return studentService.updateStudentDepartment(id,department);
    }
    @GetMapping("/findAll-api")
            public List<StudentModel> findAllStudents(){
        return studentService.findAllStudent();
    }
    @DeleteMapping("/delete-api/id/{id}")
            public String DeleteStudent(@PathVariable Integer id){
        return studentService.deleteStudent(id);
    }
        @PostMapping("/getStudentById-api/id/{id}")
        public StudentModel GetStudent(@PathVariable Integer id){
        return studentService.getStudent(id);
        }
}
