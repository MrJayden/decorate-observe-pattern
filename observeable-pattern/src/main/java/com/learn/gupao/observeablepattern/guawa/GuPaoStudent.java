package com.learn.gupao.observeablepattern.guawa;

import com.google.common.eventbus.Subscribe;

import java.time.format.DateTimeFormatter;
import java.util.Observer;

public class GuPaoStudent {

    private String stuName;

    public GuPaoStudent(String stuName){
        this.stuName = stuName;
    }

    @Subscribe
    public void getClassMessage(ClassMessage classMessage){

        System.out.println(stuName+"您好,您有一条上课消息");
        System.out.println("    课程名称 ： "+classMessage.getClassName());
        System.out.println("    开讲时间 ： "+classMessage.getDateTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("    讲课老师 ： "+classMessage.getTeacher());

    }
}
