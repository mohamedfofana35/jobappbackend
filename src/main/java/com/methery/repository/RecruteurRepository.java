package com.methery.repository;

import com.methery.model.Recruteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruteurRepository extends JpaRepository<Recruteur, Long> {
    // Vous pouvez ajouter des méthodes de recherche personnalisées ici si nécessaire
    Recruteur findByEmail(String email);
}
