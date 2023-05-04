package src.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test07 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("stu_public.xml");
        hk.hku.entity.StuEntity stuEntity = (hk.hku.entity.StuEntity) classPathXmlApplicationContext.getBean("stuEntity");
        System.out.println(stuEntity);
    }
}
