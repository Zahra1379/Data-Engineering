package com.example.batchprocessing.repository;

import com.example.batchprocessing.model.CryptoSavedData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CryptoSavedRepository extends JpaRepository<CryptoSavedData, Long> {
}
