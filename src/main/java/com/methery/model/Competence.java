package com.methery.model;

import java.util.Date;
import java.util.List;

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
public class Competence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomCompetence;

 /*   @ManyToOne
    @JoinColumn(name = "candidat_id", nullable = false)
    private Candidat candidat;
  */  
    @ManyToMany(mappedBy = "competences") 
    private List<Candidat> candidats;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomCompetence() {
		return nomCompetence;
	}

	public void setNomCompetence(String nomCompetence) {
		this.nomCompetence = nomCompetence;
	}

	public List<Candidat> getCandidats() {
		return candidats;
	}

	public void setCandidats(List<Candidat> candidats) {
		this.candidats = candidats;
	}
    

}
