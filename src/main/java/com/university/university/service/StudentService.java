package com.university.university.service;

import com.university.university.model.StudentModel;
import com.university.university.model.enums.Department;
import com.university.university.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public String addStudent(StudentModel studentModel) {
        studentRepository.save(studentModel);
        return studentModel.getFirstName()+" "+studentModel.getLastName()+" added Successfully";
    }

    public String updateStudentDepartment(Integer id, Department department) {
        StudentModel studentModel=studentRepository.findById(id).get();
        if(studentModel!=null){
            studentModel.setDepartment(department);
            return "Department updated Successfully";
        }else{
            return "Department not Found";
        }
    }

    public List<StudentModel> findAllStudent() {
        return studentRepository.findAll();
    }

    public String deleteStudent(Integer id) {
        studentRepository.deleteById(id);
        return "Student Deleted Successfully";
    }

    public StudentModel getStudent(Integer id) {
        return studentRepository.findById(id).get();
    }
}
