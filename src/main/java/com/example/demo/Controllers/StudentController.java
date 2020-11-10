package com.example.demo.Controllers;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    public StudentService studentService;

    // display all student
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return  studentService.getAllStudents();
    }

    // display a student by id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id) {
        return this.studentService.getStudentById(id);
    }

    //delete a student by id using the DELETE method
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void  deleteStudentById(@PathVariable("id") int id) {
        studentService.removeStudentById(id);
    }

    //delete a student by id using the PUT method
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void  updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }
















}
