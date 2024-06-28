package com.ciber.entities;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RespuestaCuestionario {
	
	private int codigo;
	private int estudianteCodigo;
	private int cuestionarioCodigo;
	private Date fechaRegistro; 
	private int calificacionTotal;

}
