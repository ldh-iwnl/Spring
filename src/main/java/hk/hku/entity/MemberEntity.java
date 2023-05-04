package hk.hku.entity;

public class MemberEntity {
    private String name;

    public MemberEntity() {
        System.out.println("first step: MemberEntity constructor");
    }
    public void setName(String name) {
        System.out.println("second step: MemberEntity setName");
        this.name = name;
    }
    public void init(){
        System.out.println("third step: MemberEntity init");
    }
    public void destroy(){
        System.out.println("fifth step: MemberEntity destroy");
    }

    @Override
    public String toString() {
        return "MemberEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
