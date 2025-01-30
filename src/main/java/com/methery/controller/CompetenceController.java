package com.methery.controller;

import com.methery.model.Competence;
import com.methery.service.CompetenceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/competences")
public class CompetenceController {

    private final CompetenceService competenceService;

    public CompetenceController(CompetenceService competenceService) {
        this.competenceService = competenceService;
    }

    @GetMapping
    public List<Competence> getAllCompetences() {
        return competenceService.getAllCompetences();
    }

  /*  @GetMapping("/{id}")
    public ResponseEntity<Competence> getCompetenceById(@PathVariable Long id) {
        Optional<Competence> competence = competenceService.getCompetenceById(id);
        return competence.map(ResponseEntity::ok)
                         .orElseGet(() -> ResponseEntity.notFound().build());
    }
*/
    @GetMapping("/candidat/{candidatId}")
    public List<Competence> getCompetencesByCandidat(@PathVariable Long candidatId) {
        return competenceService.getCompetencesByCandidatId(candidatId);
    }

    @PostMapping
    public Competence createCompetence(@RequestBody Competence competence) {
        return competenceService.createCompetence(competence);
    }

  /*  @PutMapping("/{id}")
    public ResponseEntity<Competence> updateCompetence(@PathVariable Long id, @RequestBody Competence competenceDetails) {
        try {
            Competence updatedCompetence = competenceService.updateCompetence(id, competenceDetails);
            return ResponseEntity.ok(updatedCompetence);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
*/
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompetence(@PathVariable Long id) {
        competenceService.deleteCompetence(id);
        return ResponseEntity.noContent().build();
    }
}
