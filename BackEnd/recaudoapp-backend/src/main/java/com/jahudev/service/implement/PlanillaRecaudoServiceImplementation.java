package com.jahudev.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jahudev.model.PlanillaRecaudo;
import com.jahudev.repo.IGenericRepo;
import com.jahudev.repo.IPlanillaRecaudoRepo;
import com.jahudev.service.IPlanillaRecaudoService;

@Service
public class PlanillaRecaudoServiceImplementation extends CRUDImpl<PlanillaRecaudo, Integer> implements IPlanillaRecaudoService{
	
	@Autowired
	private IPlanillaRecaudoRepo planillaRecaudoRepo;

	@Override
	protected IGenericRepo<PlanillaRecaudo, Integer> getRepo() {
		return planillaRecaudoRepo;
	}

	

}
	