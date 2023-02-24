package com.salesken.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Subjects_Details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer Subjectid;
	
	private Semester Subjectsemester;
	
	private Subjects Subjectsubjects;
	
	private double Subjectmarks;
	
}
