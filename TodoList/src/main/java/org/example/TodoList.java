package org.example;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class TodoList {
    ArrayList<MyTask> tasks = new ArrayList<MyTask>();
    public void printList() {
        tasks.forEach(printTask -> System.out.println(printTask.getTaskInformation() + "\n"));
    }

    public boolean addTask(MyTask task) {
        if(tasks.contains(task)) {
            return false;
        }
        return tasks.add(task);
    }

    public boolean removeTask(MyTask task) {
        if(tasks.contains(task)) {
            return tasks.remove(task);
        }
            return false;
    }

    public MyTask getTask(String title) throws NoSuchElementException {
        if(tasks.isEmpty()) {
            return null;
        }
        for(MyTask task : tasks) {
            if(task.getTitle().equals(title)) {
                return task;
            }
        }
        throw new NoSuchElementException();
    }
}
