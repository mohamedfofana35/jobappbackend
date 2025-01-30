package com.methery.service;

import com.methery.model.Experience;
import com.methery.repository.ExperienceRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ExperienceService {

    private final ExperienceRepository experienceRepository;

    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    public List<Experience> getAllExperiences() {
        return experienceRepository.findAll();
    }

    public Optional<Experience> getExperienceById(Long id) {
        return experienceRepository.findById(id);
    }

    public List<Experience> getExperiencesByCandidatId(Long candidatId) {
        return experienceRepository.findByCandidatId(candidatId);
    }

    public Experience createExperience(Experience experience) {
        return experienceRepository.save(experience);
    }

    /*public Experience updateExperience(Long id, Experience experienceDetails) {
        return experienceRepository.findById(id).map(experience -> {
            experience.setNomEntreprise(experienceDetails.getNomEntreprise());
            experience.setTitrePoste(experienceDetails.getTitrePoste());
            experience.setDateDebut(experienceDetails.getDateDebut());
            experience.setDateFin(experienceDetails.getDateFin());
            experience.setDescription(experienceDetails.getDescription());
            return experienceRepository.save(experience);
        }).orElseThrow(() -> new RuntimeException("Expérience non trouvée"));
    }*/

    public void deleteExperience(Long id) {
        experienceRepository.deleteById(id);
    }
}
