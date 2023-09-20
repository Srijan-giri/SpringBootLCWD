package config.xml.beans;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Student {

	String name;
	int age; 
	Address address;
	Map <String,String> map;
	
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

	public Student()
	{
		System.out.println("student created");
	}
	
	public void sayHello()
	{
		System.out.println("Hello, How are you");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", map=" + map + "]";
	}

	

	
	
}
