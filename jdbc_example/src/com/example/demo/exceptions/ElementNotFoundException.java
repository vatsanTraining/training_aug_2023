package com.example.demo.exceptions;

import java.time.LocalDateTime;

public class ElementNotFoundException extends Exception {

private static final long serialVersionUID = 123L;

	
	private String message;
	private LocalDateTime time;
	private String errorCode;
	
	public ElementNotFoundException(String message, LocalDateTime time, String errorCode) {
		super();
		this.message = message;
		this.time = time;
		this.errorCode = errorCode;
	}

	@Override
	public String getMessage() {

		StringBuffer buffer = new StringBuffer(message).append(":").append(time).append(":").append(errorCode);
		
		return buffer.toString();
	}
	
	

}
