package application;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	 
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();
        
		System.out.println("=== TEST 1: Department findByID	=====");
		
		Department department = DepartmentDao.findById(3);
		
		System.out.println(department);
		
		
		System.out.println("\n=== TEST 2: seller findAll	=====");
		
		 List<Department> list = DepartmentDao.findAll();
		
	    for(Department obj : list) {
	    	System.out.println(obj);
	    }
		
		
	    System.out.println("\n=== TEST 3: 	Department Delete	=====");
	    System.out.println("Enter id for delete test: ");
	    int id = sc.nextInt();
	   DepartmentDao.deleteByid(id);
	   System.out.println("Delete completed");
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 System.out.println("\n=== TEST 4: Department Insert	=====");
		 Department newDepartment = new Department(null,"Music");
		 DepartmentDao.insert(newDepartment);
		 System.out.println("Inserted! New id: " + newDepartment.getId());
		 
		 
		 
		 
		 
		 
		 
	}
           
}
