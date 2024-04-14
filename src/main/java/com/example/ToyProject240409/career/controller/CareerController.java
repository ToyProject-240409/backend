package com.example.ToyProject240409.career.controller;

import com.example.ToyProject240409.career.dto.CareerDetailDto;
import com.example.ToyProject240409.career.dto.CareerDto;
import com.example.ToyProject240409.career.service.CareerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/career")
public class CareerController {
    private final CareerService careerService;

    @GetMapping("")
    public ResponseEntity<List<CareerDto>> getCareer() {
        List<CareerDto> careerDtos = careerService.getCareer();
        return ResponseEntity.ok(careerDtos);
    }

    @GetMapping("/{careerUuid}")
    public ResponseEntity<List<CareerDetailDto>> getCareerDetail(@PathVariable UUID careerUuid) {
        List<CareerDetailDto> careerDetailDtos = careerService.getDetail(careerUuid);
        return ResponseEntity.ok(careerDetailDtos);
    }
    

}



