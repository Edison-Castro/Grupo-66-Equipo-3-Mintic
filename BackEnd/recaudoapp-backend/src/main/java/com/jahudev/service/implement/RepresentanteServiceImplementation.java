package com.jahudev.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jahudev.model.Representante;
import com.jahudev.repo.IGenericRepo;
import com.jahudev.repo.IRepresentanteRepo;
import com.jahudev.service.IRepresentanteService;

@Service
public class RepresentanteServiceImplementation extends CRUDImpl<Representante, Integer> implements IRepresentanteService{
	
	@Autowired
	private IRepresentanteRepo representanteRepo;

	@Override
	protected IGenericRepo<Representante, Integer> getRepo() {
		return representanteRepo;
	}

	

}
	