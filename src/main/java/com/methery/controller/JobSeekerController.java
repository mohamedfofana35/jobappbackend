package com.methery.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.methery.model.JobSeeker;
import com.methery.service.JobSeekerService;

import jakarta.persistence.Entity;

import java.util.List;

@RestController
@RequestMapping("/api/jobseekers")
@Entity
public class JobSeekerController {

    private final JobSeekerService jobSeekerService;

    public JobSeekerController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping
    public List<JobSeeker> getAllJobSeekers() {
        return jobSeekerService.getAllJobSeekers();
    }

    @PostMapping
    public ResponseEntity<JobSeeker> createJobSeeker(@RequestBody JobSeeker jobSeeker) {
        return ResponseEntity.ok(jobSeekerService.saveJobSeeker(jobSeeker));
    }
}
