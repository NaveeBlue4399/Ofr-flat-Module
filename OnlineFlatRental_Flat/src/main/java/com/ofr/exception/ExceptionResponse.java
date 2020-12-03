package com.ofr.exception;

import java.time.LocalDateTime;

public class ExceptionResponse {

	private int status;
	private String message;
	private LocalDateTime time;
	
	/*
	 * Default constructor for ExceptionResponse
	 */
	public ExceptionResponse() {
		super();
		
	}

	/*
	 * Parameterized constructor for ExceptionResponse
	 */
	public ExceptionResponse(int status, String message, LocalDateTime time) {
		super();
		this.status = status;
		this.message = message;
		this.time = time;
	}

	/*
	 * Getter and setter methods for all the parameters of ExceptionResponse class
	 */

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	
	
}
