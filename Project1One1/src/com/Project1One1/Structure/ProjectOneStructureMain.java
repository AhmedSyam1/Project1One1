
package com.Project1One1.Structure;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ProjectOneStructureMain {
private int invoiceNumber;
private String customerName;
private Date invoiceDate;
private ArrayList<ProjectOneStructureSecondary> secondary;  

public ProjectOneStructureMain(int invoiceNumber, String customerName, Date invoiceDate) {
this.invoiceNumber = invoiceNumber;
this.customerName = customerName;
this.invoiceDate = invoiceDate;

}

public Date getInvoiceDate() {
return invoiceDate;
}

public void setInvoiceDate(Date invoiceDate) {
this.invoiceDate = invoiceDate;
}

public int getInvoiceNumber() {
return invoiceNumber;
}

public void setInvoiceNumber(int invoiceNumber) {
this.invoiceNumber = invoiceNumber;
}

public String getCustomerName() {
return customerName;
}

public void setCustomerName(String customerName) {
this.customerName = customerName;
}

@Override
public String toString() {
String string = "InvoiceMain{" + "invoiceNumber=" + invoiceNumber + ", customerName=" + customerName + ", invoiceDate=" + invoiceDate + '}';
for (ProjectOneStructureSecondary secondary : getSecondary()) {
string += "\n\t" + secondary;
}
return string;
}

public ArrayList<ProjectOneStructureSecondary> getSecondary() {
if (secondary == null)
secondary = new ArrayList<>();  
return secondary;
}

public void setSecondary(ArrayList<ProjectOneStructureSecondary> secondary) {
this.secondary = secondary;
}

public double getInvoiceTotal() {
double total = 0.0;
for (ProjectOneStructureSecondary secondary : getSecondary()) {
total += secondary.getSecondaryTotal();
}
return total;
}

public void addInvoiceSecondary(ProjectOneStructureSecondary secondary) {
getSecondary().add(secondary);
}

public String getInformationsCSV() {
DateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
return "" + getInvoiceNumber() + "," + dateformat.format(getInvoiceDate()) + "," + getCustomerName();
}

}
