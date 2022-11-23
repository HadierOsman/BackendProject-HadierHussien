package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.io.FileWriter;

public class FileOperations {


    // Read InvoiceLine.csv file and make a list of array of its values
    private static InvoiceLine invoiceData(String [] invoiceItem) {
        int itemInvoiceNum = Integer.parseInt(invoiceItem[0]);
        String itemName = invoiceItem[1];
        double itemPrice = Double.parseDouble(invoiceItem[2]);
        int count = Integer.parseInt(invoiceItem[3]);

        return new InvoiceLine(itemInvoiceNum, itemName, itemPrice, count);
    }

    public List<InvoiceLine> readInvoices() {
        List<InvoiceLine> InvoicesList = new ArrayList<>();

        Path InvoiceLineFilePath = Paths.get("/Users/hadier.osman/Desktop/Backend_Testing/JAVA_Project/Sales_Invoice_Generator/InvoiceLine.csv");

        try (BufferedReader bR = Files.newBufferedReader(InvoiceLineFilePath, StandardCharsets.US_ASCII)) {
            String lineRow = bR.readLine();
            while (lineRow != null) {
                String[] invoiceItem = lineRow.split(",");
                InvoiceLine Invoice = invoiceData(invoiceItem);
                InvoicesList.add(Invoice);
                lineRow = bR.readLine();
            }
        } catch (FileNotFoundException fileException) {
            fileException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return InvoicesList;
    }

    // Read InvoiceHeader.csv file and make a list of array of its values

    private static InvoiceHeader invoiceHeader(String [] invoiceContent) {
        int invoiceNum = Integer.parseInt(invoiceContent[0]);
        String invoiceDate = invoiceContent[1];
        String customerName = invoiceContent[2];
        //Double invoiceTotal = Double.parseDouble(invoiceContent[3]);

        return new InvoiceHeader(invoiceNum, invoiceDate, customerName);
    }

    public List<InvoiceHeader> readHeaders() {
        List<InvoiceHeader> HeadersList = new ArrayList<>();

        Path InvoiceHeaderFilePath = Paths.get("/Users/hadier.osman/Desktop/Backend_Testing/JAVA_Project/Sales_Invoice_Generator/InvoiceHeader.csv");

        try (BufferedReader bR = Files.newBufferedReader(InvoiceHeaderFilePath, StandardCharsets.US_ASCII)) {
            String headerRow = bR.readLine();
            while (headerRow != null) {
                String[] invoiceContent = headerRow.split(",");
                InvoiceHeader Header = invoiceHeader(invoiceContent);
                HeadersList.add(Header);
                headerRow = bR.readLine();
            }
        } catch (FileNotFoundException fileException2) {
            fileException2.printStackTrace();
        } catch (IOException ioException2) {
            ioException2.printStackTrace();
        }
        return HeadersList;
    }

    public List<InvoiceHeader> HeaderLines(){
        List<InvoiceHeader> getHeaders = readHeaders();
        List<InvoiceLine> getLines = readInvoices();

        for (int i =0; i < getHeaders.size(); i++) {
            InvoiceHeader invoices = getHeaders.get(i);
            invoices.InvoiceLines = getLines.stream().filter(x -> x.getItemInvoiceNum()
                    == invoices.getInvoiceNum()).collect(Collectors.toList());

            //System.out.println("First Invoice is: " + getHeaders(0) );
            }
        return getHeaders;

        //InvoiceHeader invoiceContent = new InvoiceHeader(0);
        //System.out.println("the first invoice is: " + invoiceContent(0) );

        //System.out.println("First invoice is: " + getHeaders.get(0) );
    }

    // write in a csv file
    public void writeFile() throws IOException {
        File createFile = new File("/Users/hadier.osman/Desktop/Backend_Testing/JAVA_Project/Sales_Invoice_Generator/test.csv");
        FileWriter fileWriter = new FileWriter(createFile);

        List<InvoiceHeader> getHeaders = readHeaders();

        for (InvoiceHeader writeRow : getHeaders) {
            StringBuilder line = new StringBuilder();

            line.append(writeRow.getInvoiceNum());
            line.append(',');
            line.append(writeRow.getInvoiceDate().replaceAll("\"","\"\""));
            line.append(',');
            line.append(writeRow.getCustomerName().replaceAll("\"","\"\""));
            line.append("\n");
            fileWriter.write(line.toString());
        }
        fileWriter.close();
    }

}
