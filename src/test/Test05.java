package src.test;

import hk.hku.service.MemberService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring_02.xml");
        MemberService memberService = (MemberService) classPathXmlApplicationContext.getBean("memberService");
        memberService.addMember();
    }
}
