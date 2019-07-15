package com.learn.gupao.decorator;

import java.time.LocalDateTime;

public class PaintWall implements IHomeDecorator {
    private IHomeDecorator homeDecorator;

    public PaintWall(IHomeDecorator homeDecorator){
        this.homeDecorator = homeDecorator;
    }

    @Override
    public IHomeDecorator decorateHome() {
        System.out.println(LocalDateTime.now()+" ：  ###我要将这房间的墙刷白###");
        homeDecorator.decorateHome();
        System.out.println(LocalDateTime.now()+" ：  ###当里格朗，我将这房间的墙刷白了###");
        return this;
    }
}
