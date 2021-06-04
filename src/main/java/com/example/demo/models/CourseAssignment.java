package com.example.demo.models;

import com.example.demo.models.enums.AssignmentStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "course_assignment")
public class CourseAssignment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String assignedOn;
    private String lastUpdatedBy;
    @Enumerated(EnumType.STRING)
    private AssignmentStatus status;
    private String lastStatusChangedOn;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;

    public CourseAssignment() {
    }

    public CourseAssignment(String assignedBy, AssignmentStatus status) {
        this.assignedOn = LocalDateTime.now().toString();
        this.lastUpdatedBy = assignedBy;
        this.status = status;
        this.lastStatusChangedOn = LocalDateTime.now().toString();
    }


    public CourseAssignment(Long id, String assignedBy, AssignmentStatus status) {
        this.id = id;
        this.lastUpdatedBy = assignedBy;
        this.status = status;
        this.lastStatusChangedOn = LocalDateTime.now().toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssignedOn() {
        return assignedOn;
    }

    public void setAssignedOn(String assignedOn) {
        this.assignedOn = assignedOn;
    }

    public String getAssignedBy() {
        return lastUpdatedBy;
    }

    public void setAssignedBy(String assignedBy) {
        this.lastUpdatedBy = assignedBy;
    }

    public AssignmentStatus getStatus() {
        return status;
    }

    public void setStatus(AssignmentStatus status) {
        this.status = status;
    }

    public String getLastStatusChangedOn() {
        return lastStatusChangedOn;
    }

    public void setLastStatusChangedOn(String lastStatusChangedOn) {
        this.lastStatusChangedOn = lastStatusChangedOn;
    }
}
