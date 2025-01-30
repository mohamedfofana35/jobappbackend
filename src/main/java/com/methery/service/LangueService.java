package com.methery.service;

import com.methery.model.Langue;
import com.methery.repository.LangueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LangueService {

    private final LangueRepository langueRepository;

    public LangueService(LangueRepository langueRepository) {
        this.langueRepository = langueRepository;
    }

    public List<Langue> getAllLangues() {
        return langueRepository.findAll();
    }

    public Optional<Langue> getLangueById(Long id) {
        return langueRepository.findById(id);
    }

    public List<Langue> getLanguesByCandidatId(Long candidatId) {
        return langueRepository.findByCandidatId(candidatId);
    }

    public Langue createLangue(Langue langue) {
        return langueRepository.save(langue);
    }

    /*public Langue updateLangue(Long id, Langue langueDetails) {
        return langueRepository.findById(id).map(langue -> {
            langue.setNomLangue(langueDetails.getNomLangue());
            langue.setNiveau(langueDetails.getNiveau());
            return langueRepository.save(langue);
        }).orElseThrow(() -> new RuntimeException("Langue non trouvée"));
    }*/

    public void deleteLangue(Long id) {
        langueRepository.deleteById(id);
    }
}
	