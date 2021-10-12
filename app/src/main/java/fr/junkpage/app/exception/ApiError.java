package fr.junkpage.app.exception;

import org.springframework.http.HttpStatus;

import fr.junkpage.app.enums.ErrorType;

public class ApiError {
	
	   private HttpStatus status;
	    private String message;
	    private ErrorType errorType;

	    public ApiError(HttpStatus status, String message, ErrorType errorType) {
	        super();
	        this.status = status;
	        this.message = message;
	        this.errorType = errorType;
	    }

		public HttpStatus getStatus() {
			return status;
		}

		public void setStatus(HttpStatus status) {
			this.status = status;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public ErrorType getErrorType() {
			return errorType;
		}

		public void setErrorType(ErrorType errorType) {
			this.errorType = errorType;
		}

	   

}