package hk.hku.service;

import org.springframework.stereotype.Component;

@Component
// same as <bean id="kyleService" class="hk.hku.service.KyleService"/>
public class KyleService {
    public String addUser(){
        System.out.println("KyleService.addUser() is called");
        return "Ok";
    }
    public String addUser(Integer id){
        System.out.println("KyleService.addUser() is called");
        return "Ok";
    }
    public String delUser(){
        System.out.println("KyleService.delUser() is called");
        return "Ok";
    }
    public String updateUser(){
        System.out.println("KyleService.updateUser() is called");
        return "Ok";
    }
}
