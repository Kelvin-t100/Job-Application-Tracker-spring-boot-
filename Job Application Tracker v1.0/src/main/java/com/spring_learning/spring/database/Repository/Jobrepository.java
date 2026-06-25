package com.spring_learning.spring.database.Repository;

import com.spring_learning.spring.database.Profiles.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Jobrepository extends JpaRepository<Job,Integer> {
    List<Job> findByCompanyname(String name);

    List<Job> findByStatus(String name);

    List<Job> findByRole(String name);
}
