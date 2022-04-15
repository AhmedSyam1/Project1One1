/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1One1.projectOneDesignNew;

import com.Project1One1.Action.ProjectOneDesign;
import com.Project1One1.Action.ProjectOneMainAction;
import com.Project1One1.Action.ProjectOneSecondaryAction;
import com.Project1One1.Structure.ProjectOneStructureMain;
import com.Project1One1.Structure.ProjectOneStructureMainTable;
import com.Project1One1.Structure.ProjectOneStructureSecondary;
import com.Project1One1.Structure.ProjectOneStructureSecondaryTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author HP
 */
public class ProjectOneDesignNew implements ActionListener, ListSelectionListener {

private ProjectOneDesign design; 
private DateFormat invoiceDateTextField = new SimpleDateFormat("dd-MM-yyyy");

public ProjectOneDesignNew(ProjectOneDesign design){
    this.design = design;
}
   @Override
public void actionPerformed(ActionEvent e) {

switch (e.getActionCommand()) {
case "CreateNewMainInvoice":
newInvoiceMain();
break;
case "DeleteMainInvoice":
invoiceMainDelete();
break;
case "CreateNewSecondaryInvoice":
newInvoiceSecondary();
break;
case "DeleteSecondaryInvoice":
invoiceSecondaryDelete();
break;
case "LoadFile":
loadFile();
break;
case "SaveFile":
saveFile();
break;
case "cancelMainOrderLeft":
mainOrderCancel();
break;
case "newMainOrderLeft":
newMainOrderLeft();
break;
case "cancelSecondaryOrderRight":
cancelSecondaryOrderRight();
break;
case "newSecondaryOrderRight":
newSecondaryOrderRight();
break;
}
}

private void loadFile() {
JOptionPane.showMessageDialog(design, "Choose Main File", "Attension", JOptionPane.INFORMATION_MESSAGE);
JFileChooser openFile = new JFileChooser();
int output = openFile.showOpenDialog(design);
if (output == JFileChooser.APPROVE_OPTION) {
File MainFile = openFile.getSelectedFile();
try {
FileReader mainFr = new FileReader(MainFile);
BufferedReader mainBr = new BufferedReader(mainFr);
String mainSecondary = null;

while ((mainSecondary = mainBr.readLine()) != null) {
String[] mainParts = mainSecondary.split(",");
String invoiceNummberS = mainParts[0];
String invoiceDateS = mainParts[1];
String customerName = mainParts[2];

int invoiceNumber = Integer.parseInt(invoiceNummberS);
Date invoiceDate = invoiceDateTextField.parse(invoiceDateS);

ProjectOneStructureMain invoice = new ProjectOneStructureMain(invoiceNumber, customerName, invoiceDate);
design.getInvoiceStructureMainList().add (invoice);

}

JOptionPane.showMessageDialog(design, "Choose Secondary File", "Attension", JOptionPane.INFORMATION_MESSAGE);
output = openFile.showOpenDialog(design);
if (output == JFileChooser.APPROVE_OPTION) {
File secondaryFile = openFile.getSelectedFile();
BufferedReader secondaryBr = new BufferedReader(new FileReader(secondaryFile));
String secondarySecondary = null;
while ((secondarySecondary = secondaryBr.readLine()) != null) {
String[] secondaryParts = secondarySecondary.split(",");
String invoiceNumberS = secondaryParts[0];
String itemName = secondaryParts[1];
String itemPriceS = secondaryParts[2];
String itemCountS = secondaryParts[3];

int invoiceNumber = Integer.parseInt(invoiceNumberS);
double itemPrice = Double.parseDouble(itemPriceS);
int itemCount = Integer.parseInt(itemCountS);
ProjectOneStructureMain main = searchInvoiceNumber(invoiceNumber);
ProjectOneStructureSecondary invoiceSecondary = new ProjectOneStructureSecondary(itemName, itemPrice, itemCount, main);
main.getSecondary().add(invoiceSecondary);
}
design.setInvoiceStructureMainTable(new ProjectOneStructureMainTable(design.getInvoiceStructureMainList()));
design.getInvoiceMainTableOneLift().setModel(design.getInvoiceStructureMainTable());
design.getInvoiceMainTableOneLift().validate();
}
System.out.println("revise");
} catch (ParseException ex) {
ex.printStackTrace();



JOptionPane.showMessageDialog(design, "Wrong Date\n" + ex.getMessage(), "Stop", JOptionPane.INFORMATION_MESSAGE);
} catch (NumberFormatException ex) {
ex.printStackTrace();
JOptionPane.showMessageDialog(design, "Wrong Number\n" + ex.getMessage(), "Stop", JOptionPane.INFORMATION_MESSAGE);
} catch (FileNotFoundException ex) {
ex.printStackTrace();
JOptionPane.showMessageDialog(design, "Wrong File\n" + ex.getMessage(), "Stop", JOptionPane.INFORMATION_MESSAGE);
} catch (IOException ex) {
ex.printStackTrace();
JOptionPane.showMessageDialog(design, "Error Reading File\n" + ex.getMessage(), "Stop", JOptionPane.INFORMATION_MESSAGE);




}
}
showInv();
}

private void saveFile() {
String mains = "";
String secondarys = "";
for (ProjectOneStructureMain main : design.getInvoiceStructureMainList()) {
mains += main.getInformationsCSV();
mains += "\n";
for (ProjectOneStructureSecondary secondary : main.getSecondary()) {
secondarys += secondary.getInformationsCSV();
secondarys += "\n";
}
}
JOptionPane.showMessageDialog(design, "Choose File to Save Main Invoice", "Attension", JOptionPane.INFORMATION_MESSAGE);
JFileChooser fileChooser = new JFileChooser();
int output = fileChooser.showSaveDialog(design);
if (output == JFileChooser.APPROVE_OPTION) {
File mainFile = fileChooser.getSelectedFile();
try {
FileWriter MainFileWriter = new FileWriter(mainFile);
MainFileWriter.write(mains);
MainFileWriter.flush();
MainFileWriter.close();

JOptionPane.showMessageDialog(design, "Choose File to Save Secondary Invoice", "Attension", JOptionPane.INFORMATION_MESSAGE);
output = fileChooser.showSaveDialog(design);
if (output == JFileChooser.APPROVE_OPTION) {
File secondaryFile = fileChooser.getSelectedFile();
FileWriter secondaryFileWriter = new FileWriter(secondaryFile);
secondaryFileWriter.write(secondarys);
secondaryFileWriter.flush();
secondaryFileWriter.close();
}
} catch (Exception ex) {
JOptionPane.showMessageDialog(design, "not responding: " + ex.getMessage(), "not responding", JOptionPane.INFORMATION_MESSAGE);
}
}

}

private ProjectOneStructureMain searchInvoiceNumber(int invoiceNumber) {
ProjectOneStructureMain main = null;
for (ProjectOneStructureMain invoice : design.getInvoiceStructureMainList()) {
if (invoiceNumber == invoice.getInvoiceNumber()) {
main = invoice;
break;
}
}
return main;
}

@Override
public void valueChanged(ListSelectionEvent e) {
System.out.println("Invoice Choosed");
invoiceMainTableRowChoosed();
}

private void invoiceMainTableRowChoosed() { 
int choosedRowIndex = design.getInvoiceMainTableOneLift().getSelectedRow();
if (choosedRowIndex >= 0) {
ProjectOneStructureMain row = design.getInvoiceStructureMainTable().getInvoiceMain().get(choosedRowIndex);
design.getCustomerNameTextFiled().setText(row.getCustomerName());
design.getInvoiceDateTextFiled().setText(invoiceDateTextField.format(row.getInvoiceDate()));
design.getInvoiceNumberLabel().setText("" + row.getInvoiceNumber());
design.getInvoiceTotalLabel().setText("" + row.getInvoiceTotal());
ArrayList<ProjectOneStructureSecondary> secondary = row.getSecondary();
design.setInvoiceStructureSecondaryTable(new ProjectOneStructureSecondaryTable(secondary));
design.getInvoiceSecondaryTableTwoRight().setModel(design.getInvoiceStructureSecondaryTable());
design.getInvoiceStructureSecondaryTable().fireTableDataChanged();
}
}

private void newInvoiceMain() {
design.setMainAction(new ProjectOneMainAction(design));
design.getMainAction().setVisible(true);
}

private void newInvoiceSecondary() {
design.setSecondaryAction(new ProjectOneSecondaryAction(design));
design.getSecondaryAction().setVisible(true);
}

private void mainOrderCancel() {
design.getMainAction().setVisible(false);
design.getMainAction().dispose();
design.setMainAction(null);
}

private void newMainOrderLeft() {
String customerName = design.getMainAction().getCustomerNameTextField().getText();
String invoiceDateS = design.getMainAction().getInvoiceDateTextField().getText();
design.getMainAction().setVisible(false);
design.getMainAction().dispose();
design.setMainAction(null);
try {
Date invoiceDate = invoiceDateTextField.parse(invoiceDateS);
int invoiceNumber = otherInvoiceNumber();
ProjectOneStructureMain invoiceMain = new ProjectOneStructureMain(invoiceNumber, customerName, invoiceDate);
design.getInvoiceStructureMainList().add(invoiceMain);
design.getInvoiceStructureMainTable().fireTableDataChanged();
} catch (ParseException ex) {
    
JOptionPane.showMessageDialog(design, "Please enter the month from 1 to 12 only.","Stop",JOptionPane.INFORMATION_MESSAGE);
        
ex.printStackTrace();
}
showInv();
}

private int otherInvoiceNumber() {
int max = 0;
for (ProjectOneStructureMain Main : design.getInvoiceStructureMainList()) {
if (Main.getInvoiceNumber() > max) {
max = Main.getInvoiceNumber();
}
}
return max + 1;
}

private void cancelSecondaryOrderRight() {
design.getSecondaryAction().setVisible(false);
design.getSecondaryAction().dispose();
design.setSecondaryAction(null);
}

private void newSecondaryOrderRight() {
String itemName = design.getSecondaryAction().getItemNameTextField().getText();
String itemCountS = design.getSecondaryAction().getItemCountTextField().getText();
String itemPriceS = design.getSecondaryAction().getItemPriceTextField().getText();
design.getSecondaryAction().setVisible(false);
design.getSecondaryAction().dispose();
design.setSecondaryAction(null);
int itemCount = Integer.parseInt(itemCountS);
double itemPrice = Double.parseDouble(itemPriceS);
int MainIndex = design.getInvoiceMainTableOneLift().getSelectedRow();
ProjectOneStructureMain invoice = design.getInvoiceStructureMainTable().getInvoiceMain().get(MainIndex);

ProjectOneStructureSecondary invoiceSecondary = new ProjectOneStructureSecondary(itemName, itemPrice, itemCount, invoice);
invoice.addInvoiceSecondary(invoiceSecondary);
design.getInvoiceStructureSecondaryTable().fireTableDataChanged();
design.getInvoiceStructureMainTable().fireTableDataChanged();
design.getInvoiceTotalLabel().setText("" + invoice.getInvoiceTotal());
showInv();
}

private void invoiceMainDelete() {
int invoiceIndex = design.getInvoiceMainTableOneLift().getSelectedRow();
ProjectOneStructureMain main = design.getInvoiceStructureMainTable().getInvoiceMain().get(invoiceIndex);
design.getInvoiceStructureMainTable().getInvoiceMain().remove(invoiceIndex);
design.getInvoiceStructureMainTable().fireTableDataChanged();
design.setInvoiceStructureSecondaryTable(new ProjectOneStructureSecondaryTable(new ArrayList<ProjectOneStructureSecondary>()));
design.getInvoiceSecondaryTableTwoRight().setModel(design.getInvoiceStructureSecondaryTable());
design.getInvoiceStructureSecondaryTable().fireTableDataChanged();
design.getCustomerNameTextFiled().setText("");
design.getInvoiceDateTextFiled().setText("");
design.getInvoiceNumberLabel().setText("");
design.getInvoiceTotalLabel().setText("");
showInv();
}

private void invoiceSecondaryDelete() {
int secondaryIndex = design.getInvoiceSecondaryTableTwoRight().getSelectedRow();
ProjectOneStructureSecondary secondary = design.getInvoiceStructureSecondaryTable().getInvoiceSecondary().get(secondaryIndex);
design.getInvoiceStructureSecondaryTable().getInvoiceSecondary().remove(secondaryIndex);
design.getInvoiceStructureSecondaryTable().fireTableDataChanged();
design.getInvoiceStructureMainTable().fireTableDataChanged();
design.getInvoiceTotalLabel().setText("" + secondary.getMain().getInvoiceTotal());
showInv();
}

private void showInv() {
System.out.println("succeeded");
for (ProjectOneStructureMain main : design.getInvoiceStructureMainList()) {
System.out.println(main);
}
System.out.println("succeeded");
}


    
}
