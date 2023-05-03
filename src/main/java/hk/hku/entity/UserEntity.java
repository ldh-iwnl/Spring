package hk.hku.entity;

public class UserEntity {
    public void addUser(){
        System.out.println("Add user");
    }

    public UserEntity(){
        System.out.println("UserEntity constructor");
    }
    public UserEntity(Integer age){
        System.out.println("UserEntity constructor with age");
    }
}
