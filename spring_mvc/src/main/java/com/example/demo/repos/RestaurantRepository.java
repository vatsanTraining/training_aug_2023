package com.example.demo.repos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Restaurant;
import com.example.demo.ifaces.CrudRepository;

@Repository
public class RestaurantRepository implements CrudRepository<Restaurant> {

	private JdbcTemplate template;
	
	private static final String SELECTALL ="select * from restaurant_aug_2023";
	private static final String INSERT ="insert into restaurant_aug_2023 values(?,?,?,?,?)";
	private static final String FINDBYID ="select * from restaurant_aug_2023 where id =?";
	private static final String UPDATE ="update restaurant_aug_2023 set restaurant_name=?, "
			+ "cuisine=?,opening_date=?,rating=? where id =?";
	private static final String REMOVE ="delete from restaurant_aug_2023 where id =?";
	
	
	
	
	@Autowired
	public RestaurantRepository(JdbcTemplate template) {
		super();
		this.template = template;
	}


	
	@Override
	public List<Restaurant> findAll() {
		
		
		RowMapper<Restaurant> mapper = (rs,rowNum)->{
			
			Restaurant obj = new Restaurant();
			obj.setId(rs.getInt(1));
			obj.setRestaurantName(rs.getString(2));
			obj.setCuisine(rs.getString(3));
			obj.setOpeningDate(rs.getDate(4).toLocalDate());
			obj.setRating(rs.getDouble(5));
			return obj;
		};
		
         return this.template.query(SELECTALL, mapper);
         
		//return this.template.query(SELECTALL, BeanPropertyRowMapper.newInstance(Restaurant.class));
	}


	@Override
	public int add(Restaurant t) {
		return template.update(INSERT,
				 t.getId(),t.getRestaurantName(),t.getCuisine(),t.getOpeningDate(),t.getRating());
	}


	@Override
	public Restaurant findById(int id) {
		return this.template.queryForObject(FINDBYID, BeanPropertyRowMapper.newInstance(Restaurant.class),id);
	}


	@Override
	public int remove(int id) {
		return this.template.update(REMOVE,id);
	}


	@Override
	public int update(Restaurant t) {
		return this.template.update(UPDATE,t.getRestaurantName(),t.getCuisine(),t.getOpeningDate(),t.getRating(),t.getId());
		
	}

}
