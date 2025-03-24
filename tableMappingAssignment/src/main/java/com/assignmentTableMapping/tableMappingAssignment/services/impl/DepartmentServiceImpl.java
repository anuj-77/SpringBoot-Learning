package com.assignmentTableMapping.tableMappingAssignment.services.impl;

import com.assignmentTableMapping.tableMappingAssignment.dto.DepartmentDTO;
import com.assignmentTableMapping.tableMappingAssignment.entity.DepartmentEntity;
import com.assignmentTableMapping.tableMappingAssignment.entity.StudentEntity;
import com.assignmentTableMapping.tableMappingAssignment.repository.DepartmentRepository;
import com.assignmentTableMapping.tableMappingAssignment.services.DepartmentService;
import com.assignmentTableMapping.tableMappingAssignment.util.DepartmentEntityToDTOMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    DepartmentEntityToDTOMapping departmentEntityToDTOMapping;

    @Override
    public DepartmentDTO createDepartment(DepartmentDTO departmentDTO){
        DepartmentEntity entity = departmentEntityToDTOMapping.map(departmentDTO);
        departmentRepository.save(entity);
        departmentDTO.setId(entity.getId());
        return departmentDTO;
    }

    @Override
    public List<DepartmentDTO> getAllDepartment(){
    Iterable<DepartmentEntity> departmentEntities = departmentRepository.findAll();
    List<DepartmentDTO> departmentDTOs = new ArrayList<>();
    for (DepartmentEntity entity : departmentEntities){
        departmentDTOs.add(departmentEntityToDTOMapping.map(entity));
    }
    return departmentDTOs;
    }
}
