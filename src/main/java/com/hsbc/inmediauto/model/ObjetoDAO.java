package com.hsbc.inmediauto.model;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.hsbc.inmediauto.entidad.Objeto;
import com.hsbc.inmediauto.exception.ServiceException;

public interface ObjetoDAO {
	
	List<Objeto> objetoDAO();
	ResponseEntity<String> callVehDetails(String requestBody) throws ServiceException;


}
