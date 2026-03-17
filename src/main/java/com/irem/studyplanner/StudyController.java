package com.irem.studyplanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudyController {

    @Autowired
    private StudyRepository studyRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Irem backend başladı 🚀";
    }

    @GetMapping("/all")
    public List<Study> getAllStudies() {
        return studyRepository.findAll();
    }

    @PostMapping("/add")
    public Study addStudy(@RequestBody Study study) {
        return studyRepository.save(study);
    }
}