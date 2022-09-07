package com.jahudev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jahudev.model.Representante;
import com.jahudev.service.IRepresentanteService;

@RestController
@RequestMapping("/representantes")
public class RepresentanteController {
	
	@Autowired
	private IRepresentanteService representeService;

	@GetMapping
	public List<Representante> listarRepresentantes() throws Exception{
		return representeService.listarRepresentante();
	}
	
	@GetMapping("/{idRep}")
	public Representante listarPorId(@PathVariable("idRep") Integer idRepresentante) throws Exception{
		return representeService.listarPorIdRepresentante(idRepresentante);
	}
	
	@PostMapping
	public Representante registrarRepresentantes(@RequestBody Representante representante) throws Exception {
		return representeService.registrarRepresentante(representante);
	}
	
	@PutMapping
	Representante modificarRepresentantes(@RequestBody Representante representante) throws Exception {
		return representeService.modificarRepresentante(representante);
	}
	
	@DeleteMapping("/{idRep}")
	public void eliminarRepresentantes(@PathVariable("idRep") Integer idRepresentante) throws Exception {
		representeService.eliminarRepresentante(idRepresentante);
	}
	
}
