package cxf.client;

import cxf.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.rmi.RemoteException;

public class CxfClient {

    public static void main(String[] args) throws RemoteException{
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cxf-client.xml");
        HelloService client = (HelloService) context.getBean("helloClient");
        System.out.println(client.sayHello("hehe"));
    }

}
