package com.example.ToyProject240409.career.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "career")
public class Career {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "career_uuid", columnDefinition = "BINARY(16)")
    private UUID careerUuid;

    private Date schedule;

    private String place;

    private String target;

    private int personnel;

}
