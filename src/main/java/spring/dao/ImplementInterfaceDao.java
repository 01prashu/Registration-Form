package spring.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import spring.dao.rowmapper.rowMapper;
import spring.model.Student;


public class ImplementInterfaceDao implements InterfaceDao {
	
	private JdbcTemplate temp;

	public JdbcTemplate getTemp() {
		return temp;
	}

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
	
	public int insert(Student stud) {
		String query = "insert into student(name, email , password) values(?,?,?)";
		int r = temp.update(query, stud.getName(),stud.getEmail() , stud.getPassword());
		return r;
	}

	public List<Student> getAllMails() {
		String q = "select * from student";
		RowMapper<Student> rowMapper  = new rowMapper();
		List<Student> students = this.temp.query(q, rowMapper);
		return students;
	}

	
	public boolean isEmailInUse( List<Student>students, String email) {
		for(Student s : students)
		{
			if(s.getEmail().equals(email)) {
				return true;
			}
		}
		return false;
	}
	
	
}
