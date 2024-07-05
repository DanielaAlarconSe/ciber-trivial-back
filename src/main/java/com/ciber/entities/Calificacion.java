package com.ciber.entities;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Calificacion {
	
	private Integer codigo;
	private String estudianteNombre;
	private Integer cursoCodigo;
	private String cursoNombre;
	private Integer cuestionarioCodigo;
	private String cuestionarioNombre;
	private float calificacion;
	private Date  fechaRegistro;

}
