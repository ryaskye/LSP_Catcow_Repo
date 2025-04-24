package org.howard.edu.lspfinal.question3;

/**
 * Driver class to demonstrate the report generation workflow to see if the files work, got help from chat gpt for debugging errors.
 * it creates a SalesReport instance and InventoryReport instance and adds a blank line in between reports
 */
public class Driver {

    public static void main(String[] args) {
    	
        Report salesReport = new SalesReport();
        salesReport.generateReport(); 

        System.out.println();  

        
        Report inventoryReport = new InventoryReport();
        inventoryReport.generateReport();  
    }
}
