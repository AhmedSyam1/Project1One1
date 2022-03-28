
package com.Project1One1.Structure;

public class ProjectOneStructureSecondary {
private String itemName;
private double itemPrice;
private int itemCount;
private ProjectOneStructureMain main;

public ProjectOneStructureSecondary(String itemName, double itemPrice, int itemCount, ProjectOneStructureMain main) {
this.itemName = itemName;
this.itemPrice = itemPrice;
this.itemCount = itemCount;
this.main = main;
}

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

public int getItemCount() {
return itemCount;
}

public void setItemCount(int itemCount) {
this.itemCount = itemCount;
}

public ProjectOneStructureMain getMain() {
return main;
}

public void setMain(ProjectOneStructureMain main) {
this.main = main;
}

@Override
public String toString() {
return "InvoiceSecodary{" + "itemName=" + itemName + ", itemprice=" + itemPrice + ", itemCount=" + itemCount + '}';
}

public double getSecondaryTotal() {
return itemCount * itemPrice;
}

public String getInformationsCSV() {
return "" + getMain().getInvoiceNumber() + "," + getItemName() + "," + getItemPrice() + "," + getItemCount();
}
}
