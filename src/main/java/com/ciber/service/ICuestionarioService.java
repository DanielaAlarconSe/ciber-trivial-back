package com.ciber.service;

import java.util.List;

import com.ciber.entities.Cuestionario;

public interface ICuestionarioService {
	
	public List<Cuestionario> obtenerCuestionarios();

	public int registrarCuestionario(Cuestionario cuestionario);

	public int actualizarCuestionario(Cuestionario cuestionario);

}
