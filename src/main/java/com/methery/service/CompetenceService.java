package com.methery.service;

import com.methery.model.Competence;
import com.methery.repository.CompetenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompetenceService {

    private final CompetenceRepository competenceRepository;

    public CompetenceService(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }

    public List<Competence> getAllCompetences() {
        return competenceRepository.findAll();
    }

    public Optional<Competence> getCompetenceById(Long id) {
        return competenceRepository.findById(id);
    }

 
    public Competence createCompetence(Competence competence) {
        return competenceRepository.save(competence);
    }

   /* public Competence updateCompetence(Long id, Competence competenceDetails) {
        return competenceRepository.findById(id).map(competence -> {
            competence.setNomCompetence(competenceDetails.getNomCompetence());
            return competenceRepository.save(competence);
        }).orElseThrow(() -> new RuntimeException("Compétence non trouvée"));
    }
*/
    public void deleteCompetence(Long id) {
        competenceRepository.deleteById(id);
    }
}
