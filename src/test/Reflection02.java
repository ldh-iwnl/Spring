package src.test;

import hk.hku.entity.KyleUserEntity;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        // acquire class attribute (use reflection to give attribute value)
        Class<?> aClass = Class.forName("hk.hku.entity.KyleUserEntity");
//        Field[] fields = aClass.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        KyleUserEntity o = (KyleUserEntity) aClass.newInstance();
        Field name = aClass.getDeclaredField("name");
        // setAccessible(true) to ignore private modifier
        name.setAccessible(true);
        name.set(o, "Kyle");
        System.out.println(o.getName());
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        String invoke = (String) aClass.getMethod("setName", String.class).invoke(o, "Kyle2");
        System.out.println(o.getName());
    }
}
