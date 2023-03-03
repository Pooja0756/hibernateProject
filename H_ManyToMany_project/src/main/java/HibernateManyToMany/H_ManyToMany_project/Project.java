package HibernateManyToMany.H_ManyToMany_project;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project 
{
    @Id
    private int project_id;
    private String project_name;
   
    @ManyToMany (mappedBy="project")
    private List<Employee> employee;
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public Project(int project_id, String project_name, List<Employee> employee) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.employee = employee;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
 
}
