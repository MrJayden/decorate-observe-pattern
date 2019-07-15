package com.learn.gupao.observeablepattern.guawa;

import java.time.LocalDateTime;

public class Question {

    private String stuName;

    private Teacher teacher;

    private String question;

    private LocalDateTime dateTime;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Question{" +
                "stuName='" + stuName + '\'' +
                ", teacher=" + teacher +
                ", question='" + question + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
