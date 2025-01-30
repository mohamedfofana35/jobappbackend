package com.methery.controller;

import com.methery.model.OffreEmploi;
import com.methery.service.OffreEmploiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/offres")
public class OffreEmploiController {

    private final OffreEmploiService offreEmploiService;

    public OffreEmploiController(OffreEmploiService offreEmploiService) {
        this.offreEmploiService = offreEmploiService;
    }

    @GetMapping
    public List<OffreEmploi> getAllOffres() {
        return offreEmploiService.getAllOffres();
    }
/*
    @GetMapping("/{id}")
    public ResponseEntity<OffreEmploi> getOffreById(@PathVariable Long id) {
        Optional<OffreEmploi> offre = offreEmploiService.getOffreById(id);
        return offre.map(ResponseEntity::ok)
                     .orElseGet(() -> ResponseEntity.notFound().build());
    }
*/
    @GetMapping("/recruteur/{recruteurId}")
    public List<OffreEmploi> getOffresByRecruteur(@PathVariable Long recruteurId) {
        return offreEmploiService.getOffresByRecruteurId(recruteurId);
    }

    @PostMapping
    public OffreEmploi createOffre(@RequestBody OffreEmploi offre) {
        return offreEmploiService.createOffre(offre);
    }
/*
    @PutMapping("/{id}")
    public ResponseEntity<OffreEmploi> updateOffre(@PathVariable Long id, @RequestBody OffreEmploi offreDetails) {
        try {
            OffreEmploi updatedOffre = offreEmploiService.updateOffre(id, offreDetails);
            return ResponseEntity.ok(updatedOffre);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    */

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOffre(@PathVariable Long id) {
        offreEmploiService.deleteOffre(id);
        return ResponseEntity.noContent().build();
    }
}
