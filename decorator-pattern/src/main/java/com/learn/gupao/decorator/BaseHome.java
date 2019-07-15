package com.learn.gupao.decorator;

import java.time.LocalDateTime;

public class BaseHome implements IHomeDecorator {

    @Override
    public IHomeDecorator decorateHome() {
        System.out.println(LocalDateTime.now()+"  :   我是毛坯房");
        return this;
    }
}
