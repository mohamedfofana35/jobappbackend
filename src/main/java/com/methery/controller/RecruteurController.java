package com.methery.controller;

import com.methery.model.Recruteur;
import com.methery.service.RecruteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/recruteurs")
public class RecruteurController {

    @Autowired
    private RecruteurService recruteurService;

    @PostMapping
    public ResponseEntity<Recruteur> creerRecruteur(@RequestBody Recruteur recruteur) {
        Recruteur createdRecruteur = recruteurService.creerRecruteur(recruteur);
        return ResponseEntity.ok(createdRecruteur);
    }

    @GetMapping
    public ResponseEntity<List<Recruteur>> obtenirTousLesRecruteurs() {
        List<Recruteur> recruteurs = recruteurService.obtenirTousLesRecruteurs();
        return ResponseEntity.ok(recruteurs);
    }
/*
    @GetMapping("/{id}")
    public ResponseEntity<Recruteur> obtenirRecruteurParId(@PathVariable Long id) {
        Optional<Recruteur> recruteur = recruteurService.obtenirRecruteurParId(id);
        return recruteur.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
*/
    @PutMapping("/{id}")
    public ResponseEntity<Recruteur> mettreAJourRecruteur(@PathVariable Long id, @RequestBody Recruteur recruteur) {
        try {
            Recruteur updatedRecruteur = recruteurService.mettreAJourRecruteur(id, recruteur);
            return ResponseEntity.ok(updatedRecruteur);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> supprimerRecruteur(@PathVariable Long id) {
        recruteurService.supprimerRecruteur(id);
        return ResponseEntity.noContent().build();
    }
/*
    @GetMapping("/email/{email}")
    public ResponseEntity<Recruteur> obtenirRecruteurParEmail(@PathVariable String email) {
        Recruteur recruteur = recruteurService.obtenirRecruteurParEmail(email);
        return recruteur != null ? ResponseEntity.ok(recruteur) : ResponseEntity.notFound().build();
    }*/
}
