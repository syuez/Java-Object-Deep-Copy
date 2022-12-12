package com.syuez.objectreference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String city;
    private String country;

    /**
     * 无参构造函数
     */
    public Address() {
    }

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public Address(Address that) {
        this(that.getCity(), that.getCountry());
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
