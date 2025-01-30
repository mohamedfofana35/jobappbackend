package com.methery.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.methery.model.JobPost;
@Repository
public interface JobPostRepository extends JpaRepository<JobPost, Long> {
}
