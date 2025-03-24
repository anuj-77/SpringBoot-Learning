package com.assignmentTableMapping.tableMappingAssignment.controller;

import com.assignmentTableMapping.tableMappingAssignment.dto.AssignmentDTO;
import com.assignmentTableMapping.tableMappingAssignment.services.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignment")
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    @PostMapping("")
    public ResponseEntity<AssignmentDTO> createAssignment(@RequestBody AssignmentDTO assignmentDTO){
        return ResponseEntity.ok(assignmentService.createAssignment(assignmentDTO));
    }
    @GetMapping("")
    public ResponseEntity<List<AssignmentDTO>> getAllAssignment(){
        return ResponseEntity.ok(assignmentService.getAllAssignment());
    }

}
