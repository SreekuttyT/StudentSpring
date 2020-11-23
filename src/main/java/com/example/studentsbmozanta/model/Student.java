package com.example.studentsbmozanta.model;

import java.util.Date;
import java.util.ArrayList;
//import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.List;


@Document(collection = "Student Details")
public class Student {

    //@Id
    //private long id;
    
    //@Size(min = 3, max = 30)
    private String name;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dob;

    //@NotEmpty
    private List<String> cls = new ArrayList<String>();

   // @NotEmpty
    private List<String> division = new ArrayList<String>();

    //@NotEmpty
    private String gender;

    public Student() {
        super();
    }

    public Student(String name, Date dob, List<String> string, List<String> division, String gender) {
        super();
    
        this.name = name;
        this.dob = dob;
        this.cls = string;
        this.division = division;
        this.gender = gender;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setAge(Date dob) {
        this.dob = dob;
    }

    public List<String> getCls() {
        return cls;
    }

    public void setCls(List<String> cls) {
        this.cls = cls;
    }

    public List<String> getDivision() {
        return division;
    }

    public void setDivision(List<String> division) {
        this.division = division;
    }

    public String getGender() {
        return gender;
    }

    public void setGrade(String gender) {
        this.gender = gender;
    }
    
}
