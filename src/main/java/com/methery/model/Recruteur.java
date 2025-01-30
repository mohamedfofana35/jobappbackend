	package com.methery.model;
	
	import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
	import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
	import java.util.List;
	
	@Entity
	@ToString
	@Data
	@Getter
	@Setter
	
	public class Recruteur {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	
	    private String nom;
	    private String prenom;
		private String email;
		
	    private String numeroTelephone;
	
	    @Temporal(TemporalType.DATE)
	    @JsonFormat(pattern = "yyyy-MM-dd")
	    private Date dateEmbauche; // Date de l'embauche ou de la création du recruteur
	    @OneToMany(mappedBy = "recruteur", cascade = CascadeType.ALL)
	    private List<OffreEmploi> offreEmplois;
	
	    	   }
