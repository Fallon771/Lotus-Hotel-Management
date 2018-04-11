package ie.lyit.gui;

import ie.lyit.database.DisplayTables;
import ie.lyit.users.Guest;
import java.awt.event.WindowAdapter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import ie.lyit.database.RemoveGuest;
import javax.swing.JOptionPane;

/**
 *
 * @author James Fallon
 */
public class BookingPopup extends javax.swing.JFrame {

    MainFrame frame;
    DisplayTables display = new DisplayTables();
    String room;
    /**
     * Creates new form BookingPopup
     */
    public BookingPopup() {
        
        // Set look & feel (Metal)
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookingPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // Construct GUI
        initComponents();
        roomNumber.setText("Room:"+frame.getCurrentRoomNo());  
    }
    
    public void displayRoomTable(){
         
         room = roomNumber.getText();
         String secondPart = room.substring(5,8);
         System.out.print(secondPart);
         String time = new SimpleDateFormat("EEE d MMM yyyy   h:mm a").format(Calendar.getInstance().getTime());
         timeStamp.setText(time);
        
         ArrayList<Guest> list = new ArrayList<>();
         DefaultTableModel model2 = (DefaultTableModel)guestTable.getModel();
         DefaultTableModel model = (DefaultTableModel)bookingTable.getModel();
         
         try{
         String sql = "SELECT DISTINCT * FROM `guest`, `rooms` WHERE `roomno` = '"+secondPart+"' && guest.id = rooms.id HAVING `booked` = 1";
         list = display.displayGuestTable(sql);
         Object[] row = new Object[9];
         for(int i=0;i<list.size();i++){
            row [0] = list.get(i).getId();
            row [1] = list.get(i).getTitle();
            row [2] = list.get(i).getfName();
            row [3] = list.get(i).getsName();
            row [4] = list.get(i).getAddress();
            row [5] = list.get(i).getPhoneNo();
            row [6] = list.get(i).getEmailAddress();
            row [7] = list.get(i).getCheckIn();
            row [8] = list.get(i).getCheckOut();
            model.addRow(row);
            }
         }
         catch(Exception e){
         System.out.print("ERROR!!");
         }    
        
         try{
        // list.clear();
         String sql = "SELECT DISTINCT * FROM `guest`, `rooms` WHERE `roomno` = '"+secondPart+"' && guest.id = rooms.id HAVING `booked` = 0";
         list = display.displayGuestTable(sql);
         Object[] row = new Object[9];
         row [0] = list.get(0).getId();
         row [1] = list.get(0).getTitle();
         row [2] = list.get(0).getfName();
         row [3] = list.get(0).getsName();
         row [4] = list.get(0).getAddress();
         row [5] = list.get(0).getPhoneNo();
         row [6] = list.get(0).getEmailAddress();
         row [7] = list.get(0).getCheckIn();
         row [8] = list.get(0).getCheckOut();
         model2.addRow(row);
         list.clear();
         }
         catch(Exception e){
         System.out.print(e.getMessage());
         }    
    }                                       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        roomNumber = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        timeStamp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable();
        canelBooking = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        guestTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setTitle("Booking");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(34, 104, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bookings");

        roomNumber.setFont(new java.awt.Font("Simplified Arabic", 0, 20)); // NOI18N
        roomNumber.setForeground(new java.awt.Color(255, 255, 255));

        timeStamp.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        timeStamp.setForeground(new java.awt.Color(255, 255, 255));
        timeStamp.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pen_32px_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 421, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(timeStamp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(timeStamp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bookingTable.setBackground(new java.awt.Color(102, 153, 255));
        bookingTable.setFont(new java.awt.Font("Gulim", 0, 13)); // NOI18N
        bookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Guest Id", "Title", "First Name", "Surname", "Address", "Phone No.", "Email", "Check-In", "Check-Out"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookingTable.setToolTipText("List of all the bookings for this room");
        bookingTable.setGridColor(new java.awt.Color(0, 51, 153));
        bookingTable.setSelectionBackground(new java.awt.Color(153, 255, 153));
        jScrollPane2.setViewportView(bookingTable);

        canelBooking.setForeground(new java.awt.Color(153, 0, 0));
        canelBooking.setMnemonic('c');
        canelBooking.setText("Cancel Booking");
        canelBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canelBookingActionPerformed(evt);
            }
        });

        guestTable.setBackground(new java.awt.Color(255, 204, 204));
        guestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Guest Id", "Title", "First Name", "Surname", "Address", "Phone No.", "Email", "Check-In", "Check-Out"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        guestTable.setToolTipText("List of all the bookings for this room");
        guestTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        guestTable.setAutoscrolls(false);
        guestTable.setGridColor(new java.awt.Color(0, 51, 153));
        guestTable.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jScrollPane3.setViewportView(guestTable);
        if (guestTable.getColumnModel().getColumnCount() > 0) {
            guestTable.getColumnModel().getColumn(8).setMinWidth(95);
            guestTable.getColumnModel().getColumn(8).setPreferredWidth(95);
        }

        jLabel3.setText("Current Guest:");

        jSeparator2.setForeground(new java.awt.Color(0, 102, 153));

        jLabel4.setText("Bookings:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(canelBooking)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(canelBooking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void canelBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canelBookingActionPerformed
        // TODO add your handling code here:
        RemoveGuest remove = new RemoveGuest();
        int row;
        String value;
        // Get the guest number when user clicks on row
        if(guestTable.isRowSelected(0)){
             row = guestTable.getSelectedRow();
             value = guestTable.getModel().getValueAt(row, 0).toString();
        }
        else{
             row = bookingTable.getSelectedRow();
             value = bookingTable.getModel().getValueAt(row, 0).toString();
        }
        
        System.out.println("ROW:"+row);
        //String value = bookingTable.getModel().getValueAt(row, 0).toString();
        String sql = "DELETE FROM `guest` WHERE id = '"+value+"'";
        int x = JOptionPane.showConfirmDialog(null, "Are you sure you wish to remove this booking?\n"
                + "Guest Number:"
                + value, "Cancel booking", JOptionPane.OK_CANCEL_OPTION);
        System.out.print("Selceted:: "+x);
        
        // If user selected OK,remove guest.
        if(x == 0){
            try{
                remove.removeGuest(sql);
               }
            catch(Exception e){
                System.out.print(e.getMessage());
                }
        }   
        // Update table by clearing and getting updated entries
       
         DefaultTableModel dm = (DefaultTableModel) bookingTable.getModel();
         DefaultTableModel dm2 = (DefaultTableModel) guestTable.getModel();
         dm.setRowCount(0);
         dm2.setRowCount(0);
         while(dm.getRowCount() > 0)
         {
                dm.removeRow(0);
         }
         System.out.println("Row count guest:"+dm2.getRowCount());
         while(dm2.getRowCount() > 0)
         {
                dm2.removeRow(0);
         }
         repaint();
         displayRoomTable();
    }//GEN-LAST:event_canelBookingActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable bookingTable;
    private javax.swing.JButton canelBooking;
    private static javax.swing.JTable guestTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel roomNumber;
    private javax.swing.JLabel timeStamp;
    // End of variables declaration//GEN-END:variables
}
