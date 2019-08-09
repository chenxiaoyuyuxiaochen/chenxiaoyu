package Java;

import java.util.Scanner;

import com.woniu.dao.DeptDAO;

public class DeptView {
   Scanner sc=new Scanner(System.in);
   DeptDAO dd=new DeptDAO();
   
   
   public void menu() {
	   int sel=-1;
	   while(sel!=5) {
		   System.out.println("***************");
			System.out.println("*部门管理系统*");
			System.out.println("*1、查看所有部门*");
			System.out.println("*2、添加部门*");
			System.out.println("*3、修改部门*");
			System.out.println("*4、删除部门*");
			System.out.println("*5、退出系统*");
			System.out.println("***************");
			sel=sc.nextInt();
			switch(sel) {
			case 1:
				showAllDept();
				break;
			
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
			case 5:
				System.out.println("系统推出，欢迎再次使用！");
				break;
	   }
		   
   }
   }
   		private void showAllDept() {
   			dd.findAll();
	
}
		public static void main(String[] args) {
			new DeptView().menu();
		}
}
