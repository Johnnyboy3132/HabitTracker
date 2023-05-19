package habittracker;

import java.util.ArrayList;
import javax.swing.*;

public class datapanel extends JPanel {

    /**
     * Creates new form Data
     */
    private JPanel SuccessAndFailPanel;
    private JLabel habitNameLabel;
    private JLabel SuccessAndFailLabel;
    private JLabel successTimes;
    private JLabel failTimes;
    private JProgressBar SuccessRateBar;
    private JLabel successRateLabel;
    private JLabel successRate;

    private JPanel completeTimesPanel;
    private JLabel timesCompleteLabel;
    private JLabel thisWeekLabel;
    private JLabel thisMonthLabel;
    private JLabel thisYearLabel;
    private JLabel allLabel;
    private JLabel thisWeekCompleteTimes;
    private JLabel thisMonthCompleteTimes;
    private JLabel thisYearCompleteTimes;
    private JLabel allCoompleteTimes;
    
    private JPanel streakPanel;
    private JLabel streakLabel;
    private JLabel bestStreakLabel;
    private JLabel bestStreak;
    private JLabel currentStreakLabel;
    private JLabel currentStreak;

    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JSeparator jSeparator4;
    private JSeparator jSeparator5;
    private JSeparator jSeparator6;
    private JSeparator jSeparator7;
    private JSeparator jSeparator8;
    private JSeparator jSeparator9;
    private JSeparator jSeparator10;
    
    public datapanel(String habitName, ArrayList<Integer> orgonizedData) {
        initComponents(habitName, orgonizedData);
    }

    private void initComponents(String habitName, ArrayList<Integer> orgonizedData) {

        SuccessAndFailPanel = new JPanel();
        habitNameLabel = new JLabel();
        SuccessAndFailPanel = new JPanel();
        successTimes = new JLabel();
        failTimes = new JLabel();
        SuccessRateBar = new JProgressBar();
        SuccessAndFailLabel = new JLabel();
        successRateLabel = new JLabel();
        successRate = new JLabel();

        completeTimesPanel = new JPanel();
        timesCompleteLabel = new JLabel();
        thisWeekLabel = new JLabel();
        thisMonthLabel = new JLabel();
        thisYearLabel = new JLabel();
        allLabel = new JLabel();
        thisMonthCompleteTimes = new JLabel();
        thisWeekCompleteTimes = new JLabel();
        allCoompleteTimes = new JLabel();
        thisYearCompleteTimes = new JLabel();

        streakPanel = new JPanel();
        streakLabel = new JLabel();
        bestStreak = new JLabel();
        bestStreakLabel = new JLabel();
        currentStreak = new JLabel();
        currentStreakLabel = new JLabel();

        jSeparator1 = new JSeparator();
        jSeparator2 = new JSeparator();
        jSeparator3 = new JSeparator();
        jSeparator4 = new JSeparator();
        jSeparator5 = new JSeparator();
        jSeparator6 = new JSeparator();
        jSeparator7 = new JSeparator();
        jSeparator8 = new JSeparator();
        jSeparator9 = new JSeparator();
        jSeparator10 = new JSeparator();


        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));
        setOpaque(false);

        SuccessAndFailPanel.setBackground(new java.awt.Color(51, 51, 51));
        SuccessAndFailPanel.setForeground(new java.awt.Color(51, 51, 51));

        SuccessRateBar.setBackground(new java.awt.Color(255, 0, 0));
        SuccessRateBar.setForeground(new java.awt.Color(0, 255, 0));
        SuccessRateBar.setValue(orgonizedData.get(2));

        habitNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 36));
        habitNameLabel.setForeground(new java.awt.Color(204, 204, 204));
        habitNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        habitNameLabel.setText(habitName);

        SuccessAndFailLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        SuccessAndFailLabel.setForeground(new java.awt.Color(204, 204, 204));
        SuccessAndFailLabel.setHorizontalAlignment(SwingConstants.CENTER);
        SuccessAndFailLabel.setText("Success / Fail");

        successTimes.setFont(new java.awt.Font("Segoe UI", 1, 24));
        successTimes.setForeground(new java.awt.Color(0, 153, 255));
        successTimes.setHorizontalAlignment(SwingConstants.CENTER);
        successTimes.setText(orgonizedData.get(0).toString());

        failTimes.setFont(new java.awt.Font("Segoe UI", 1, 24));
        failTimes.setForeground(new java.awt.Color(0, 153, 255));
        failTimes.setHorizontalAlignment(SwingConstants.CENTER);
        failTimes.setText(orgonizedData.get(1).toString());

        successRateLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        successRateLabel.setForeground(new java.awt.Color(204, 204, 204));
        successRateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        successRateLabel.setText("Success rate");

        successRate.setFont(new java.awt.Font("Segoe UI", 1, 24));
        successRate.setForeground(new java.awt.Color(0, 153, 255));
        successRate.setHorizontalAlignment(SwingConstants.CENTER);
        successRate.setText(orgonizedData.get(2).toString()+"%");

        GroupLayout SuccessAndFailPanelLayout = new GroupLayout(SuccessAndFailPanel);
        SuccessAndFailPanel.setLayout(SuccessAndFailPanelLayout);
        SuccessAndFailPanelLayout.setHorizontalGroup(
            SuccessAndFailPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(SuccessAndFailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SuccessAndFailPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, SuccessAndFailPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(SuccessAndFailPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(SuccessAndFailPanelLayout.createSequentialGroup()
                                .addComponent(successTimes, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(failTimes, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                            .addComponent(SuccessRateBar, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(GroupLayout.Alignment.TRAILING, SuccessAndFailPanelLayout.createSequentialGroup()
                        .addGroup(SuccessAndFailPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator10, GroupLayout.Alignment.LEADING)
                            .addComponent(SuccessAndFailLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(habitNameLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(jSeparator9, GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, SuccessAndFailPanelLayout.createSequentialGroup()
                        .addComponent(successRateLabel, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, SuccessAndFailPanelLayout.createSequentialGroup()
                        .addComponent(successRate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        SuccessAndFailPanelLayout.setVerticalGroup(
            SuccessAndFailPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(SuccessAndFailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(habitNameLabel, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SuccessAndFailLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SuccessRateBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SuccessAndFailPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(successTimes)
                    .addComponent(failTimes))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(successRateLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(successRate)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        completeTimesPanel.setBackground(new java.awt.Color(51, 51, 51));
        completeTimesPanel.setForeground(new java.awt.Color(51, 51, 51));

        timesCompleteLabel.setFont(new java.awt.Font("Segoe UI", 1, 28));
        timesCompleteLabel.setForeground(new java.awt.Color(204, 204, 204));
        timesCompleteLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timesCompleteLabel.setText("TimesCompleted");

        thisWeekLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        thisWeekLabel.setForeground(new java.awt.Color(153, 153, 153));
        thisWeekLabel.setHorizontalAlignment(SwingConstants.LEFT);
        thisWeekLabel.setText("This week :");

        thisMonthLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        thisMonthLabel.setForeground(new java.awt.Color(153, 153, 153));
        thisMonthLabel.setHorizontalAlignment(SwingConstants.LEFT);
        thisMonthLabel.setText("This month :");

        thisYearLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        thisYearLabel.setForeground(new java.awt.Color(153, 153, 153));
        thisYearLabel.setHorizontalAlignment(SwingConstants.LEFT);
        thisYearLabel.setText("This year :");

        allLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        allLabel.setForeground(new java.awt.Color(153, 153, 153));
        allLabel.setHorizontalAlignment(SwingConstants.LEFT);
        allLabel.setText("All :");
        
        thisWeekCompleteTimes.setFont(new java.awt.Font("Segoe UI", 1, 24));
        thisWeekCompleteTimes.setForeground(new java.awt.Color(0, 153, 255));
        thisWeekCompleteTimes.setHorizontalAlignment(SwingConstants.RIGHT);
        thisWeekCompleteTimes.setText(orgonizedData.get(5).toString());

        thisMonthCompleteTimes.setFont(new java.awt.Font("Segoe UI", 1, 24));
        thisMonthCompleteTimes.setForeground(new java.awt.Color(0, 153, 255));
        thisMonthCompleteTimes.setHorizontalAlignment(SwingConstants.RIGHT);
        thisMonthCompleteTimes.setText(orgonizedData.get(6).toString());

        thisYearCompleteTimes.setFont(new java.awt.Font("Segoe UI", 1, 24));
        thisYearCompleteTimes.setForeground(new java.awt.Color(0, 153, 255));
        thisYearCompleteTimes.setHorizontalAlignment(SwingConstants.RIGHT);
        thisYearCompleteTimes.setText(orgonizedData.get(7).toString());

        allCoompleteTimes.setFont(new java.awt.Font("Segoe UI", 1, 24));
        allCoompleteTimes.setForeground(new java.awt.Color(0, 153, 255));
        allCoompleteTimes.setHorizontalAlignment(SwingConstants.RIGHT);
        allCoompleteTimes.setText(orgonizedData.get(8).toString());

        GroupLayout completeTimesPanelLayout = new GroupLayout(completeTimesPanel);
        completeTimesPanel.setLayout(completeTimesPanelLayout);
        completeTimesPanelLayout.setHorizontalGroup(
            completeTimesPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(completeTimesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(completeTimesPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(timesCompleteLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator7)
                    .addComponent(jSeparator8)
                    .addGroup(completeTimesPanelLayout.createSequentialGroup()
                        .addGroup(completeTimesPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(completeTimesPanelLayout.createSequentialGroup()
                                .addComponent(allLabel, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(allCoompleteTimes, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
                            .addGroup(completeTimesPanelLayout.createSequentialGroup()
                                .addComponent(thisYearLabel, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thisYearCompleteTimes, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
                            .addGroup(completeTimesPanelLayout.createSequentialGroup()
                                .addComponent(thisMonthLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(thisMonthCompleteTimes, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
                            .addGroup(completeTimesPanelLayout.createSequentialGroup()
                                .addComponent(thisWeekLabel, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(thisWeekCompleteTimes, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        completeTimesPanelLayout.setVerticalGroup(
            completeTimesPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(completeTimesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timesCompleteLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(completeTimesPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(thisWeekLabel)
                    .addComponent(thisWeekCompleteTimes))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(completeTimesPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(thisMonthLabel)
                    .addComponent(thisMonthCompleteTimes))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(completeTimesPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(thisYearCompleteTimes)
                    .addComponent(thisYearLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(completeTimesPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(allLabel)
                    .addComponent(allCoompleteTimes))
                .addGap(25, 25, 25))
        );

        streakPanel.setBackground(new java.awt.Color(51, 51, 51));
        streakPanel.setForeground(new java.awt.Color(51, 51, 51));

        
        streakLabel.setFont(new java.awt.Font("Segoe UI", 1, 48));
        streakLabel.setForeground(new java.awt.Color(204, 204, 204));
        streakLabel.setHorizontalAlignment(SwingConstants.CENTER);
        streakLabel.setText("Streak");

        currentStreakLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        currentStreakLabel.setForeground(new java.awt.Color(153, 153, 153));
        currentStreakLabel.setHorizontalAlignment(SwingConstants.CENTER);
        currentStreakLabel.setText("Current");

        currentStreak.setFont(new java.awt.Font("Segoe UI", 1, 24));
        currentStreak.setForeground(new java.awt.Color(0, 153, 255));
        currentStreak.setHorizontalAlignment(SwingConstants.CENTER);
        currentStreak.setText(orgonizedData.get(3).toString()+" Days");

        bestStreakLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        bestStreakLabel.setForeground(new java.awt.Color(153, 153, 153));
        bestStreakLabel.setHorizontalAlignment(SwingConstants.CENTER);
        bestStreakLabel.setText("Best");

        bestStreak.setFont(new java.awt.Font("Segoe UI", 1, 24));
        bestStreak.setForeground(new java.awt.Color(0, 153, 255));
        bestStreak.setHorizontalAlignment(SwingConstants.CENTER);
        bestStreak.setText(orgonizedData.get(4).toString()+" Days");

        GroupLayout streakPanelLayout = new GroupLayout(streakPanel);
        streakPanel.setLayout(streakPanelLayout);
        streakPanelLayout.setHorizontalGroup(
            streakPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(bestStreak, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
            .addGroup(streakPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(streakPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, GroupLayout.Alignment.TRAILING)
                    .addComponent(bestStreakLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(currentStreak, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(currentStreakLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(streakLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        streakPanelLayout.setVerticalGroup(
            streakPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(streakPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(streakLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentStreakLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentStreak)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bestStreakLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bestStreak)
                .addGap(30, 30, 30))
        );

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setOrientation(SwingConstants.VERTICAL);

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator4.setOrientation(SwingConstants.VERTICAL);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SuccessAndFailPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(streakPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(completeTimesPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(completeTimesPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SuccessAndFailPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(streakPanel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4, GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
    }                  
}
