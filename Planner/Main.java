package Planner;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskList<High> myHighs = new TaskList<>();

        TaskList<Low> myLows = new TaskList<>();

        TaskList<Middle> myMiddles = new TaskList<>();

        myHighs.addTask(new High("Homework", "high"));
        myHighs.addTask(new High("Clean the car", "high"));


        DayPlanner.exportTask(myLows);

        DayPlanner.importTask(myHighs);
    }
}
