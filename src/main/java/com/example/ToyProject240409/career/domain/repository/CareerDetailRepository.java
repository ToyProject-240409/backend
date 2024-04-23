package com.example.ToyProject240409.career.domain.repository;

import com.example.ToyProject240409.career.domain.CareerDetail;
import com.example.ToyProject240409.career.dto.CareerDetailDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CareerDetailRepository extends JpaRepository<CareerDetail,UUID> {
    @Query("select new com.example.ToyProject240409.career.dto.CareerDetailDto(d.address, d.detailcourse, d.tel, d.notice) " +
    "FROM CareerDetail d join d.career c " +
    "WHERE c.careerUuid= :careerUuid ")
    List<CareerDetailDto> findDetail(@Param("careerUuid") UUID careerUuid);

}
