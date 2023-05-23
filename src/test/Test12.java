package src.test;

import hk.hku.entity.EmpEntity;


/**
 * three different ways to acquire class objects in Java
 *
 */
public class Test12 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. methods of acquiring class objects: use object name directly
        Class<EmpEntity> empEntityClass = EmpEntity.class;
        //2. new object, acquire class using object
        EmpEntity empEntity = new EmpEntity();
        Class<? extends EmpEntity> aClass = empEntity.getClass();
        //3. use Class.forName(), reflection mechanism
        Class<?> aClass1 = Class.forName("hk.hku.entity.EmpEntity");
        System.out.println(empEntityClass == aClass);
        System.out.println(empEntityClass == aClass1);

    }
}
