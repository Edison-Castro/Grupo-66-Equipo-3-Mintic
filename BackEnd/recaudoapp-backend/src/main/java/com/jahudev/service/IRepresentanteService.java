package com.jahudev.service;

import java.util.List;

import com.jahudev.model.Representante;

public interface IRepresentanteService {
	
	Representante registrarRepresentante (Representante representante) throws Exception;
	Representante modificarRepresentante (Representante representante) throws Exception;
	List<Representante> listarRepresentante () throws Exception;
	Representante listarPorIdRepresentante (Integer idRepresentante) throws Exception;
	void eliminarRepresentante (Integer idRepresentante) throws Exception;
}
