package com.hsbc.inmediauto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.AccessException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hsbc.inmediauto.exception.*;
import com.hsbc.inmediauto.model.ObjetoDAO;
import com.hsbc.inmediauto.util.Conexion;
import com.hsbc.inmediauto.entidad.ResquestVehDetails;
import com.hsbc.inmediauto.entidad.ResponseConsul;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api( value = "Remittance" )
@CrossOrigin(origins = "http://localhost:5432")
@RestController
@RequestMapping("MarcasVeh")

public class Proceso {
	public static void main (String [] args) {
		Conexion conn = new Conexion();
        conn.connectDatabase(); 
	}
	
	private static final Logger log = LogManager.getLogger(Proceso.class);
	
	@Autowired
	ObjetoDAO ObjDAO;
	

	@ApiOperation( value = "Service Catalogo Detalles del Vehiculo HSBC")
	@ApiResponses( value = {
			@ApiResponse( code = 200, message = "Operación exitosa"),
			@ApiResponse( code = 400, message = "Error en la operación"),
			@ApiResponse( code = 500, message = "Error Interno")
	})
	@RequestMapping(path = "/catvehdetails", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseConsul> catVehDetails(@RequestBody ResquestVehDetails reqVehDet)throws AccessException
	{		
		log.debug("Started method getCatalogos");		
		ResponseConsul response = new ResponseConsul();
		ObjectMapper mapper = new ObjectMapper();
		try {
			String req = mapper.writeValueAsString(reqVehDet);
			log.info("in Post Call----------------------->>>>>>>> {}", req);
			
		} catch (JsonProcessingException e) {
			log.error("Error While Convering Validation Request to JSON");}
		
		log.debug("Ended method getCatalogos");
		
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
/*
	@ApiOperation( value = "Servicio para segmentos del cliente")
	@ApiResponses( value = {
			@ApiResponse( code = 200, message = "Operación exitosa"),
			@ApiResponse( code = 400, message = "Error en la operación"),
			@ApiResponse( code = 500, message = "Error Interno")
	})
	@RequestMapping(path = "/detallesVeh", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getcatvehdetails(@RequestBody ResquestVehDetails reqVehDet)throws AccessException
	{		
		log.debug("Started method getcatvehdetails");		
		String requestBody = "";
		
		ObjectMapper mapper = new ObjectMapper();		
		try {
			requestBody = mapper.writeValueAsString(reqVehDet);
			
			log.info("StringMessage Request --> {}", requestBody);			
		} catch (JsonProcessingException e ) {
			log.error("Error While Convering Validation Request to JSON");
		}
		
		log.debug("Ended method getcatvehdetails");
		
		return consultaService.callVehDetails(requestBody);
	}*/
	
	
	

	
		
}
