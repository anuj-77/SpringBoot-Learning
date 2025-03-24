package com.assignmentTableMapping.tableMappingAssignment.controller;

import com.assignmentTableMapping.tableMappingAssignment.dto.CourseDTO;
import com.assignmentTableMapping.tableMappingAssignment.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("")
    public ResponseEntity<CourseDTO> createCourse(@RequestBody CourseDTO courseDTO){
       return ResponseEntity.ok(courseService.createCourse(courseDTO));
    }
    @GetMapping("")
    public ResponseEntity<List<CourseDTO>>getAllCourse(){
        return ResponseEntity.ok(courseService.getAllCourse());
    }
}
