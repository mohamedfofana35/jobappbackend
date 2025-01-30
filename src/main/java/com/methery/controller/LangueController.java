package com.methery.controller;

import com.methery.model.Langue;
import com.methery.service.LangueService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/langues")
public class LangueController {

    private final LangueService langueService;

    public LangueController(LangueService langueService) {
        this.langueService = langueService;
    }

    @GetMapping
    public List<Langue> getAllLangues() {
        return langueService.getAllLangues();
    }
/*
    @GetMapping("/{id}")
    public ResponseEntity<Langue> getLangueById(@PathVariable Long id) {
        Optional<Langue> langue = langueService.getLangueById(id);
        return langue.map(ResponseEntity::ok)
                     .orElseGet(() -> ResponseEntity.notFound().build());
    }
*/
    @GetMapping("/candidat/{candidatId}")
    public List<Langue> getLanguesByCandidat(@PathVariable Long candidatId) {
        return langueService.getLanguesByCandidatId(candidatId);
    }

    @PostMapping
    public Langue createLangue(@RequestBody Langue langue) {
        return langueService.createLangue(langue);
    }

  /*  @PutMapping("/{id}")
    public ResponseEntity<Langue> updateLangue(@PathVariable Long id, @RequestBody Langue langueDetails) {
        try {
            Langue updatedLangue = langueService.updateLangue(id, langueDetails);
            return ResponseEntity.ok(updatedLangue);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    */

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLangue(@PathVariable Long id) {
        langueService.deleteLangue(id);
        return ResponseEntity.noContent().build();
    }
}
