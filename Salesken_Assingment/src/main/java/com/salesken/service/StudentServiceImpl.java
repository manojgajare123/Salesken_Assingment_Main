package com.salesken.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesken.exception.StudentException;
import com.salesken.exception.SubjectException;
import com.salesken.DTO.Students_DTO;
import com.salesken.DTO.Subjects_DTO;
import com.salesken.model.Student;
import com.salesken.model.Subjects_Details;
import com.salesken.repository.StudentRepo;
import com.salesken.repository.SubjectRepo;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
	private StudentRepo studentRepo;
    
    @Autowired
    private SubjectRepo subjectsDetailsRepo;
    
    @Autowired
    private ModelMapper modelMapper;
	
    
	@Override
	public Student registerStudent(Students_DTO studentDto) throws StudentException {
		// TODO Auto-generated method 
		Student student = this.modelMapper.map(studentDto, Student.class);
		return studentRepo.save(student);
		 
	}

	
	@Override
	public List<Students_DTO> getAllStudent() throws StudentException {
		// TODO Auto-generated method stub
		
		List<Student> list = this.studentRepo.findAll();
		List<Students_DTO>  allStudent = list.stream().map((stud)-> this.modelMapper.map(list,Students_DTO.class))
		.collect(Collectors.toList());
		
		return allStudent;
	}

	
	@Override
	public Students_DTO findStudentById(Integer studentId) throws StudentException{
		// TODO Auto-generated method stub
		
		Student student = this.studentRepo.findById(studentId).orElseThrow(()-> new StudentException("Student not found : "+studentId));
		return this.modelMapper.map(student, Students_DTO.class);
		
	}

	

}
