  
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
public class ProjectOneSecondaryAction extends JDialog{
private JTextField itemNameTextField;
private JTextField itemCountTextField;
private JTextField itemPriceTextField;
private JLabel itemNameLabel;
private JLabel itemCountLabel;
private JLabel itemPriceLabel;
private JButton createNewSecondaryOrderButton;
private JButton cancelSecondaryOrderButton;

public ProjectOneSecondaryAction(ProjectOneDesign frame) {
itemNameTextField = new JTextField(20);
itemNameLabel = new JLabel("Item Name");

itemCountTextField = new JTextField(20);
itemCountLabel = new JLabel("Item Count");

itemPriceTextField = new JTextField(20);
itemPriceLabel = new JLabel("Item Price");

createNewSecondaryOrderButton = new JButton("Create New Order");
cancelSecondaryOrderButton = new JButton("Cancel Order");

createNewSecondaryOrderButton.setActionCommand("newSecondaryOrderRight");
cancelSecondaryOrderButton.setActionCommand("cancelSecondaryOrderRight");

createNewSecondaryOrderButton.addActionListener(frame.getdesignNew());
cancelSecondaryOrderButton.addActionListener(frame.getdesignNew());
setLayout(new GridLayout(4, 2));

add(itemNameLabel);
add(itemNameTextField);
add(itemCountLabel);
add(itemCountTextField);
add(itemPriceLabel);
add(itemPriceTextField);
add(createNewSecondaryOrderButton);
add(cancelSecondaryOrderButton);

pack();
}

public JTextField getItemNameTextField() {
return itemNameTextField;
}

public JTextField getItemCountTextField() {
return itemCountTextField;
}

public JTextField getItemPriceTextField() {
return itemPriceTextField;
}
}
