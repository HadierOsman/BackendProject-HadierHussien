package Model;


public class InvoiceLine {
    private String itemName;
    private double itemPrice;
    private int count;
    private int itemInvoiceNum;

    /* double invoiceTotal;  // sum of itemPrices in an invoice */


    public InvoiceLine(int itemInvoiceNum, String itemName, double itemPrice, int count) {
        this.itemInvoiceNum = itemInvoiceNum;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
    }

    public InvoiceLine() {
    }


    // getter and setter methods
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getItemInvoiceNum() {return itemInvoiceNum;}

    public void setItemInvoiceNum(int itemInvoiceNum) {this.itemInvoiceNum = itemInvoiceNum;}
}