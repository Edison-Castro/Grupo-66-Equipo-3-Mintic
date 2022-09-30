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
import com.jahudev.model.PlanillaRecaudo;
import com.jahudev.service.IPlanillaRecaudoService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/planillas")
public class PlanillaController {
	
	@Autowired
	private IPlanillaRecaudoService planillaRecaudoService;

	@GetMapping
	public ResponseEntity<List<PlanillaRecaudo>>  listar() throws Exception{
		List<PlanillaRecaudo> lista = planillaRecaudoService.listar();
		System.out.print("Entro al get");
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{idPlanilla}")
	public ResponseEntity<PlanillaRecaudo> listarPorId(@PathVariable("idPlanilla") Integer idPlanilla) throws Exception{
		PlanillaRecaudo repreId = planillaRecaudoService.listarPorId(idPlanilla);
		if (repreId == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + idPlanilla);
		}
		return new ResponseEntity<>(repreId, HttpStatus.OK);
	}
	
	@PostMapping
	public PlanillaRecaudo registrar(@RequestBody PlanillaRecaudo planilla) throws Exception {
		return planillaRecaudoService.registrar(planilla);
	}
	
	@PutMapping
	PlanillaRecaudo modificar(@RequestBody PlanillaRecaudo planilla) throws Exception {
		return planillaRecaudoService.modificar(planilla);
	}
	
	@DeleteMapping("/{idPla}")
	public void eliminar(@PathVariable("idPla") Integer idPlanilla) throws Exception {
		planillaRecaudoService.eliminar(idPlanilla);
	}
	
}
