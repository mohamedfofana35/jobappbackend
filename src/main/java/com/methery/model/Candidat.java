package com.methery.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidats")
@Getter
@Setter
@ToString
public class Candidat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateNaissance;
    private String email;
    private String telephone;
    private String cv;

    // Relations
    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL)
    private List<Candidature> candidatures;

    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL)
    private List<Experience> experiences;

    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL)
    private List<Formation> formations;
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "candidat_competence",
        joinColumns = @JoinColumn(name = "candidat_id"),
        inverseJoinColumns = @JoinColumn(name = "competence_id")
    )
    private List<Competence> competences;


	
}
