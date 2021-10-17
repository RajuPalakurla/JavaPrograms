package com.demo.database.databasedemo.Jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public class PersonRowmapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person = new Person();
			person.setId(rs.getInt("Id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			return person;
		}
		
	}
	
	public List<Person> findAll(){
		return jdbcTemplate.query("select * from Person",
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public List<Person> findAllByRowMapper(){
		return jdbcTemplate.query("select id,name,location from Person",
				new PersonRowmapper());
	}
	
	public Person findById(int id){
		return jdbcTemplate.queryForObject
				("select * from Person where id=?",new Object[]{id},
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public int deleteById(int id){
		return jdbcTemplate.update
				("delete from Person where id=?",new Object[]{id});
	}
	
	public int insert(Person person){
		return jdbcTemplate.update
				("insert into person  (id,name ,location ,birthdate )"
						+ "values (?,?,?,?)",new Object[]{person.getId(),person.getName(),person.getLocation()
								,new Timestamp(person.getBirthdate().getTime())});
	}
	
	public int update(Person person){
		return jdbcTemplate.update
				("update person set name=? ,location=? ,birthdate=? "+" where id = ?"
						,new Object[]{person.getName(),
								person.getLocation(),
								new Timestamp(person.getBirthdate().getTime()),
								person.getId()});
	}
}
