package com.assignmentTableMapping.tableMappingAssignment.services;

import com.assignmentTableMapping.tableMappingAssignment.dto.DepartmentDTO;


import java.util.List;

public interface DepartmentService {

    DepartmentDTO createDepartment(DepartmentDTO departmentDTO);

    List<DepartmentDTO> getAllDepartment();

    DepartmentDTO getDepartmentByID(Long id);
}
