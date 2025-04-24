package org.howard.edu.lspfinal.question3;

/**
 * subclass that generates a sales report
 * help from google for formatting
 */
public class SalesReport extends Report {

    @Override
    protected void loadData() {
        System.out.println("Loading sales data...");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting sales data...");
    }

    @Override
    protected void printReport() {
        System.out.println("Printing sales report.");
    }
}
