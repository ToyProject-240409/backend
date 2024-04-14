package com.example.ToyProject240409.career.dto;

import lombok.Getter;

import java.util.Date;

@Getter
public class CareerDto {
    private Date schedule;
    private String place;
    private String target;
    private int personnel;

    public CareerDto(Date schedule, String place, String target, int personnel) {
        this.schedule = schedule;
        this.place = place;
        this.target = target;
        this.personnel = personnel;
    }

}
