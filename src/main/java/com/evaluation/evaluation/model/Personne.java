package com.evaluation.evaluation.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class Personne {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String titre;

    @NotBlank
    private String nom;

    @NotBlank
    private String prenom;

    @NotBlank
    private String email;

    @NotBlank
    private String motDePasse;

    @NotBlank
    private String adresse1;

    @NotBlank
    private String adresse2;

    @NotBlank
    private String codePostal;

    @NotBlank
    private String ville;

    @AssertTrue
    private boolean cguAcceptees;


}
