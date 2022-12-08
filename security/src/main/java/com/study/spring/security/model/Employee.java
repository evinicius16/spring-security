package com.study.spring.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long Id;
    private String firstName;
    private String lastName;
    private String username;

}
