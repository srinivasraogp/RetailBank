package com.hcl.dto;

import java.io.Serializable;

public class RegistrationResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public RegistrationResponseDTO() {
		super();
	}

	public RegistrationResponseDTO(String message) {
		super();
		this.message = message;
	}

}
