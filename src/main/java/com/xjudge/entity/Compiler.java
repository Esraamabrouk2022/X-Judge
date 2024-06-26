package com.xjudge.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xjudge.model.enums.OnlineJudgeType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "compiler")
public class Compiler extends BaseEntity<Long> {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String idValue;

    private String name;

    @Enumerated(EnumType.STRING)
    private OnlineJudgeType onlineJudgeType;
}
