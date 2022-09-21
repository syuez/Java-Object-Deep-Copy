package com.syuez;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShallowCopyTest {
    /**
     * 浅克隆，hashCode 相同，equals 相等，但不是同一个对象。
     * 符合克隆的定义，内容相同，但不是同一个个体。
     */
    @Test
    public void whenShallowCopying_thenObjectsShouldNotBeSame() {
        Address address = new Address("Downing St 10", "London", "England");
        User pm = new User("Prime", "Minister", address);
        User shallowCopy = new User(pm.getFirstName(), pm.getLastName(), pm.getAddress());

        System.out.println(pm.hashCode());
        System.out.println(shallowCopy.hashCode());

        System.out.println(pm.equals(shallowCopy));

        assertThat(shallowCopy).isNotSameAs(pm);
    }
    /**
     * 当原始对象发生改变时，浅克隆也会发生变化
     */
    @Test
    public void whenModifyingOriginalObject_ThenCopyShouldChange() {
        Address address = new Address("Downing St 10", "London", "England");
        User pm = new User("Prime", "Minister", address);
        User shallowCopy = new User(pm.getFirstName(), pm.getLastName(), pm.getAddress());

        address.setCountry("Great Britain");

        System.out.println(shallowCopy.getAddress().getCountry());
        System.out.println(pm.getAddress().getCountry());

        assertThat(shallowCopy.getAddress().getCountry()).isEqualTo(pm.getAddress().getCountry());
    }

}