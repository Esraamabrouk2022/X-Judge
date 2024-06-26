package com.xjudge.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xjudge.entity.key.ContestProblemKey;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contest_problem", uniqueConstraints = {
        @UniqueConstraint(name = "contest_hashtag_unique", columnNames = {"contest_id", "problem_hashtag"})
})
public class ContestProblem extends BaseEntity<ContestProblemKey> {

    @EmbeddedId
    ContestProblemKey id;

    @ManyToOne
    @JsonIgnore
    @ToString.Exclude
    @MapsId("contestId")
    @JoinColumn(name = "contest_id")
    private Contest contest;

    @ManyToOne
    @JsonIgnore
    @ToString.Exclude
    @MapsId("problemId")
    @JoinColumn(name = "problem_id")
    private Problem problem;

    private Integer problemWeight;

    private String problemAlias;

    private String problemCode;

    private String problemHashtag;

    private long numberOfSubmission;

    private long numberOfAccepted;
}