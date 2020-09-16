package com.igreendata.account.exception;

public class InvalidRequestException extends RuntimeException{

	private static final long serialVersionUID = -573107388004412262L;
	private String errorMessage;
	private Exception exception;
	
	public InvalidRequestException(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

	
}
