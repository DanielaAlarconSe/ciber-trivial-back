package com.ciber.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ciber.entities.EstadoCivil;

public class EstadoCivilRowMapper implements RowMapper<EstadoCivil>{

	@Override
	public EstadoCivil mapRow(ResultSet rs, int rowNum) throws SQLException {
		EstadoCivil estadoCivil = new EstadoCivil();
		estadoCivil.setCodigo(rs.getInt("esc_codigo"));
		estadoCivil.setNombre(rs.getString("esc_nombre"));
		estadoCivil.setEstado(rs.getInt("esc_estado"));
		return estadoCivil;
	}

}