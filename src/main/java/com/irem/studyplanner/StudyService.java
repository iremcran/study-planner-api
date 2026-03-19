package com.irem.studyplanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudyService {

    @Autowired
    private StudyRepository studyRepository;

    public List<Study> getAllStudies() {
        return studyRepository.findAll();
    }

    public Study addStudy(Study study) {
        return studyRepository.save(study);
    }
}