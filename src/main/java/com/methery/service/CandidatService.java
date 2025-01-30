package com.methery.service;

import com.methery.model.Candidat;
import com.methery.repository.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CandidatService {

    private final CandidatRepository candidatRepository;

    @Autowired
    public CandidatService(CandidatRepository candidatRepository) {
        this.candidatRepository = candidatRepository;
    }

    public List<Candidat> getAllCandidats() {
        return candidatRepository.findAll();
    }

    public Optional<Candidat> getCandidatById(Long id) {
        return candidatRepository.findById(id);
    }

    public Candidat addCandidat(Candidat candidat) {
        return candidatRepository.save(candidat);
    }

  /*  public Candidat updateCandidat(Long id, Candidat candidatDetails) {
        return candidatRepository.findById(id).map(candidat -> {
            candidat.setNom(candidatDetails.getNom());
            candidat.setPrenom(candidatDetails.getPrenom());
            candidat.setDateNaissance(candidatDetails.getDateNaissance());
            candidat.setEmail(candidatDetails.getEmail());
            candidat.setTelephone(candidatDetails.getTelephone());
            candidat.setCv(candidatDetails.getCv());
            return candidatRepository.save(candidat);
        }).orElseThrow(() -> new RuntimeException("Candidat non trouvé"));
    }
*/
    public void deleteCandidat(Long id) {
        candidatRepository.deleteById(id);
    }
}
