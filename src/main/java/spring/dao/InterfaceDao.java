package spring.dao;

import java.util.List;

import spring.model.Student;

public interface InterfaceDao {
	
	public int insert(Student stud);
	public List<Student> getAllMails();
	public boolean isEmailInUse(String email);
}
