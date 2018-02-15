/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.gui;
import ie.lyit.database.Connect;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ie.lyit.database.*;
import ie.lyit.users.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jim
 */
public class MainFrame extends javax.swing.JFrame {

    // Variables
    int xMouse;
    int yMouse;
    double xScreen;
    double yScreen;
    static boolean flag2 = true;
    boolean fetched = false;
    
    //Instances
    Connect conn = new Connect();
    ScreenSize screen = new ScreenSize();
    CheckStatus thread1 = new CheckStatus();
    Receptionist rep = new Receptionist();
    GuestId id = new GuestId();
    DisplayTables display = new DisplayTables();
 
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        
        // Set image on taskbar
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/TaskBar_104px.png")));
        thread1.start();
        initComponents();  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        cardGroup = new javax.swing.ButtonGroup();
        sideBar = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        checkPanel = new javax.swing.JPanel();
        checkInLabel = new javax.swing.JLabel();
        checkInIcon = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();
        searchLabel = new javax.swing.JLabel();
        searchIcon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lotusText = new javax.swing.JLabel();
        checkOutPanel = new javax.swing.JPanel();
        checkOutLab = new javax.swing.JLabel();
        checkOutIcon1 = new javax.swing.JLabel();
        quitPanel = new javax.swing.JPanel();
        searchLabel1 = new javax.swing.JLabel();
        searchIcon1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        banner = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        bannerTitle = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        topPanel = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        dragBar = new javax.swing.JLabel();
        maxi = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        dbStatus = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        serverTime = new javax.swing.JLabel();
        layerPane = new javax.swing.JLayeredPane();
        checkinScreen = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        roomText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        room200 = new javax.swing.JButton();
        room201 = new javax.swing.JButton();
        room202 = new javax.swing.JButton();
        room203 = new javax.swing.JButton();
        room204 = new javax.swing.JButton();
        room206 = new javax.swing.JButton();
        room207 = new javax.swing.JButton();
        room205 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        fName = new javax.swing.JTextField();
        sName = new javax.swing.JTextField();
        title = new javax.swing.JComboBox<>();
        titleLabel = new javax.swing.JLabel();
        fNameLablel = new javax.swing.JLabel();
        sNameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        checkInDate = new com.toedter.calendar.JDateChooser();
        checkOutDate = new com.toedter.calendar.JDateChooser();
        guestNo = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        checkInButt = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        bookButt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        phoneLabel = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSpinner3 = new javax.swing.JSpinner();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton16 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        masterRad = new javax.swing.JRadioButton();
        visaRad = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        americanRad = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        serverTest = new javax.swing.JButton();
        homeScreen = new javax.swing.JPanel();
        dataTabPane = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        guestTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        currentGuest = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        sqlTest = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        searchScreen = new javax.swing.JPanel();
        searchGuest = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jTextField21 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        searchRoom = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jButton15 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1255, 747));

        sideBar.setBackground(new java.awt.Color(34, 104, 153));
        sideBar.setPreferredSize(new java.awt.Dimension(200, 550));

        homePanel.setBackground(new java.awt.Color(34, 104, 153));
        homePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                homePanelMouseMoved(evt);
            }
        });
        homePanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                homePanelFocusLost(evt);
            }
        });
        homePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanelMouseClicked(evt);
            }
        });

        homeLabel.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeLabel.setText("Home");
        homeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home_42px.png"))); // NOI18N

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        checkPanel.setBackground(new java.awt.Color(34, 104, 153));
        checkPanel.setPreferredSize(new java.awt.Dimension(175, 74));
        checkPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                checkPanelMouseMoved(evt);
            }
        });
        checkPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkPanelMouseClicked(evt);
            }
        });

        checkInLabel.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        checkInLabel.setForeground(new java.awt.Color(255, 255, 255));
        checkInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkInLabel.setText("Check In");
        checkInLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        checkInIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Check Book_32px.png"))); // NOI18N

        javax.swing.GroupLayout checkPanelLayout = new javax.swing.GroupLayout(checkPanel);
        checkPanel.setLayout(checkPanelLayout);
        checkPanelLayout.setHorizontalGroup(
            checkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkInIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(checkInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        checkPanelLayout.setVerticalGroup(
            checkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(checkPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(checkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkInIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        searchPanel.setBackground(new java.awt.Color(34, 104, 153));
        searchPanel.setPreferredSize(new java.awt.Dimension(175, 74));
        searchPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                searchPanelMouseMoved(evt);
            }
        });
        searchPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchPanelMouseClicked(evt);
            }
        });

        searchLabel.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchLabel.setText("Search");
        searchLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search_32px.png"))); // NOI18N

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchLabel)
                .addGap(34, 34, 34))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(searchIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
            .addComponent(searchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_100px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Gisha", 2, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hotel Management");

        lotusText.setFont(new java.awt.Font("Gisha", 2, 21)); // NOI18N
        lotusText.setForeground(new java.awt.Color(255, 255, 255));
        lotusText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lotusText.setText("Lotus");

        checkOutPanel.setBackground(new java.awt.Color(34, 104, 153));
        checkOutPanel.setPreferredSize(new java.awt.Dimension(175, 74));
        checkOutPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                checkOutPanelMouseMoved(evt);
            }
        });
        checkOutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkOutPanelMouseClicked(evt);
            }
        });

        checkOutLab.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        checkOutLab.setForeground(new java.awt.Color(255, 255, 255));
        checkOutLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkOutLab.setText("Check Out");
        checkOutLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        checkOutIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Check Book_32px.png"))); // NOI18N

        javax.swing.GroupLayout checkOutPanelLayout = new javax.swing.GroupLayout(checkOutPanel);
        checkOutPanel.setLayout(checkOutPanelLayout);
        checkOutPanelLayout.setHorizontalGroup(
            checkOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkOutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkOutIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkOutLab)
                .addGap(20, 20, 20))
        );
        checkOutPanelLayout.setVerticalGroup(
            checkOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkOutPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(checkOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkOutIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkOutLab, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        quitPanel.setBackground(new java.awt.Color(34, 104, 153));
        quitPanel.setPreferredSize(new java.awt.Dimension(175, 74));
        quitPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                quitPanelMouseMoved(evt);
            }
        });
        quitPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitPanelMouseClicked(evt);
            }
        });

        searchLabel1.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        searchLabel1.setForeground(new java.awt.Color(255, 255, 255));
        searchLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchLabel1.setText("Quit");
        searchLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        searchIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Door_32px.png"))); // NOI18N

        javax.swing.GroupLayout quitPanelLayout = new javax.swing.GroupLayout(quitPanel);
        quitPanel.setLayout(quitPanelLayout);
        quitPanelLayout.setHorizontalGroup(
            quitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchLabel1)
                .addGap(34, 34, 34))
        );
        quitPanelLayout.setVerticalGroup(
            quitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quitPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(searchIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
            .addComponent(searchLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(checkPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(checkOutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addComponent(quitPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(sideBarLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lotusText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lotusText)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(checkOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(quitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        banner.setBackground(new java.awt.Color(255, 255, 255));
        banner.setPreferredSize(new java.awt.Dimension(900, 167));
        banner.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bannerMouseMoved(evt);
            }
        });

        jSeparator8.setPreferredSize(new java.awt.Dimension(500, 10));

        jSeparator7.setPreferredSize(new java.awt.Dimension(500, 10));

        bannerTitle.setFont(new java.awt.Font("Dotum", 1, 48)); // NOI18N
        bannerTitle.setForeground(new java.awt.Color(255, 255, 255));
        bannerTitle.setText("Home");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner2.jpg"))); // NOI18N
        jLabel13.setMaximumSize(new java.awt.Dimension(1180, 170));

        javax.swing.GroupLayout bannerLayout = new javax.swing.GroupLayout(banner);
        banner.setLayout(bannerLayout);
        bannerLayout.setHorizontalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bannerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bannerLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        bannerLayout.setVerticalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(bannerTitle))
            .addGroup(bannerLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bannerLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        topPanel.setBackground(new java.awt.Color(255, 255, 255));

        close.setBackground(new java.awt.Color(255, 204, 204));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Multiply_36px.png"))); // NOI18N
        close.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                closeMouseMoved(evt);
            }
        });
        close.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                closeFocusLost(evt);
            }
        });
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        mini.setBackground(new java.awt.Color(204, 215, 228));
        mini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Minimize Window_32px.png"))); // NOI18N
        mini.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                miniMouseMoved(evt);
            }
        });
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });

        dragBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragBarMouseDragged(evt);
            }
        });
        dragBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragBarMousePressed(evt);
            }
        });

        maxi.setBackground(new java.awt.Color(204, 215, 228));
        maxi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maxi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Full Screen_28px.png"))); // NOI18N
        maxi.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        maxi.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                maxiMouseMoved(evt);
            }
        });
        maxi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                maxiMousePressed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dragBar, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mini, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(maxi, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dragBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(maxi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        footer.setBackground(new java.awt.Color(255, 255, 255));
        footer.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel7.setText("Server Status:");

        dbStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Filled Circle_Red_16px.png"))); // NOI18N
        dbStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dbStatusMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel9.setText("Lotus Hotel Management v0.6");

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 534, Short.MAX_VALUE)
                .addComponent(serverTime, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dbStatus))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dbStatus)
                    .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9)
                        .addComponent(serverTime, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1))
        );

        layerPane.setBackground(new java.awt.Color(255, 255, 255));
        layerPane.setDoubleBuffered(true);

        checkinScreen.setBackground(new java.awt.Color(255, 255, 255));
        checkinScreen.setPreferredSize(new java.awt.Dimension(968, 406));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Room Information"));

        jLabel14.setText("Room Number:");

        roomText.setText("201");

        jLabel16.setText("Adults:");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jLabel17.setText("Children:");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jTabbedPane1.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Single Rooms"));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        room200.setBackground(new java.awt.Color(255, 204, 204));
        room200.setLabel("200");
        room200.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                room200MouseMoved(evt);
            }
        });
        room200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room200ActionPerformed(evt);
            }
        });
        jPanel2.add(room200, new java.awt.GridBagConstraints());

        room201.setBackground(new java.awt.Color(102, 153, 255));
        room201.setLabel("201");
        room201.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                room201MouseMoved(evt);
            }
        });
        jPanel2.add(room201, new java.awt.GridBagConstraints());

        room202.setBackground(new java.awt.Color(153, 255, 153));
        room202.setLabel("202");
        room202.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                room202MouseMoved(evt);
            }
        });
        room202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room202ActionPerformed(evt);
            }
        });
        jPanel2.add(room202, new java.awt.GridBagConstraints());

        room203.setBackground(new java.awt.Color(153, 255, 153));
        room203.setLabel("203");
        room203.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room203ActionPerformed(evt);
            }
        });
        jPanel2.add(room203, new java.awt.GridBagConstraints());

        room204.setBackground(new java.awt.Color(153, 255, 153));
        room204.setLabel("204");
        room204.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                room204MouseMoved(evt);
            }
        });
        room204.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room204ActionPerformed(evt);
            }
        });
        jPanel2.add(room204, new java.awt.GridBagConstraints());

        room206.setBackground(new java.awt.Color(153, 255, 153));
        room206.setLabel("206");
        room206.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                room206MouseMoved(evt);
            }
        });
        room206.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room206ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel2.add(room206, gridBagConstraints);

        room207.setBackground(new java.awt.Color(153, 255, 153));
        room207.setLabel("207");
        room207.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                room207MouseMoved(evt);
            }
        });
        room207.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room207ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel2.add(room207, gridBagConstraints);

        room205.setBackground(new java.awt.Color(153, 255, 153));
        room205.setLabel("205");
        room205.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                room205MouseMoved(evt);
            }
        });
        room205.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room205ActionPerformed(evt);
            }
        });
        jPanel2.add(room205, new java.awt.GridBagConstraints());

        jTabbedPane1.addTab("Single", jPanel2);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Double Rooms"));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jButton21.setBackground(new java.awt.Color(255, 204, 204));
        jButton21.setLabel("201");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton21, new java.awt.GridBagConstraints());

        jButton22.setBackground(new java.awt.Color(102, 153, 255));
        jButton22.setLabel("200");
        jPanel5.add(jButton22, new java.awt.GridBagConstraints());

        jButton23.setBackground(new java.awt.Color(153, 255, 153));
        jButton23.setLabel("201");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton23, new java.awt.GridBagConstraints());

        jButton24.setBackground(new java.awt.Color(153, 255, 153));
        jButton24.setLabel("200");
        jPanel5.add(jButton24, new java.awt.GridBagConstraints());

        jButton25.setBackground(new java.awt.Color(153, 255, 153));
        jButton25.setLabel("201");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton25, new java.awt.GridBagConstraints());

        jButton26.setBackground(new java.awt.Color(153, 255, 153));
        jButton26.setLabel("200");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel5.add(jButton26, gridBagConstraints);

        jTabbedPane1.addTab("Double", jPanel5);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Executive", jPanel7);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Bridal", jPanel14);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Function", jPanel15);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Checkmark_16px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(roomText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(316, 316, 316))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(roomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Guest Details"));

        title.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr\t", "Mrs", "Miss", "Dr", "Ms" }));

        titleLabel.setText("Title:");

        fNameLablel.setText("First Name:");

        sNameLabel.setText("Surname:");

        addressLabel.setText("Address:");

        jLabel27.setText("Check-In:");

        jLabel28.setText("Check-Out:");

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        checkInDate.setDateFormatString("yyyy-MM-dd");

        checkOutDate.setDateFormatString("yyyy-MM-dd");

        guestNo.setText("Guest No*:");

        jTextField6.setEditable(false);

        checkInButt.setText("Check-In");
        checkInButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInButtActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        bookButt.setText("Book");
        bookButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtActionPerformed(evt);
            }
        });

        jLabel1.setText("Payment Type:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit Card", " ", " " }));

        phoneLabel.setText("Phone:");

        emailLabel.setText("Email:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkOutDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkInDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, 118, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator4)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(clearButton)
                .addGap(94, 94, 94)
                .addComponent(bookButt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkInButt)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameLablel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(guestNo))
                    .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING, 0, 120, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guestNo)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLabel)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fNameLablel)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sNameLabel)
                    .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(checkInDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(bookButt)
                    .addComponent(checkInButt)))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Billing Information"));

        jLabel21.setText("Room Type:");

        jButton2.setLabel("Total");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single\t", "Double", "Bridal Suite", "Executive" }));

        jLabel11.setText("Extras:");

        jLabel15.setText("Drinks:");

        jLabel29.setText("Food:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jButton16.setText("Clear");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField8)
                                    .addComponent(jTextField9)
                                    .addComponent(jTextField10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton16)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Packages & Addons"));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Spa Weekend");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Valentines");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Summer Deal");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Bank Holiday");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Spring Break");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("Function Room");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox6)
                .addGap(2, 2, 2)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(202, 229, 250));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Credit / Debit Card"));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "First Name", "Surname", "Card Number", "Expiry", "Cvc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(170);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(3);
        }

        jButton1.setText("Clear");

        jButton11.setText("Add");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MasterCard_28px.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Visa_28px.png"))); // NOI18N

        jLabel10.setText("Master Card:");

        jLabel20.setText("Visa:");

        masterRad.setBackground(new java.awt.Color(202, 229, 250));
        cardGroup.add(masterRad);

        visaRad.setBackground(new java.awt.Color(202, 229, 250));
        cardGroup.add(visaRad);

        jLabel23.setText("American Express:");

        americanRad.setBackground(new java.awt.Color(202, 229, 250));
        cardGroup.add(americanRad);
        americanRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                americanRadActionPerformed(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/American Express_28px.png"))); // NOI18N

        serverTest.setLabel("Server Test");
        serverTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(masterRad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visaRad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(americanRad)
                .addGap(47, 47, 47)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(serverTest))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(visaRad)
                            .addComponent(jLabel23)
                            .addComponent(jLabel25)
                            .addComponent(americanRad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton11)
                            .addComponent(jButton1)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(masterRad)))
                            .addComponent(jLabel20))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(serverTest, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout checkinScreenLayout = new javax.swing.GroupLayout(checkinScreen);
        checkinScreen.setLayout(checkinScreenLayout);
        checkinScreenLayout.setHorizontalGroup(
            checkinScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkinScreenLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(checkinScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(checkinScreenLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(checkinScreenLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 18, Short.MAX_VALUE))
        );
        checkinScreenLayout.setVerticalGroup(
            checkinScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(checkinScreenLayout.createSequentialGroup()
                .addGroup(checkinScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(checkinScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        homeScreen.setBackground(new java.awt.Color(255, 255, 255));
        homeScreen.setForeground(new java.awt.Color(102, 255, 102));
        homeScreen.setFocusable(false);
        homeScreen.setPreferredSize(new java.awt.Dimension(964, 406));

        dataTabPane.setFocusable(false);
        dataTabPane.setRequestFocusEnabled(false);

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
                false, false, false, false, false, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(guestTable);
        if (guestTable.getColumnModel().getColumnCount() > 0) {
            guestTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            guestTable.getColumnModel().getColumn(0).setMaxWidth(70);
            guestTable.getColumnModel().getColumn(1).setMinWidth(50);
            guestTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            guestTable.getColumnModel().getColumn(1).setMaxWidth(40);
        }

        jButton3.setLabel("Edit");

        jButton4.setLabel("Delete");

        jButton10.setLabel("Add");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addGap(0, 866, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton10)))
        );

        dataTabPane.addTab("Guests", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1057, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        dataTabPane.addTab("Rooms", jPanel9);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1057, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        dataTabPane.addTab("Booked", jPanel10);

        currentGuest.setBackground(new java.awt.Color(255, 255, 255));
        currentGuest.setBorder(javax.swing.BorderFactory.createTitledBorder("Current Guests"));

        jLabel4.setText("Total Adults:");

        jLabel8.setText("Total Children:");

        jLabel19.setText("Reservations:");

        javax.swing.GroupLayout currentGuestLayout = new javax.swing.GroupLayout(currentGuest);
        currentGuest.setLayout(currentGuestLayout);
        currentGuestLayout.setHorizontalGroup(
            currentGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentGuestLayout.createSequentialGroup()
                .addGroup(currentGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(currentGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        currentGuestLayout.setVerticalGroup(
            currentGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentGuestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(currentGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(currentGuestLayout.createSequentialGroup()
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(currentGuestLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Rooms Free"));

        jLabel30.setText("Single:");

        jLabel31.setText("Doubles:");

        jLabel32.setText("Executive:");

        jLabel33.setText("Total Free Rooms:");

        jLabel34.setText("Bridal:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel34))
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        jPanel12.setBackground(new java.awt.Color(153, 204, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("De-bugging & Testing Only"));

        sqlTest.setText("Test SQL Entries");
        sqlTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqlTestActionPerformed(evt);
            }
        });

        jButton13.setText("Clear Table");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sqlTest)
                    .addComponent(jButton13))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sqlTest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout homeScreenLayout = new javax.swing.GroupLayout(homeScreen);
        homeScreen.setLayout(homeScreenLayout);
        homeScreenLayout.setHorizontalGroup(
            homeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataTabPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
                    .addGroup(homeScreenLayout.createSequentialGroup()
                        .addComponent(currentGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        homeScreenLayout.setVerticalGroup(
            homeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeScreenLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(homeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(currentGuest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dataTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        searchScreen.setBackground(new java.awt.Color(255, 255, 255));
        searchScreen.setPreferredSize(new java.awt.Dimension(964, 406));

        searchGuest.setBackground(new java.awt.Color(255, 255, 255));
        searchGuest.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Guest"));
        searchGuest.setPreferredSize(new java.awt.Dimension(495, 320));

        jLabel12.setText("Guest Name");

        jLabel22.setText("Room No:");

        jLabel24.setText("First Name:");

        jLabel26.setText("Phone:");

        jLabel35.setText("ID:");

        jLabel36.setText("Surname:");

        jLabel37.setText("Email:");

        jTextField3.setEditable(false);

        jTextField5.setEditable(false);

        jTextField11.setEditable(false);

        jTextField14.setEditable(false);

        jTextField21.setEditable(false);

        jButton14.setText("Find Guest");

        jTextField2.setEditable(false);

        jLabel39.setText("Address:");

        jTextField22.setEditable(false);

        jLabel38.setText("Checked-In:");

        jLabel40.setText("Room Type:");

        jLabel41.setText("No. of Guest:");

        jTextField4.setEditable(false);

        jTextField23.setEditable(false);

        jTextField24.setEditable(false);

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete_16px.png"))); // NOI18N

        javax.swing.GroupLayout searchGuestLayout = new javax.swing.GroupLayout(searchGuest);
        searchGuest.setLayout(searchGuestLayout);
        searchGuestLayout.setHorizontalGroup(
            searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchGuestLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchGuestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchGuestLayout.createSequentialGroup()
                        .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(searchGuestLayout.createSequentialGroup()
                                    .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel39)
                                        .addComponent(jLabel26))
                                    .addGap(22, 22, 22))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchGuestLayout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(searchGuestLayout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField22, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField21)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel35)
                            .addComponent(jLabel37)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );

        searchGuestLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField14, jTextField21, jTextField3});

        searchGuestLayout.setVerticalGroup(
            searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchGuestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchGuestLayout.createSequentialGroup()
                        .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addGap(10, 10, 10)
                        .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel41)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        searchRoom.setBackground(new java.awt.Color(255, 255, 255));
        searchRoom.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Room"));
        searchRoom.setPreferredSize(new java.awt.Dimension(495, 320));

        jLabel42.setText("Room No.");

        jButton15.setText("Search Room");

        jLabel43.setText("Availability:");

        jTextField26.setEditable(false);

        jLabel44.setText("Type:");

        jTextField27.setEditable(false);

        jLabel45.setText("Cost/Night:");

        jTextField28.setEditable(false);

        jLabel46.setText("Available From:");

        jTextField29.setEditable(false);

        jLabel47.setText("Booked Under:");

        jTextField30.setEditable(false);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete_16px.png"))); // NOI18N

        javax.swing.GroupLayout searchRoomLayout = new javax.swing.GroupLayout(searchRoom);
        searchRoom.setLayout(searchRoomLayout);
        searchRoomLayout.setHorizontalGroup(
            searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchRoomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator10)
                    .addGroup(searchRoomLayout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchRoomLayout.createSequentialGroup()
                        .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel47))
                        .addGap(27, 27, 27)
                        .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel44))
                        .addGap(10, 10, 10)
                        .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField28, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jTextField27)))
                    .addGroup(searchRoomLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        searchRoomLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField26, jTextField30});

        searchRoomLayout.setVerticalGroup(
            searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchRoomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel42)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout searchScreenLayout = new javax.swing.GroupLayout(searchScreen);
        searchScreen.setLayout(searchScreenLayout);
        searchScreenLayout.setHorizontalGroup(
            searchScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchScreenLayout.setVerticalGroup(
            searchScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchRoom, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                    .addComponent(searchGuest, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layerPane.setLayer(checkinScreen, javax.swing.JLayeredPane.POPUP_LAYER);
        layerPane.setLayer(homeScreen, javax.swing.JLayeredPane.DRAG_LAYER);
        layerPane.setLayer(searchScreen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layerPaneLayout = new javax.swing.GroupLayout(layerPane);
        layerPane.setLayout(layerPaneLayout);
        layerPaneLayout.setHorizontalGroup(
            layerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
            .addGroup(layerPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkinScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE))
            .addComponent(homeScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
        );
        layerPaneLayout.setVerticalGroup(
            layerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkinScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
            .addComponent(homeScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
            .addComponent(searchScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(layerPane)
                    .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(banner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
                    .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(layerPane)
                .addGap(2, 2, 2)
                .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dragBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragBarMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - (xMouse+200), y - yMouse);
    }//GEN-LAST:event_dragBarMouseDragged
    
    private void dragBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragBarMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragBarMousePressed

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        // TODO add your handling code here:
        setState(ICONIFIED);
       
    }//GEN-LAST:event_miniMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        thread1.interrupt();
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void searchPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchPanelMouseMoved
        // TODO add your handling code here:
        homePanel.setBackground(new java.awt.Color(34,104,153));
        checkPanel.setBackground(new java.awt.Color(34,104,153));
         quitPanel.setBackground(new java.awt.Color(34,104,153));
        searchPanel.setBackground(new java.awt.Color(84,140,196));
        checkOutPanel.setBackground(new java.awt.Color(34,104,153));
    }//GEN-LAST:event_searchPanelMouseMoved

    private void checkPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkPanelMouseMoved
        // TODO add your handling code here:
        homePanel.setBackground(new java.awt.Color(34,104,153));
        checkPanel.setBackground(new java.awt.Color(84,140,196));
        searchPanel.setBackground(new java.awt.Color(34,104,153));
         quitPanel.setBackground(new java.awt.Color(34,104,153));
        checkOutPanel.setBackground(new java.awt.Color(34,104,153));
        
    }//GEN-LAST:event_checkPanelMouseMoved

    private void homePanelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_homePanelFocusLost
        // TODO add your handling code here:
        homePanel.setBackground(new java.awt.Color(153, 53, 200));
    }//GEN-LAST:event_homePanelFocusLost

    private void homePanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseMoved
        // TODO add your handling code here:
        homePanel.setBackground(new java.awt.Color(84,140,196));
        checkPanel.setBackground(new java.awt.Color(34,104,153));
        searchPanel.setBackground(new java.awt.Color(34,104,153));
         quitPanel.setBackground(new java.awt.Color(34,104,153));
         checkOutPanel.setBackground(new java.awt.Color(34,104,153));

    }//GEN-LAST:event_homePanelMouseMoved

    private void homePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseClicked
        // TODO add your handling code here:
        checkinScreen.setVisible(false);
        homeScreen.setVisible(true);
        dataTabPane.setVisible(true);
        currentGuest.setVisible(true);
        bannerTitle.setText("Home");
        searchScreen.setVisible(false);
    }//GEN-LAST:event_homePanelMouseClicked

    private void checkPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkPanelMouseClicked
        // TODO add your handling code here:
        
        // update id on checkin screen
         updateGuestId();
         checkinScreen.setVisible(true);
         searchScreen.setVisible(false);
         homeScreen.setVisible(false);
         dataTabPane.setVisible(false);
         currentGuest.setVisible(false);
         bannerTitle.setText("Check-In");
         //searchScreen.setVisible(false);
    }//GEN-LAST:event_checkPanelMouseClicked

    private void searchPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchPanelMouseClicked
        // TODO add your handling code here:
         checkinScreen.setVisible(false);
         homeScreen.setVisible(false);
         searchScreen.setVisible(true);
         bannerTitle.setText("Search");
    }//GEN-LAST:event_searchPanelMouseClicked

    private void room200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room200ActionPerformed
        // TODO add your handling code here:
        roomText.setText("200");
    }//GEN-LAST:event_room200ActionPerformed

    private void room202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room202ActionPerformed
        // TODO add your handling code here:
        roomText.setText("202");
        
    }//GEN-LAST:event_room202ActionPerformed

    private void room204ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room204ActionPerformed
        // TODO add your handling code here:
        roomText.setText("204");
    }//GEN-LAST:event_room204ActionPerformed

    private void room207ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room207ActionPerformed
        // TODO add your handling code here:
        roomText.setText("207");
    }//GEN-LAST:event_room207ActionPerformed

    private void room206ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room206ActionPerformed
        // TODO add your handling code here:
        roomText.setText("206");
    }//GEN-LAST:event_room206ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void serverTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverTestActionPerformed
        // TODO add your handling code here:
        try{
        conn.connectToHotel();
        }
        catch(Exception exc){
        System.out.print("\nError opening connection...");
        
        }
        finally{
        if(conn.getStatus() == true){
        dbStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Filled Circle_Green_16px.png")));
        JOptionPane.showMessageDialog(null, "Server up and running...", "Connected", JOptionPane.INFORMATION_MESSAGE);
        checkInButt.setEnabled(true);
        }
        else if(conn.getStatus() == false){
            
            checkInButt.setEnabled(false);
            dbStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Filled Circle_Red_16px.png")));
            JOptionPane.showMessageDialog(null, "Error connecting to database..is Xammp running??\n\n1:Database SQL file is uploaded to LYIT mail,go import it to Xammp"
                    +"\n2:Check SQL driver is loaded to libraries(Right click the libraries package in project explorer(left side)& add JAR file)..I included the JAR in lib folder" 
                    +"\nEmail me if your still stuck. ~ J.Fallon "
                    +"\n\nDefault logins:\nUser: root\nPassword: password", "Connection Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_serverTestActionPerformed

    private void checkOutPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkOutPanelMouseMoved
        // TODO add your handling code here:
         homePanel.setBackground(new java.awt.Color(34,104,153));
         checkPanel.setBackground(new java.awt.Color(34,104,153));
         searchPanel.setBackground(new java.awt.Color(34,104,153));
         quitPanel.setBackground(new java.awt.Color(34,104,153));
         checkOutPanel.setBackground(new java.awt.Color(84,140,196));
         
    }//GEN-LAST:event_checkOutPanelMouseMoved

    private void checkOutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkOutPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_checkOutPanelMouseClicked

    private void americanRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_americanRadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_americanRadActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void maxiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxiMousePressed
        // TODO add your handling code here:
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        layerPane.setSize(screenSize.width, screenSize.height);
        setExtendedState(MainFrame.MAXIMIZED_BOTH);
        
        setResizable(false);
        System.out.print("Screen Test");
        repaint();
       
    }//GEN-LAST:event_maxiMousePressed

    private void quitPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitPanelMouseMoved
        // TODO add your handling code here:
         homePanel.setBackground(new java.awt.Color(34,104,153));
         checkPanel.setBackground(new java.awt.Color(34,104,153));
         searchPanel.setBackground(new java.awt.Color(34,104,153));
         checkOutPanel.setBackground(new java.awt.Color(34,104,153));
         quitPanel.setBackground(new java.awt.Color(84,140,196));
    }//GEN-LAST:event_quitPanelMouseMoved

    private void quitPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitPanelMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_quitPanelMouseClicked

    private void closeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseMoved
        // TODO add your handling code here:
        close.setOpaque(true);
        maxi.setOpaque(false);
        mini.setOpaque(false);
        repaint();
    }//GEN-LAST:event_closeMouseMoved

    private void closeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_closeFocusLost
        // TODO add your handling code here:
       // close.setOpaque(false);
    }//GEN-LAST:event_closeFocusLost

    private void maxiMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxiMouseMoved
        // TODO add your handling code here:
        close.setOpaque(false);
        maxi.setOpaque(true);
        mini.setOpaque(false);
        repaint();
    }//GEN-LAST:event_maxiMouseMoved
    
    private void bannerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bannerMouseMoved
        // TODO add your handling code here:
        restartThread();
        close.setOpaque(false);
        maxi.setOpaque(false);
        mini.setOpaque(false);
        repaint();
    }//GEN-LAST:event_bannerMouseMoved

    private void miniMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseMoved
        // TODO add your handling code here:
        close.setOpaque(false);
        maxi.setOpaque(false);
        mini.setOpaque(true);
        repaint();
    }//GEN-LAST:event_miniMouseMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bookButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookButtActionPerformed

    private void checkInButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInButtActionPerformed
        // TODO add your handling code here: 
       
        // Check if fields are blank
        if(fName.getText().equals("") || sName.getText().equals("") || address.getText().equals("") || (checkInDate.getDate() == null)  || (checkOutDate.getDate() == null)){
            JOptionPane.showMessageDialog(null, "Fill in all fields", "Fills blank", JOptionPane.ERROR_MESSAGE);
        }
        else{  
            Guest checkIn = new Guest((String)title.getSelectedItem(),
            fName.getText(),sName.getText(),address.getText(),
            phone.getText(),email.getText(),checkInDate.getDate(),
            checkOutDate.getDate());
            int x = JOptionPane.showConfirmDialog(null, ("First Name: "+fName.getText()
                    +"\nSurname: "+sName.getText()
                    +"\nAddress: "+address.getText()
                    +"\nPhone: " +phone.getText()
                    +"\nEmail: "+email.getText()
                    +"\n\n-------------------------------\n"
                    +"\nCheck-In: "+checkInDate.getDate()
                    +"\nCheck-Out: "+checkOutDate.getDate()
                    +"\n\n" ), "Check & Confim Details", JOptionPane.OK_CANCEL_OPTION);
            System.out.print("OPTION:"+x);
            // If OK was selected...add guest to database
            if(x == 0){
                rep.addGuest(checkIn);
                JOptionPane.showMessageDialog(null, "Guest added", "Confirmed", JOptionPane.INFORMATION_MESSAGE);
                updateGuestId(); 
                clearGuestFields();
            }
         }              
    }//GEN-LAST:event_checkInButtActionPerformed
    
    private void sqlTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqlTestActionPerformed
        // TODO add your handling code here:
         ArrayList<Guest> list;
         DefaultTableModel model = (DefaultTableModel)guestTable.getModel();
         
         try{
         list = display.displayGuestTable();
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
         sqlTest.setEnabled(false);
    }//GEN-LAST:event_sqlTestActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        clearGuestFields();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dm = (DefaultTableModel) guestTable.getModel();
        while(dm.getRowCount() > 0)
        {
                dm.removeRow(0);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void dbStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbStatusMouseClicked
        // TODO add your handling code here:
        if(thread1.getStatus() || !flag2 ){
        JOptionPane.showMessageDialog(null, "Database: "+thread1.getDatabase(), "Connections:", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(flag2){
         JOptionPane.showMessageDialog(null, "No connection!", "Connections:", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_dbStatusMouseClicked

    private void room200MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_room200MouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_room200MouseMoved

    private void room201MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_room201MouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_room201MouseMoved

    private void room202MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_room202MouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_room202MouseMoved

    private void room204MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_room204MouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_room204MouseMoved

    private void room205MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_room205MouseMoved
        // TODO add your handling code here:
       
    }//GEN-LAST:event_room205MouseMoved

    private void room206MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_room206MouseMoved
        // TODO add your handling code here:
       
    }//GEN-LAST:event_room206MouseMoved

    private void room207MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_room207MouseMoved
        // TODO add your handling code here:
      
    }//GEN-LAST:event_room207MouseMoved

    private void room205ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room205ActionPerformed
        // TODO add your handling code here:
        roomText.setText("205");
        int x = rep.checkRoomStatus(205);
        setRoomButtonColor(x,room205);
    }//GEN-LAST:event_room205ActionPerformed

    private void room203ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room203ActionPerformed
        // TODO add your handling code here:
        int x = rep.checkRoomStatus(202);
        setRoomButtonColor(x,room203);
    }//GEN-LAST:event_room203ActionPerformed

    public void setColor(javax.swing.JPanel panel){
        panel.setBackground(new java.awt.Color(153, 53, 200));
    }
    public void resetColor(javax.swing.JPanel panel){
        panel.setBackground(new java.awt.Color(67,73,159));
    }
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Custom Class methods
    // Author J.Fallon
    // Custom class methods
    public void clearGuestFields(){
     fName.setText("");
     sName.setText("");
     address.setText("");
     phone.setText("");
     email.setText("");
     checkInDate.setDate(null);
     checkOutDate.setDate(null);
    }
    // Start a new thread to ping server if thread is dead
    public void restartThread(){
        if(!thread1.isAlive() && flag2){
        CheckStatus thread1 = new CheckStatus();
        thread1.start();
        flag2 = false;
        }
    }
    public void updateGuestId(){
    
        try{
        boolean failed = id.getGuestId();
        
        // If server offline....disable Check-In button
            if(failed){
            checkInButt.setEnabled(false);
            }
            else if(!failed){
            checkInButt.setEnabled(true);
            }
        
        jTextField6.setText(""+id.getId());
        }
        catch(Exception e){
        System.out.print("Error updating id..");
        }
    }
    public void setRoomButtonColor(int x,javax.swing.JButton but){
    
        switch (x) {
            case 1:
                but.setBackground(Color.BLUE);
                break;
            case 2:
                but.setBackground(Color.GREEN);
                break;
            case 3:
                but.setBackground(Color.pink);
                break;
            default:
                break;
        }
    }
    public static void setStatus(boolean flag){
    if(flag){
        dbStatus.setIcon(new javax.swing.ImageIcon(MainFrame.class.getResource("/images/Filled Circle_Green_16px.png")));
         checkInButt.setEnabled(true);
        }
    else{
        dbStatus.setIcon(new javax.swing.ImageIcon(MainFrame.class.getResource("/images/Filled Circle_Red_16px.png")));
        checkInButt.setEnabled(false);
        flag2 = true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JRadioButton americanRad;
    private javax.swing.JPanel banner;
    private javax.swing.JLabel bannerTitle;
    private javax.swing.JButton bookButt;
    private javax.swing.ButtonGroup cardGroup;
    private static javax.swing.JButton checkInButt;
    private com.toedter.calendar.JDateChooser checkInDate;
    private javax.swing.JLabel checkInIcon;
    private javax.swing.JLabel checkInLabel;
    private com.toedter.calendar.JDateChooser checkOutDate;
    private javax.swing.JLabel checkOutIcon1;
    private javax.swing.JLabel checkOutLab;
    private javax.swing.JPanel checkOutPanel;
    private javax.swing.JPanel checkPanel;
    private javax.swing.JPanel checkinScreen;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel close;
    private javax.swing.JPanel currentGuest;
    private javax.swing.JTabbedPane dataTabPane;
    private static javax.swing.JLabel dbStatus;
    public void setStatus(){
        dbStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Filled Circle_Green_16px.png")));
    }
    private javax.swing.JLabel dragBar;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField fName;
    private javax.swing.JLabel fNameLablel;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel guestNo;
    private javax.swing.JTable guestTable;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel homeScreen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLayeredPane layerPane;
    private javax.swing.JLabel lotusText;
    private javax.swing.JRadioButton masterRad;
    private javax.swing.JLabel maxi;
    private javax.swing.JLabel mini;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JPanel quitPanel;
    private javax.swing.JButton room200;
    private javax.swing.JButton room201;
    private javax.swing.JButton room202;
    private javax.swing.JButton room203;
    private javax.swing.JButton room204;
    private javax.swing.JButton room205;
    private javax.swing.JButton room206;
    private javax.swing.JButton room207;
    private javax.swing.JTextField roomText;
    private javax.swing.JTextField sName;
    private javax.swing.JLabel sNameLabel;
    private javax.swing.JPanel searchGuest;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JLabel searchIcon1;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel searchLabel1;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JPanel searchRoom;
    private javax.swing.JPanel searchScreen;
    private javax.swing.JButton serverTest;
    private javax.swing.JLabel serverTime;
    private javax.swing.JPanel sideBar;
    private javax.swing.JButton sqlTest;
    private javax.swing.JComboBox<String> title;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JRadioButton visaRad;
    // End of variables declaration//GEN-END:variables
}