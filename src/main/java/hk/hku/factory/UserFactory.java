package hk.hku.factory;

import hk.hku.entity.UserEntity;
import hk.hku.utils.Dom4jClass;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

public class UserFactory {
    public static UserEntity getUserEntity() throws ClassNotFoundException, InstantiationException, IllegalAccessException, DocumentException {
        /**
         * 1.使用解析xml技术 解析spring.xml配置文件；
         * 2.获取<bean id=”” class=””/> 类的完整路径地址
         * 3.使用到反射技术初始化对象
         * 4.需要使用工厂模式封装初始化对象
         */
        //configure xml file: dom4j
        String userClass = new Dom4jClass().getUserClass();
        //get class path
        //use reflection to initialize object
        Class<?> aClass = Class.forName(userClass);
        //execute default constructor
        UserEntity userEntity = (UserEntity) aClass.newInstance();
        return userEntity;
    }


}
