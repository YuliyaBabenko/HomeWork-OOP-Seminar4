package Planner;


public class TaskList<T> {
    private T[] tasks;

    public TaskList(T[] tasks) {
        this.tasks = tasks;
    }

    public T[] getTasks() {
        return tasks;
    }

    public void setTasks(T[] tasks) {
        this.tasks = tasks;
    }


}
