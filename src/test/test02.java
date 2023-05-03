package src.test;

import hk.hku.entity.UserEntity;
import hk.hku.factory.UserFactory;
import org.dom4j.DocumentException;

public class test02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, DocumentException {
        /**
         * 1.使用解析xml技术 解析spring.xml配置文件；
         * 2.获取<bean id=”” class=””/> 类的完整路径地址
         * 3.使用到反射技术初始化对象
         * 4.需要使用工厂模式封装初始化对象
         */
        //configure xml file
        //get class path
        //use reflection to initialize object
        UserEntity userEntity = UserFactory.getUserEntity();
        System.out.println(userEntity);
        userEntity.addUser();
    }
}
