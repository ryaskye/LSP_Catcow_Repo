package org.howard.edu.lspfinal.question2;

/**
 * Exception thrown when a task with the same name already exists in the TaskManager.
 * used chat gpt to add serialVersionUID because it was giving warning errors
 */
public class DuplicateTaskException extends Exception {
    private static final long serialVersionUID = 1L;  // Added serialVersionUID

    public DuplicateTaskException(String message) {
        super(message);
    }
}
