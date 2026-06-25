package com.spring_learning.spring.database.Services;

import com.spring_learning.spring.database.Exceptions.JobNotFoundException;
import com.spring_learning.spring.database.Profiles.Job;
import com.spring_learning.spring.database.Repository.Jobrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Jobservice {

    @Autowired
    Jobrepository repo;

    public ResponseEntity<String> newentry(Job j){
        repo.save(j);
        return ResponseEntity.status(200).body("application entered");
    }
    public ResponseEntity<List<Job>> searchbyname(String name){
        List<Job> list=repo.findByCompanyname(name);
        if(list.isEmpty()){
            throw new JobNotFoundException();
        }
        return ResponseEntity.status(200).body(list);
    }
    public ResponseEntity<List<Job>> searchbystatus(String name){
        List<Job> list=repo.findByStatus(name);
        if(list.isEmpty()){
            throw new JobNotFoundException();
        }
        return ResponseEntity.status(200).body(list);
    }
    public ResponseEntity<List<Job>> searchbyrole(String name){
        List<Job> list=repo.findByRole(name);
        if(list.isEmpty()){
            throw new JobNotFoundException();
        }
        return ResponseEntity.status(200).body(list);
    }
    public ResponseEntity<Job> searchbyid(int id){
        Optional<Job> list=repo.findById(id);
        if(list.isEmpty()){
            throw new JobNotFoundException();
        }
        return ResponseEntity.status(200).body(list.get());
    }

    public Page<Job> getall(Pageable size){
       return repo.findAll(size);
    }

    public ResponseEntity<String> update(int id,Job j){
        Optional<Job> job=repo.findById(id);
        if(job.isEmpty()){
            throw new JobNotFoundException();
        }
         Job temp=job.get();
        temp.setId(id);
        temp.setStatus(j.getStatus());
        repo.save(temp);
        return ResponseEntity.status(200).body("upadated");
    }
}
