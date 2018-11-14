package com.jdbcdemo.JDBCDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository // lets us communicate with the DB
public class FoodJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Food> findAllFoods() {
		return jdbcTemplate.query("select * from food", new BeanPropertyRowMapper<Food>(Food.class));
	}

	public List<Food> findByCategory(String category) {
		return jdbcTemplate.query("select * from food where category like '%" + category + "%'",
				new BeanPropertyRowMapper<Food>(Food.class));
	}

	public int addFood(String name, String category, String description) {
		String addQuery = "insert into food(name, category, description) values(?, ?, ?)";
		return jdbcTemplate.update(addQuery, name, category, description);
	}

	public int updateFood(int id, String name, String category, String description) {
		String updateQuery = "update food set name=?, category=?, description=? where id=?";
		return jdbcTemplate.update(updateQuery, name, category, description, id);
	}

	public int deleteFood(int id) {
		String deleteQuery = "delete from food where id=?";
		return jdbcTemplate.update(deleteQuery, id);
	}

}
