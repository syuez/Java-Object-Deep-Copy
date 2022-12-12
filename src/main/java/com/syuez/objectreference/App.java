package com.syuez.objectreference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCity("上海");
        address.setCountry("中国");

        Family family1 = new Family();
        family1.setType("父亲");
        family1.setFullName("于小屁");
        Family family2 = new Family();
        family2.setType("哥哥");
        family2.setFullName("于大屁");
        List<Family> list = new ArrayList<>();
        list.add(family1);
        list.add(family2);

        Map<String, String> primarySchool = new HashMap<>();
        primarySchool.put("小学", "弱智一小");

        Map<String, String> middleSchool = new HashMap<>();
        middleSchool.put("中学", "庞各庄中学");

        Map<String, String> college = new HashMap<>();
        college.put("大学", "清华池");

        List<Map<String, String>> schools = new ArrayList<>();
        schools.add(primarySchool);
        schools.add(middleSchool);
        schools.add(college);

        Person person = new Person();
        person.setFullName("于谦");
        person.setAge(18);
        person.setAddress(address);
        person.setFamilies(list);
        person.setSchools(schools);
        System.out.println(person);

        System.out.println("----过了 10 年--------");

        address.setCity("纽约");
        address.setCountry("美国");

        // 哥哥成家了
        Family family3 = new Family();
        family3.setFullName("王钢蛋");
        family3.setType("嫂子");
        list.add(family3);
        person.setAge(28);
        // 偷偷改了小学经历
        primarySchool.put("小学", "清华二小");
        // 被人发现没读过大学
        schools.remove(2);

        System.out.println(person);

    }
}
