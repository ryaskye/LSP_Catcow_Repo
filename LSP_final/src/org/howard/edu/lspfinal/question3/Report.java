package org.howard.edu.lspfinal.question3;

/**
 * a class that defines the template method for generating a report
 * google for help of starter code
 */
public abstract class Report {

	/**
	 *Step 1: Load data, Step 2: Format data, Step 3: Print report
	 */
    public void generateReport() {
        loadData();    
        formatData();  
        printReport(); 
    }

    /**
     *abstract method to implement for subclasses 
     */
    protected abstract void loadData();
    protected abstract void formatData();
    protected abstract void printReport();
}
