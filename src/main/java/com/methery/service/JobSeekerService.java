package com.methery.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.methery.model.JobSeeker;
import com.methery.repository.JobSeekerRepository;

import java.util.List;

@Service
public class JobSeekerService {
	@Autowired
    private JobSeekerRepository jobSeekerRepository;

    public JobSeekerService(JobSeekerRepository jobSeekerRepository) {
        this.jobSeekerRepository = jobSeekerRepository;
    }

    public List<JobSeeker> getAllJobSeekers() {
        return jobSeekerRepository.findAll();
    }

    public JobSeeker saveJobSeeker(JobSeeker jobSeeker) {
        return jobSeekerRepository.save(jobSeeker);
    }
}
