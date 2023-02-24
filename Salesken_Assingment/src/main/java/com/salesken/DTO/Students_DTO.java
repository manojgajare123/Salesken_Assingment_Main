package com.salesken.DTO;



import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Students_DTO {

	
	
	@NotEmpty
	@NotNull
	private String student_name;
	


	@NotEmpty
	@NotNull
	@Email
	private String student_email;
	


	@NotEmpty
	@NotNull
	private String student_gender;
	


	@NotEmpty
	@NotNull
	private String student_mobileNumber;
}
