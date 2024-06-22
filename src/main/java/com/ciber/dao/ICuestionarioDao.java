package com.ciber.dao;

import java.util.List;

import com.ciber.entities.Cuestionario;

public interface ICuestionarioDao {
	
	public List<Cuestionario> obtenerCuestionarios();

	public int registrarCuestionario(Cuestionario cuestionario);

	public int actualizarCuestionario(Cuestionario cuestionario);

}
