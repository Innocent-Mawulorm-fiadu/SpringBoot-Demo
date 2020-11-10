package com.example.demo.Service;

import com.example.demo.Datas.StudentDatas;
import com.example.demo.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDatas studentDatas;

    public Collection<Student> getAllStudents() {
        return  studentDatas.getAllStudents();
    }

    public Student getStudentById(int id) {
        return this.studentDatas.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDatas.removeStudentById(id);
    }

    public void updateStudent(Student student) {
        this.studentDatas.updateStudent(student);
    }
}
