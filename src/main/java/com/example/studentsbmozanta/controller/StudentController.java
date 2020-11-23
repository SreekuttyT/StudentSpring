package com.example.studentsbmozanta.controller;

//import java.net.URI;
//import java.net.URISyntaxException;

import java.util.*;
import com.example.studentsbmozanta.model.Student;
import com.example.studentsbmozanta.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.http.ResponseEntity;

@RestController
public class StudentController {
    @Autowired
    public StudentRepository studentRepository;

    @CrossOrigin(origins = "http://localhost:3000")


    @RequestMapping(method = RequestMethod.POST, value = "/student")
    public Student save(@RequestBody Student student) {

        studentRepository.save(student);

        return student;

        }

    

    @ModelAttribute("cls")
    public List<String> initializeCls() {

        List<String> cls = new ArrayList<String>();
        cls.add("I");
        cls.add("II");
        cls.add("III");
        cls.add("IV");
        cls.add("V");
        cls.add("V1");
        cls.add("V11");
        cls.add("V111");
        cls.add("1X");
        cls.add("X");
        cls.add("X11");
        cls.add("X12");
        return cls;
    }

    @ModelAttribute("division")
    public List<String> initializeDivision() {

        List<String> division = new ArrayList<String>();
        division.add("A");
        division.add("B");
        division.add("C");
        return 
        division;
    }
    
}
