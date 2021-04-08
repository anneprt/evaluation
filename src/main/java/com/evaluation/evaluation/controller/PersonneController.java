package com.evaluation.evaluation.controller;

import com.evaluation.evaluation.model.Personne;
import com.evaluation.evaluation.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/personnes")
@CrossOrigin("*")
public class PersonneController {

    @Autowired
    private PersonneService personneService;

    /**
     * Read-recuperer toutes les personnes
     *
     * @return une liste de personnes completes
     */
    @GetMapping
    public List<Personne> getPersonnes() {
        return personneService.getPersonnes();
    }

    /**
     * Read-recuperer une seule personne
     *
     * @param id-l'id de la personne
     * @return un objet personne complet
     */
    @GetMapping("/{id}")
    public Personne getPersonne(@PathVariable("id") final Long id) {
        return personneService.getPersonne(id).orElse(null);
    }

    /**
     * Create-ajouter une nouvelle personne
     *
     * @param personne un objet perso,,e
     * @return un objet personne complet
     */
    @PostMapping
    public ResponseEntity<Personne> createPersonne(@Valid @RequestBody Personne personne) {
        return ResponseEntity.status(201).body(personneService.createPersonne(personne));
    }

    /**
     * Update-Modifier une personne existante
     *
     * @param id  -l'id de la personne à modifier
     * @param personne-l'objet personne mis à jour
     */
    @PutMapping("/{id}")
    public Personne updatePersonne(@Valid @RequestBody Personne personne, @PathVariable("id") final Long id) {
        return personneService.updatePersonne(id, personne);
    }

    /**
     * Delete-supprimer une personne
     *
     * @param id- l'id de la personne à supprimer
     */
    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable("id") final Long id) {
        personneService.deletePersonne(id);
    }
}
