package hk.hku.service;

import hk.hku.dao.UserDao;
import hk.hku.factory.UserDaoFactory;

public class UserService {
    public void addUser(){
        UserDao userDao = UserDaoFactory.getUserDao();
        userDao.addUser();
    }

    public static void main(String[] args) {
        new UserService().addUser();
    }
}
