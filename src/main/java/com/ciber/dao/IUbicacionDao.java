package com.ciber.dao;

import java.util.List;

import com.ciber.entities.CabecerasCentrosPoblados;
import com.ciber.entities.Departamento;
import com.ciber.entities.Municipio;
import com.ciber.entities.Pais;

public interface IUbicacionDao {
	
	public List<Pais> obtenerPaisLocal();
	
	public List<Pais> obtenerPaises();
	
}
