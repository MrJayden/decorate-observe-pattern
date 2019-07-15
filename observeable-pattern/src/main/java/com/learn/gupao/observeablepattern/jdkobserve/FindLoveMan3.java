package com.learn.gupao.observeablepattern.jdkobserve;

import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public class FindLoveMan3 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Girl girl = (Girl)o;
        System.out.println("***********************FindLoveMan3用户，"+girl.getName()+"正在发起一个求爱对话******************************");
        System.out.println(girl.getName()+" : "+arg.toString());
        if(girl.getAge()<30 ){
            System.out.print(this.getClass().getSimpleName()+" : "+girl.getName()+"姑娘，我喜欢你,");
        }
        if(girl.getBridePrice()<200000){
            System.out.print("你嫁给我吧");
        }
        if(girl.getBridePrice()>200000){
            System.out.print("但是彩礼有点高，如果你能降一点，我想我就更有动力去追你了");
        }
        System.out.println();
    }
}
