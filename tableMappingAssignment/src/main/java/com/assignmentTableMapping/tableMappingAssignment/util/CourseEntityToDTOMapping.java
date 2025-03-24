package com.assignmentTableMapping.tableMappingAssignment.util;

import com.assignmentTableMapping.tableMappingAssignment.dto.CourseDTO;
import com.assignmentTableMapping.tableMappingAssignment.entity.CourseEntity;
import org.springframework.stereotype.Component;

@Component
public class CourseEntityToDTOMapping {

    public CourseDTO map (CourseEntity entity){
        CourseDTO dto = new CourseDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public CourseEntity map(CourseDTO dto){
        CourseEntity entity = new CourseEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }

}
