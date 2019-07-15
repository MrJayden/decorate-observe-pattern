package com.learn.gupao.decorator;

import java.time.LocalDateTime;

public class PutFloor implements IHomeDecorator {
    private  IHomeDecorator homeDecorator;
    public PutFloor(IHomeDecorator homeDecorator){
         this.homeDecorator = homeDecorator;
    }
    @Override
    public IHomeDecorator decorateHome() {
        System.out.println(LocalDateTime.now()+" ：  &&&&我要将这房间的地板给铺了");
        homeDecorator.decorateHome();
        System.out.println(LocalDateTime.now()+" ：  &&&&我已经将这房间的地板给铺了&&&&");
        return this;
    }
}
