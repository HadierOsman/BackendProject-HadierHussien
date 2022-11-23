package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceHeader{

    private int invoiceNum;
    private String invoiceDate;
    private String customerName;
    //private double invoiceTotal;
    public List<InvoiceLine> InvoiceLines; //important

    /*public InvoiceHeader(){
        super();
        invoiceDate = new Date();
    }*/


    public InvoiceHeader(int invoiceNum, String invoiceDate, String customerName) {
        this.invoiceNum = invoiceNum;
        this.customerName = customerName;
        this.invoiceDate = invoiceDate;
        //this.invoiceTotal = invoiceTotal;
    }

    /// added to print out ///
    public InvoiceHeader(int invoiceNum) {
    }

    public int getInvoiceNum() {return invoiceNum;}

    public void setInvoiceNum(int invoiceNum) {this.invoiceNum = invoiceNum;}

    public String getInvoiceDate() {return invoiceDate;}

    public void setInvoiceDate(String invoiceDate) {this.invoiceDate = invoiceDate;}

    public String getCustomerName() {return customerName;}

    public void setCustomerName(String customerName) {this.customerName = customerName;}

    public List<InvoiceLine> getInvoiceLines() {return InvoiceLines;}

    public void setInvoiceLines(ArrayList<InvoiceLine> invoiceLines) {InvoiceLines = invoiceLines;}
}