package com.learn.gupao.decorator;

public class DecoratorMainTest {

    public static void main(String[] args) {

        IHomeDecorator homeDecorator = new PutFloor(new PaintWall(new InstallDropLight(new BaseHome())));
        homeDecorator.decorateHome();
    }

}
