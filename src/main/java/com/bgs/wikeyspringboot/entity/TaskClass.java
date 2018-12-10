package com.bgs.wikeyspringboot.entity;

public class TaskClass {
    private Integer id;
    private String task;
    private Integer application;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Integer getApplication() {
        return application;
    }

    public void setApplication(Integer application) {
        this.application = application;
    }

    @Override
    public String toString() {
        return "TaskClass{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", application=" + application +
                '}';
    }
}
