package hk.hku.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class KylePostProcessor02 implements BeanPostProcessor, Ordered {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("step 1: postProcessBeforeInitialization02");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("step 3: postProcessAfterInitialization02");
        return bean;
    }

    public int getOrder() {
        return 0;
    }
}
