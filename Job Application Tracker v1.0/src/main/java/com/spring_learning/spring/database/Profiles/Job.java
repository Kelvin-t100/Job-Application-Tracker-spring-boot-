package com.spring_learning.spring.database.Profiles;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.internal.util.Optional;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    @Size(min=3)
    private String companyname;
    @NotBlank
    @Size(min = 3)
    private String role;
    @Pattern(regexp = "APPLIED|SHORTLISTED|INTERVIEW|REJECTED|OFFER")
    private String status="APPLIED";
    private String notes="no notes yet";
    public Job(){}

    public Job(String companyname,String role){
        this.companyname=companyname;
        this.role=role;
    }

    public void setId(int id){ this.id=id; }
    public void setCompanyname(String companyname){ this.companyname=companyname; }
    public void setRole(String role){this.role=role; }
    public void setStatus(String status){ this.status=status; }
    public void setNotes(String notes){this.notes=notes;}

    public int getId(){return id;}
    public String getCompanyname(){return  companyname; }
    public String getRole(){return role;}
    public String getStatus(){return  status;}
    public String getNotes(){return notes;}
}
