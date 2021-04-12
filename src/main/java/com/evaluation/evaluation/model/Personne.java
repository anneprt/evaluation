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
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Veuillez renseigner un titre")
    private String titre;

    @NotBlank(message = "Veuillez renseigner un nom")
    private String nom;

    @NotBlank(message = "Veuillez renseigner un prenom")
    private String prenom;

    @NotBlank(message = "Veuillez renseigner un email valide")
    private String email;

    @NotBlank(message = "Veuillez renseigner un mot de passe")
    private String motDePasse;

    @NotBlank(message = "Veuillez renseigner une adresse")
    private String adresse1;

    private String adresse2;

    @NotBlank(message = "Veuillez renseigner un code postal")
    private String codePostal;

    @NotBlank(message = "Veuillez renseigner la ville")
    private String ville;

    @AssertTrue(message = "Erreur lors de l'enregistrement : vous devez accepter les CGU")
    private boolean cguAcceptees;


}
