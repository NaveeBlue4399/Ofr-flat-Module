package com.ofr.exception;

/*
 * FlatNotFoundException class
 */

public class FlatNotFoundException extends Exception{

	/**Default serial version parameter
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * Parameterized constructor for FlatNotFoundException class
	 */
	public FlatNotFoundException(String message) {
		super(message);
	}
}
