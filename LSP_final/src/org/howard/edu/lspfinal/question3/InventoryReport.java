package org.howard.edu.lspfinal.question3;

/**
 * subclass that generates an inventory report.
 * got starter code from the SalesReport file
 */
public class InventoryReport extends Report {

    @Override
    protected void loadData() {
        System.out.println("Loading inventory data...");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting inventory data...");
    }

    @Override
    protected void printReport() {
        System.out.println("Printing inventory report.");
    }
}
