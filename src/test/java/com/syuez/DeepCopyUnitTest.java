package com.syuez;

import com.google.gson.Gson;
import org.apache.commons.lang.SerializationUtils;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotEquals;

public class DeepCopyUnitTest {
    /**
     * 深度克隆
     * 使用 拷贝构造函数 后
     * 原始对象的修改不会改变克隆体(deepCopy)的内容
     */
//    @Test
//    public void whenModifyingOriginalObject_thenCopyShouldNotChange() {
//        Address address = new Address("Downing St 10", "London", "England");
//        User pm = new User("Prime", "Minister", address);
//        User deepCopy = new User(pm);
//
//        address.setCountry("Great Britain");
//
//        System.out.println(pm.getAddress().getCountry());
//        System.out.println(deepCopy.getAddress().getCountry());
//
//        assertNotEquals(pm.getAddress().getCountry(),deepCopy.getAddress().getCountry());
//    }

    /**
     * 实现 Object 的 clone 方法，来实现深克隆
     */
//    @Test
//    public void whenModifyingOriginalObject_thenCloneCopyShouldNotChange() {
//        Address address = new Address("Downing St 10", "London", "England");
//        User pm = new User("Prime", "Minister", address);
//        User deepCopy = (User) pm.clone();
//
//        address.setCountry("Great Britain");
//
//        System.out.println(pm.getAddress().getCountry());
//        System.out.println(deepCopy.getAddress().getCountry());
//
//        assertThat(deepCopy.getAddress().getCountry())
//                .isNotEqualTo(pm.getAddress().getCountry());
//    }

    /**
     * Apache Commons Lang 序列化
     * 需要将 Serializable 接口添加到类中
     */
//    @Test
//    public void whenModifyingOriginalObject_thenCommonsCloneShouldNotChange() {
//        Address address = new Address("Downing St 10", "London", "England");
//        User pm = new User("Prime", "Minister", address);
//        User deepCopy = (User) SerializationUtils.clone(pm);
//
//        address.setCountry("Great Britain");
//
//        System.out.println(pm.getAddress().getCountry());
//        System.out.println(deepCopy.getAddress().getCountry());
//
//        assertThat(deepCopy.getAddress().getCountry())
//                .isNotEqualTo(pm.getAddress().getCountry());
//    }

    @Test
    public void whenModifyingOriginalObject_thenGsonCloneShouldNotChange() {
        Address address = new Address("Downing St 10", "London", "England");
        User pm = new User("Prime", "Minister", address);
        Gson gson = new Gson();
        User deepCopy = gson.fromJson(gson.toJson(pm), User.class);

        address.setCountry("Great Britain");

        System.out.println(pm.getAddress().getCountry());
        System.out.println(deepCopy.getAddress().getCountry());

        assertThat(deepCopy.getAddress().getCountry())
                .isNotEqualTo(pm.getAddress().getCountry());
    }


}
