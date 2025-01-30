package com.methery.service;

import com.methery.model.OffreEmploi;
import com.methery.repository.OffreEmploiRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OffreEmploiService {

    private final OffreEmploiRepository offreEmploiRepository;

    public OffreEmploiService(OffreEmploiRepository offreEmploiRepository) {
        this.offreEmploiRepository = offreEmploiRepository;
    }

    public List<OffreEmploi> getAllOffres() {
        return offreEmploiRepository.findAll();
    }

    public Optional<OffreEmploi> getOffreById(Long id) {
        return offreEmploiRepository.findById(id);
    }

    public List<OffreEmploi> getOffresByRecruteurId(Long recruteurId) {
        return offreEmploiRepository.findByRecruteurId(recruteurId);
    }

    public OffreEmploi createOffre(OffreEmploi offre) {
        return offreEmploiRepository.save(offre);
    }

    /*public OffreEmploi updateOffre(Long id, OffreEmploi offreDetails) {
        return offreEmploiRepository.findById(id).map(offre -> {
            offre.setTitre(offreDetails.getTitre());
            offre.setDescription(offreDetails.getDescription());
            offre.setCompetencesRequises(offreDetails.getCompetencesRequises());
            offre.setTypeContrat(offreDetails.getTypeContrat());
            offre.setLieu(offreDetails.getLieu());
            offre.setSalaire(offreDetails.getSalaire());
            return offreEmploiRepository.save(offre);
        }).orElseThrow(() -> new RuntimeException("Offre d'emploi non trouvée"));
    }*/

    public void deleteOffre(Long id) {
        offreEmploiRepository.deleteById(id);
    }
}
