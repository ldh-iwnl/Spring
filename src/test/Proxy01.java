package src.test;
import hk.hku.proxy.OrderServiceProxy;
import hk.hku.service.impl.OrderServiceImpl;

public class Proxy01 {
    public static void main(String[] args) {
        // Agent class
        OrderServiceProxy orderServiceProxy = new OrderServiceProxy(new OrderServiceImpl());
        String s = orderServiceProxy.addOrder("csgo");
        System.out.println(s);
        // proxy class -> agent clas s



    }
}
