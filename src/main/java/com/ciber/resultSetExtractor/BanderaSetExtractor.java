package com.ciber.resultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ciber.entities.Bandera;
import com.ciber.rowMapper.BanderaRowMapper;

public class BanderaSetExtractor implements ResultSetExtractor<List<Bandera>> {

	@Override
	public List<Bandera> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Bandera> list = new ArrayList<Bandera>();
		while (rs.next()) {
			list.add(new BanderaRowMapper().mapRow(rs, (rs.getRow() - 1)));
		}

		return list;
	}
}
