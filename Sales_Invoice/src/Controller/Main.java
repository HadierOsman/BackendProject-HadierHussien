package Controller;

import Model.FileOperations;
import Model.InvoiceHeader;
import Model.InvoiceLine;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOperations invoiceHeader = new FileOperations();
        List<InvoiceLine> obj =  invoiceHeader.readInvoices();
        for (InvoiceLine b : obj) {
            System.out.println("Invoice Data is: Invoice Number= " + b.getItemInvoiceNum() + ", Item Name= " + b.getItemName() +
                    ", Item Price= " + b.getItemPrice() + ", Item Count= " + b.getCount());}

        FileOperations operations = new FileOperations();
        List<InvoiceHeader> obj2 = operations.HeaderLines();

        operations.writeFile();



    }

}