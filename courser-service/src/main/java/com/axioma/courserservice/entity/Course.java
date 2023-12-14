package com.axioma.courserservice.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="courses")
public class Course {

    @Id
    private Long id;

    private String name;

    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @PrePersist
    public void prePersist(){
        this.createAt= new Date();
    }
}
