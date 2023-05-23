package src.test;

import hk.hku.entity.KyleUserEntity;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("hk.hku.entity.KyleUserEntity");
        KyleUserEntity o =(KyleUserEntity) aClass.newInstance();
        System.out.println(o);
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        Constructor<?> constructor = aClass.getConstructor(String.class, Integer.class);
        KyleUserEntity o1 = (KyleUserEntity) constructor.newInstance("Kyle", 18);
        System.out.println(o1);
    }
}
