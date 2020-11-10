package com.example.demo.Controllers;

import com.example.demo.Entity.Lecture;
import com.example.demo.Service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/lectures")
public class LectureController {

    @Autowired
    private LectureService lectureService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Lecture> getAllLectures() {
        return lectureService.getAllLectures();
    }
}
