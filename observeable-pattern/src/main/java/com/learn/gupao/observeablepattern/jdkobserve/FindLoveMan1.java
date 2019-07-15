package com.learn.gupao.observeablepattern.jdkobserve;

import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public class FindLoveMan1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Girl girl = (Girl)o;
        System.out.println("***********************FindLoveMan1用户，"+girl.getName()+"正在发起一个求爱对话******************************");
        System.out.println(girl.getName()+" : "+arg.toString());
        if(girl.getAge()>25){
            System.out.println(this.getClass().getSimpleName()+" : "+girl.getName()+"姑娘,我们不合适，我年龄太小了");
            return;
        }
        System.out.println(this.getClass().getSimpleName()+" : 我对你的印象挺好的，可以往下发展");
    }

}
