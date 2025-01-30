package com.methery.controller;

import com.methery.model.Candidature;
import com.methery.service.CandidatureService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/candidatures")
public class CandidatureController {

    private final CandidatureService candidatureService;

    public CandidatureController(CandidatureService candidatureService) {
        this.candidatureService = candidatureService;
    }

    @GetMapping
    public List<Candidature> getAllCandidatures() {
        return candidatureService.getAllCandidatures();
    }

   /* @GetMapping("/{id}")
    public ResponseEntity<Candidature> getCandidatureById(@PathVariable Long id) {
        Optional<Candidature> candidature = candidatureService.getCandidatureById(id);
        return candidature.map(ResponseEntity::ok)
                         .orElseGet(() -> ResponseEntity.notFound().build());
    }*/

    @GetMapping("/candidat/{candidatId}")
    public List<Candidature> getCandidaturesByCandidat(@PathVariable Long candidatId) {
        return candidatureService.getCandidaturesByCandidatId(candidatId);
    }

    @GetMapping("/offre/{offreId}")
    public List<Candidature> getCandidaturesByOffre(@PathVariable Long offreId) {
        return candidatureService.getCandidaturesByOffreId(offreId);
    }

    @PostMapping
    public Candidature createCandidature(@RequestBody Candidature candidature) {
        return candidatureService.createCandidature(candidature);
    }

    /*@PutMapping("/{id}")
    public ResponseEntity<Candidature> updateCandidature(@PathVariable Long id, @RequestBody Candidature candidatureDetails) {
        try {
            Candidature updatedCandidature = candidatureService.updateCandidature(id, candidatureDetails);
            return ResponseEntity.ok(updatedCandidature);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }*/

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCandidature(@PathVariable Long id) {
        candidatureService.deleteCandidature(id);
        return ResponseEntity.noContent().build();
    }
}
