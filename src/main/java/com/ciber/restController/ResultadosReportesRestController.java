package com.ciber.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciber.service.IResultadosReportesService;

@RestController
@RequestMapping(path = "resultados-reportes")
public class ResultadosReportesRestController {
	
	@Autowired
	IResultadosReportesService service;

	@GetMapping(path = "obtener-resultado-trivia/{codigo}")
	public float obtenerResultadoTrivia(@PathVariable Integer codigo) {
		return service.obtenerResultadoTrivia(codigo);
	}

}
