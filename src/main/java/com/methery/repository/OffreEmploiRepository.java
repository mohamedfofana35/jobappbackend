package com.methery.repository;

import com.methery.model.OffreEmploi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OffreEmploiRepository extends JpaRepository<OffreEmploi, Long> {
//    List<OffreEmploi> findByRecruteurId(Long recruteurId);
	
}
