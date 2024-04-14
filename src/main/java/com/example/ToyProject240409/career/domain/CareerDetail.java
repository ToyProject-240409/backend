package com.example.ToyProject240409.career.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "careerDetail")
public class CareerDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "careerDetail_uuid", columnDefinition = "BINARY(16)")
    private UUID careerDetailUuid;

    @ManyToOne
    @JoinColumn(name = "career_uuid")
    private Career career;

    private String address;

    private String detailcourse;

    private String tel;

    private String notice;

}
