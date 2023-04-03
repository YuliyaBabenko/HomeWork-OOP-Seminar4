package Planner;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<High> myHighs = new TaskList<>();

        List<Low> myLows = new TaskList<>();

        List<Middle> myMiddles = new TaskList<>();

        myHighs.add(new High("Homework", "high"));
        myHighs.add(new High("Clean the car", "high"));


        DayPlanner.exportTask(myLows);

        DayPlanner.importTask(myHighs);
    }
}
