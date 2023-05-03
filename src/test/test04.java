package src.test;

import hk.hku.entity.BookEntity;
import hk.hku.entity.OrderEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test04 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("order.xml");
        OrderEntity orders =classPathXmlApplicationContext.getBean("orderEntity", OrderEntity.class);
        System.out.println(orders.toString());
    }
}
