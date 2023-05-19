
package habittracker;

import java.io.IOException;

public class otherpanel extends javax.swing.JPanel {

    /**
     * Creates new form startup
     */
    private javax.swing.JButton restoreButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel infoLabel2;
    private javax.swing.JLabel infoLabel3;
    private javax.swing.JLabel NOTELabel;

    public otherpanel() {
        initComponents();
    }
            
    private void initComponents() {

        infoLabel = new javax.swing.JLabel();
        infoLabel2 = new javax.swing.JLabel();
        infoLabel3 = new javax.swing.JLabel();
        restoreButton = new javax.swing.JButton();
        NOTELabel = new javax.swing.JLabel();

        setOpaque(false);

        infoLabel.setFont(new java.awt.Font("Segoe UI", 0, 24));
        infoLabel.setForeground(new java.awt.Color(0, 255, 255));
        infoLabel.setText("");

        infoLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24));
        infoLabel2.setForeground(new java.awt.Color(0, 255, 255));
        infoLabel2.setText("");

        infoLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24));
        infoLabel3.setForeground(new java.awt.Color(204, 204, 204));
        infoLabel3.setText("Button to restore this software");

        restoreButton.setBackground(new java.awt.Color(51, 51, 51));
        restoreButton.setFont(new java.awt.Font("Segoe UI", 1, 24));
        restoreButton.setForeground(new java.awt.Color(255, 51, 51));
        restoreButton.setText("Restore");
        restoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    restoreButtonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        NOTELabel.setFont(new java.awt.Font("Segoe UI", 1, 14));
        NOTELabel.setForeground(new java.awt.Color(255, 51, 51));
        NOTELabel.setText("NOTE : THIS WILL CLEAN ALL DATA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 382, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NOTELabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(restoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(infoLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NOTELabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(restoreButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }                       

    private void restoreButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                         
        excelManager.backToStartup();
        mainFrame.clearBody();
    }                                                   
}
