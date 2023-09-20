package config.xml.beans;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tut.withoutBoot.beans.OrderService;

import another.world.Repo;
import another.world.UserRepo;

public class App {
public static void main(String[] args) {
	
	System.out.println("XML Main Started");
	ApplicationContext context = new ClassPathXmlApplicationContext("config/xml/beans/XML_FOLDER/config.xml");
	
	Student student1 = context.getBean("student1",Student.class);
	student1.sayHello();
	System.out.println(student1);
	
	Map<String, String> map = student1.getMap();
	map.forEach((key,value)->{
		System.out.println(key+" => "+value);
	});
	
	System.out.println(map.getClass().getName());
	
	Address add = context.getBean(Address.class);
	System.out.println(add);
	
	System.out.println("------------------------------");
	
	Repo repo = context.getBean(Repo.class);
	repo.getUser();
	
	UserRepo userRepo = context.getBean(UserRepo.class);
	userRepo.searchUser();
	
//	OrderService orderService = context.getBean(OrderService.class);
//	orderService.createOrder();
}
}
