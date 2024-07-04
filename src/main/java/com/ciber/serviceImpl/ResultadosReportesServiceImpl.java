package com.ciber.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciber.dao.IResultadosReportesDao;
import com.ciber.service.IResultadosReportesService;

@Service
public class ResultadosReportesServiceImpl implements IResultadosReportesService{
	
	@Autowired
	IResultadosReportesDao dao;

	@Override
	public float obtenerResultadoTrivia(Integer codigo) {
		
		return dao.obtenerResultadoTrivia(codigo);
		
	}

}
