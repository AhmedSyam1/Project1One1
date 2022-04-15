/*

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceMainTableOneLift = new javax.swing.JTable();
        invoiceMainTableOneLift.getSelectionModel().addListSelectionListener(designNew);
        CreateNewMainInvoice = new javax.swing.JButton();
        CreateNewMainInvoice.addActionListener(designNew);
        deleteInvoiceMainOneleft = new javax.swing.JButton();
        deleteInvoiceMainOneleft.addActionListener(designNew);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        customerNameTextFiled = new javax.swing.JTextField();
        invoiceDateTextFiled = new javax.swing.JTextField();
        invoiceNumberLabel = new javax.swing.JLabel();
        invoiceTotalLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        invoiceSecondaryTableTwoRight = new javax.swing.JTable();
        createInvoiceSecondaryTwoRight = new javax.swing.JButton();
        createInvoiceSecondaryTwoRight.addActionListener(designNew);
        deleteInvoiceSecondaryTwoRight = new javax.swing.JButton();
        deleteInvoiceSecondaryTwoRight.addActionListener(designNew);
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadMenu = new javax.swing.JMenuItem();
        loadMenu.addActionListener(designNew);
        saveMenu = new javax.swing.JMenuItem();
        saveMenu.addActionListener(designNew);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoiceMainTableOneLift.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(invoiceMainTableOneLift);

        CreateNewMainInvoice.setText("Create New Main Invoice");

        deleteInvoiceMainOneleft.setText("Delete Main Invoice");

        jLabel1.setText("Invoice Number");

        jLabel2.setText("Invoide Date");

        jLabel3.setText("Customer name");

        invoiceSecondaryTableTwoRight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(invoiceSecondaryTableTwoRight);

        createInvoiceSecondaryTwoRight.setText("Create New Secondary Invoice");
        createInvoiceSecondaryTwoRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createInvoiceSecondaryTwoRightActionPerformed(evt);
            }
        });

        deleteInvoiceSecondaryTwoRight.setText("Delete Secondary Invoice");

        jLabel4.setText("Invoice Total");

        jMenu1.setText("File");

        loadMenu.setText("Load File");
        loadMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuActionPerformed(evt);
            }
        });
        jMenu1.add(loadMenu);

        saveMenu.setText("Save File");
        jMenu1.add(saveMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(invoiceTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invoiceDateTextFiled)
                                    .addComponent(customerNameTextFiled)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CreateNewMainInvoice)
                                .addGap(97, 97, 97)
                                .addComponent(deleteInvoiceMainOneleft))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(createInvoiceSecondaryTwoRight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteInvoiceSecondaryTwoRight))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(invoiceNumberLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 87, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoiceNumberLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(invoiceDateTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customerNameTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(invoiceTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createInvoiceSecondaryTwoRight)
                            .addComponent(deleteInvoiceSecondaryTwoRight)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteInvoiceMainOneleft)
                            .addComponent(CreateNewMainInvoice))))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadMenuActionPerformed

    private void createInvoiceSecondaryTwoRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createInvoiceSecondaryTwoRightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createInvoiceSecondaryTwoRightActionPerformed
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateNewMainInvoice;
    private javax.swing.JButton createInvoiceSecondaryTwoRight;
    private javax.swing.JTextField customerNameTextFiled;
    private javax.swing.JButton deleteInvoiceMainOneleft;
    private javax.swing.JButton deleteInvoiceSecondaryTwoRight;
    private javax.swing.JTextField invoiceDateTextFiled;
    private javax.swing.JTable invoiceMainTableOneLift;
    private javax.swing.JLabel invoiceNumberLabel;
    private javax.swing.JTable invoiceSecondaryTableTwoRight;
    private javax.swing.JLabel invoiceTotalLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadMenu;
    private javax.swing.JMenuItem saveMenu;
    // End of variables declaration//GEN-END:variables
*/






package com.Project1One1.Action;

import com.Project1One1.Structure.ProjectOneStructureMain;
import com.Project1One1.Structure.ProjectOneStructureMainTable;
import com.Project1One1.Structure.ProjectOneStructureSecondaryTable;
import com.Project1One1.projectOneDesignNew.ProjectOneDesignNew;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JTextField;




/**
 *
 * @author HP
 */

public class ProjectOneDesign extends javax.swing.JFrame{



public ProjectOneDesign() {
initComponents();
}

/**
* This method is called from within the constructor to initialize the form.
* WARNING: Do NOT modify this code. The content of this method is always
* regenerated by the Form Editor.
*/

@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">                          


private void initComponents() {

jScrollPane1 = new javax.swing.JScrollPane();
invoiceMainTableOneLift = new javax.swing.JTable();
invoiceMainTableOneLift.getSelectionModel().addListSelectionListener(designNew);
CreateNewMainInvoice = new javax.swing.JButton();
CreateNewMainInvoice.addActionListener(designNew);
deleteInvoiceMainOneleft = new javax.swing.JButton();
deleteInvoiceMainOneleft.addActionListener(designNew);
jLabel1 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();
jLabel3 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
customerNameTextFiled = new javax.swing.JTextField();
invoiceDateTextFiled = new javax.swing.JTextField();
invoiceNumberLabel = new javax.swing.JLabel();
invoiceTotalLabel = new javax.swing.JLabel();
jScrollPane2 = new javax.swing.JScrollPane();
invoiceSecondaryTableTwoRight = new javax.swing.JTable();
createInvoiceSecondaryTwoRight = new javax.swing.JButton();
createInvoiceSecondaryTwoRight.addActionListener(designNew);
deleteInvoiceSecondaryTwoRight = new javax.swing.JButton();
deleteInvoiceSecondaryTwoRight.addActionListener(designNew);
jMenuBar1 = new javax.swing.JMenuBar();
jMenu1 = new javax.swing.JMenu();
loadMenu = new javax.swing.JMenuItem();
loadMenu.addActionListener(designNew);
saveMenu = new javax.swing.JMenuItem();
saveMenu.addActionListener(designNew);

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

invoiceMainTableOneLift.setModel(new javax.swing.table.DefaultTableModel(
new Object[][]{},
new String[]{}
));
jScrollPane1.setViewportView(invoiceMainTableOneLift);

CreateNewMainInvoice.setText("Create New Main Invoice");
CreateNewMainInvoice.setActionCommand("CreateNewMainInvoice");

deleteInvoiceMainOneleft.setText("Delete Main Invoice");
deleteInvoiceMainOneleft.setActionCommand("DeleteMainInvoice");

jLabel1.setText("Invoice Number");

jLabel2.setText("Invoide Date");

jLabel3.setText("Customer name");

jLabel4.setText("Invoice Total");

invoiceSecondaryTableTwoRight.setModel(new javax.swing.table.DefaultTableModel(
new Object[][]{},
new String[]{}
));
jScrollPane2.setViewportView(invoiceSecondaryTableTwoRight);

createInvoiceSecondaryTwoRight.setText("Create New Secondary Invoice");
createInvoiceSecondaryTwoRight.setActionCommand("CreateNewSecondaryInvoice");
createInvoiceSecondaryTwoRight.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
newSecondaryInvoiceRightActionPerformed(evt);
}
});

deleteInvoiceSecondaryTwoRight.setText("Delete Secondary Invoice");
deleteInvoiceSecondaryTwoRight.setActionCommand("DeleteSecondaryInvoice");

jMenu1.setText("File");

loadMenu.setText("Load File");
loadMenu.setActionCommand("LoadFile");
loadMenu.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
loadFileActionPerformed(evt);
}
});
jMenu1.add(loadMenu);

saveMenu.setText("Save File");
saveMenu.setActionCommand("SaveFile");
jMenu1.add(saveMenu);

jMenuBar1.add(jMenu1);

setJMenuBar(jMenuBar1);

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel3)
.addComponent(jLabel1)
.addComponent(jLabel2)
.addComponent(jLabel4))
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(customerNameTextFiled)
.addComponent(invoiceDateTextFiled)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(invoiceNumberLabel)
.addComponent(invoiceTotalLabel))
.addGap(0, 0, Short.MAX_VALUE))))
.addGroup(layout.createSequentialGroup()
.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(0, 0, Short.MAX_VALUE))))
.addGroup(layout.createSequentialGroup()
.addGap(76, 76, 76)
.addComponent(createInvoiceSecondaryTwoRight)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(deleteInvoiceSecondaryTwoRight)
.addGap(113, 113, 113))))
.addGroup(layout.createSequentialGroup()
.addGap(57, 57, 57)
.addComponent(CreateNewMainInvoice)
.addGap(87, 87, 87)
.addComponent(deleteInvoiceMainOneleft)))
.addContainerGap())
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel1)
.addComponent(invoiceNumberLabel))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel2)
.addComponent(invoiceDateTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel3)
.addComponent(customerNameTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel4)
.addComponent(invoiceTotalLabel))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(33, 33, 33)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(createInvoiceSecondaryTwoRight)
.addComponent(deleteInvoiceSecondaryTwoRight))
.addGap(44, 44, 44)))
.addGap(34, 34, 34)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(deleteInvoiceMainOneleft)
.addComponent(CreateNewMainInvoice))
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);

pack();
}// </editor-fold>      

/**
* @param args the command secondary arguments
*/

private void loadFileActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
}

private void newSecondaryInvoiceRightActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
}


public static void main(String args[]) {
/* Set the Nimbus look and feel */
//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
*/
try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
if ("Nimbus".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
} catch (ClassNotFoundException ex) {
java.util.logging.Logger.getLogger(ProjectOneDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(ProjectOneDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(ProjectOneDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(ProjectOneDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>
//</editor-fold>



java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new ProjectOneDesign().setVisible(true);
}
});
}

// Variables declaration - do not modify                     
private javax.swing.JButton CreateNewMainInvoice;
private javax.swing.JButton createInvoiceSecondaryTwoRight;
private javax.swing.JTextField customerNameTextFiled;
private javax.swing.JButton deleteInvoiceMainOneleft;
private javax.swing.JButton deleteInvoiceSecondaryTwoRight;
private javax.swing.JTextField invoiceDateTextFiled;
private javax.swing.JTable invoiceSecondaryTableTwoRight;
private javax.swing.JLabel invoiceNumberLabel;
private javax.swing.JLabel invoiceTotalLabel;
private javax.swing.JTable invoiceMainTableOneLift;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JMenu jMenu1;
private javax.swing.JMenuBar jMenuBar1;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JScrollPane jScrollPane2;
private javax.swing.JMenuItem loadMenu;
private javax.swing.JMenuItem saveMenu;
// End of variables declaration                   
private List<ProjectOneStructureMain> invoiceStructureMainList = new ArrayList<>();
private ProjectOneStructureMainTable invoiceStructureMainTable;
private ProjectOneStructureSecondaryTable invoiceStructureSecondaryTable;
private ProjectOneMainAction mainAction;
private ProjectOneSecondaryAction secondaryAction;
private ProjectOneDesignNew designNew = new ProjectOneDesignNew(this);

 public ProjectOneDesignNew getdesignNew() {
        return designNew;
    }

   public void setMainAction(ProjectOneMainAction mainAction) {
        this.mainAction = mainAction;
    }

    public void setSecondaryAction(ProjectOneSecondaryAction secondaryAction) {
        this.secondaryAction = secondaryAction;
    }

    public void setInvoiceStructureSecondaryTable(ProjectOneStructureSecondaryTable invoiceStructureSecondaryTable) {
        this.invoiceStructureSecondaryTable = invoiceStructureSecondaryTable;
    }

    public void setInvoiceStructureMainTable(ProjectOneStructureMainTable invoiceStructureMainTable) {
        this.invoiceStructureMainTable = invoiceStructureMainTable;
    }

    public JButton getCreateNewMainInvoice() {
        return CreateNewMainInvoice;
    }

    public JButton getCreateInvoiceSecondaryTwoRight() {
        return createInvoiceSecondaryTwoRight;
    }

    public JTextField getCustomerNameTextFiled() {
        return customerNameTextFiled;
    }

    public JButton getDeleteInvoiceMainOneleft() {
        return deleteInvoiceMainOneleft;
    }

    public JButton getDeleteInvoiceSecondaryTwoRight() {
        return deleteInvoiceSecondaryTwoRight;
    }

    public JTextField getInvoiceDateTextFiled() {
        return invoiceDateTextFiled;
    }

    public JTable getInvoiceSecondaryTableTwoRight() {
        return invoiceSecondaryTableTwoRight;
    }

    public JLabel getInvoiceNumberLabel() {
        return invoiceNumberLabel;
    }

    public JLabel getInvoiceTotalLabel() {
        return invoiceTotalLabel;
    }

    public JTable getInvoiceMainTableOneLift() {
        return invoiceMainTableOneLift;
    }

    public JMenuItem getLoadMenu() {
        return loadMenu;
    }

    public JMenuItem getSaveMenu() {
        return saveMenu;
    }


    public List<ProjectOneStructureMain> getInvoiceStructureMainList() {
        return invoiceStructureMainList;
    }

    public ProjectOneStructureMainTable getInvoiceStructureMainTable() {
        return invoiceStructureMainTable;
    }

    public ProjectOneStructureSecondaryTable getInvoiceStructureSecondaryTable() {
        return invoiceStructureSecondaryTable;
    }

    public ProjectOneMainAction getMainAction() {
        return mainAction;
    }

    public ProjectOneSecondaryAction getSecondaryAction() {
        return secondaryAction;
    }

  
   


   


}
