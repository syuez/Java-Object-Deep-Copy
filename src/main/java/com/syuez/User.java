package com.syuez;

import lombok.Data;

@Data
public class User {
    private String firstName;
    private String lastName;
    private Address address;
    /**
     * 常规构造函数
     */
    public User(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    /**
     * 深度克隆
     * 拷贝构造函数
     */
//    public User(User that) {
//        this(that.getFirstName(), that.getLastName(), new Address(that.getAddress()));
//    }

    /**
     * 重写 clone 方法来实现深克隆
     */
//    @Override
//    public User clone() {
//        User user;
//        try {
//            user =  (User) super.clone();
//        } catch (CloneNotSupportedException e) {
//            user = new User(this.getFirstName(), this.getLastName(), this.getAddress());
//        }
//        user.address = (Address) this.address.clone();
//        return user;
//    }
}
