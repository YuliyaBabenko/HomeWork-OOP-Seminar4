package Planner;

public class Main {
    public static void main(String[] args) {
        TaskList<High> myHighs = new TaskList<>(new High("Homework", "high"),
        new High("Clear the car", "high"), new High("Send a package", "high"));

        TaskList<Low> myLows = new TaskList<>(new Low("Bake a cake", "low"),
        new Low("Call Sarah for a walk", "low"));

        TaskList<Middle> myMiddles = new TaskList<>(new Middle("Wash the kitchen", "middle"),
        new Middle("Clean the carpet", "middle"));

        DayPlanner.exportTask(myLows);
    }
}
