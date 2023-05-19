package habittracker;

import java.io.IOException;
import javax.swing.*;
import javax.swing.GroupLayout;

public class mainPanel extends JPanel {
    /*
     * Creates new form Check
     */

    private JLabel habitNameLabel;
    private JCheckBox monCheckBox, tueCheckBox, wedCheckBox, thuCheckBox, friCheckBox, satCheckBox, sunCheckBox;
    private JButton editButton, saveButton;

    public mainPanel(String habitName,
            boolean monEnabled,
            boolean tueEnabled,
            boolean wedEnabled,
            boolean thuEnabled,
            boolean friEnabled,
            boolean satEnabled,
            boolean sunEnabled,
            boolean monChecked,
            boolean tueChecked,
            boolean wedChecked,
            boolean thuChecked,
            boolean friChecked,
            boolean satChecked,
            boolean sunChecked) {
        initComponents(habitName, monEnabled, tueEnabled, wedEnabled, thuEnabled, friEnabled, satEnabled, sunEnabled,
                monChecked, tueChecked, wedChecked, thuChecked, friChecked, satChecked, sunChecked);

    }

    private void initComponents(String habitName,
            boolean monEnabled,
            boolean tueEnabled,
            boolean wedEnabled,
            boolean thuEnabled,
            boolean friEnabled,
            boolean satEnabled,
            boolean sunEnabled,
            boolean monChecked,
            boolean tueChecked,
            boolean wedChecked,
            boolean thuChecked,
            boolean friChecked,
            boolean satChecked,
            boolean sunChecked) {

        habitNameLabel = new JLabel();
        editButton = new JButton();
        saveButton = new JButton();
        monCheckBox = new JCheckBox();
        tueCheckBox = new JCheckBox();
        wedCheckBox = new JCheckBox();
        thuCheckBox = new JCheckBox();
        friCheckBox = new JCheckBox();
        satCheckBox = new JCheckBox();
        sunCheckBox = new JCheckBox();

        setBackground(new java.awt.Color(51, 51, 51));
        setOpaque(false);

        habitNameLabel.setBackground(new java.awt.Color(51, 51, 51));
        habitNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        habitNameLabel.setForeground(new java.awt.Color(204, 204, 204));
        habitNameLabel.setText(habitName);
        habitNameLabel.setOpaque(true);

        editButton.setBackground(new java.awt.Color(51, 51, 51));
        editButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        editButton.setForeground(new java.awt.Color(204, 204, 204));
        editButton.setText("Edit");
        editButton.setOpaque(true);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    editButtonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        saveButton.setBackground(new java.awt.Color(51, 51, 51));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        saveButton.setForeground(new java.awt.Color(204, 204, 204));
        saveButton.setText("Save");
        saveButton.setOpaque(true);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    saveButtonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        monCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        monCheckBox.setFocusable(monEnabled);
        monCheckBox.setEnabled(monEnabled);
        monCheckBox.setSelected(monChecked);

        tueCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        tueCheckBox.setFocusable(tueEnabled);
        tueCheckBox.setEnabled(tueEnabled);
        tueCheckBox.setSelected(tueChecked);

        wedCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        wedCheckBox.setFocusable(wedEnabled);
        wedCheckBox.setEnabled(wedEnabled);
        wedCheckBox.setSelected(wedChecked);

        thuCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        thuCheckBox.setFocusable(thuEnabled);
        thuCheckBox.setEnabled(thuEnabled);
        thuCheckBox.setSelected(thuChecked);

        friCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        friCheckBox.setFocusable(friEnabled);
        friCheckBox.setEnabled(friEnabled);
        friCheckBox.setSelected(friChecked);

        satCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        satCheckBox.setFocusable(satEnabled);
        satCheckBox.setEnabled(satEnabled);
        satCheckBox.setSelected(satChecked);

        sunCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        sunCheckBox.setFocusable(sunEnabled);
        sunCheckBox.setEnabled(sunEnabled);
        sunCheckBox.setSelected(sunChecked);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(habitNameLabel, GroupLayout.PREFERRED_SIZE, 155,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monCheckBox, GroupLayout.PREFERRED_SIZE, 65,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tueCheckBox, GroupLayout.PREFERRED_SIZE, 65,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wedCheckBox, GroupLayout.PREFERRED_SIZE, 65,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thuCheckBox, GroupLayout.PREFERRED_SIZE, 65,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(friCheckBox, GroupLayout.PREFERRED_SIZE, 65,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(satCheckBox, GroupLayout.PREFERRED_SIZE, 65,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sunCheckBox, GroupLayout.PREFERRED_SIZE, 65,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editButton, GroupLayout.PREFERRED_SIZE, 62,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton, GroupLayout.PREFERRED_SIZE, 62,
                                        GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(monCheckBox, GroupLayout.Alignment.TRAILING,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(habitNameLabel, GroupLayout.Alignment.TRAILING,
                                                GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                        .addComponent(editButton, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(saveButton, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tueCheckBox, GroupLayout.Alignment.TRAILING,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(wedCheckBox, GroupLayout.Alignment.TRAILING,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(thuCheckBox, GroupLayout.Alignment.TRAILING,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(friCheckBox, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(satCheckBox, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sunCheckBox, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(16, 16, 16)));
    }

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        mainFrame.showForm(new editpanel(habitNameLabel.getText()));
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        excelManager.insertHabitTrack(habitNameLabel.getText(), monCheckBox.isSelected(), tueCheckBox.isSelected(),
                wedCheckBox.isSelected(), thuCheckBox.isSelected(), friCheckBox.isSelected(), satCheckBox.isSelected(),
                sunCheckBox.isSelected());

    }
}
