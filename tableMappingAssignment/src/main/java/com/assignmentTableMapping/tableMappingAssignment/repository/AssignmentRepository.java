package com.assignmentTableMapping.tableMappingAssignment.repository;

import com.assignmentTableMapping.tableMappingAssignment.entity.AssignmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository <AssignmentEntity,Long> {

}
