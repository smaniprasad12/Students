package methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
	

	int id;
	String name;
	int age;
	String school;
   public Lists() {
		
	}
	
	public Lists(int id,String name,int age,String school) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.school=school;
	}
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "id:" + id + ", name: " + name + ", age: "+ age+ age + ", school: " + school + "";
	}
	
	

}
