package com.bedzrah.demo.controllers;

import com.bedzrah.demo.databasemodels.Tutor;
import com.bedzrah.demo.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bedzrah on 4/27/18.
 */
@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    TutorRepository tutorRepository;

    @GetMapping("/tutors")
    public List<Tutor> getAllTutors() {
        List<Tutor> allTutors = (List<Tutor>) tutorRepository.findAll();
        for(int i=0; i< allTutors.size(); i++) {
            System.out.println("Tutor Name ="+allTutors.get(i).getName()+" course ="+allTutors.get(i).getCourseName());
        }
        return allTutors;
    }
}
