package HibernateManyToMany.H_ManyToMany_project;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;



	@Entity
	public class Employee 
	{
		@Id
		private int Emp_Id;
		private String Emp_Name;
		private String Emp_Address;
		
		@ManyToMany 
		@JoinTable(name="employee_project_table",
		joinColumns= {@JoinColumn(name="Emp_Id")},
		inverseJoinColumns= {@JoinColumn(name="project_id")})
		private List<Project> project;

		public int getEmp_Id() {
			return Emp_Id;
		}

		public void setEmp_Id(int emp_Id) {
			Emp_Id = emp_Id;
		}

		public String getEmp_Name() {
			return Emp_Name;
		}

		public void setEmp_Name(String emp_Name) {
			Emp_Name = emp_Name;
		}

		public String getEmp_Address() {
			return Emp_Address;
		}

		public void setEmp_Address(String emp_Address) {
			Emp_Address = emp_Address;
		}

		public List<Project> getProject() {
			return project;
		}

		public void setProject(List<Project> project) {
			this.project = project;
		}

		public Employee(int emp_Id, String emp_Name, String emp_Address, List<Project> project) {
			super();
			Emp_Id = emp_Id;
			Emp_Name = emp_Name;
			Emp_Address = emp_Address;
			this.project = project;
		}

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

}
