package com.salesken.DTO;

import com.salesken.model.Semester;
import com.salesken.model.Subjects;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data

public class Subjects_DTO {


	@NotEmpty
	@NotNull
	private Semester semester;
	
	
	@NotEmpty
	@NotNull
	
	private Subjects subjects;
	
	
	@NotEmpty
	@NotNull
	@Max(value = 100, message = "Marks should not be more than 100")
	private double marks;
}
