package com.example.demo.utils;

public enum SqlStatement {
    
	
	SELECTALL("select * from restaurant_aug_2023"),
   INSERT ("insert into restaurant_aug_2023 values(?,?,?,?,?)"),
   FINDBYID("select * from restaurant_aug_2023 where id =?"),
  UPDATE("update restaurant_aug_2023 set restaurant_name=?,cuisine=?,opening_date=?,rating=? where id =?"),
  REMOVE ("delete from restaurant_aug_2023 where id =?");

	private String sql;

SqlStatement(String sql) {
	
	this.sql = sql;
}
	
public String getSql() {
	
	return this.sql;
}
 }
