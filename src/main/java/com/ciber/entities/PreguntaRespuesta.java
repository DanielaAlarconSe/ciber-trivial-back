package com.ciber.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PreguntaRespuesta {
	
	private int codigo;
	private int preguntCodigo;
	private int respuestaOpcionCodigo;
	private int respuestaTipoCodigo; 
	private int estado;

}
