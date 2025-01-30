package com.methery.controller;

import com.methery.model.Candidat;
import com.methery.service.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/candidats")
public class CandidatController {

    private final CandidatService candidatService;

    @Autowired
    public CandidatController(CandidatService candidatService) {
        this.candidatService = candidatService;
    }

    @GetMapping
    public List<Candidat> getAllCandidats() {
        return candidatService.getAllCandidats();
    }

    @GetMapping("/{id}")
    public Optional<Candidat> getCandidatById(@PathVariable Long id) {
        return candidatService.getCandidatById(id);
    }

    @PostMapping
    public Candidat addCandidat(@RequestBody Candidat candidat) {
        return candidatService.addCandidat(candidat);
    }

  /*  @PutMapping("/{id}")
    public Candidat updateCandidat(@PathVariable Long id, @RequestBody Candidat candidat) {
        return candidatService.updateCandidat(id, candidat);
    }*/

    @DeleteMapping("/{id}")
    public void deleteCandidat(@PathVariable Long id) {
        candidatService.deleteCandidat(id);
    }
}
