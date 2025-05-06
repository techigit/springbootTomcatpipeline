package com.org.java.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.MethodNotAllowedException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> emptyInputExceptionHandller(EmptyInputException emptyInputException){
		return new ResponseEntity<String>("filed is empty please look it once",HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(NoDataAvailableException.class)
	public ResponseEntity<String> noDataAvailableExceptionHandller(NoDataAvailableException noDataAvailableException){
		return new ResponseEntity<String>("No Data Availble Given Input please check once",HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(MethodNotAllowedException.class)
	public ResponseEntity<String> methodNotAllowedExceptionHandaller(MethodNotAllowedException  methodNotAllowedException ){
		return new ResponseEntity<String>("please the chage the verb name as soon as possiable..",HttpStatus.BAD_REQUEST);

	}
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> nullPointerException(NullPointerException nullPointerException){
		return new ResponseEntity<String>("Given input no date availbale please check and change",HttpStatus.BAD_REQUEST);
		
	}

}
