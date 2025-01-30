package com.methery.model;


import org.springframework.stereotype.Component;

import jakarta.persistence.*;
@Component
@Entity // Indique que cette classe est une entité JPA
@Table(name = "job_seekers") // Spécifie le nom de la table
public class JobSeeker {
    
    @Id // Indique la clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrément dans la base de données
    private Long id;

    @Column(nullable = false) // Non null dans la base de données
    private String name;

    @Column(unique = true, nullable = false) // Champ unique
    private String email;

    @Column(name = "resume_link") // Nom de la colonne dans la table
    private String resumeLink;

    private String skills;

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResumeLink() {
        return resumeLink;
    }

    public void setResumeLink(String resumeLink) {
        this.resumeLink = resumeLink;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
