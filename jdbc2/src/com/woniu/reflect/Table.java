package com.woniu.reflect;

import java.lang.annotation.ElementType;

public @interface Table {
	

	String value() default "dept";

	
}
