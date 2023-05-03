package src.test;

import hk.hku.entity.UserEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    public static void main(String[] args) {
//        new UserEntity().addUser();
//        //spring configures bean
//        //bean is actually an object
        // load spring config file
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new
                ClassPathXmlApplicationContext("spring.xml");
        // use bean id to get bean
        UserEntity userEntity = classPathXmlApplicationContext.getBean("userEntity", UserEntity.class);
        // call method
        userEntity.addUser();
    }
}
