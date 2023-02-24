package com.salesken.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.OneToMany;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="Student_Id" , unique = true)
	
	private Integer studentId;
	
	private String studentname;
	
	private String studentemail;
	
	private String studentgender;
	
	private String studentmobileNumber;
	
	@OneToMany
	private List<Subjects_Details> subDetails = new ArrayList<>();
}
