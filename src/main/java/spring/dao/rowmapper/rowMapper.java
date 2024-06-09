package spring.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import spring.model.Student;

public class rowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student stu = new Student();
		stu.setName(rs.getString(1));
		stu.setEmail(rs.getString(2));
		stu.setPassword(rs.getNString(3));
		return stu;
	}

}
