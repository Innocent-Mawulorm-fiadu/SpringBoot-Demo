package com.example.demo.Datas;

import com.example.demo.Entity.Lecture;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class LectureDatas {
    private static Map<Integer, Lecture> lectures;

    static{

       lectures = new HashMap<Integer, Lecture>() {
           {
               put(1, new Lecture(1, 4, "Sam Moorhouse", "Software Engineering"));
               put(2, new Lecture(2, 2, "Ewan Smith", "Programming"));
               put(3, new Lecture(3, 1, "Mike Clarke", "Software Architecture"));
               put(4, new Lecture(4, 3, "Matinaz", "Agile Software Development"));

           }

       };

    }

    public Collection<Lecture> getAllLectures() {
        return this.lectures.values();
    }
}
