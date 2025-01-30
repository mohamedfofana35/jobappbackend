package com.methery.service;

import com.methery.model.Recruteur;
import com.methery.repository.RecruteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecruteurService {

    @Autowired
    private RecruteurRepository recruteurRepository;

    public Recruteur creerRecruteur(Recruteur recruteur) {
        return recruteurRepository.save(recruteur);
    }

    public List<Recruteur> obtenirTousLesRecruteurs() {
        return recruteurRepository.findAll();
    }

    public Optional<Recruteur> obtenirRecruteurParId(Long id) {
        return recruteurRepository.findById(id);
    }

    public Recruteur mettreAJourRecruteur(Long id, Recruteur recruteur) {
        if (recruteurRepository.existsById(id)) {
           // recruteur.setId(id);
            return recruteurRepository.save(recruteur);
        } else {
            throw new RuntimeException("Recruteur non trouvé");
        }
    }

    public void supprimerRecruteur(Long id) {
        recruteurRepository.deleteById(id);
    }

    public Recruteur obtenirRecruteurParEmail(String email) {
        return recruteurRepository.findByEmail(email);
    }
}
