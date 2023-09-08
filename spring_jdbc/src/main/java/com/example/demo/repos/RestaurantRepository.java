package com.example.demo.repos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Restaurant;
import com.example.demo.ifaces.CrudRepository;
import com.example.demo.utils.SqlStatement;

@Repository
public class RestaurantRepository implements CrudRepository<Restaurant> {

	private JdbcTemplate template;
	
	
	
	
	@Autowired
	public RestaurantRepository(JdbcTemplate template) {
		super();
		this.template = template;
	}


	
	@Override
	public List<Restaurant> findAll() {
		
		RowMapper<Restaurant> mapper = (rs,rowNum)->{
			
			Restaurant obj = new Restaurant();
			obj.setId(rs.getInt("fname"));
			obj.setRestaurantName(rs.getString(2));
			obj.setCuisine(rs.getString(3));
			obj.setOpeningDate(rs.getDate(4).toLocalDate());
			obj.setRating(rs.getDouble(5));
			return obj;
		};
		
         return this.template.query(SqlStatement.SELECTALL.getSql(), mapper);
         
		//return this.template.query(SELECTALL, BeanPropertyRowMapper.newInstance(Restaurant.class));
	}


	@Override
	public int add(Restaurant t) {
		return template.update(SqlStatement.INSERT.getSql(),
				 t.getId(),t.getRestaurantName(),t.getCuisine(),t.getOpeningDate(),t.getRating());
	}


	@Override
	public Restaurant findById(int id) {
		return this.template.queryForObject(SqlStatement.FINDBYID.getSql(), BeanPropertyRowMapper.newInstance(Restaurant.class),id);
	}


	@Override
	public int remove(int id) {
		return this.template.update(SqlStatement.REMOVE.getSql(),id);
	}


	@Override
	public int update(Restaurant t) {
		return this.template.update(SqlStatement.UPDATE.getSql(),t.getRestaurantName(),t.getCuisine(),t.getOpeningDate(),t.getRating(),t.getId());
		
	}

}
