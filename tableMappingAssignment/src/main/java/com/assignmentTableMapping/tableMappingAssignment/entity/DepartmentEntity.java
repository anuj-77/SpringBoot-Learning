package com.assignmentTableMapping.tableMappingAssignment.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Department_Table")
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Department_Name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "Student_id")
    private StudentEntity studentEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AssignmentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
