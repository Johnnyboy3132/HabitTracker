
package habittracker;

import java.io.IOException;
import javax.swing.*;
import java.awt.event.*;;

public class newHabitPanel extends JPanel {

    /**
     * Creates new form newHabit
     */
    private JButton saveButton;
    private JCheckBox everydayCheckBox;
    private JCheckBox mondayRepeatCheckBox;
    private JCheckBox tuesdayRepeatCheckBox;
    private JCheckBox wednesdayRepeatCheckBox;
    private JCheckBox thursdayRepeatCheckBox;
    private JCheckBox saturdayRepeatCheckBox;
    private JCheckBox fridayRepeatCheckBox;
    private JCheckBox sundayRepeatCheckBox;
    private JLabel habitnameLabel;
    private JLabel repeatdayLabel;
    private JTextField habitNameTextField;

    public newHabitPanel() {
        initComponents();
    }

    private void initComponents() {

        habitNameTextField = new JTextField();
        habitnameLabel = new JLabel();
        saveButton = new JButton();
        repeatdayLabel = new JLabel();
        everydayCheckBox = new JCheckBox();
        mondayRepeatCheckBox = new JCheckBox();
        tuesdayRepeatCheckBox = new JCheckBox();
        wednesdayRepeatCheckBox = new JCheckBox();
        thursdayRepeatCheckBox = new JCheckBox();
        saturdayRepeatCheckBox = new JCheckBox();
        fridayRepeatCheckBox = new JCheckBox();
        sundayRepeatCheckBox = new JCheckBox();

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(102, 102, 102));
        
        habitnameLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        habitnameLabel.setForeground(new java.awt.Color(204, 204, 204));
        habitnameLabel.setText("Habit Name : ");

        habitNameTextField.setBackground(new java.awt.Color(102, 102, 102));
        habitNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 18));
        habitNameTextField.setForeground(new java.awt.Color(204, 204, 204));
        habitNameTextField.setText("Enter Habit name");
        habitNameTextField.setOpaque(true);

        saveButton.setBackground(new java.awt.Color(102, 102, 102));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 18));
        saveButton.setForeground(new java.awt.Color(204, 204, 204));
        saveButton.setText("Save");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    saveButtonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        repeatdayLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        repeatdayLabel.setForeground(new java.awt.Color(204, 204, 204));
        repeatdayLabel.setText("Repeat day :");

        everydayCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        everydayCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        everydayCheckBox.setText("Every day");
        everydayCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        everydayCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                everydayCheckBoxActionPerformed(evt);
            }
        });

        mondayRepeatCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        mondayRepeatCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        mondayRepeatCheckBox.setText("Monday");
        mondayRepeatCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        mondayRepeatCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                mondayRepeatCheckBoxActionPerformed(evt);
            }
        });

        tuesdayRepeatCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        tuesdayRepeatCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        tuesdayRepeatCheckBox.setText("Tuesday");
        tuesdayRepeatCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        tuesdayRepeatCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                tuesdayRepeatCheckBoxActionPerformed(evt);
            }
        });

        wednesdayRepeatCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        wednesdayRepeatCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        wednesdayRepeatCheckBox.setText("Wednesday");
        wednesdayRepeatCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        wednesdayRepeatCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                wednesdayRepeatCheckBoxActionPerformed(evt);
            }
        });

        thursdayRepeatCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        thursdayRepeatCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        thursdayRepeatCheckBox.setText("Thursday");
        thursdayRepeatCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        thursdayRepeatCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                thursdayRepeatCheckBoxActionPerformed(evt);
            }
        });

        fridayRepeatCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        fridayRepeatCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        fridayRepeatCheckBox.setText("Friday");
        fridayRepeatCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        fridayRepeatCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fridayRepeatCheckBoxActionPerformed(evt);
            }
        });

        saturdayRepeatCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        saturdayRepeatCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        saturdayRepeatCheckBox.setText("Saturday");
        saturdayRepeatCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        saturdayRepeatCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                saturdayRepeatCheckBoxActionPerformed(evt);
            }
        });

        sundayRepeatCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14));
        sundayRepeatCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        sundayRepeatCheckBox.setText("Sunday");
        sundayRepeatCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        sundayRepeatCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                sundayRepeatCheckBoxActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(habitnameLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(habitNameTextField, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(repeatdayLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(everydayCheckBox)
                                    .addComponent(saturdayRepeatCheckBox))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mondayRepeatCheckBox)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tuesdayRepeatCheckBox)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(wednesdayRepeatCheckBox)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(thursdayRepeatCheckBox)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fridayRepeatCheckBox))
                                    .addComponent(sundayRepeatCheckBox))))
                        .addContainerGap(103, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(habitNameTextField)
                    .addComponent(habitnameLabel, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(repeatdayLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(everydayCheckBox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mondayRepeatCheckBox)
                    .addComponent(tuesdayRepeatCheckBox)
                    .addComponent(wednesdayRepeatCheckBox)
                    .addComponent(thursdayRepeatCheckBox)
                    .addComponent(fridayRepeatCheckBox))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(sundayRepeatCheckBox)
                    .addComponent(saturdayRepeatCheckBox))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(75, 75, 75)
                .addComponent(saveButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        ));
    }

    private void fridayRepeatCheckBoxActionPerformed(ActionEvent evt) {
        checkAllbox();
    }

    private void everydayCheckBoxActionPerformed(ActionEvent evt) {
        mondayRepeatCheckBox.setSelected(true);
        tuesdayRepeatCheckBox.setSelected(true);
        wednesdayRepeatCheckBox.setSelected(true);
        thursdayRepeatCheckBox.setSelected(true);
        fridayRepeatCheckBox.setSelected(true);
        saturdayRepeatCheckBox.setSelected(true);
        sundayRepeatCheckBox.setSelected(true);
        checkAllbox();
    }

    private void mondayRepeatCheckBoxActionPerformed(ActionEvent evt) {
        checkAllbox();
    }

    private void tuesdayRepeatCheckBoxActionPerformed(ActionEvent evt) {
        checkAllbox();
    }

    private void wednesdayRepeatCheckBoxActionPerformed(ActionEvent evt) {
        checkAllbox();
    }

    private void thursdayRepeatCheckBoxActionPerformed(ActionEvent evt) {
        checkAllbox();
    }

    private void saturdayRepeatCheckBoxActionPerformed(ActionEvent evt) {
        checkAllbox();
    }

    private void sundayRepeatCheckBoxActionPerformed(ActionEvent evt) {
        checkAllbox();
    }

    private void checkAllbox(){
        if (mondayRepeatCheckBox.isSelected()&&tuesdayRepeatCheckBox.isSelected()&&wednesdayRepeatCheckBox.isSelected()&&thursdayRepeatCheckBox.isSelected()&&saturdayRepeatCheckBox.isSelected()&&fridayRepeatCheckBox.isSelected()&&sundayRepeatCheckBox.isSelected()){
            everydayCheckBox.setSelected(true);
        } else {
            everydayCheckBox.setSelected(false);
        }
    }

    private void saveButtonActionPerformed(ActionEvent evt) throws IOException {
        
        String habitName = habitNameTextField.getText();
        boolean repeatMon = mondayRepeatCheckBox.isSelected();
        boolean repeatTue = tuesdayRepeatCheckBox.isSelected();
        boolean repeatWed = wednesdayRepeatCheckBox.isSelected();
        boolean repeatThu = thursdayRepeatCheckBox.isSelected();
        boolean repeatFri = saturdayRepeatCheckBox.isSelected();
        boolean repeatSat = fridayRepeatCheckBox.isSelected();
        boolean repeatSun = sundayRepeatCheckBox.isSelected();
        if (excelManager.isReachMaxHabitNum()){
            return;
        } else if (excelManager.isHabitExist(habitName)){
            return;
        }
        excelManager.insertNewHabit(habitName,repeatMon,repeatTue,repeatWed,repeatThu,repeatFri,repeatSat,repeatSun);
        excelManager.createNewHabit(habitName, repeatMon, repeatTue, repeatWed, repeatThu, repeatFri, repeatSat, repeatSun);
        mainFrame.clearBody();
    }
}
