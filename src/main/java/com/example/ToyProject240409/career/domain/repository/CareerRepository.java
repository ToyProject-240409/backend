package com.example.ToyProject240409.career.domain.repository;

import com.example.ToyProject240409.career.domain.Career;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CareerRepository extends JpaRepository<Career, UUID> {


}
