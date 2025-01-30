package com.methery.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.methery.model.JobPost;
import com.methery.repository.JobPostRepository;

import java.util.List;

@Service
public class JobPostService {
	@Autowired
    private JobPostRepository jobPostRepository;

    public JobPostService(JobPostRepository jobPostRepository) {
        this.jobPostRepository = jobPostRepository;
    }

    public List<JobPost> getAllJobPosts() {
        return jobPostRepository.findAll();
    }

    public JobPost saveJobPost(JobPost jobPost) {
        return jobPostRepository.save(jobPost);
    }
}
