package com.tut.withoutBoot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tut.withoutBoot.beans.CartService;
import com.tut.withoutBoot.beans.OrderService;
import com.tut.withoutBoot.beans.UserService;
import com.tut.withoutBoot.config.AppConfig;
import com.tut.withoutBoot.web.AuthController;
import com.tut.withoutBoot.web.HomeController;

import another.world.Repo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Application Started" );
        // we have to create object of application context
        
        // annotation based 
         ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        //for XML
        //ApplicationContext context = new ClassPathXmlApplicationContext("XML_FILE_NAME");
         
         System.out.println(context);
         CartService cartService1 = context.getBean("cartService1",CartService.class);
         cartService1.createCart();

         UserService userServie  = context.getBean(UserService.class);
         userServie.saveUser();
         
         OrderService orderService = context.getBean(OrderService.class);
         System.out.println(orderService);
         orderService.createOrder();
         
         
        HomeController home =  context.getBean(HomeController.class);
        home.homePage();
        
        AuthController authController = context.getBean(AuthController.class);
        authController.login();
        
        Repo r = context.getBean(Repo.class);
        r.getUser();
    }
}
