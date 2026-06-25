package com.spring_learning.spring.database.Controllers;

import com.spring_learning.spring.database.Jobtracker;
import com.spring_learning.spring.database.Profiles.Job;
import com.spring_learning.spring.database.Services.Jobservice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Jobcontroller {

    @Autowired
    Jobservice service;

    @PostMapping("/newapplication")
    public ResponseEntity<String> newentry(@Valid @RequestBody Job j){
    return service.newentry(j);
    }

    @GetMapping("/search/company/{companyname}")
    public ResponseEntity<List<Job>> searchnyname(@PathVariable String companyname){
        return service.searchbyname(companyname);
    }
    @GetMapping("/search/status/{status}")
    public ResponseEntity<List<Job>> searchbystatus(@PathVariable String status){
        return service.searchbystatus(status);
    }
    @GetMapping("/search/role/{role}")
    public ResponseEntity<List<Job>> searchbyrole(@PathVariable String role){
        return service.searchbyrole(role);
    }

    @GetMapping("/search/id/{id}")
    public ResponseEntity<Job> searchbyid(@PathVariable int id){
        return service.searchbyid(id);
    }

    @GetMapping("/getall")
    public ResponseEntity<Page<Job>> getjob(Pageable size){
        return ResponseEntity.ok(service.getall(size));
    }

    @PatchMapping("update/status/{id}")
    public ResponseEntity<String> update(@PathVariable int id, @RequestBody Job j){
        return service.update(id,j);
    }
}
