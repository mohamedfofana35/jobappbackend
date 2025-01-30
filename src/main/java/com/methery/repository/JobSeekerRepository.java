package com.methery.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.methery.model.JobSeeker;
@Repository
public interface JobSeekerRepository extends JpaRepository<JobSeeker, Long> {
}

