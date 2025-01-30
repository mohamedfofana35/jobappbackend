package com.methery.repository;

import com.methery.model.Competence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CompetenceRepository extends JpaRepository<Competence, Long> {
}
