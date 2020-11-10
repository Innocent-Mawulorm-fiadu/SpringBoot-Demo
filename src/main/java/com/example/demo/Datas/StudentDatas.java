package com.example.demo.Datas;

import com.example.demo.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDatas {


    private static Map<Integer, Student> students;

    static{

        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, 100, "Vincent", "Math and Stats"));
                put(2, new Student(2, 200, "Providence", "Comp Science"));
                put(3, new Student(3, 300, "Zeeya", "Comp Science"));
                put(4, new Student(4, 400, "Innocent", "Information Tech"));

            }
        };
    }


    public Object removeStudentById;

    public Collection<Student> getAllStudents() {
        return  this.students.values();
    }

    public Student getStudentById(int id) {
        return this.students.get(id);
    }


    public void removeStudentById(int id) {
        this.students.remove(id);

    }

    public void updateStudent(Student student) {
        Student s = students.get(student.getId());
        s.setLevel(student.getLevel());
        s.setName(student.getName());
        s.setCourse(student.getCourse());
        students.put(student.getId(), student);
    }

}
