package com.ray.project.validation;

import org.springframework.util.StringUtils;

import com.ray.project.constant.CodeDescription;
import com.ray.project.exception.BadRequestException;

public class Validate {

	
	public static boolean notNull(Object obj,CodeDescription codeDescription) {
		if(obj != null || !StringUtils.isEmpty(obj)) 
			return true;
		else
			throw new BadRequestException(codeDescription);
	}
	
	public static boolean lengthCheck(String obj,int minLength,int maxLength,CodeDescription codeDescription) {
		if(obj.length() >= minLength && obj.length() <= maxLength) 
			return false;
		else
			throw new BadRequestException(codeDescription);
	}
}
