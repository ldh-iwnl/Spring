package src.test;

import hk.hku.proxy02.KyleInvocationHandler;
import hk.hku.service.OrderService;
import hk.hku.service.impl.OrderServiceImpl;

public class Proxy02 {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        OrderService orderService = new KyleInvocationHandler(new OrderServiceImpl()).getProxy();
        orderService.addOrder("kyle");
    }
}
