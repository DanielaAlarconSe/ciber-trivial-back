package com.ciber.dto;

import java.sql.Date;
import java.util.Map;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReporteAgrupadoDto {
	
	private String estudianteNombre;
	private Date fechaRegistro;
	private Map<String, String> columnas;
	private float calificacion;

}
