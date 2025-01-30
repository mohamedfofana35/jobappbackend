package com.methery.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.methery.model.JobPost;
import com.methery.service.JobPostService;

import jakarta.persistence.Entity;

import java.util.List;

@RestController
@RequestMapping("/api/jobposts")
@Entity
public class JobPostController {

    private final JobPostService jobPostService;

    public JobPostController(JobPostService jobPostService) {
        this.jobPostService = jobPostService;
    }

    @GetMapping
    public List<JobPost> getAllJobPosts() {
        return jobPostService.getAllJobPosts();
    }

    @PostMapping
    public ResponseEntity<JobPost> createJobPost(@RequestBody JobPost jobPost) {
        return ResponseEntity.ok(jobPostService.saveJobPost(jobPost));
    }
}
