package com.syuez;

import lombok.Data;

@Data
public class Address {
    private String street;
    private String city;
    private String country;
    /**
     * 常规构造函数
     */
    public Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }
    /**
     * 深度克隆
     * 拷贝构造函数
     */
//    public Address(Address that) {
//        this(that.getStreet(), that.getCity(), that.getCountry());
//    }

    /**
     * 重写 clone 方法来实现深克隆
     */
//    @Override
//    public Address clone() {
//        try {
//            return (Address) super.clone();
//        } catch (CloneNotSupportedException e) {
//            return new Address(this.street, this.getCity(), this.getCountry());
//        }
//    }


}
