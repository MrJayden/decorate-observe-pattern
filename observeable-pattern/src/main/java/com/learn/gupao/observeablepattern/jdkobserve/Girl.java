package com.learn.gupao.observeablepattern.jdkobserve;

import java.util.Observable;

public class Girl extends Observable {

    private String name;

    private int age;

    private Long bridePrice;


    public void wantToWedding(){
        setChanged();
        notifyObservers("我想找一个爱我的如意郎君");
    }


    public Long getBridePrice() {
        return bridePrice;
    }

    public void setBridePrice(Long bridePrice) {
        this.bridePrice = bridePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bridePrice=" + bridePrice +
                '}';
    }
}
