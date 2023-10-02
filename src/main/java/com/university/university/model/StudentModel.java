package com.university.university.model;

import com.university.university.model.enums.Branch;
import com.university.university.model.enums.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class StudentModel {
    @Id
    private Integer studentId;
    private String firstName;
    private String lastName;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Branch branch;
    @Enumerated(EnumType.STRING)
    private Department department;
}
