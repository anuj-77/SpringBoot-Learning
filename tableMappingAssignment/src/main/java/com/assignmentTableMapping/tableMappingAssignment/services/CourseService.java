package com.assignmentTableMapping.tableMappingAssignment.services;

import com.assignmentTableMapping.tableMappingAssignment.dto.CourseDTO;
import java.util.List;


public interface CourseService {

    CourseDTO createCourse (CourseDTO courseDTO);
    List<CourseDTO> getAllCourse();
}
