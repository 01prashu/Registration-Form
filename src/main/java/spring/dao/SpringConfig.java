package spring.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig {
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://127.0.0.1:3306/spring_framework");
		ds.setUsername("root");
		ds.setPassword("prashant@123");
		return ds;
	}
	@Bean("temp")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(getDataSource());
		return temp;
	}
	@Bean("dao")
	public ImplementInterfaceDao getDao()
	{
		ImplementInterfaceDao dao = new ImplementInterfaceDao();
		dao.setTemp(getTemplate());
		return dao;
	}
}
