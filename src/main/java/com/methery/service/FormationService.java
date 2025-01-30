package com.methery.service;

import com.methery.model.Formation;
import com.methery.repository.FormationRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FormationService {

    private final FormationRepository formationRepository;

    public FormationService(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    public List<Formation> getAllFormations() {
        return formationRepository.findAll();
    }

    public Optional<Formation> getFormationById(Long id) {
        return formationRepository.findById(id);
    }

    public List<Formation> getFormationsByCandidatId(Long candidatId) {
        return formationRepository.findByCandidatId(candidatId);
    }

    public Formation createFormation(Formation formation) {
        return formationRepository.save(formation);
    }

    /*public Formation updateFormation(Long id, Formation formationDetails) {
        return formationRepository.findById(id).map(formation -> {
            formation.setEtablissement(formationDetails.getEtablissement());
            formation.setDiplome(formationDetails.getDiplome());
            formation.setDateObtention(formationDetails.getDateObtention());
            return formationRepository.save(formation);
        }).orElseThrow(() -> new RuntimeException("Formation non trouvée"));
    }*/

    public void deleteFormation(Long id) {
        formationRepository.deleteById(id);
    }
}
