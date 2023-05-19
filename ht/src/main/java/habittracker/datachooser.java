package habittracker;

import java.io.IOException;
import java.util.ArrayList;

public class datachooser extends javax.swing.JPanel {

    /**
     * Creates new form chooseData
     */
    private javax.swing.JButton habitButton;
    private javax.swing.JSeparator jSeparator1;

    public datachooser(String habitName) {
        initComponents(habitName);
    }

    private void initComponents(String habitName) {

        habitButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setOpaque(false);

        habitButton.setBackground(new java.awt.Color(51, 51, 51));
        habitButton.setFont(new java.awt.Font("Segoe UI", 1, 24));
        habitButton.setForeground(new java.awt.Color(204, 204, 204));
        habitButton.setText(habitName);
        habitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    habitButtonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1)
                                        .addComponent(habitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 288,
                                                Short.MAX_VALUE))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(habitButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)));
    }

    /**
     * Event handler for the "habitButton" button in a graphical user interface.
     * Retrieves organized data using the "excelManager" object based on the text of
     * the button.
     * Displays the data in a new "datapanel" object using the "main" object to show
     * the form.
     */
    private void habitButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        ArrayList<Integer> orgonizedData = excelManager.getOrgonizeData(habitButton.getText());
        mainFrame.showForm(new datapanel(habitButton.getText(), orgonizedData));
    }

}
