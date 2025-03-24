package com.assignmentTableMapping.tableMappingAssignment.controller;

import com.assignmentTableMapping.tableMappingAssignment.dto.DepartmentDTO;
import com.assignmentTableMapping.tableMappingAssignment.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/createDepartment")
    public ResponseEntity<DepartmentDTO> createDepartment(@RequestBody DepartmentDTO departmentDTO){
        DepartmentDTO dto = departmentService.createDepartment(departmentDTO);
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/getDepartment")
    public ResponseEntity<List<DepartmentDTO>> getAllDepartment(){
        return ResponseEntity.ok(departmentService.getAllDepartment());
    }

}
