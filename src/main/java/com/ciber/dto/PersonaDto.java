package com.ciber.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonaDto {

	private int codigo;
	
	private String nombre;

	private String apellido;
	
	private String correo;
	
	private int estadoUsuario;
	
	private int tipo;
	
}
