package fr.junkpage.app.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import fr.junkpage.app.enums.ErrorType;

@ControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<Object> handleDataIntegrityViolation(CustomException ex) {
	   
	    ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), ErrorType.WARNING);
	    return new ResponseEntity<Object>(apiError, new HttpHeaders(), apiError.getStatus());	
	}
}