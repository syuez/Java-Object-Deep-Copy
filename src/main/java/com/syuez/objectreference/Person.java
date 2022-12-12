package com.syuez.objectreference;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

public class Person {
    @Getter
    @Setter
    private String fullName;

    @Getter
    @Setter
    private int age;

    @Getter
    @Setter
    private Address address;

    /**
     * 家庭成员
     */
    @Getter
    @Setter
    private List<Family> families;

    /**
     * 就读过的学校
     */
    @Getter
    @Setter
    private List<Map<String, String>> schools;

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
