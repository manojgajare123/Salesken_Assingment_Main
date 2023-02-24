package com.salesken.service;

import java.util.List;

import com.salesken.DTO.Students_DTO;
import com.salesken.DTO.Subjects_DTO;
import com.salesken.exception.StudentException;
import com.salesken.exception.SubjectException;
import com.salesken.model.Student;

public interface StudentService {

	
	Student registerStudent(Students_DTO studentDto)throws StudentException;
	
	List<Students_DTO> getAllStudent()throws StudentException;
	
	Students_DTO findStudentById(Integer studentId)throws StudentException;
	
}
