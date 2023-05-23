package hk.hku.proxy;

import hk.hku.service.OrderService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderServiceProxy implements OrderService{
    private OrderService orderService;

    public OrderServiceProxy(OrderService orderService) {
        this.orderService = orderService;
    }

        public String addOrder(String orderName) {
            log.info("addOrder start orderName:{}", orderName);
            String s = orderService.addOrder(orderName);
            log.info("addOrder end orderName:{}", orderName);
            return s;

        }

}
