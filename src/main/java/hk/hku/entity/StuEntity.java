package hk.hku.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StuEntity {
    private String[] arrays;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;

    private List<CourseEntity> courses;

    @Override
    public String toString() {
        return "StuEntity{" +
                "arrays=" + Arrays.toString(arrays) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", courses=" + courses +
                '}';
    }

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }

    public String[] getArrays() {
        return arrays;
    }

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

}
