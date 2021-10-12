package fr.junkpage.app.exception;

public class CustomException extends RuntimeException {

	private static final long serialVersionUID = -5699845509761789731L;

		public CustomException(String errorMsg) {
			super(errorMsg);
		}

}
