package HibernateManyToMany.H_ManyToMany_project;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
     	SessionFactory factory = cfg.buildSessionFactory();
    	System.out.println(factory.isClosed());
   
     //create Table Employee
    	Employee e1 = new Employee();
    	e1.setEmp_Id(201);
    	e1.setEmp_Name("Pooja");
    	e1.setEmp_Address("Nashik");
    	
    	
    	Employee e2 = new Employee();
    	e2.setEmp_Id(202);
    	e2.setEmp_Name("Kajal");
    	e2.setEmp_Address("Pune");
    	
    //create Table project 1
    	Project p1 = new Project();
    	p1.setProject_id(101);
    	p1.setProject_name("Travelling Management");
    	
    	//create table project 2
    	Project p2 = new Project();
    	p2.setProject_id(102);
    	p2.setProject_name("Hostel Management");
    	
    	//Create Table Project 3
    	Project p3 = new Project();
    	p3.setProject_id(103);
    	p3.setProject_name("Hospital Management");
    	
    	
    	//create table project 4
    	Project p4 = new Project();
    	p4.setProject_id(104);
    	p4.setProject_name("Library management");
    	
    	//creating list of Employee and project
    	List<Employee>emp = new ArrayList<Employee>();
    	List<Project>pro = new ArrayList<Project>();
    	
    	pro.add(p1);
    	pro.add(p2);
    	pro.add(p3);
    	pro.add(p4);
    	e1.setProject(pro);
    	
    	emp.add(e1);
    	emp.add(e2);
    	p1.setEmployee(emp);
    	
    	//opening the session
    	Session session = factory.openSession();
    	
    	//opening the session
    	Transaction tx = session.beginTransaction();
    	
    	
    	
    	//saving the values of student table
    	session.save(e1);
    	session.save(e2);
    	
    	//saving the values of Department table
    	session.save(p1);
    	session.save(p2);
    	session.save(p3);
    	session.save(p4);
    	
    	//commit
    	tx.commit();
    	
    	//closing session and factory
    	session.close();
    	session.close();
    	}
    
   }
