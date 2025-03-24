package com.assignmentTableMapping.tableMappingAssignment.util;

import com.assignmentTableMapping.tableMappingAssignment.dto.DepartmentDTO;
import com.assignmentTableMapping.tableMappingAssignment.entity.DepartmentEntity;
import org.springframework.stereotype.Component;

@Component
public class DepartmentEntityToDTOMapping {
    public DepartmentDTO map (DepartmentEntity entity){
        DepartmentDTO dto = new DepartmentDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }
    public DepartmentEntity map (DepartmentDTO dto){
        DepartmentEntity entity = new DepartmentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
