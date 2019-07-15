package com.learn.gupao.observeablepattern.jdkobserve;

import java.util.Observable;
import java.util.Observer;

public class FindLoveMan2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Girl girl = (Girl)o;
        System.out.println("***********************FindLoveMan2用户，"+girl.getName()+"正在发起一个求爱对话******************************");
        System.out.println(girl.getName()+" : "+arg.toString());
        if(girl.getBridePrice()>120000){
            System.out.println(this.getClass().getSimpleName()+" : "+girl.getName()+"姑娘，我们不合适，你家要的彩礼太高了");
            return;
        }
    }

}
