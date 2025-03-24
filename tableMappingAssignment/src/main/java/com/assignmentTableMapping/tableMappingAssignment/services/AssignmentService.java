package com.assignmentTableMapping.tableMappingAssignment.services;

import com.assignmentTableMapping.tableMappingAssignment.dto.AssignmentDTO;

import java.util.List;

public interface AssignmentService {
    AssignmentDTO createAssignment(AssignmentDTO assignmentDTO);
    List<AssignmentDTO> getAllAssignment();
}
