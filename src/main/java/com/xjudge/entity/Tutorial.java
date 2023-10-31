package com.xjudge.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@AllArgsConstructor
@Table(name="tutorial")
public class Tutorial {
    //problem-id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String hint;
    private String code;
}
