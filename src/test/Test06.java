package src.test;

import hk.hku.entity.EmpEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test06 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("employer.xml");
        EmpEntity empEntity = (EmpEntity) classPathXmlApplicationContext.getBean("empEntity2");
        System.out.println(empEntity);
    }
}
