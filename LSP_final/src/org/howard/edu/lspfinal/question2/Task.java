package org.howard.edu.lspfinal.question2;

/**
 * Represents a Task in the TaskManager with a name, priority, and status.
 */
public class Task {
    private String name;
    private int priority;
    private String status;

    // Constructor
    public Task(String name, int priority, String status) {
        this.name = name;
        this.priority = priority;
        this.status = status;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + ", status='" + status + "'}";
    }
}
