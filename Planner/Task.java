package Planner;

public class Task {
    private String description;
    private String prio;

    public Task(String description, String prio) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPrio() {
        return prio;
    }
    public void setPrio(String prio) {
        this.prio = prio;
    }
    @Override
    public String toString() {
        return this.description + " has priority " + prio;
    }

}
