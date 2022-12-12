package com.syuez.objectreference;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Person {
    @Getter
    @Setter
    private String fullName;

    @Getter
    @Setter
    private int age;
    private Address address;
    public Address getAddress() {
        return new Address(address);
    }

    public void setAddress(Address address) {
        this.address = new Address(address);
    }
    /**
     * 家庭成员
     */
    private List<Family> families;

    public List<Family> getFamilies() {
        return new ArrayList<>(families);
    }

    public void setFamilies(List<Family> families) {
        this.families = new ArrayList<>(families);
    }
    /**
     * 就读过的学校
     */
    private List<Map<String, String>> schools;

    public List<Map<String, String>> getSchools() {
        return new ArrayList<>(schools);
    }
//    public void setSchools(List<Map<String, String>> schools) {
//        this.schools = new ArrayList<>(schools);
//    }
    public void setSchools(List<Map<String, String>> schools) {
        this.schools = schools.stream()
                .map(HashMap::new)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", families=" + families +
                ", schools=" + schools +
                '}';
    }
}
