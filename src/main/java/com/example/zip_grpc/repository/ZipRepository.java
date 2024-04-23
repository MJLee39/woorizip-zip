package com.example.zip_grpc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.zip_grpc.entity.Zip;
import org.springframework.data.jpa.repository.Query;

public interface ZipRepository extends JpaRepository<Zip, String> {

    List<Zip> findByShowYes(String showYes);

    List<Zip> findByAgentId(String id);

    List<Zip> findByEstateId(String estateId);

    @Query("select z from Zip z where (z.estateId, z.fee) in (select z2.estateId, min(z2.fee) from Zip z2 group by z2.estateId) and z.showYes = :showYes")
    List<Zip> findMinFeeByEstateId(String showYes);

}
