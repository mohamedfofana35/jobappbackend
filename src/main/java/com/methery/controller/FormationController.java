package com.methery.controller;

import com.methery.model.Formation;
import com.methery.service.FormationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/formations")
public class FormationController {

    private final FormationService formationService;

    public FormationController(FormationService formationService) {
        this.formationService = formationService;
    }

    @GetMapping
    public List<Formation> getAllFormations() {
        return formationService.getAllFormations();
    }

    /*@GetMapping("/{id}")
    public ResponseEntity<Formation> getFormationById(@PathVariable Long id) {
        Optional<Formation> formation = formationService.getFormationById(id);
        return formation.map(ResponseEntity::ok)
                         .orElseGet(() -> ResponseEntity.notFound().build());
    }*/

    @GetMapping("/candidat/{candidatId}")
    public List<Formation> getFormationsByCandidat(@PathVariable Long candidatId) {
        return formationService.getFormationsByCandidatId(candidatId);
    }

    @PostMapping
    public Formation createFormation(@RequestBody Formation formation) {
        return formationService.createFormation(formation);
    }

  /*  @PutMapping("/{id}")
    public ResponseEntity<Formation> updateFormation(@PathVariable Long id, @RequestBody Formation formationDetails) {
        try {
            Formation updatedFormation = formationService.updateFormation(id, formationDetails);
            return ResponseEntity.ok(updatedFormation);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
*/
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFormation(@PathVariable Long id) {
        formationService.deleteFormation(id);
        return ResponseEntity.noContent().build();
    }
}
