package hk.hku.entity;

public class EmpEntity {
    private String name;
    private Integer age;
    private DeptEntity deptEntity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public DeptEntity getDeptEntity() {
        return deptEntity;
    }

    public void setDeptEntity(DeptEntity deptEntity) {
        this.deptEntity = deptEntity;
    }

    @Override
    public String toString() {
        return "EmpEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", deptEntity=" + deptEntity +
                '}';
    }
}
