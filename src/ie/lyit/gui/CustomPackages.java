package ie.lyit.gui;

import ie.lyit.database.Insertions;
import ie.lyit.hotel.Packages;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author James Fallon
 */
public class CustomPackages extends javax.swing.JFrame {

    private int sliderNum  = 0;
    private String name;
    private String comments;
    private double totalbill;
    private double increase;
    private double decrease;
    private double extras;
    
    Insertions insert;
    static Packages pack;
     
    public CustomPackages() {
        
        setLook();
        initComponents();
    }
    
    private void setLook(){
    // Set look & feel --> (Metal theme)
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomPackages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomPackages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomPackages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomPackages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        packagePanel = new javax.swing.JPanel();
        packageText = new javax.swing.JTextField();
        discountText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        addButton = new javax.swing.JButton();
        disocuntLabel = new javax.swing.JLabel();
        slider = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentsArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        extraCheck = new javax.swing.JCheckBox();
        extraText = new javax.swing.JTextField();
        increaseCheck = new javax.swing.JCheckBox();
        incText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        decreaseCheck = new javax.swing.JCheckBox();
        decText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Packages & Deals");
        setResizable(false);

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        packagePanel.setBackground(new java.awt.Color(255, 255, 153));
        packagePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Packages"));

        discountText.setEditable(false);
        discountText.setText("0");
        discountText.setMargin(new java.awt.Insets(2, 19, 2, 1));
        discountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountTextActionPerformed(evt);
            }
        });

        jLabel2.setText("Package Name:");

        addButton.setMnemonic('A');
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        disocuntLabel.setBackground(new java.awt.Color(255, 255, 255));
        disocuntLabel.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        disocuntLabel.setText("Discount / Increase Off Total Bill:");

        slider.setForeground(new java.awt.Color(0, 0, 0));
        slider.setMajorTickSpacing(25);
        slider.setMinimum(-100);
        slider.setMinorTickSpacing(5);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setValue(0);
        slider.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        slider.setValueIsAdjusting(true);
        slider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sliderMouseDragged(evt);
            }
        });

        commentsArea.setColumns(20);
        commentsArea.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        commentsArea.setRows(5);
        commentsArea.setText("Package Extras Include...");
        commentsArea.setAutoscrolls(false);
        jScrollPane1.setViewportView(commentsArea);

        jLabel3.setText("Comments:");

        clearButton.setMnemonic('C');
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("%");

        extraCheck.setBackground(new java.awt.Color(255, 255, 153));
        extraCheck.setText("Extra's");
        extraCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                extraCheckItemStateChanged(evt);
            }
        });
        extraCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraCheckActionPerformed(evt);
            }
        });

        extraText.setText("0.00");
        extraText.setEnabled(false);
        extraText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraTextActionPerformed(evt);
            }
        });

        increaseCheck.setBackground(new java.awt.Color(255, 255, 153));
        increaseCheck.setText("Fixed Increase");
        increaseCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                increaseCheckItemStateChanged(evt);
            }
        });

        incText.setText("0");
        incText.setEnabled(false);
        incText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incTextActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 9)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText(" Food,drink etc.. ");

        decreaseCheck.setBackground(new java.awt.Color(255, 255, 153));
        decreaseCheck.setText("Fixed Decrease");
        decreaseCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                decreaseCheckItemStateChanged(evt);
            }
        });

        decText.setText("0");
        decText.setEnabled(false);
        decText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                decTextFocusLost(evt);
            }
        });

        jLabel6.setText("€");

        jLabel7.setText("€");

        jLabel8.setText("€");

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(204, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 9)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("Add a custom fixed price to bill...");

        jLabel11.setBackground(new java.awt.Color(204, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 9)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Subtract a custom fixed price from bill...");

        javax.swing.GroupLayout packagePanelLayout = new javax.swing.GroupLayout(packagePanel);
        packagePanel.setLayout(packagePanelLayout);
        packagePanelLayout.setHorizontalGroup(
            packagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, packagePanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(packagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(packagePanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(packageText, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(packagePanelLayout.createSequentialGroup()
                        .addComponent(disocuntLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(discountText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))))
            .addComponent(slider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1)
            .addGroup(packagePanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(packagePanelLayout.createSequentialGroup()
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(packagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(packagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, packagePanelLayout.createSequentialGroup()
                        .addGroup(packagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(packagePanelLayout.createSequentialGroup()
                                .addComponent(decreaseCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(packagePanelLayout.createSequentialGroup()
                                .addComponent(extraCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, packagePanelLayout.createSequentialGroup()
                        .addComponent(increaseCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(2, 2, 2)))
                .addGroup(packagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(incText, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extraText, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decText, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(packagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        packagePanelLayout.setVerticalGroup(
            packagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(packagePanelLayout.createSequentialGroup()
                .addGroup(packagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(packageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(packagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(packagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(discountText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(disocuntLabel)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(packagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(packagePanelLayout.createSequentialGroup()
                        .addGroup(packagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(packagePanelLayout.createSequentialGroup()
                                .addComponent(extraCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(increaseCheck))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, packagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(incText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(packagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(decreaseCheck)
                            .addComponent(jLabel8)
                            .addComponent(decText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(packagePanelLayout.createSequentialGroup()
                        .addGroup(packagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(extraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(packagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(clearButton)))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Package Creator");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Product_52px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2)))
                .addContainerGap())
        );

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(packagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(packagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // Passing user info into variables
       
        insert = new Insertions();
        name = packageText.getText();
        totalbill = slider.getValue();
        extras = Double.parseDouble(extraText.getText());
        increase = Double.parseDouble(incText.getText());
        decrease = Double.parseDouble(decText.getText());
        comments = commentsArea.getText();
        
        //pack = new Packages(name,(int)totalbill,increase,decrease,extras,comments);
        initObject(name,(int)totalbill,increase,decrease,extras,comments);
        MainFrame.setPackageText(pack.getName());
        
        if(packageText.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Enter package name!", "No name entered", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Package Created", "Package created...", JOptionPane.INFORMATION_MESSAGE);
            dispose();  
        }       
    }//GEN-LAST:event_addButtonActionPerformed
    public static void initObject(String n,int tot,double inc,double dec,double extras,String comments){
        pack = new Packages(n,tot,inc,dec,extras,comments);
    }
    
    public void addPackageToDB(int cusId){
         insert = new Insertions();
         System.out.println("\n\n\nDEBUG Packages:"+pack.getName()+pack.getComments());
         
         String sql = "INSERT INTO `packages` (`packid`,`name`,`totalbill`,`extras`,`increase`,`decrease`,`comments`) VALUES "
                + "('"+cusId+"','"+pack.getName()+"','"+pack.getTotalBill()+"', '"+pack.getExtras()+"', '"+pack.getFixIncrease()+"','"+pack.getFixDecrease()+"','"+pack.getComments()+"');";
        
         try{
        insert.insertToDatabase(sql);
        JOptionPane.showMessageDialog(null, "Package added to database!", "Packages Added", JOptionPane.INFORMATION_MESSAGE);
         }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Error adding room to database!", "Error", JOptionPane.ERROR_MESSAGE);
        System.out.println("Error while trying to add package to database..");
        System.out.println("\n"+e.getMessage());
        }     
    }
    private void sliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderMouseDragged
        // TODO add your handling code here:
        sliderNum = slider.getValue();
        
        if(sliderNum < 0){
            discountText.setBackground(Color.pink);
            discountText.setText("-"+sliderNum);
        }
        else if(sliderNum > 0){
            discountText.setBackground(Color.green);
            discountText.setText("+"+sliderNum);
        }
        else{
             discountText.setText(""+sliderNum);
             discountText.setBackground(Color.white);
        }
        repaint();
    }//GEN-LAST:event_sliderMouseDragged

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // Clear all fields to default..
        incText.setText("0.00");
        extraText.setText("0.00");
        discountText.setText("0");
        slider.setValue(0);
        commentsArea.setText("Package Extras Include...");
        packageText.setText("");
        decText.setText("0");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void extraCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_extraCheckActionPerformed

    private void extraTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_extraTextActionPerformed

    private void incTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incTextActionPerformed

    private void increaseCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_increaseCheckItemStateChanged
        // TODO add your handling code here:
  
        if(increaseCheck.isSelected()){
        incText.setEnabled(true);
        decText.setEnabled(false);
        // Disable slider
        slider.setValue(0);
        slider.setEnabled(false);
        discountText.setText("0");
        discountText.setBackground(Color.white);
        
        decreaseCheck.setEnabled(false);
        }
        else if(!increaseCheck.isSelected()){
        decreaseCheck.setEnabled(true);
        incText.setEnabled(false);
        decText.setEnabled(false);
        
        slider.setEnabled(true);
        }
    }//GEN-LAST:event_increaseCheckItemStateChanged

    private void decreaseCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_decreaseCheckItemStateChanged
        // TODO add your handling code here:
        
        if(decreaseCheck.isSelected()){
        incText.setEnabled(false);
        decText.setEnabled(true);
        increaseCheck.setEnabled(false);
         // Disable slider
        slider.setValue(0);
        slider.setEnabled(false);
        discountText.setText("0");
        discountText.setBackground(Color.white);
        }
        else if(!decreaseCheck.isSelected()){
        increaseCheck.setEnabled(true);
        decText.setEnabled(false);
        incText.setEnabled(false);
        
        slider.setEnabled(true);
        }
    }//GEN-LAST:event_decreaseCheckItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        slider.setValue(0);
        discountText.setText(""+0);
        discountText.setBackground(Color.white);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void extraCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_extraCheckItemStateChanged
        // TODO add your handling code here:
       if(extraCheck.isSelected()){
            extraText.setEnabled(true);
        }
       else if(!extraCheck.isSelected()){
           extraText.setEnabled(false);
       }
    }//GEN-LAST:event_extraCheckItemStateChanged

    private void discountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountTextActionPerformed

    private void decTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_decTextFocusLost
        // If user enters a positive number...convert it to negetive 
        int num = 0;
        num = Integer.parseInt(decText.getText());
        if( num > 0){
            num = (num * -1);
            decText.setText(""+num);
            repaint();
            System.out.println("DEBUGGG"+num);
        }
    }//GEN-LAST:event_decTextFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextArea commentsArea;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JTextField decText;
    private javax.swing.JCheckBox decreaseCheck;
    private javax.swing.JTextField discountText;
    private javax.swing.JLabel disocuntLabel;
    private javax.swing.JCheckBox extraCheck;
    private javax.swing.JTextField extraText;
    private javax.swing.JTextField incText;
    private javax.swing.JCheckBox increaseCheck;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel packagePanel;
    private javax.swing.JTextField packageText;
    private javax.swing.JSlider slider;
    // End of variables declaration//GEN-END:variables
}
