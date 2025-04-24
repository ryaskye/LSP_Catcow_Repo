package org.howard.edu.lspfinal.question2;

/**
 * Exception thrown when a task is not found in the TaskManager.
 * used chat gpt to add serialVersionUID because it was giving warning errors
 */
public class TaskNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;  // Added serialVersionUID

    public TaskNotFoundException(String message) {
        super(message);
    }
}
