package com.methery.repository;

import com.methery.model.Langue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LangueRepository extends JpaRepository<Langue, Long> {
    List<Langue> findByCandidatId(Long candidatId);
}
