/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mkyong.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author mczarny
 */
public class CityRowMapper implements RowMapper<City>{

	@Override
	public City mapRow(ResultSet rs, int rowNum) throws SQLException {

		City result = new City();
		result.setId(rs.getString("id"));
		result.setCode(rs.getString("code"));
		result.setName(rs.getString("name"));
			
		return result;
	} 
    
}
