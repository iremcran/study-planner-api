package com.irem.studyplanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudyController {

    @Autowired
    private StudyService studyService;

    @GetMapping("/hello")
    public String hello() {
        return "Irem backend başladı 🚀";
    }

    @GetMapping("/all")
    public List<Study> getAllStudies() {
        return studyService.getAllStudies();
    }

    @PostMapping("/add")
    public Study addStudy(@RequestBody Study study) {
        return studyService.addStudy(study);
    }
}