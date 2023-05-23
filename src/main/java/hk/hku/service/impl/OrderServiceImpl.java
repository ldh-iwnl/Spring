package hk.hku.service.impl;

import hk.hku.proxy.OrderServiceProxy;
import hk.hku.service.OrderService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderServiceImpl implements OrderService {

    public String addOrder(String orderName) {
        log.info("<orderName:{}>", orderName);
        return "ok";
    }
}
