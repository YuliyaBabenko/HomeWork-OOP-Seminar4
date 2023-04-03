package Planner;

import java.util.*;

public class TaskList<T> {
    private List<T> tasks = new ArrayList<>();

    public TaskList(List<T> tasks) {
        this.tasks = tasks;
    }

    public List<T> getTasks() {
        return tasks;
    }

    public void setTasks(List<T> tasks) {
        this.tasks = tasks;
    }

}
