package com.methery.service;

import com.methery.model.Candidature;
import com.methery.repository.CandidatureRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CandidatureService {

    private final CandidatureRepository candidatureRepository;

    public CandidatureService(CandidatureRepository candidatureRepository) {
        this.candidatureRepository = candidatureRepository;
    }

    public List<Candidature> getAllCandidatures() {
        return candidatureRepository.findAll();
    }

    public Optional<Candidature> getCandidatureById(Long id) {
        return candidatureRepository.findById(id);
    }

    public List<Candidature> getCandidaturesByCandidatId(Long candidatId) {
        return candidatureRepository.findByCandidatId(candidatId);
    }

    public List<Candidature> getCandidaturesByOffreId(Long offreId) {
        return candidatureRepository.findByOffreEmploiId(offreId);
    }

    public Candidature createCandidature(Candidature candidature) {
        return candidatureRepository.save(candidature);
    }

    /*public Candidature updateCandidature(Long id, Candidature candidatureDetails) {
        return candidatureRepository.findById(id).map(candidature -> {
            candidature.setDateCandidature(candidatureDetails.getDateCandidature());
            candidature.setStatut(candidatureDetails.getStatut());
            return candidatureRepository.save(candidature);
        }).orElseThrow(() -> new RuntimeException("Candidature non trouvée"));
    }*/

    public void deleteCandidature(Long id) {
        candidatureRepository.deleteById(id);
    }
}
