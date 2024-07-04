package com.ciber.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ciber.dao.IResultadosReportesDao;

@Repository
public class ResultadosReportesDaoImpl implements IResultadosReportesDao{
	
	@Autowired
	@Qualifier("JDBCTemplateConsulta")
	public JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("JDBCTemplateEjecucion")
	public JdbcTemplate jdbcTemplateEjecucion;

	@Override
	public float obtenerResultadoTrivia(Integer codigo) {
		
		String sql = "select rc.rec_calificacion_total from principal.respuesta_cuestionario rc where rc.rec_codigo = " + codigo + " ;";
	    
	    return jdbcTemplate.queryForObject(sql, Float.class);
		
	}

}
