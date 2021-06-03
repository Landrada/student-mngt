package com.example.demo.models;
import com.example.demo.models.enums.BedType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="bed")
    public class Bed {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String number;
        @Enumerated(EnumType.STRING)
        private BedType Type;
        @ManyToMany(mappedBy = "beds", cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
        private Set<Student> student = new HashSet<Student>();
        public Bed(){}
        public Bed(Long id, String number, BedType type, Set<Student> student) {
            this.id = id;
            this.number = number;
            Type = type;
            this.student = student;
        }
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getNumber() {
            return number;
        }
        public void setNumber(String number) {
            this.number = number;
        }
        public BedType getType() {
            return Type;
        }
        public void setType(BedType type) {
            Type = type;
        }
        public Set<Student> getStudent() {
            return student;
        }
        public void setStudent(Set<Student> student) {
            this.student = student;
        }
    }

