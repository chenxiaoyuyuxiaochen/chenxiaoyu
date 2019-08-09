package com.woniu.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.woniu.bean.Dept;

public class Demo {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
	
	Class c=Dept.class;
	Object obj=c.newInstance();
	Method m=c.getDeclaredMethod("setDname", String.class);
	m.invoke(obj, "abc");
	
	Method m2=c.getDeclaredMethod("getDname");
	Object obj2= m2.invoke(obj);
	
	System.out.println(obj2);
	}
	
}
