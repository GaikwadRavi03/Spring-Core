package com.bridgelabz.login_app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bridgelabz.login_app.model.Login;
import com.bridgelabz.login_app.model.User;

public class UserDaoImpl implements UserDao {

	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into Users values(?,?,?,?,?,?,?)";

		jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstname(),
				user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone() });
	}

	@Override
	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		String sql = "select * from Users where username='" + login.getUsername() + "' and password='"
				+ login.getPassword() + "'";

		List<User> users = jdbcTemplate.query(sql, new UserMapper());

		return users.size() > 0 ? users.get(0) : null;
	}

	class UserMapper implements RowMapper<User> {

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			User user = new User();

			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setFirstname(rs.getString("firstname"));
			user.setLastname(rs.getString("lastname"));
			user.setEmail(rs.getString("email"));
			user.setAddress(rs.getString("address"));
			user.setPhone(rs.getString("phone"));

			return user;
		}
	}
}
