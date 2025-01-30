package com.methery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.methery.model.Candidat;

@Repository
public interface CandidatRepository extends JpaRepository<Candidat, Long> {
}
