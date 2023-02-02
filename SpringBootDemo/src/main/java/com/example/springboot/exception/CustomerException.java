package com.example.springboot.exception;

public class CustomerException extends Exception {
	private static final long serialversionID=1L;
	String errorMsg;
	public CustomerException(String errorMsg) {
		super();
		this.errorMsg=errorMsg;
	}
}
