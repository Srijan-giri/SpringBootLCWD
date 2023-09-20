class Demo {

    Demo(){
        System.out.println("Creating Object of Demo");
    }

    public void display()
    {
        System.out.println("Display Details");
    }
}




public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello Everyone");
        Demo d = new Demo();
        d.display();
    }
}
