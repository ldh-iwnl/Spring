package hk.hku.factorybean;

import hk.hku.entity.UserEntity;
import org.springframework.beans.factory.FactoryBean;

public class KyleBean implements FactoryBean{
    /**
     * define factoryBean's return object
     * @return
     * @throws Exception
     */
    public Object getObject() throws Exception {
        return new UserEntity();
    }

    public Class<?> getObjectType() {
        return null;
    }
}
