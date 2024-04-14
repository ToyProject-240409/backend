package com.example.ToyProject240409.career.service;

import com.example.ToyProject240409.career.domain.Career;
import com.example.ToyProject240409.career.domain.CareerDetail;
import com.example.ToyProject240409.career.domain.repository.CareerDetailRepository;
import com.example.ToyProject240409.career.domain.repository.CareerRepository;
import com.example.ToyProject240409.career.dto.CareerDetailDto;
import com.example.ToyProject240409.career.dto.CareerDto;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class CareerService {
    private final CareerRepository careerRepository;
    private final CareerDetailRepository careerDetailRepository;

    public CareerService(CareerRepository careerRepository, CareerDetailRepository careerDetailRepository) {
        this.careerRepository = careerRepository;
        this.careerDetailRepository = careerDetailRepository;
    }
    public List<CareerDto> getCareer(){
        List<Career> careers = careerRepository.findAll();
        List<CareerDto> careerDtos = careers.stream()
                .map(career -> new CareerDto(
                        career.getSchedule(),
                        career.getPlace(),
                        career.getTarget(),
                        career.getPersonnel()))
                .collect(Collectors.toList());
        return careerDtos;
    }

    public List<CareerDetailDto> getDetail(UUID careerUuid) {
        Optional<CareerDetail> careerDetails = careerDetailRepository.findById(careerUuid);
        List<CareerDetailDto> careerDetailDtos = careerDetails.stream()
                .map(careerDetail -> new CareerDetailDto(
                        careerDetail.getAddress(),
                        careerDetail.getDetailcourse(),
                        careerDetail.getTel(),
                        careerDetail.getNotice()))
                .collect(Collectors.toList());
        return careerDetailDtos;

    }
}
