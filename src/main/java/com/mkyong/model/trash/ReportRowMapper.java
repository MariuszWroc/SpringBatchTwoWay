/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mkyong.model.trash;

import com.mkyong.model.Report;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author mczarny
 */
@Deprecated
public class ReportRowMapper implements RowMapper<Report>{

	@Override
	public Report mapRow(ResultSet rs, int rowNum) throws SQLException {

		Report result = new Report();
		result.setClicks(rs.getString("clicks"));
		result.setDate(rs.getString("date"));
		result.setEarning(rs.getString("earning"));
                result.setImpressions(rs.getString("impressions"));
			
		return result;
	} 
}
