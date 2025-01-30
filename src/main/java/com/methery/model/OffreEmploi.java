package com.methery.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OffreEmploi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    private String competencesRequises;
    private String typeContrat;
    private String lieu;
    @ManyToOne
    @JoinColumn(name = "recruteur_id", nullable = false)
    @JsonIgnore
    private Recruteur recruteur;
	private Double salaire;


}
