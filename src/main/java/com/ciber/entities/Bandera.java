package com.ciber.entities;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Bandera {
	
	private Integer codigo;
	private Date  fechaRegistro;
	private Integer estado;

}
