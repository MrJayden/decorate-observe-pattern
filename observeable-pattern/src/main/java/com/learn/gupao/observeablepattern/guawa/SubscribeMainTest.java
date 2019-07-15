package com.learn.gupao.observeablepattern.guawa;

import com.google.common.eventbus.EventBus;

import java.time.LocalDateTime;

public class SubscribeMainTest {

    public static void main(String[] args) {
        EventBus gperEventBus = new EventBus();
        EventBus stuEventBus = new EventBus();

        gperEventBus.register(new GuPaoStudent("hanmeimei"));
        stuEventBus.register(new Gper());

        Question question = new Question();
        question.setDateTime(LocalDateTime.now());
        question.setStuName("zhangsan");
        question.setTeacher(Teacher.Tom);
        question.setQuestion("老师，我想进设计模式强化训练营，可以不？");
        stuEventBus.post(question);
        System.out.println("#########################################################");

        ClassMessage classMessage = new ClassMessage();
        classMessage.setClassName("深入讲解观察者模式");
        classMessage.setTeacher(Teacher.Tom);
        classMessage.setDateTime(LocalDateTime.parse("2019-05-12T20:00:00"));
        gperEventBus.post(classMessage);

    }
}
