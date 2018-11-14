package com.jdbcdemo.JDBCDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomersDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Customers> findAllCustomers() {
		return jdbcTemplate.query("select * from Customers", new BeanPropertyRowMapper<Customers>(Customers.class));
	}

	public List<Customers> findByName(String contactName) {
		return jdbcTemplate.query("select * from Customers where name like '%" + contactName + "%'",
				new BeanPropertyRowMapper<Customers>(Customers.class));
	}

	public int addCustomer(String custID, String contactName, String address, String city, String phone) {
		String addQuery = "insert into customers(customerId, companyName, contactName, address, city, phone) values(?,?,?, ?, ?, ?)";
		return jdbcTemplate.update(addQuery, custID, "Hello World", contactName, address, city, phone);
	}

	public int updateCustomer(String id, String contactName, String address, String city, String phone) {
		String updateQuery = "update customers set contactName=?, address=?, city=?, phone=? where id=?";
		return jdbcTemplate.update(updateQuery, contactName, address, city, phone, id);
	}

	public int deleteCustomer(String id) {
		String deleteQuery = "delete from customers where id=?";
		return jdbcTemplate.update(deleteQuery, id);
	}

}
