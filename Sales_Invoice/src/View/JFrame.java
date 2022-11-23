/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/*
 * @author hadier.osman
 */

import Model.InvoiceHeader;
import Model.InvoiceLine;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JFrame extends javax.swing.JFrame {

    public JFrame() {
        initComponents();
    }

    // Variables declaration - do not modify
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JMenuItem fileBtn;
    private javax.swing.JTable invoiceItemsTable;
    private javax.swing.JTable invoicesTable;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem saveMenuBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JButton saveBtn;
    // End of variables declaration

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents

    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane2 = new JScrollPane();
        jTable2 = new JTable();
        jInternalFrame1 = new JInternalFrame();
        jScrollPane1 = new JScrollPane();
        invoicesTable = new JTable();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jScrollPane4 = new JScrollPane();
        jTextPane1 = new JTextPane();
        jScrollPane3 = new JScrollPane();
        invoiceItemsTable = new JTable();
        createBtn = new JButton();
        deleteBtn = new JButton();
        saveBtn = new JButton();
        cancelBtn = new JButton();
        jScrollPane5 = new JScrollPane();
        jTextPane2 = new JTextPane();
        jScrollPane6 = new JScrollPane();
        jTextPane3 = new JTextPane();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        fileBtn = new JMenuItem();
        saveMenuBtn = new JMenuItem();

        GroupLayout jFrame1Layout = new GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("InvoiceAPP");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new AbsoluteLayout());

        /// invoices table ///
        invoicesTable.setAutoCreateRowSorter(true);
        invoicesTable.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "No.", "Date", "Customer", "Total"
                }
        ));

        /*public void addToTable(ArrayList<InvoiceHeader> , JTable invoicesTable){
            for (InvoiceHeader i : InvoiceHeader )
                ((DefaultTableModel) invoicesTable.getModel()).addRow(new Object[]);
        }*/

        invoicesTable.setRowHeight(25);
        jScrollPane1.setViewportView(invoicesTable);

        jInternalFrame1.getContentPane().add(jScrollPane1, new AbsoluteConstraints(10, 90, -1, 510));

        jLabel1.setText("Invoices Table");
        jInternalFrame1.getContentPane().add(jLabel1, new AbsoluteConstraints(20, 50, -1, -1));

        /// Right Hand Side Labels ///

        jLabel2.setText("Invoice Number");
        jInternalFrame1.getContentPane().add(jLabel2, new AbsoluteConstraints(510, 60, -1, -1));

        jLabel3.setText("Invoice Date");
        jInternalFrame1.getContentPane().add(jLabel3, new AbsoluteConstraints(510, 100, -1, -1));

        jLabel4.setText("Customer Name");
        jInternalFrame1.getContentPane().add(jLabel4, new AbsoluteConstraints(510, 140, -1, -1));

        jLabel5.setText("Invoice Total");
        jInternalFrame1.getContentPane().add(jLabel5, new AbsoluteConstraints(510, 180, -1, 20));

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new Color(244, 244, 244));
        jTextPane1.setForeground(new Color(244, 244, 244));
        jTextPane1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        jTextPane1.setSelectionColor(new Color(0, 0, 0));
        jScrollPane4.setViewportView(jTextPane1);

        jInternalFrame1.getContentPane().add(jScrollPane4, new AbsoluteConstraints(640, 180, 260, -1));

        /// Invoice Items Table ///

        invoiceItemsTable.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "No.", "Item Name", "Item Price", "Count", "Item Total"
                }
        ));
        invoiceItemsTable.setCellSelectionEnabled(true);
        invoiceItemsTable.setRowHeight(25);
        jScrollPane3.setViewportView(invoiceItemsTable);
        invoiceItemsTable.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jInternalFrame1.getContentPane().add(jScrollPane3, new AbsoluteConstraints(500, 230, 440, 370));

        /// Create new invoice btn ///

        createBtn.setText("Create New Invoice");
        createBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                createBtnActionPerformed(evt);

            }
        });
        jInternalFrame1.getContentPane().add(createBtn, new AbsoluteConstraints(70, 643, 160, 30));

        /// Delete Invoice btn ///

        deleteBtn.setText("Delete Invoice");
        deleteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(deleteBtn, new AbsoluteConstraints(280, 643, 160, 30));

        /// Save btn ///

        saveBtn.setText("Save");
        jInternalFrame1.getContentPane().add(saveBtn, new AbsoluteConstraints(610, 640, -1, -1));

        /// Cancel btn ///

        cancelBtn.setText("Cancel");
        jInternalFrame1.getContentPane().add(cancelBtn, new AbsoluteConstraints(730, 640, -1, -1));

        jTextPane2.setSelectionColor(new Color(0, 0, 0));
        jScrollPane5.setViewportView(jTextPane2);

        jInternalFrame1.getContentPane().add(jScrollPane5, new AbsoluteConstraints(640, 140, 260, -1));

        jTextPane3.setSelectionColor(new Color(0, 0, 0));
        jScrollPane6.setViewportView(jTextPane3);

        jInternalFrame1.getContentPane().add(jScrollPane6, new AbsoluteConstraints(640, 100, 260, -1));

        /// Menu ///

        jMenu1.setText("File");

        /// Load File btn ///

        fileBtn.setText("Load File");
        fileBtn.setToolTipText("");
        fileBtn.setBorderPainted(false);
        jMenu1.add(fileBtn);

        JFileChooser chooseFile = new JFileChooser();
        int file = chooseFile.showOpenDialog(JFrame.this);
        File selectedFile = null;
        if (file == JFileChooser.APPROVE_OPTION){
            selectedFile = chooseFile.getSelectedFile();
        }

        fileBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                jFrame1.getContentPane().setBackground(Color.pink);

            }
        });


        //// read csv file and put it in the table ///



        /// not creating a new array Invoices but call InvoiceHeader ////

        try {
            //assert selectedFile != null;
            Scanner scanner = new Scanner(selectedFile);
            while (scanner.hasNext()){
                String [] invoiceRow = scanner.nextLine().split(",");
                InvoiceHeader i = new InvoiceHeader(Integer.parseInt(invoiceRow[0]), invoiceRow[1], invoiceRow[2]);
            }
        }
        catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Please select a valid file");
        }

        /// Save File btn ///

        saveMenuBtn.setText("Save File");
        jMenu1.add(saveMenuBtn);
        jMenuBar1.add(jMenu1);
        jInternalFrame1.setJMenuBar(jMenuBar1);

        //saveMenuBtn

        /*public void writeinFile() throws IOException {
            File openFile = new File("/Users/hadier.osman/Desktop/Backend_Testing/JAVA_Project/Sales_Invoice_Generator/InvoiceHeader.csv");
            FileWriter fileWriter = new FileWriter(openFile);

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
        }*/


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jInternalFrame1, GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );

        pack();
    }

    /// Delete btn Actions ///
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed

    /// Create btn Actions ///
    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createBtnActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

}
