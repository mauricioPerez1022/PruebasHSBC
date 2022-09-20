package com.hsbc.inmediauto.exception;

import org.springframework.http.HttpStatus;

public class ServiceException extends Exception{

	private static final long serialVersionUID = 1L;
	private final String errorMessage;
	private final String errorCode;
	private final HttpStatus status;

	public ServiceException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = "";
		this.status = HttpStatus.OK;
	}

	public ServiceException(String errorMessage, String errorCode, HttpStatus status) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.status = status;
	}
	
	public HttpStatus getStatus() {
		return status;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}
}
