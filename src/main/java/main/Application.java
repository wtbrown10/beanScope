package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

            Car car1 = ctx.getBean(Car.class);
            Car car2 = ctx.getBean(Car.class);

            System.out.println("Car 1: " + car1);
            System.out.println("Car 2: " + car2);
            System.out.println("");


            ((AnnotationConfigApplicationContext)ctx).close();

    }
}
