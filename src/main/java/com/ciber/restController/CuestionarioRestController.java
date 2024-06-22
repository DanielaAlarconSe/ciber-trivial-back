package com.ciber.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciber.entities.Cuestionario;
import com.ciber.service.ICuestionarioService;

@RestController
@RequestMapping(path = "cuestionario")
public class CuestionarioRestController {
	
	@Autowired
	ICuestionarioService service;

	@GetMapping(path = "obtener-cuestionarios")
	public List<Cuestionario> obtenerCuestionarios() {
		return service.obtenerCuestionarios();
	}

	@PostMapping(path = "registrar-cuestionario")
	public int registrarCuestionario(@RequestBody Cuestionario cuestionario) {
		return service.registrarCuestionario(cuestionario);
	}

	@PutMapping(path = "actualizar-cuestionario")
	public int actualizarCuestionario(@RequestBody Cuestionario cuestionario) {
		return service.actualizarCuestionario(cuestionario);
	}

}
