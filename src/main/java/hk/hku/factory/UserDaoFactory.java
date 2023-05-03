package hk.hku.factory;

import hk.hku.dao.UserDao;

public class UserDaoFactory {
    public static UserDao getUserDao(){
        return new UserDao();
    }
}
