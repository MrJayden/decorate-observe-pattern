package com.learn.gupao.observeablepattern.guawa;

import java.time.LocalDateTime;

public class ClassMessage {

    private String className;
    private Teacher teacher;
    private LocalDateTime dateTime;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "ClassMessage{" +
                "className='" + className + '\'' +
                ", teacher=" + teacher +
                ", dateTime=" + dateTime +
                '}';
    }
}
