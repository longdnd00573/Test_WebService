package example;

import example.entity.Employee;

import javax.xml.ws.Endpoint;

public class MainApplication {
    public static void main(String[] argv) {
        String helloService = "http://localhost:9000/employee-service";
        Endpoint.publish(helloService, new Employee());

    }
}
