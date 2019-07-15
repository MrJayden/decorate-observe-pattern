package com.learn.gupao.observeablepattern.jdkobserve;

public class FindLoveManMainTest {
    public static void main(String[] args) {
        FindLoveMan1 man1 = new FindLoveMan1();
        FindLoveMan2 man2 = new FindLoveMan2();
        FindLoveMan3 man3 = new FindLoveMan3();

        Girl girl1 = new Girl();

        girl1.setName("紫萱");
        girl1.setBridePrice(130000L);
        girl1.setAge(22);

        girl1.addObserver(man1);
        girl1.addObserver(man2);
        girl1.addObserver(man3);

        girl1.wantToWedding();
    }
}
