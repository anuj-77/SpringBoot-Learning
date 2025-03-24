package com.assignmentTableMapping.tableMappingAssignment.services.impl;

import com.assignmentTableMapping.tableMappingAssignment.dto.AssignmentDTO;
import com.assignmentTableMapping.tableMappingAssignment.entity.AssignmentEntity;
import com.assignmentTableMapping.tableMappingAssignment.repository.AssignmentRepository;
import com.assignmentTableMapping.tableMappingAssignment.services.AssignmentService;
import com.assignmentTableMapping.tableMappingAssignment.util.AssignmentEntityToDTOMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssignmentServiceImpl implements AssignmentService {
    @Autowired
    private AssignmentRepository assignmentRepository;
    @Autowired
    private AssignmentEntityToDTOMapping assignmentEntityToDTOMapping;

    @Override
    public AssignmentDTO createAssignment (AssignmentDTO assignmentDTO){
        AssignmentEntity entity = assignmentEntityToDTOMapping.map(assignmentDTO);
        assignmentRepository.save(entity);
        assignmentDTO.setId(entity.getId());
        return assignmentDTO;
    }

    @Override
    public List<AssignmentDTO> getAllAssignment(){
        List<AssignmentEntity> assignmentEntities = assignmentRepository.findAll();
        List<AssignmentDTO> assignmentDTOs = new ArrayList<>();
        for (AssignmentEntity entity: assignmentEntities){
            assignmentDTOs.add(assignmentEntityToDTOMapping.map(entity));
        }
        return assignmentDTOs;
    }

}
