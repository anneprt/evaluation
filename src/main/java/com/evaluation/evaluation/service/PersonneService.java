package com.evaluation.evaluation.service;

import com.evaluation.evaluation.exception.PersonneIntrouvableException;
import com.evaluation.evaluation.model.Personne;
import com.evaluation.evaluation.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonneService {

    @Autowired
    private PersonneRepository personneRepository;

    public Optional<Personne> getPersonne(final Long id) {
        return personneRepository.findById(id);
    }

    public List<Personne> getPersonnes() {
        return personneRepository.findAll();
    }

    public void deletePersonne(final Long id) {
        personneRepository.deleteById(id);
    }

    public Personne createPersonne(Personne personne) {
        Personne u = new Personne();
        return saveWithNewValues(personne, u);
    }

    public Personne updatePersonne(Long id, Personne personne) {
        if (id == null) {
            throw new PersonneIntrouvableException("L'utilisateur n'existe pas");
        }

        Personne u = this.getPersonne(id).orElseThrow(() -> new PersonneIntrouvableException("L'utilisateur n'existe pas"));

        return saveWithNewValues(personne, u);
    }

    private Personne saveWithNewValues(Personne personne, Personne u) {
        u.setTitre(personne.getTitre());
        u.setNom(personne.getNom());
        u.setPrenom(personne.getPrenom());
        u.setEmail(personne.getEmail());
        u.setMotDePasse(personne.getMotDePasse());
        u.setAdresse1(personne.getAdresse1());
        u.setAdresse2(personne.getAdresse2());
        u.setCodePostal(personne.getCodePostal());
        u.setVille(personne.getVille());
        u.setCguAcceptees(personne.isCguAcceptees());
        return personneRepository.save(u);
    }
}
