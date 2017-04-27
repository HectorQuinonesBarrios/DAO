package com.ranga;

import java.util.List;


public interface StudentDAO {
	public void createStudent(Student student) throws Exception;
	public Student getStudent(long id) throws Exception;
	public void updateStudent(Student student) throws Exception;
	public void deleteStudent(Student student) throws Exception;
	public List<Student> getAllStudents() throws Exception;
}
