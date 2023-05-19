package habittracker;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JCheckBox;

public class editpanel extends javax.swing.JPanel {

    /**
     * Creates new form Edit
     */
    private javax.swing.JButton saveButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JCheckBox everydayCheckBox;
    private javax.swing.JCheckBox mondayCheckBox;
    private javax.swing.JCheckBox tuesdayCheckBox;
    private javax.swing.JCheckBox wednesdayCheckBox;
    private javax.swing.JCheckBox thursdayCheckBox;
    private javax.swing.JCheckBox saturdayCheckBox;
    private javax.swing.JCheckBox fridayCheckBox;
    private javax.swing.JCheckBox sundayCheckBox;
    private javax.swing.JLabel habitNameLabel;
    private javax.swing.JLabel repeatDayLabel;
    private javax.swing.JPanel editPanel;
    private javax.swing.JTextField habitNameTextField;
    private String currentHabitNameString;

    public editpanel(String habitName) throws IOException {
        initComponents(habitName);
        setOpaque(false);
        /*
         * to get the current repeat data and habit's name in order to let user edit
         * better
         */
        this.currentHabitNameString = habitName;
        ArrayList<Boolean> habitEnableDays = excelManager.getHabitEnableDay(habitName);
        ArrayList<JCheckBox> checkboxes = new ArrayList<JCheckBox>();
        checkboxes.add(mondayCheckBox);
        checkboxes.add(tuesdayCheckBox);
        checkboxes.add(wednesdayCheckBox);
        checkboxes.add(thursdayCheckBox);
        checkboxes.add(saturdayCheckBox);
        checkboxes.add(fridayCheckBox);
        checkboxes.add(sundayCheckBox);
        for (int i = 0; i < 7; i++) {
            if (habitEnableDays.get(i).equals(true)) {
                checkboxes.get(i).setSelected(true);
            }
        }
        checkAllbox();
    }

    private void initComponents(String habitName) {

        editPanel = new javax.swing.JPanel();
        habitNameTextField = new javax.swing.JTextField();
        habitNameLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        repeatDayLabel = new javax.swing.JLabel();
        everydayCheckBox = new javax.swing.JCheckBox();
        mondayCheckBox = new javax.swing.JCheckBox();
        tuesdayCheckBox = new javax.swing.JCheckBox();
        wednesdayCheckBox = new javax.swing.JCheckBox();
        thursdayCheckBox = new javax.swing.JCheckBox();
        saturdayCheckBox = new javax.swing.JCheckBox();
        fridayCheckBox = new javax.swing.JCheckBox();
        sundayCheckBox = new javax.swing.JCheckBox();
        deleteButton = new javax.swing.JButton();

        editPanel.setBackground(new java.awt.Color(51, 51, 51));
        editPanel.setForeground(new java.awt.Color(102, 102, 102));

        habitNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        habitNameLabel.setForeground(new java.awt.Color(204, 204, 204));
        habitNameLabel.setText("Habit Name : ");

        habitNameTextField.setBackground(new java.awt.Color(102, 102, 102));
        habitNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 18));
        habitNameTextField.setForeground(new java.awt.Color(204, 204, 204));
        habitNameTextField.setText(habitName);
        habitNameTextField.setOpaque(true);

        saveButton.setBackground(new java.awt.Color(102, 102, 102));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 18));
        saveButton.setForeground(new java.awt.Color(204, 204, 204));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    saveButtonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        repeatDayLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        repeatDayLabel.setForeground(new java.awt.Color(204, 204, 204));
        repeatDayLabel.setText("Repeat day :");

        everydayCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        everydayCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        everydayCheckBox.setText("Every day");
        everydayCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        everydayCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                everydayCheckBoxActionPerformed(evt);
            }
        });

        mondayCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        mondayCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        mondayCheckBox.setText("Monday");
        mondayCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mondayCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mondayCheckBoxActionPerformed(evt);
            }
        });

        tuesdayCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        tuesdayCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        tuesdayCheckBox.setText("Tuesday");
        tuesdayCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tuesdayCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuesdayCheckBoxActionPerformed(evt);
            }
        });

        wednesdayCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        wednesdayCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        wednesdayCheckBox.setText("Wednesday");
        wednesdayCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wednesdayCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wednesdayCheckBoxActionPerformed(evt);
            }
        });

        thursdayCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        thursdayCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        thursdayCheckBox.setText("Thursday");
        thursdayCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thursdayCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thursdayCheckBoxActionPerformed(evt);
            }
        });

        saturdayCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        saturdayCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        saturdayCheckBox.setText("Saturday");
        saturdayCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saturdayCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturdayCheckBoxActionPerformed(evt);
            }
        });

        fridayCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        fridayCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        fridayCheckBox.setText("Friday");
        fridayCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fridayCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fridayCheckBoxActionPerformed(evt);
            }
        });

        sundayCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        sundayCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        sundayCheckBox.setText("Sunday");
        sundayCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sundayCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(102, 102, 102));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18));
        deleteButton.setForeground(new java.awt.Color(204, 204, 204));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    deleteButtonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
                editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                        .addGroup(editPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(editPanelLayout.createSequentialGroup()
                                                .addComponent(habitNameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(habitNameTextField,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 170,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(editPanelLayout.createSequentialGroup()
                                                .addComponent(repeatDayLabel)
                                                .addGap(18, 18, 18)
                                                .addGroup(editPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(everydayCheckBox)
                                                        .addComponent(saturdayCheckBox))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(editPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(editPanelLayout.createSequentialGroup()
                                                                .addComponent(mondayCheckBox)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(tuesdayCheckBox)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(wednesdayCheckBox)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(thursdayCheckBox)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(fridayCheckBox))
                                                        .addComponent(sundayCheckBox))))
                                .addContainerGap(103, Short.MAX_VALUE)));
        editPanelLayout.setVerticalGroup(
                editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editPanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(editPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(habitNameTextField)
                                        .addComponent(habitNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 43,
                                                Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(
                                        editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(repeatDayLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(everydayCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(mondayCheckBox)
                                                .addComponent(tuesdayCheckBox)
                                                .addComponent(wednesdayCheckBox)
                                                .addComponent(thursdayCheckBox)
                                                .addComponent(fridayCheckBox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(sundayCheckBox)
                                                .addComponent(saturdayCheckBox))
                                .addGap(139, 139, 139)
                                .addGroup(
                                        editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 11, Short.MAX_VALUE)));
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        String habitName = habitNameTextField.getText();
        boolean repeatMon = mondayCheckBox.isSelected();
        boolean repeatTue = tuesdayCheckBox.isSelected();
        boolean repeatWed = wednesdayCheckBox.isSelected();
        boolean repeatThu = thursdayCheckBox.isSelected();
        boolean repeatFri = fridayCheckBox.isSelected();
        boolean repeatSat = saturdayCheckBox.isSelected();
        boolean repeatSun = sundayCheckBox.isSelected();
        excelManager.editHabit(currentHabitNameString, habitName, repeatMon, repeatTue, repeatWed, repeatThu, repeatFri,
                repeatSat, repeatSun);
        mainFrame.clearBody();
    }

    private void everydayCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        mondayCheckBox.setSelected(true);
        tuesdayCheckBox.setSelected(true);
        wednesdayCheckBox.setSelected(true);
        thursdayCheckBox.setSelected(true);
        saturdayCheckBox.setSelected(true);
        fridayCheckBox.setSelected(true);
        sundayCheckBox.setSelected(true);
        checkAllbox();
    }

    private void mondayCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        checkAllbox();
    }

    private void tuesdayCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        checkAllbox();
    }

    private void wednesdayCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        checkAllbox();
    }

    private void thursdayCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        checkAllbox();
    }

    private void saturdayCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        checkAllbox();
    }

    private void fridayCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        checkAllbox();
    }

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {
        checkAllbox();
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        excelManager.deletehabit(currentHabitNameString);
        mainFrame.clearBody();
    }

    private void checkAllbox() {
        if (mondayCheckBox.isSelected() && tuesdayCheckBox.isSelected() && wednesdayCheckBox.isSelected()
                && thursdayCheckBox.isSelected() && saturdayCheckBox.isSelected() && fridayCheckBox.isSelected()
                && sundayCheckBox.isSelected()) {
            everydayCheckBox.setSelected(true);
        } else {
            everydayCheckBox.setSelected(false);
        }
    }
}
