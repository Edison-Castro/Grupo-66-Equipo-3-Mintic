package com.jahudev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jahudev.exception.ModeloNotFoundException;
import com.jahudev.model.Representante;
import com.jahudev.service.IRepresentanteService;

@RestController
@RequestMapping("/representantes")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class RepresentanteController {
	
	@Autowired
	private IRepresentanteService representeService;

	@GetMapping
	public ResponseEntity<List<Representante>>  listar() throws Exception{
		List<Representante> lista = representeService.listar();
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{idRep}")
	public ResponseEntity<Representante> listarPorId(@PathVariable("idRep") Integer idRepresentante) throws Exception{
		Representante repreId = representeService.listarPorId(idRepresentante);
		if (repreId == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + idRepresentante);
		}
		return new ResponseEntity<>(repreId, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Representante> registrar(@RequestBody Representante representante) throws Exception {
		Representante repreObj = representeService.registrar(representante);
		return new ResponseEntity<>(repreObj, HttpStatus.CREATED);
	}
	
	@PutMapping
	ResponseEntity<Representante> modificarRepresentantes(@RequestBody Representante representante) throws Exception {
		Representante repreObj = representeService.modificar(representante);
		return new ResponseEntity<>(repreObj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{idRep}")
	public ResponseEntity<Void> eliminarRepresentantes(@PathVariable("idRep") Integer idRepresentante) throws Exception {
		Representante repreId = representeService.listarPorId(idRepresentante);
		if (repreId == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + idRepresentante);
		}
		representeService.eliminar(idRepresentante);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
