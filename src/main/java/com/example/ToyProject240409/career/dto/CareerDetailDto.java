package com.example.ToyProject240409.career.dto;

import com.example.ToyProject240409.career.domain.CareerDetail;
import lombok.Getter;

@Getter
public class CareerDetailDto {
    private String address;
    private String detailcourse;
    private String tel;
    private String notice;

    public CareerDetailDto(String address, String detailcourse, String tel, String notice) {
        this.address = address;
        this.detailcourse = detailcourse;
        this.tel = tel;
        this.notice = notice;
    }

}
