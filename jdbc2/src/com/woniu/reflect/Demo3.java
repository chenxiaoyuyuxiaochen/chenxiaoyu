package com.woniu.reflect;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

import com.mysql.jdbc.Field;
import com.woniu.bean.Dept;

public class Demo3 {


	public static void main(String[] args) throws IOException {
		Class c = Dept.class;
		
		StringBuffer str = new StringBuffer();
		
		//��ð�
		str.append(c.getPackage().toString()+".demo;\n");
		//�����ķ���Ȩ��
		str.append(Modifier.toString(c.getModifiers())+" class ");
		//�������
		str.append(c.getSimpleName());
		//��ø���
		Class parent = c.getSuperclass();
		if(parent!=Object.class){
			str.append(" extends "+parent.getSimpleName());
		}
		//��ýӿ�
		Class[] cs = c.getInterfaces();
		if(cs.length>0){
			str.append(" implements ");
			for(int i=0;i<cs.length;i++){
				str.append(cs[i].getSimpleName()+(i==(cs.length-1)?"":","));
			}
		}
		
		str.append("{\n");
		
	
		
		//������е�ʵ������
		Method[] ms = c.getDeclaredMethods();
		for(Method m:ms){
			// public void setDname(String dname){}
			str.append("\t"+Modifier.toString(m.getModifiers())+" "+m.getReturnType().getSimpleName()+" "+m.getName()+"(");
			//���ʵ�������Ĳ���
			Parameter[] ps = m.getParameters();
			if(ps.length>0){
				for(int i=0;i<ps.length;i++){
					Parameter p = ps[i];
					str.append(p.getType().getSimpleName()+" "+p.getName()+(i==ps.length-1?"":","));
				}
				str.append("){}\n");
			}else{
				str.append("){return null;}\n");
			}
			
		}
		
		str.append("}");
		
		System.out.println(str.toString());
		
		
	}


}
