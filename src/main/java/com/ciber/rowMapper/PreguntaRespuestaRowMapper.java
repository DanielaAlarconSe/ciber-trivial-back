package com.ciber.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ciber.entities.PreguntaRespuesta;

public class PreguntaRespuestaRowMapper implements RowMapper<PreguntaRespuesta>{

	@Override
	public PreguntaRespuesta mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		PreguntaRespuesta preguntaRespuesta = new PreguntaRespuesta();
		preguntaRespuesta.setCodigo(rs.getInt("prr_codigo"));
		preguntaRespuesta.setPreguntaCodigo(rs.getInt("pre_codigo"));
		preguntaRespuesta.setRespuestaOpcionCodigo(rs.getInt("reo_codigo"));
		preguntaRespuesta.setEstado(rs.getInt("prr_estado"));
		return preguntaRespuesta;
		
	}
}
