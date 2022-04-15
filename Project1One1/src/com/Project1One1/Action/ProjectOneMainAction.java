
package com.Project1One1.Action;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class ProjectOneMainAction extends JDialog {
private JTextField customerNameTextField;
private JTextField invoiceDateTextField;
private JLabel cusomerNameLabel;
private JLabel invoiceDateLabel;
private JButton createNewMainOrderButton;
private JButton cancelMainOrderButton;

public ProjectOneMainAction(ProjectOneDesign frame) {
cusomerNameLabel = new JLabel("Customer Name:");
customerNameTextField = new JTextField(20);
invoiceDateLabel = new JLabel("Invoice Date:");
invoiceDateTextField = new JTextField(20);
createNewMainOrderButton = new JButton("Create New Order");
cancelMainOrderButton = new JButton("Cancel Order");

createNewMainOrderButton.setActionCommand("newMainOrderLeft");
cancelMainOrderButton.setActionCommand("cancelMainOrderLeft");

createNewMainOrderButton.addActionListener(frame.getdesignNew());
cancelMainOrderButton.addActionListener(frame.getdesignNew());
setLayout(new GridLayout(3, 2));

add(invoiceDateLabel);
add(invoiceDateTextField);
add(cusomerNameLabel);
add(customerNameTextField);
add(createNewMainOrderButton);
add(cancelMainOrderButton);

pack();

}

public JTextField getCustomerNameTextField() {
return customerNameTextField;
}

public JTextField getInvoiceDateTextField() {
return invoiceDateTextField;
}

}
