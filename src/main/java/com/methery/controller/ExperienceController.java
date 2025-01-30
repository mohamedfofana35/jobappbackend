package com.methery.controller;

import com.methery.model.Experience;
import com.methery.service.ExperienceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/experiences")
public class ExperienceController {

    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping
    public List<Experience> getAllExperiences() {
        return experienceService.getAllExperiences();
    }

   /* @GetMapping("/{id}")
    public ResponseEntity<Experience> getExperienceById(@PathVariable Long id) {
        Optional<Experience> experience = experienceService.getExperienceById(id);
        return experience.map(ResponseEntity::ok)
                         .orElseGet(() -> ResponseEntity.notFound().build());
    }
*/
    @GetMapping("/candidat/{candidatId}")
    public List<Experience> getExperiencesByCandidat(@PathVariable Long candidatId) {
        return experienceService.getExperiencesByCandidatId(candidatId);
    }

    @PostMapping
    public Experience createExperience(@RequestBody Experience experience) {
        return experienceService.createExperience(experience);
    }

    /*@PutMapping("/{id}")
    public ResponseEntity<Experience> updateExperience(@PathVariable Long id, @RequestBody Experience experienceDetails) {
        try {
            Experience updatedExperience = experienceService.updateExperience(id, experienceDetails);
            return ResponseEntity.ok(updatedExperience);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }*/

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExperience(@PathVariable Long id) {
        experienceService.deleteExperience(id);
        return ResponseEntity.noContent().build();
    }
}
