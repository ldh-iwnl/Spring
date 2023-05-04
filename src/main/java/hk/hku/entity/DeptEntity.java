package hk.hku.entity;

public class DeptEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DeptEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
