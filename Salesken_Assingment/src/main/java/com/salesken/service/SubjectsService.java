package com.salesken.service;

import java.util.List;


import com.salesken.exception.SubjectException;


public interface SubjectsService {


	public Double getAveragePercentageOfRecentSemester() throws SubjectException;
	
	
	
	public List<Object[]> averageMarksOfStudents() throws SubjectException;
	
	
	public List<Object[]> top2ConsistentStudents() throws SubjectException;
	
}
