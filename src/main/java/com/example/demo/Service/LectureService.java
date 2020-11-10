package com.example.demo.Service;

import com.example.demo.Datas.LectureDatas;
import com.example.demo.Entity.Lecture;
import com.example.demo.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LectureService {

    @Autowired
    public LectureDatas lectureDatas;

    public Collection<Lecture> getAllLectures() {
        return lectureDatas.getAllLectures();
    }
}
