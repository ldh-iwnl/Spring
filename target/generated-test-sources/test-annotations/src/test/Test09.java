package src.test;

import hk.hku.entity.MemberEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test09 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("member.xml");
        MemberEntity memberEntity = (MemberEntity) classPathXmlApplicationContext.getBean("memberEntity");
        System.out.println("step 4: getBean memberEntity");
        System.out.println(memberEntity);
    }
}
