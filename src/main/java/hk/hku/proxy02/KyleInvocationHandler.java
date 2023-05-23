package hk.hku.proxy02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class KyleInvocationHandler implements InvocationHandler {
    private Object target;

    public KyleInvocationHandler(Object target) {
        this.target = target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("KyleInvocationHandler invoke, args:{}", args);
        Object result = method.invoke(target, args);
        log.info("KyleInvocationHandler invoke end,args:{}", args);
        return result;
    }
    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
