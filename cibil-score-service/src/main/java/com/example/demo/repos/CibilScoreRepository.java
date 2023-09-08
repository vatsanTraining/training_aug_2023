package com.example.demo.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.demo.entity.CibilScore;
import com.example.demo.ifaces.CrudRepository;

public class CibilScoreRepository implements CrudRepository<CibilScore,String> {

	
	private JdbcTemplate template;
	
	
	String INSERT = "";
	String FINDBYID="";
	String FINDALL="";
	String UPDATE="";
	String REMOVE="";

	@Autowired
	public CibilScoreRepository(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public int add(CibilScore t) {
		return template.update(INSERT,t.getFirstName());
	}

	@Override
	public Optional<CibilScore> findById(String id) {
		
		CibilScore found= 
				template.queryForObject(FINDBYID,BeanPropertyRowMapper
						 .newInstance(CibilScore.class),id);
		
				return found==null?Optional.empty():Optional.of(found);
	}

	@Override
	public List<CibilScore> findAll() {
		
		RowMapper<CibilScore> mapper = (var rs,var rowNum) ->{
			
			CibilScore score = new CibilScore();
			
			return score;
		};
		
		return template.query(FINDALL,mapper);
	}

	@Override
	public int remove(int id) {
		return template.update(REMOVE,id);
	}

	@Override
	public int update(CibilScore t) {
		return template.update(UPDATE,t.getPanCardNumber());
		
	}

}
