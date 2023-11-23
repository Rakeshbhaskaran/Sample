package com.ff.javaUtility;

import java.time.LocalDateTime;

public class JavaUtility {
	
	public String getSystemLocalDateTime() {
		LocalDateTime now=LocalDateTime.now();
		return now.toString().replaceAll(":", "-");
	}
	

}
