
package com.Project1One1.Structure;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HP
 */
public class ProjectOneStructureMainTable extends AbstractTableModel {

private List<ProjectOneStructureMain> invoiceMain;
private DateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");

public ProjectOneStructureMainTable(List<ProjectOneStructureMain> mainInvoice) {
this.invoiceMain = mainInvoice;
}

public List<ProjectOneStructureMain> getInvoiceMain() {
return invoiceMain;
}


@Override
public int getRowCount() {
return invoiceMain.size();
}

@Override
public int getColumnCount() {
return 4;
}

@Override
public String getColumnName(int columnIndex) {
switch (columnIndex) {
case 0:
return "Invoice Num";
case 1:
return "Customer Name";
case 2:
return "Invoice Date";
case 3:
return "Invoice Total";
default:
return "";
}
}

@Override
public Class<?> getColumnClass(int columnIndex) {
switch (columnIndex) {
case 0:
return Integer.class;
case 1:
return String.class;
case 2:
return String.class;
case 3:
return Double.class;
default:
return Object.class;
}
}

@Override
public boolean isCellEditable(int rowIndex, int columnIndex) {
return false;
}

@Override
public Object getValueAt(int rowIndex, int columnIndex) {
ProjectOneStructureMain row = invoiceMain.get(rowIndex);

switch (columnIndex) {
case 0:
return row.getInvoiceNumber();
case 1:
return row.getCustomerName();
case 2:
return dateformat.format(row.getInvoiceDate());
case 3:
return row.getInvoiceTotal();
default:
return "";
}

}

}
