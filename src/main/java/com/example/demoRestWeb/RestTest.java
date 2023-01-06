package com.example.demoRestWeb;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestTest {
    private List<Student> list = new ArrayList<>();

    @GetMapping("getstudent")
    public List<Student> getData(){
        return list;
    }
    @PostMapping("addstudent")
    public String addStudent(@RequestBody Student student){


        list.add(student);
        return "Dodano studenta do listy";

    }
    @DeleteMapping("removestudent")
public  String removeData(){
        list.clear();
        return "Usunięto listę studentów";
}
}
