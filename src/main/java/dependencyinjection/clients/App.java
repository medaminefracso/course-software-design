package dependencyinjection.clients;

import dependencyinjection.vehicles.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Vehicle aCar = (Vehicle) context.getBean("mrBeansCar");
        aCar.crankIgnition();
    }
}
