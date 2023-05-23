package src.test;

import hk.hku.entity.EmpEntity;
import hk.hku.entity.MemberEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test11 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("employer_auto.xml");
        EmpEntity empEntity = (EmpEntity) classPathXmlApplicationContext.getBean("empEntity2");
        System.out.println(empEntity);
    }
}
