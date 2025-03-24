package com.assignmentTableMapping.tableMappingAssignment.services.impl;

import com.assignmentTableMapping.tableMappingAssignment.dto.DepartmentDTO;
import com.assignmentTableMapping.tableMappingAssignment.entity.DepartmentEntity;
import com.assignmentTableMapping.tableMappingAssignment.repository.DepartmentRepository;
import com.assignmentTableMapping.tableMappingAssignment.services.DepartmentService;
import com.assignmentTableMapping.tableMappingAssignment.util.DepartmentEntityToDTOMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private DepartmentEntityToDTOMapping departmentEntityToDTOMapping;

    @Override
    public DepartmentDTO createDepartment(DepartmentDTO departmentDTO){
        DepartmentEntity entity = departmentEntityToDTOMapping.map(departmentDTO);
        departmentRepository.save(entity);
        departmentDTO.setId(entity.getId());
        return departmentDTO;
    }

    @Override
    public List<DepartmentDTO> getAllDepartment(){
    List<DepartmentEntity> departmentEntities = departmentRepository.findAll();
    List<DepartmentDTO> departmentDTOs = new ArrayList<>();
    for (DepartmentEntity entity : departmentEntities){
        departmentDTOs.add(departmentEntityToDTOMapping.map(entity));
    }
    return departmentDTOs;
    }

    @Override
    public DepartmentDTO getDepartmentByID(Long id){
        Optional<DepartmentEntity> optionalDepartmentEntity = departmentRepository.findById(id);
        return departmentEntityToDTOMapping.map(optionalDepartmentEntity.get());

    }

}
