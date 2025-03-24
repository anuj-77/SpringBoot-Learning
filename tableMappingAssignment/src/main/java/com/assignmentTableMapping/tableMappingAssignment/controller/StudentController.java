package com.assignmentTableMapping.tableMappingAssignment.controller;

import com.assignmentTableMapping.tableMappingAssignment.dto.StudentDTO;
import com.assignmentTableMapping.tableMappingAssignment.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/setStudent")
    public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO student) {
        StudentDTO dto = studentService.createStudent(student);
        return ResponseEntity.ok(dto);
    }

    @GetMapping("")
    public ResponseEntity<List<StudentDTO>> getAllStudent() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/studentID/{id}")
    public ResponseEntity<StudentDTO> getStudentByID(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudentByID(id));
    }

}
