package com.learn.gupao.observeablepattern.guawa;

import com.google.common.eventbus.Subscribe;
import org.springframework.format.datetime.DateFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Gper {

    @Subscribe
    public void askQuestion(Question question){
        System.out.println(question.getTeacher()+"老师，一份答疑消息");
        System.out.println("    学员名称 ："+question.getStuName());
        System.out.println("    提问内容 ："+question.getQuestion());
        System.out.println("    提问时间 ："+question.getDateTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }


}
