package com.ray.project.dto;

import com.ray.project.constant.CodeDescription;

import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class BaseDto {

	Integer code;
	
	String description;
	
	Boolean status;
	
	Object content;
	
	public BaseDto() {}
	
	public BaseDto(CodeDescription codeDescription) {
		this.code = codeDescription.getCode();
		this.description = codeDescription.getDescription();
		this.status = codeDescription.getStatus();
	}
	
	public BaseDto(CodeDescription codeDescription,Object content) {
		this.code = codeDescription.getCode();
		this.description = codeDescription.getDescription();
		this.status = codeDescription.getStatus();
		this.content = content;
	}
	
	
	
}
