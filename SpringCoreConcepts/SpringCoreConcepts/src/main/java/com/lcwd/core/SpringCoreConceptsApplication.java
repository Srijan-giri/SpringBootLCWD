package com.lcwd.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

import com.lcwd.core.DependencyInjection.Person_DI;
import com.lcwd.core.DependencyInjection.Samosa;
import com.lcwd.core.DependencyInjection.Student;
import com.lcwd.core.LooseCoupling.Animal1;
import com.lcwd.core.LooseCoupling.Person;
import com.lcwd.core.scope.Pepsi;
import com.lcwd.core.scope.Soda;

import test.Test;




@SpringBootApplication
//@ComponentScan(basePackages = {"com.lcwd.core","test"})
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {

		// 1. tight coupling
//		Person p = new Person();
//		p.playWithAnimal();

		// 2. loose coupling

//		Animal1 animal1 = new Dog();
//		Animal1 animal1 = new Cat();
//		Person p = new Person(animal1);
//		p.playWithAnimal();
		
		
		
		// 3.a) About the beans
		
		  // @Component
		 
		 // b)About the dependencies
		 // @Autowired
		
		 // c) where to scan for beans  --> com.lcwd.SpringCoreConcepts.LooseCoupling
		 // @ComponentScan()

		
		/*
		
		
		 ApplicationContext context  = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		 
		 Person personBean = context.getBean(Person.class);
		 
		 personBean.playWithAnimal();
		 System.out.println(personBean);
		 
		 
         Test testBean = context.getBean(Test.class);
         System.out.println(testBean.getClass());
         System.out.println(testBean.getClass().getPackageName());
         testBean.testing();

         
         Animal1 cat = context.getBean("cat",Animal1.class);
         Animal1 dog = context.getBean("dog",Animal1.class);
         cat.play();
         dog.play();
         
         */
		
		// 4. Dependency Injection
		
		
		/*
		 ApplicationContext context  = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		 
		 Person_DI personBean = context.getBean(Person_DI.class);
		 
		 personBean.playWithAnimal();
		 System.out.println(personBean);
		 
		 */
		 
		 
		 
		 // 5. bean scope
		
		
		// 1. Singleton
		// 2. Protoype
		
		// first request for Pepsi Bean
		
		/*
		
		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		Pepsi bean = context.getBean(Pepsi.class);
		System.out.println(bean);
		bean.drink();
		 
		// second request for Pepsi Bean
		
		Pepsi bean1 = context.getBean(Pepsi.class);
		System.out.println(bean1);
		bean1.drink();
		
		
		// third request for Pepsi Bean
		
		Pepsi bean2 = context.getBean(Pepsi.class);
		System.out.println(bean2);
		bean2.drink();
		 
		 */
		
		// 6. Proxy Mode in Bean Scope

		// Single  bean inside multiple bean create -- > multiple dependency
		
		
		/*
		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		
		Pepsi pepsi  = context.getBean(Pepsi.class);
		
		System.out.println(pepsi);
		Soda soda  = pepsi.getSoda();
		System.out.println(soda);
		
		
		Pepsi pepsi1  = context.getBean(Pepsi.class);
		System.out.println(pepsi1);
		Soda soda1  = pepsi.getSoda();
		System.out.println(soda1);
		
		Pepsi pepsi2 = context.getBean(Pepsi.class);
		System.out.println(pepsi2);
		Soda soda2 = pepsi.getSoda();
		System.out.println(soda2);
		
		*/
		
		// 7. Spring Life Cycle : @PostConstruct and @PreDestroy
		
		
		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		
		com.lcwd.core.lifecycle.Student student = context.getBean("student5",com.lcwd.core.lifecycle.Student.class);
		
		System.out.println(student);
		student.postConstruct();
		
		
		
	}


}
