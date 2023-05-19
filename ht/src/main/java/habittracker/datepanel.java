package habittracker;

import java.time.LocalDate;

public class datepanel extends javax.swing.JPanel {

    /**
     * Creates new form Date
     */
    private javax.swing.JLabel tueLabel;
    private javax.swing.JLabel wedLabel;
    private javax.swing.JLabel thuLabel;
    private javax.swing.JLabel friLabel;
    private javax.swing.JLabel satLabel;
    private javax.swing.JLabel sunLabel;
    private javax.swing.JLabel habitNameLabel;
    private javax.swing.JLabel monLabel;
    private javax.swing.JLabel currentDateLabel;

    public datepanel() {
        initComponents();
        setOpaque(false);
    }
    
    private void initComponents() {

        habitNameLabel = new javax.swing.JLabel();
        monLabel = new javax.swing.JLabel();
        tueLabel = new javax.swing.JLabel();
        wedLabel = new javax.swing.JLabel();
        thuLabel = new javax.swing.JLabel();
        friLabel = new javax.swing.JLabel();
        satLabel = new javax.swing.JLabel();
        sunLabel = new javax.swing.JLabel();
        currentDateLabel = new javax.swing.JLabel();

        habitNameLabel.setBackground(new java.awt.Color(51, 51, 51));
        habitNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        habitNameLabel.setForeground(new java.awt.Color(204, 204, 204));
        habitNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        habitNameLabel.setText("Habit Name");
        habitNameLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        habitNameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        habitNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        habitNameLabel.setOpaque(true);

        monLabel.setBackground(new java.awt.Color(51, 51, 51));
        monLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        monLabel.setForeground(new java.awt.Color(204, 204, 204));
        monLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        monLabel.setText("Mon");
        monLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        monLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        monLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        monLabel.setOpaque(true);

        tueLabel.setBackground(new java.awt.Color(51, 51, 51));
        tueLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        tueLabel.setForeground(new java.awt.Color(204, 204, 204));
        tueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tueLabel.setText("Tue");
        tueLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        tueLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tueLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tueLabel.setOpaque(true);

        wedLabel.setBackground(new java.awt.Color(51, 51, 51));
        wedLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        wedLabel.setForeground(new java.awt.Color(204, 204, 204));
        wedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wedLabel.setText("Wed");
        wedLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        wedLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        wedLabel.setOpaque(true);

        thuLabel.setBackground(new java.awt.Color(51, 51, 51));
        thuLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        thuLabel.setForeground(new java.awt.Color(204, 204, 204));
        thuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thuLabel.setText("Thu");
        thuLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        thuLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        thuLabel.setOpaque(true);

        friLabel.setBackground(new java.awt.Color(51, 51, 51));
        friLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        friLabel.setForeground(new java.awt.Color(204, 204, 204));
        friLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        friLabel.setText("Fri");
        friLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        friLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        friLabel.setOpaque(true);

        satLabel.setBackground(new java.awt.Color(51, 51, 51));
        satLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        satLabel.setForeground(new java.awt.Color(204, 204, 204));
        satLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        satLabel.setText("Sat");
        satLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        satLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        satLabel.setOpaque(true);

        sunLabel.setBackground(new java.awt.Color(51, 51, 51));
        sunLabel.setFont(new java.awt.Font("Segoe UI", 1, 24));
        sunLabel.setForeground(new java.awt.Color(204, 204, 204));
        sunLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sunLabel.setText("Sun");
        sunLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        sunLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sunLabel.setOpaque(true);

        currentDateLabel.setBackground(new java.awt.Color(51, 51, 51));
        currentDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 21));
        currentDateLabel.setForeground(new java.awt.Color(204, 204, 204));
        currentDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        currentDateLabel.setText(LocalDate.now().toString());
        currentDateLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        currentDateLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        currentDateLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        currentDateLabel.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(habitNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(friLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(satLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sunLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(currentDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(habitNameLabel)
                        .addComponent(monLabel)
                        .addComponent(tueLabel)
                        .addComponent(wedLabel)
                        .addComponent(thuLabel)
                        .addComponent(friLabel)
                        .addComponent(satLabel)
                        .addComponent(sunLabel)))
                .addGap(20, 20, 20))
        );
    }                   
              
}
