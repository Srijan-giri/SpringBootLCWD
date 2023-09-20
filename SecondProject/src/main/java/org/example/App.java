package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student student = new Student();
        student.setName("Srijan Giri");
        System.out.println(student);
        System.out.println(student.getName());
    }
}
