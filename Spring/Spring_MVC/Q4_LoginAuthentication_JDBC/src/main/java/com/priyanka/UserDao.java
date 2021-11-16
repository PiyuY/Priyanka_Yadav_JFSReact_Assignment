package com.priyanka;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class UserDao {

	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	public int saveUser(User u){  
	    String query="insert into user(email, username, password) values('"+ u.getEmail() +"', '"+ u.getUsername() +"', '" + u.getPassword() + "')"; 
	    return jdbcTemplate.update(query);  
	}  
	
	public User getUserByUsername(User u) {
	    String sql = "SELECT * FROM user WHERE username='" + u.getUsername() + "'";

	    return jdbcTemplate.query(sql, new ResultSetExtractor<User>() {
	
	        @Override
	        public User extractData(ResultSet rs) throws SQLException, DataAccessException {
	            if (rs.next()) {
	                User resultUser = new User();
	                resultUser.setId(rs.getInt("id"));
	                resultUser.setEmail(rs.getString("email"));
	                resultUser.setUsername(rs.getString("username"));
	                resultUser.setPassword(rs.getString("password"));
	                return resultUser;
	            }
	 
	            return null;
	        }
	 
	    });
	}
}
