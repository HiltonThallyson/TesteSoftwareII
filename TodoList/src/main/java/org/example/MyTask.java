package org.example;

public class MyTask {
    private String title;
    private String description;
    private int priority;

    MyTask(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) throws IllegalArgumentException {
        if (title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
    }

    public Priority getPriority() {
        if(priority == 0) {
            return Priority.PriorityLow;
        }else if(priority == 1) {
            return Priority.PriorityMedium;
        }else {
            return Priority.PriorityHigh;
        }

    }

    public void setPriority(int priority) throws IllegalArgumentException {
//        if(priority < 0 || priority > 2){
//            throw new IllegalArgumentException("Priority must be between 0 and 2");
//        }
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) throws IllegalArgumentException {
        if(description == null || description.trim().isEmpty()){
            throw new IllegalArgumentException("Description cannot be null or empty");
        }
        this.description = description;
    }

    public String getTaskInformation() {
        return "Title: " + title + "\n" + "Description: " + description + "\n" + "Priority: " + getPriority().name();
    }
}
