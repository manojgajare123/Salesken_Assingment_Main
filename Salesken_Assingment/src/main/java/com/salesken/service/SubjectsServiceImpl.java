package com.salesken.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.salesken.exception.SubjectException;
import com.salesken.repository.SubjectRepo;

public class SubjectsServiceImpl implements SubjectsService {

	@Autowired
	private SubjectRepo subjectRepo;
	
	 
	
	
	@Override
	public Double getAveragePercentageOfRecentSemester() throws SubjectException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> averageMarksOfStudents() throws SubjectException {
		// TODO Auto-generated method stub
		return subjectRepo.averageMarksOfStudents();
	}

	
	@Override
	public List<Object[]> top2ConsistentStudents() throws SubjectException {
		// TODO Auto-generated method stub
		return subjectRepo.averageMarksOfStudents();
	}

}
