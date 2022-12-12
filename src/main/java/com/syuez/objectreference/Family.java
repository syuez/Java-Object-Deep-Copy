package com.syuez.objectreference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Family {
    private String type;
    private String fullName;

    @Override
    public String toString() {
        return "Family{" +
                "type='" + type + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
