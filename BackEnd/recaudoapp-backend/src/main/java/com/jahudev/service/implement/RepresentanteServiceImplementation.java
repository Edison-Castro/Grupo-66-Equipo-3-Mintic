package com.jahudev.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jahudev.dao.IRepresentanteRepo;
import com.jahudev.model.Representante;
import com.jahudev.service.IRepresentanteService;

@Service
public class RepresentanteServiceImplementation implements IRepresentanteService{
	
	@Autowired
	private IRepresentanteRepo representanteRepo;

	@Override
	public Representante registrarRepresentante(Representante representante) throws Exception {
		return representanteRepo.save(representante);
	}

	@Override
	public Representante modificarRepresentante(Representante representante) throws Exception {
		return representanteRepo.save(representante);
	}

	@Override
	public List<Representante> listarRepresentante() throws Exception {
		return representanteRepo.findAll();
	}

	//utiliza la clase Optional que nos va a permitir manejar los null pointer exception
	@Override
	public Representante listarPorIdRepresentante(Integer idRepresentante) throws Exception {
		Optional<Representante> representanteOptional = representanteRepo.findById(idRepresentante);
		return representanteOptional.isPresent() ? representanteOptional.get():new Representante(); 
	}

	@Override
	public void eliminarRepresentante(Integer idRepresentante) throws Exception {
		representanteRepo.deleteById(idRepresentante);
		
	}

}
