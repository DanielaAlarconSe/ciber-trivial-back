package com.ciber.dao;

import java.util.List;

import com.ciber.entities.RespuestaOpcion;
import com.ciber.entities.RespuestaTipo;

public interface IRespuestaDao {
	
	public List<RespuestaOpcion> obtenerRespuestasCuestionario(int codigo);
	
	public List<RespuestaTipo> obtenerRespuestaTipo();

	public int registrarRespuesta(RespuestaOpcion respuestaOpcion);

	public int actualizarRespuesta(RespuestaOpcion respuestaOpcion);

}
