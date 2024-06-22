package com.ciber.resultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ciber.entities.Departamento;
import com.ciber.rowMapper.DepartamentoRowMapper;

public class DepartamentoSetExtractor implements ResultSetExtractor<List<Departamento>>{

	@Override
	public List<Departamento> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Departamento> list = new ArrayList<Departamento>();
		while (rs.next()) {
			list.add(new DepartamentoRowMapper().mapRow(rs, (rs.getRow() - 1)));
		}
		
		return list;
	}

}