package com.ciber.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ciber.entities.Bandera;

public class BanderaRowMapper implements RowMapper<Bandera>{

	@Override
	public Bandera mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Bandera bandera = new Bandera();
		bandera.setCodigo(rs.getInt("ban_codigo"));
		bandera.setCodigo(rs.getInt("ban_fecha_registro"));
		bandera.setCodigo(rs.getInt("ban_estado"));
		
		return bandera;
		
	}
}
