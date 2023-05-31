package src.test;

import hk.hku.service.KyleService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("aop.xml");
        KyleService kyleService = (KyleService) classPathXmlApplicationContext.getBean("kyleService", KyleService.class);
        kyleService.addUser(123456);

    }
}
