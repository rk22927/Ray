package com.ray.project.exception;

import com.ray.project.constant.CodeDescription;

import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class BadRequestException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Integer code;
	
	String description;
	
	public BadRequestException() {}
	
	public BadRequestException(CodeDescription codeDescription) {
		this.code = codeDescription.getCode();
		this.description = codeDescription.getDescription();
		
	}

}
