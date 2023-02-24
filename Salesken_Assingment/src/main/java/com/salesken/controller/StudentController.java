package com.salesken.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.salesken.DTO.Students_DTO;
import com.salesken.DTO.Subjects_DTO;
import com.salesken.exception.StudentException;
import com.salesken.exception.SubjectException;
import com.salesken.model.Student;
import com.salesken.service.StudentService;
import com.salesken.service.SubjectsService;
import jakarta.validation.Valid;



@RestController
@RequestMapping("/Student")
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private SubjectsService subjectService;
	
	
	@PostMapping("/save")
	public ResponseEntity<Student> addStudent(@Valid @RequestBody Students_DTO student) throws StudentException{
		Student registerStudent = studentService.registerStudent(student) ;
		return new ResponseEntity<Student>(registerStudent,HttpStatus.CREATED) ;
	}
	
	
	@GetMapping("/all")
	
	public ResponseEntity<List<Students_DTO>> getAllStudent() throws StudentException{
		return ResponseEntity.ok(this.studentService.getAllStudent());

	}
	
	
	@GetMapping("/topTwoStudents")
	 public ResponseEntity<List<Object[]>> gettop2ConsistentStudents() throws SubjectException{
		return new ResponseEntity<List<Object[]>>(subjectService.top2ConsistentStudents(),HttpStatus.OK);
	 }
	
	
	@GetMapping("/averageMarks")
	 public ResponseEntity<List<Object[]>> getaverageMarksOfStudents() throws SubjectException{
		return new ResponseEntity<List<Object[]>>(subjectService.averageMarksOfStudents(),HttpStatus.OK);
	 }
	
	
	
	
	@GetMapping("/getAveragePercentagePerSemester")
	 public ResponseEntity<Double> getAverageOfRecentSemester() throws SubjectException{
		 return new ResponseEntity<Double>(subjectService.getAveragePercentageOfRecentSemester(),HttpStatus.OK);
	 }
}
