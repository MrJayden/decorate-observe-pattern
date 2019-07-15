package com.learn.gupao.decorator;

import java.time.LocalDateTime;

public class InstallDropLight implements IHomeDecorator {

    private IHomeDecorator homeDecorator;

    public InstallDropLight(IHomeDecorator homeDecorator){
         this.homeDecorator = homeDecorator;
    }

    @Override
    public IHomeDecorator decorateHome() {
        System.out.println(LocalDateTime.now()+" ：  @@@我要将这房间的吊灯给装上@@@");
        homeDecorator.decorateHome();
        System.out.println(LocalDateTime.now()+" ：  @@@哈哈，我将这房间的吊灯给装上了@@@");
        return this;
    }
}
