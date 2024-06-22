package com.ciber.resultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ciber.entities.SexoBiologico;
import com.ciber.rowMapper.SexoBiologicoRowMapper;

public class SexoBiologicoSetExtractor implements ResultSetExtractor<List<SexoBiologico>>{

	@Override
	public List<SexoBiologico> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<SexoBiologico> list = new ArrayList<SexoBiologico>();
		while (rs.next()) {
			list.add(new SexoBiologicoRowMapper().mapRow(rs, (rs.getRow() - 1)));
		}
		
		return list;
	}

}