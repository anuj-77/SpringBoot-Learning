package com.assignmentTableMapping.tableMappingAssignment.util;

import com.assignmentTableMapping.tableMappingAssignment.dto.AssignmentDTO;
import com.assignmentTableMapping.tableMappingAssignment.entity.AssignmentEntity;
import org.springframework.stereotype.Component;

@Component
public class AssignmentEntityToDTOMapping {

    public AssignmentDTO map(AssignmentEntity entity) {
        AssignmentDTO dto = new AssignmentDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;

    }

    public AssignmentEntity map(AssignmentDTO dto) {
        AssignmentEntity entity = new AssignmentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
