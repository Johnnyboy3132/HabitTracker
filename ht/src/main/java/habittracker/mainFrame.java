package habittracker;

import javax.swing.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class mainFrame extends JFrame {

    /**
     * Creates main frame of the this software
     */

    private JPanel framePanel;
    private JButton mainButton;
    private JButton dataButton;
    private JButton newHabitButton;
    private JButton otherButton;
    private JPanel menuPanel;
    private static JPanel bodyPanel;

    public mainFrame() {
        initComponents();
        getContentPane().setBackground(new Color(200, 200, 200));
        menuPanel.setOpaque(false);
    }

    /**
     * Creates new form main
     */
    public static void showForm(Component com) {
        bodyPanel.removeAll();
        bodyPanel.add(com);
        bodyPanel.revalidate();
        bodyPanel.repaint();
    }

    /**
     * Clear all the content in body
     */
    public static void clearBody() {
        bodyPanel.removeAll();
        bodyPanel.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */

    private void initComponents() {

        framePanel = new JPanel();
        menuPanel = new JPanel();
        bodyPanel = new JPanel();
        dataButton = new JButton();
        otherButton = new JButton();
        mainButton = new JButton();
        newHabitButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        framePanel.setBackground(new java.awt.Color(50, 50, 50));

        dataButton.setFont(new java.awt.Font("Segoe UI", 1, 48));
        dataButton.setForeground(new java.awt.Color(204, 204, 204));
        dataButton.setText("Data");
        dataButton.setContentAreaFilled(false);
        dataButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    dataButtonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        otherButton.setFont(new java.awt.Font("Segoe UI", 1, 48));
        otherButton.setForeground(new java.awt.Color(204, 204, 204));
        otherButton.setText("Other");
        otherButton.setContentAreaFilled(false);
        otherButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                otherButtonActionPerformed(evt);
            }
        });

        mainButton.setFont(new java.awt.Font("Segoe UI", 1, 48));
        mainButton.setForeground(new java.awt.Color(204, 204, 204));
        mainButton.setText("Main");
        mainButton.setContentAreaFilled(false);
        mainButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    mainButtonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        newHabitButton.setFont(new java.awt.Font("Segoe UI", 1, 48));
        newHabitButton.setForeground(new java.awt.Color(204, 204, 204));
        newHabitButton.setText("New Habit");
        newHabitButton.setContentAreaFilled(false);
        newHabitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                newHabitButtonActionPerformed(evt);
            }
        });

        GroupLayout menuPanelLayout = new GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
                menuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(menuPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mainButton, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newHabitButton, GroupLayout.PREFERRED_SIZE, 300,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataButton, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otherButton, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addContainerGap()));
        menuPanelLayout.setVerticalGroup(
                menuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(menuPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(otherButton)
                                        .addComponent(dataButton)
                                        .addComponent(mainButton)
                                        .addComponent(newHabitButton))
                                .addContainerGap()));

        bodyPanel.setOpaque(false);
        bodyPanel.setLayout(new BoxLayout(bodyPanel, BoxLayout.Y_AXIS));

        GroupLayout framePanelLayout = new GroupLayout(framePanel);
        framePanel.setLayout(framePanelLayout);
        framePanelLayout.setHorizontalGroup(
                framePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(framePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(framePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(menuPanel, GroupLayout.Alignment.TRAILING,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bodyPanel, GroupLayout.Alignment.TRAILING,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));
        framePanelLayout.setVerticalGroup(
                framePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(framePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(menuPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bodyPanel, GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                                .addGap(22, 22, 22)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(framePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                .addGap(3, 3, 3)));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(framePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                .addGap(3, 3, 3)));
        pack();
        setLocationRelativeTo(null);
    }

    /*
     * Action Performed when clicking main button
     */

    private void mainButtonActionPerformed(ActionEvent evt) throws IOException {
        bodyPanel.removeAll();
        bodyPanel.add(new datepanel());
        ArrayList<String> habitNames = excelManager.readHabitList();
        for (String name : habitNames) {
            System.out.println(name);
            excelManager.getHabitEnableDay(name);
            ArrayList<Boolean> habitEnableDay = excelManager.getHabitEnableDay(name);
            ArrayList<Boolean> habitTrackData = excelManager.getThisWeekTrackData(name);
            System.out.println("trackdata monday : " + habitTrackData.get(0));
            bodyPanel.add(new mainPanel(name, habitEnableDay.get(0), habitEnableDay.get(1), habitEnableDay.get(2),
                    habitEnableDay.get(3), habitEnableDay.get(4), habitEnableDay.get(5), habitEnableDay.get(6),
                    habitTrackData.get(0), habitTrackData.get(1), habitTrackData.get(2), habitTrackData.get(3),
                    habitTrackData.get(4), habitTrackData.get(5), habitTrackData.get(6)));
        }
        bodyPanel.revalidate();
        bodyPanel.repaint();
    }

    /*
     * Action Performed when clicking new Habit button
     */

    private void newHabitButtonActionPerformed(ActionEvent evt) {
        showForm(new newHabitPanel());
    }

    /*
     * Action Performed when clicking data button
     */

    private void dataButtonActionPerformed(ActionEvent evt) throws IOException {
        bodyPanel.removeAll();
        ArrayList<String> habitNames = excelManager.readHabitList();
        for (String name : habitNames) {
            bodyPanel.add(new datachooser(name));
        }
        bodyPanel.revalidate();
        bodyPanel.repaint();
    }

    /*
     * Action Performed when clicking other button
     */

    private void otherButtonActionPerformed(ActionEvent evt) {
        showForm(new otherpanel());
    }

}
