/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.gui;
import ie.lyit.threads.CheckStatus;
import ie.lyit.threads.RoomStatus;
import ie.lyit.database.Insertions;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ie.lyit.database.*;
import ie.lyit.hotel.Bill;
import ie.lyit.hotel.CreditCard;
import ie.lyit.hotel.Packages;
import ie.lyit.hotel.Rooms;
import ie.lyit.users.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.swing.JButton;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author Jim
 */
public class MainFrame extends javax.swing.JFrame {

    // Variables
    int xMouse;
    int yMouse;
    int test;
    long sT;
    long eT;
    long diffDays;
    static double totalPrice = 0.00;
    double xScreen;
    double yScreen;
    static boolean flag2 = true;
    boolean cardAdded = false;
    boolean fetched = false;
    boolean roomAvailable,roomBooked;
    ValidBooking valid;
    JLabel l;
     
    //Instances
    Insertions conn = new Insertions();
    ScreenSize screen = new ScreenSize();
    CheckStatus thread1 = new CheckStatus();
    Receptionist rep = new Receptionist();
    GuestId id = new GuestId();
    DisplayTables display = new DisplayTables();
    RoomStatus rs = new RoomStatus();
    CustomerExists cus = new CustomerExists();
    CreditCard card;
    CustomPackages pack;
    Bill bill = new Bill();
    Color c;
    LogOnPage frame;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        
        // Set image on taskbar
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/TaskBar_104px.png")));
        // Start our threads
        thread1.start();
        rs.start();   
        // Initilizise JFrame & components
        initComponents();  
        updateGuestId(); 
        loadGuestHomeTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        cardGroup = new javax.swing.ButtonGroup();
        dealsGroup = new javax.swing.ButtonGroup();
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
        footer = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        dbStatus = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        serverTime = new javax.swing.JLabel();
        layerPane = new javax.swing.JLayeredPane();
        checkinScreen = new javax.swing.JPanel();
        roomInfo = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        roomText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        adults = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        children = new javax.swing.JSpinner();
        roomTab = new javax.swing.JTabbedPane();
        singlePanel = new javax.swing.JPanel();
        room200 = new javax.swing.JButton();
        room201 = new javax.swing.JButton();
        room202 = new javax.swing.JButton();
        room203 = new javax.swing.JButton();
        room204 = new javax.swing.JButton();
        room205 = new javax.swing.JButton();
        room206 = new javax.swing.JButton();
        room207 = new javax.swing.JButton();
        doublePanel = new javax.swing.JPanel();
        room301 = new javax.swing.JButton();
        room302 = new javax.swing.JButton();
        room303 = new javax.swing.JButton();
        room304 = new javax.swing.JButton();
        room305 = new javax.swing.JButton();
        room306 = new javax.swing.JButton();
        bridalPanel = new javax.swing.JPanel();
        room100 = new javax.swing.JButton();
        room101 = new javax.swing.JButton();
        room103 = new javax.swing.JButton();
        executivePanel = new javax.swing.JPanel();
        room401 = new javax.swing.JButton();
        room402 = new javax.swing.JButton();
        room403 = new javax.swing.JButton();
        room404 = new javax.swing.JButton();
        room405 = new javax.swing.JButton();
        room406 = new javax.swing.JButton();
        checkMark = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        detailsPanel = new javax.swing.JPanel();
        fName = new javax.swing.JTextField();
        sName = new javax.swing.JTextField();
        title = new javax.swing.JComboBox<>();
        titleLabel = new javax.swing.JLabel();
        fNameLablel = new javax.swing.JLabel();
        sNameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        checkinLab = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        checkInDate = new com.toedter.calendar.JDateChooser();
        checkOutDate = new com.toedter.calendar.JDateChooser();
        guestNo = new javax.swing.JLabel();
        guestId = new javax.swing.JTextField();
        checkInButt = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        bookButt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        payment = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        phoneLabel = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        payProcess = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        existLabel = new javax.swing.JLabel();
        checkGuest = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        roomPriceTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        euroLabel = new javax.swing.JLabel();
        discountTotal = new javax.swing.JTextField();
        fixedTotal = new javax.swing.JTextField();
        euroLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        roomCost = new javax.swing.JTextField();
        packageCost = new javax.swing.JTextField();
        nightsStay = new javax.swing.JTextField();
        totalCost = new javax.swing.JTextField();
        calculateBill = new javax.swing.JButton();
        roomType = new javax.swing.JTextField();
        euroLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        euroLabel4 = new javax.swing.JLabel();
        extraText = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        packageButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        packageCheck = new javax.swing.JCheckBox();
        packageText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cardTable = new javax.swing.JTable();
        clearCard = new javax.swing.JButton();
        addCard = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        masterRad = new javax.swing.JRadioButton();
        visaRad = new javax.swing.JRadioButton();
        americanRad = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        serverTest = new javax.swing.JButton();
        warnLabel = new javax.swing.JLabel();
        homeScreen = new javax.swing.JPanel();
        dataTabPane = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        guestTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable();
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
        loggedOnAlert = new javax.swing.JTextField();
        addRecep = new javax.swing.JButton();
        removeRecep = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        searchScreen = new javax.swing.JPanel();
        searchGuest = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbRno = new javax.swing.JLabel();
        lbFN = new javax.swing.JLabel();
        lblPh = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        lbSN = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        tfFindGuest = new javax.swing.JTextField();
        tfFname = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        tfSurname = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        tfRoom = new javax.swing.JTextField();
        findGuest = new javax.swing.JButton();
        lbAdd = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        lbCI = new javax.swing.JLabel();
        lbType = new javax.swing.JLabel();
        lbNoP = new javax.swing.JLabel();
        tfCheckin = new javax.swing.JTextField();
        tfType = new javax.swing.JTextField();
        tfNoP = new javax.swing.JTextField();
        tfChildren = new javax.swing.JTextField();
        lbChild = new javax.swing.JLabel();
        ta = new java.awt.TextArea();
        lbAdult = new javax.swing.JLabel();
        tfAdults = new javax.swing.JTextField();
        searchRoom = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        roomNo = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        btnSearchRoom = new javax.swing.JButton();
        lblAvailablity = new javax.swing.JLabel();
        tfAvailability = new javax.swing.JTextField();
        lblType = new javax.swing.JLabel();
        tfRoomType = new javax.swing.JTextField();
        lblCost = new javax.swing.JLabel();
        tfCost = new javax.swing.JTextField();
        lblUnder = new javax.swing.JLabel();
        tfFN = new javax.swing.JTextField();
        lblFrom = new javax.swing.JLabel();
        tfAvailable = new javax.swing.JTextField();
        tfCustID = new javax.swing.JTextField();
        lblCustID = new javax.swing.JLabel();
        tfSN = new javax.swing.JTextField();
        checkOutScreen = new javax.swing.JPanel();
        CheckOutViaRoomNo = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel55 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        abiPanel = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1255, 750));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homePanelMousePressed(evt);
            }
        });

        homeLabel.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
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
                .addContainerGap(16, Short.MAX_VALUE))
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                checkPanelMousePressed(evt);
            }
        });

        checkInLabel.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        checkInLabel.setForeground(new java.awt.Color(255, 255, 255));
        checkInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkInLabel.setText("Check In / Book");
        checkInLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        checkInIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Check Book_32px.png"))); // NOI18N

        javax.swing.GroupLayout checkPanelLayout = new javax.swing.GroupLayout(checkPanel);
        checkPanel.setLayout(checkPanelLayout);
        checkPanelLayout.setHorizontalGroup(
            checkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkInIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkInLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchPanelMousePressed(evt);
            }
        });

        searchLabel.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                checkOutPanelMousePressed(evt);
            }
        });

        checkOutLab.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
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
                .addGap(12, 12, 12)
                .addComponent(checkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
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
                .addGap(570, 1210, Short.MAX_VALUE))
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
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

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dragBar, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(mini, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1306, 1306, 1306))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dragBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        footer.setBackground(new java.awt.Color(255, 255, 255));
        footer.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel7.setText("Server Status:");

        dbStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Filled Circle_Red_16px.png"))); // NOI18N
        dbStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dbStatusMousePressed(evt);
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
        checkinScreen.setPreferredSize(new java.awt.Dimension(1080, 406));

        roomInfo.setBackground(new java.awt.Color(255, 255, 255));
        roomInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Room Information"));

        jLabel14.setText("Room Number:");

        roomText.setEditable(false);
        roomText.setText("201");
        roomText.setToolTipText("Room number");

        jLabel16.setText("Adults:");

        adults.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jLabel17.setText("Children:");

        children.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        roomTab.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N

        singlePanel.setBackground(new java.awt.Color(255, 255, 255));
        singlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Single Rooms"));
        singlePanel.setLayout(new java.awt.GridBagLayout());

        room200.setBackground(new java.awt.Color(255, 255, 255));
        room200.setLabel("200");
        room200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room200ActionPerformed(evt);
            }
        });
        singlePanel.add(room200, new java.awt.GridBagConstraints());

        room201.setBackground(new java.awt.Color(255, 255, 255));
        room201.setLabel("201");
        room201.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room201ActionPerformed(evt);
            }
        });
        singlePanel.add(room201, new java.awt.GridBagConstraints());

        room202.setBackground(new java.awt.Color(255, 255, 255));
        room202.setLabel("202");
        room202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room202ActionPerformed(evt);
            }
        });
        singlePanel.add(room202, new java.awt.GridBagConstraints());

        room203.setBackground(new java.awt.Color(255, 255, 255));
        room203.setLabel("203");
        room203.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room203ActionPerformed(evt);
            }
        });
        singlePanel.add(room203, new java.awt.GridBagConstraints());

        room204.setBackground(new java.awt.Color(255, 255, 255));
        room204.setLabel("204");
        room204.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room204ActionPerformed(evt);
            }
        });
        singlePanel.add(room204, new java.awt.GridBagConstraints());

        room205.setBackground(new java.awt.Color(255, 255, 255));
        room205.setText("205");
        room205.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room205ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        singlePanel.add(room205, gridBagConstraints);

        room206.setBackground(new java.awt.Color(255, 255, 255));
        room206.setText("206");
        room206.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room206ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        singlePanel.add(room206, gridBagConstraints);

        room207.setBackground(new java.awt.Color(255, 255, 255));
        room207.setText("207");
        room207.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room207ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        singlePanel.add(room207, gridBagConstraints);

        roomTab.addTab("Single", singlePanel);

        doublePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Double Rooms"));
        doublePanel.setLayout(new java.awt.GridBagLayout());

        room301.setBackground(new java.awt.Color(255, 255, 255));
        room301.setText("301");
        room301.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room301ActionPerformed(evt);
            }
        });
        doublePanel.add(room301, new java.awt.GridBagConstraints());

        room302.setBackground(new java.awt.Color(255, 255, 255));
        room302.setText("302");
        room302.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room302ActionPerformed(evt);
            }
        });
        doublePanel.add(room302, new java.awt.GridBagConstraints());

        room303.setBackground(new java.awt.Color(255, 255, 255));
        room303.setText("303");
        room303.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room303ActionPerformed(evt);
            }
        });
        doublePanel.add(room303, new java.awt.GridBagConstraints());

        room304.setBackground(new java.awt.Color(255, 255, 255));
        room304.setText("304");
        room304.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room304ActionPerformed(evt);
            }
        });
        doublePanel.add(room304, new java.awt.GridBagConstraints());

        room305.setBackground(new java.awt.Color(255, 255, 255));
        room305.setText("305");
        room305.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room305ActionPerformed(evt);
            }
        });
        doublePanel.add(room305, new java.awt.GridBagConstraints());

        room306.setBackground(new java.awt.Color(255, 255, 255));
        room306.setText("306");
        room306.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room306ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        doublePanel.add(room306, gridBagConstraints);

        roomTab.addTab("Double", doublePanel);

        bridalPanel.setLayout(new java.awt.GridBagLayout());

        room100.setBackground(new java.awt.Color(255, 255, 255));
        room100.setText("100");
        room100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room100ActionPerformed(evt);
            }
        });
        bridalPanel.add(room100, new java.awt.GridBagConstraints());

        room101.setBackground(new java.awt.Color(255, 255, 255));
        room101.setText("101");
        room101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room101ActionPerformed(evt);
            }
        });
        bridalPanel.add(room101, new java.awt.GridBagConstraints());

        room103.setBackground(new java.awt.Color(255, 255, 255));
        room103.setText("103");
        room103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room103ActionPerformed(evt);
            }
        });
        bridalPanel.add(room103, new java.awt.GridBagConstraints());

        roomTab.addTab("Bridal", bridalPanel);

        executivePanel.setLayout(new java.awt.GridBagLayout());

        room401.setBackground(new java.awt.Color(255, 204, 204));
        room401.setText("401");
        room401.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room401ActionPerformed(evt);
            }
        });
        executivePanel.add(room401, new java.awt.GridBagConstraints());

        room402.setBackground(new java.awt.Color(255, 204, 204));
        room402.setText("402");
        room402.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room402ActionPerformed(evt);
            }
        });
        executivePanel.add(room402, new java.awt.GridBagConstraints());

        room403.setBackground(new java.awt.Color(255, 204, 204));
        room403.setText("403");
        room403.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room403ActionPerformed(evt);
            }
        });
        executivePanel.add(room403, new java.awt.GridBagConstraints());

        room404.setBackground(new java.awt.Color(255, 204, 204));
        room404.setText("404");
        room404.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room404ActionPerformed(evt);
            }
        });
        executivePanel.add(room404, new java.awt.GridBagConstraints());

        room405.setBackground(new java.awt.Color(255, 204, 204));
        room405.setText("405");
        room405.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room405ActionPerformed(evt);
            }
        });
        executivePanel.add(room405, new java.awt.GridBagConstraints());

        room406.setBackground(new java.awt.Color(255, 204, 204));
        room406.setText("406");
        room406.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room406ActionPerformed(evt);
            }
        });
        executivePanel.add(room406, new java.awt.GridBagConstraints());

        roomTab.addTab("Executive", executivePanel);

        checkMark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Checkmark_16px.png"))); // NOI18N

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Horizontal Line_25px.png"))); // NOI18N
        jLabel50.setText("Occupied");

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Horizontal Line_Blue_25px.png"))); // NOI18N
        jLabel51.setText("Booked");

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Horizontal Line_Green_25px.png"))); // NOI18N
        jLabel52.setText("Available");

        javax.swing.GroupLayout roomInfoLayout = new javax.swing.GroupLayout(roomInfo);
        roomInfo.setLayout(roomInfoLayout);
        roomInfoLayout.setHorizontalGroup(
            roomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roomInfoLayout.createSequentialGroup()
                        .addGroup(roomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(adults, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(children, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMark, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(roomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)))
                    .addComponent(roomTab, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roomInfoLayout.setVerticalGroup(
            roomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomInfoLayout.createSequentialGroup()
                .addGroup(roomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roomInfoLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel51)
                        .addGap(16, 16, 16))
                    .addGroup(roomInfoLayout.createSequentialGroup()
                        .addGroup(roomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkMark, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(roomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(roomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(roomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(adults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(children, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(roomTab, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        detailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        detailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Guest Details"));

        fName.setInheritsPopupMenu(true);

        title.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr\t", "Mrs", "Miss", "Dr", "Ms" }));

        titleLabel.setText("Title:");

        fNameLablel.setText("First Name:");

        sNameLabel.setText("Surname:");

        addressLabel.setText("Address:");

        checkinLab.setText("Check-In:");

        jLabel28.setText("Check-Out:");

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        checkInDate.setDateFormatString("yyyy-MM-dd");
        checkInDate.setMinSelectableDate(new Date());
        checkInDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                checkInDatePropertyChange(evt);
            }
        });

        checkOutDate.setDateFormatString("yyyy-MM-dd");
        checkOutDate.setMinSelectableDate(new Date());
        checkOutDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                checkOutDatePropertyChange(evt);
            }
        });

        guestNo.setText("Guest No*:");

        guestId.setEditable(false);

        checkInButt.setMnemonic('C');
        checkInButt.setText("Check-In");
        checkInButt.setToolTipText("Check guest in");
        checkInButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInButtActionPerformed(evt);
            }
        });

        clearButton.setMnemonic('r');
        clearButton.setText("Clear");
        clearButton.setToolTipText("Clear all guest fields");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        bookButt.setMnemonic('B');
        bookButt.setText("Book");
        bookButt.setToolTipText("Book guest in");
        bookButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtActionPerformed(evt);
            }
        });

        jLabel1.setText("Payment Type:");

        payment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit Card", " ", " ", " " }));
        payment.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                paymentItemStateChanged(evt);
            }
        });
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });

        phoneLabel.setText("Phone:");

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        emailLabel.setText("Email:");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Help_22px.png"))); // NOI18N
        jLabel10.setToolTipText("Click to open help");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });

        payProcess.setBackground(new java.awt.Color(255, 255, 255));
        payProcess.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        payProcess.setForeground(new java.awt.Color(0, 153, 0));
        payProcess.setText("Payment Processed");

        existLabel.setFont(new java.awt.Font("Dotum", 0, 12)); // NOI18N
        existLabel.setForeground(new java.awt.Color(102, 153, 255));
        existLabel.setText("Check if customer has stayed before");

        checkGuest.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 11)); // NOI18N
        checkGuest.setText("Check Guest");
        checkGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkGuestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addComponent(jSeparator13)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addComponent(clearButton)
                        .addGap(94, 94, 94)
                        .addComponent(bookButt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkInButt))
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fNameLablel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(guestNo))
                        .addGap(24, 24, 24)
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(detailsPanelLayout.createSequentialGroup()
                                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(guestId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addComponent(jLabel10)
                                .addContainerGap())
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailsPanelLayout.createSequentialGroup()
                                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkinLab, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(checkOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkInDate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(detailsPanelLayout.createSequentialGroup()
                                .addComponent(phoneLabel)
                                .addGap(49, 49, 49)
                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(existLabel)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(existLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(guestNo)
                        .addComponent(guestId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLabel)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fNameLablel)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sNameLabel)
                    .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneLabel)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkinLab)
                    .addComponent(checkInDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(payProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(bookButt)
                    .addComponent(checkInButt)))
        );

        payProcess.setVisible(false);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Billing Information"));

        jLabel21.setText("Room Type:");

        roomPriceTotal.setEditable(false);
        roomPriceTotal.setBackground(new java.awt.Color(255, 255, 255));
        roomPriceTotal.setText("0.00");
        roomPriceTotal.setBorder(null);
        roomPriceTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomPriceTotalActionPerformed(evt);
            }
        });

        jLabel11.setText("Discount / Increase:");

        jLabel29.setText("Fixed Discount / Increase:");

        euroLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Euro_20px.png"))); // NOI18N

        discountTotal.setEditable(false);
        discountTotal.setBackground(new java.awt.Color(255, 255, 255));
        discountTotal.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        discountTotal.setText("0");
        discountTotal.setBorder(null);
        discountTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountTotalActionPerformed(evt);
            }
        });

        fixedTotal.setEditable(false);
        fixedTotal.setBackground(new java.awt.Color(255, 255, 255));
        fixedTotal.setText("0.00");
        fixedTotal.setBorder(null);
        fixedTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixedTotalActionPerformed(evt);
            }
        });

        euroLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Euro_20px.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        jTextField8.setFont(new java.awt.Font("Gautami", 0, 13)); // NOI18N
        jTextField8.setText("Room Cost:");
        jTextField8.setBorder(null);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.setFont(new java.awt.Font("Gautami", 0, 13)); // NOI18N
        jTextField9.setText("Package Total:");
        jTextField9.setBorder(null);

        jTextField10.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jTextField10.setText("Total Cost:");
        jTextField10.setBorder(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField14.setFont(new java.awt.Font("Gautami", 0, 13)); // NOI18N
        jTextField14.setText("Nights Staying:");
        jTextField14.setBorder(null);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jSeparator12.setForeground(new java.awt.Color(51, 51, 51));

        roomCost.setEditable(false);
        roomCost.setBackground(new java.awt.Color(255, 255, 255));
        roomCost.setText("0.00");
        roomCost.setBorder(null);
        roomCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomCostActionPerformed(evt);
            }
        });

        packageCost.setEditable(false);
        packageCost.setBackground(new java.awt.Color(255, 255, 255));
        packageCost.setText("0.00");
        packageCost.setBorder(null);
        packageCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageCostActionPerformed(evt);
            }
        });

        nightsStay.setEditable(false);
        nightsStay.setBackground(new java.awt.Color(255, 255, 255));
        nightsStay.setText("0");
        nightsStay.setBorder(null);

        totalCost.setEditable(false);
        totalCost.setBackground(new java.awt.Color(255, 255, 255));
        totalCost.setText("0");
        totalCost.setBorder(null);
        totalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCostActionPerformed(evt);
            }
        });

        calculateBill.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        calculateBill.setText("Calculate Bill");
        calculateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField9)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomCost)
                            .addComponent(packageCost))
                        .addGap(131, 131, 131))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nightsStay))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(calculateBill)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomCost, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(packageCost, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nightsStay, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculateBill))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roomType.setEditable(false);
        roomType.setText("Single");

        euroLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        euroLabel1.setText("%");

        jLabel22.setText("Extra's:");

        euroLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Euro_20px.png"))); // NOI18N

        extraText.setEditable(false);
        extraText.setBackground(new java.awt.Color(255, 255, 255));
        extraText.setText("0.00");
        extraText.setBorder(null);
        extraText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(discountTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(euroLabel3)))
                        .addGap(4, 4, 4)
                        .addComponent(fixedTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(euroLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(roomType, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(2, 2, 2)
                            .addComponent(euroLabel)
                            .addGap(4, 4, 4)
                            .addComponent(roomPriceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(euroLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(extraText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(roomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(euroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roomPriceTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(discountTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(euroLabel1)))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(euroLabel3)
                    .addComponent(fixedTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(euroLabel4)
                        .addComponent(extraText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Packages & Addons"));

        packageButton.setBackground(new java.awt.Color(255, 255, 0));
        packageButton.setFont(new java.awt.Font("Dubai", 0, 10)); // NOI18N
        packageButton.setMnemonic('C');
        packageButton.setText("Custom Package Creator");
        packageButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        packageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageButtonActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel15.setText("Create Package");

        packageCheck.setBackground(new java.awt.Color(255, 255, 153));
        packageCheck.setText("Include Package");
        packageCheck.setEnabled(false);
        packageCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                packageCheckItemStateChanged(evt);
            }
        });

        packageText.setEditable(false);
        packageText.setBackground(new java.awt.Color(255, 255, 204));
        packageText.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N
        packageText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        packageText.setText("None");
        packageText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 0));

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel20.setText("Current Package:");

        jSeparator11.setBackground(new java.awt.Color(102, 102, 0));
        jSeparator11.setForeground(new java.awt.Color(153, 153, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel15)
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(packageText)
                            .addComponent(packageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(packageCheck)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator11)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(packageButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(packageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(packageCheck)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(153, 204, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Credit / Debit Card"));

        cardTable.setModel(new javax.swing.table.DefaultTableModel(
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
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        cardTable.setToolTipText("Press enter to store details");
        cardTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cardTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardTableMouseExited(evt);
            }
        });
        cardTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    JTable target = (JTable)e.getSource();
                    int row = target.getSelectedRow();
                    int column = target.getSelectedColumn();
                    // do some action if appropriate column
                    addCard.setEnabled(false);
                }
            }
        });
        jScrollPane3.setViewportView(cardTable);
        if (cardTable.getColumnModel().getColumnCount() > 0) {
            cardTable.getColumnModel().getColumn(0).setResizable(false);
            cardTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            cardTable.getColumnModel().getColumn(1).setResizable(false);
            cardTable.getColumnModel().getColumn(1).setPreferredWidth(30);
            cardTable.getColumnModel().getColumn(2).setResizable(false);
            cardTable.getColumnModel().getColumn(2).setPreferredWidth(170);
            cardTable.getColumnModel().getColumn(3).setResizable(false);
            cardTable.getColumnModel().getColumn(3).setPreferredWidth(20);
            cardTable.getColumnModel().getColumn(4).setResizable(false);
            cardTable.getColumnModel().getColumn(4).setPreferredWidth(3);
        }
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        cardTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );

        clearCard.setText("Clear");
        clearCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCardActionPerformed(evt);
            }
        });

        addCard.setText("Add");
        addCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addCardMouseEntered(evt);
            }
        });
        addCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCardActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MasterCard_28px.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Visa_28px.png"))); // NOI18N

        masterRad.setBackground(new java.awt.Color(153, 204, 255));
        cardGroup.add(masterRad);
        masterRad.setSelected(true);
        masterRad.setText("Master Card");

        visaRad.setBackground(new java.awt.Color(153, 204, 255));
        cardGroup.add(visaRad);
        visaRad.setText("Visa");

        americanRad.setBackground(new java.awt.Color(153, 204, 255));
        cardGroup.add(americanRad);
        americanRad.setText("American Express");
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

        warnLabel.setBackground(new java.awt.Color(255, 255, 255));
        warnLabel.setFont(new java.awt.Font("Estrangelo Edessa", 0, 14)); // NOI18N
        warnLabel.setForeground(new java.awt.Color(204, 51, 0));
        warnLabel.setText("Press 'Enter' to finish entering data into table!");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(addCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(serverTest))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masterRad)
                .addGap(31, 31, 31)
                .addComponent(visaRad)
                .addGap(37, 37, 37)
                .addComponent(americanRad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(warnLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel25)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(americanRad)
                        .addComponent(visaRad)
                        .addComponent(masterRad)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(warnLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addCard)
                        .addComponent(clearCard))
                    .addComponent(serverTest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout checkinScreenLayout = new javax.swing.GroupLayout(checkinScreen);
        checkinScreen.setLayout(checkinScreenLayout);
        checkinScreenLayout.setHorizontalGroup(
            checkinScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkinScreenLayout.createSequentialGroup()
                .addComponent(detailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(checkinScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(checkinScreenLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(checkinScreenLayout.createSequentialGroup()
                        .addComponent(roomInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        checkinScreenLayout.setVerticalGroup(
            checkinScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkinScreenLayout.createSequentialGroup()
                .addGroup(checkinScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkinScreenLayout.createSequentialGroup()
                        .addGroup(checkinScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roomInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(checkinScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(detailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 512, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton3))
        );

        dataTabPane.addTab("Guests", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1035, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        dataTabPane.addTab("Rooms", jPanel9);

        bookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Guest Id", "Room No", "Title", "First Name", "Surname", "Address", "Phone No.", "Email", "Check-In", "Check-Out"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(bookingTable);
        if (bookingTable.getColumnModel().getColumnCount() > 0) {
            bookingTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            bookingTable.getColumnModel().getColumn(0).setMaxWidth(70);
            bookingTable.getColumnModel().getColumn(2).setMinWidth(50);
            bookingTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            bookingTable.getColumnModel().getColumn(2).setMaxWidth(40);
        }

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
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

        loggedOnAlert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loggedOnAlert.setForeground(new java.awt.Color(51, 102, 255));
        loggedOnAlert.setText("Logged on");
        loggedOnAlert.setBorder(null);
        loggedOnAlert.setCaretColor(new java.awt.Color(255, 255, 255));
        loggedOnAlert.setOpaque(false);
        loggedOnAlert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggedOnAlertActionPerformed(evt);
            }
        });

        addRecep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        addRecep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecepActionPerformed(evt);
            }
        });

        removeRecep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.PNG"))); // NOI18N
        removeRecep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRecepActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blueArrow2.png"))); // NOI18N
        jButton2.setToolTipText("Log-out of session");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homeScreenLayout = new javax.swing.GroupLayout(homeScreen);
        homeScreen.setLayout(homeScreenLayout);
        homeScreenLayout.setHorizontalGroup(
            homeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(homeScreenLayout.createSequentialGroup()
                        .addComponent(currentGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(386, 386, 386)
                        .addComponent(loggedOnAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(addRecep, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeRecep, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        homeScreenLayout.setVerticalGroup(
            homeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeScreenLayout.createSequentialGroup()
                .addGroup(homeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeScreenLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(homeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(currentGuest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(homeScreenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(homeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(addRecep, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeRecep, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loggedOnAlert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(dataTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        searchScreen.setBackground(new java.awt.Color(255, 255, 255));
        searchScreen.setPreferredSize(new java.awt.Dimension(964, 406));

        searchGuest.setBackground(new java.awt.Color(153, 204, 255));
        searchGuest.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Guest"));
        searchGuest.setPreferredSize(new java.awt.Dimension(495, 320));
        searchGuest.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                searchGuestAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel12.setText("Guest Name");

        lbRno.setText("Room No:");

        lbFN.setText("First Name:");

        lblPh.setText("Phone:");

        lbID.setText("ID:");

        lbSN.setText("Surname:");

        lbEmail.setText("Email:");

        tfFname.setEditable(false);

        tfID.setEditable(false);

        tfSurname.setEditable(false);

        tfEmail.setEditable(false);

        tfRoom.setEditable(false);

        findGuest.setText("Find Guest");
        findGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findGuestActionPerformed(evt);
            }
        });

        lbAdd.setText("Address:");

        tfPhone.setEditable(false);

        lbCI.setText("Checked-In:");

        lbType.setText("Room Type:");

        lbNoP.setText("No. Of People");
        lbNoP.setToolTipText("");

        tfCheckin.setEditable(false);

        tfType.setEditable(false);

        tfNoP.setEditable(false);

        tfChildren.setEditable(false);

        lbChild.setText("Children:");

        ta.setEditable(false);

        lbAdult.setText("Adult:");

        tfAdults.setEditable(false);

        javax.swing.GroupLayout searchGuestLayout = new javax.swing.GroupLayout(searchGuest);
        searchGuest.setLayout(searchGuestLayout);
        searchGuestLayout.setHorizontalGroup(
            searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchGuestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchGuestLayout.createSequentialGroup()
                        .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, searchGuestLayout.createSequentialGroup()
                                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(searchGuestLayout.createSequentialGroup()
                                            .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbRno)
                                                .addComponent(lbAdd)
                                                .addComponent(lblPh))
                                            .addGap(22, 22, 22))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchGuestLayout.createSequentialGroup()
                                            .addComponent(lbFN)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(searchGuestLayout.createSequentialGroup()
                                        .addComponent(lbCI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfRoom)
                                    .addComponent(tfFname)
                                    .addComponent(tfCheckin)
                                    .addComponent(ta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSN)
                                    .addComponent(lbID)
                                    .addComponent(lbEmail)
                                    .addComponent(lbType)
                                    .addComponent(lbNoP)
                                    .addComponent(lbChild)
                                    .addComponent(lbAdult))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfAdults)
                                    .addComponent(tfChildren)
                                    .addComponent(tfID)
                                    .addComponent(tfSurname)
                                    .addComponent(tfType)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(tfNoP))))
                        .addGap(21, 21, 21))
                    .addGroup(searchGuestLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(tfFindGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(findGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        searchGuestLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfEmail, tfFname, tfRoom});

        searchGuestLayout.setVerticalGroup(
            searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchGuestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfFindGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findGuest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRno)
                    .addComponent(tfRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbID)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSN)
                    .addComponent(tfFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchGuestLayout.createSequentialGroup()
                        .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbType)
                            .addComponent(tfType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNoP)
                            .addComponent(tfNoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbChild)
                            .addComponent(tfChildren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbAdd)
                    .addComponent(ta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAdult)
                    .addComponent(tfCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCI)
                    .addComponent(tfAdults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        searchRoom.setBackground(new java.awt.Color(153, 204, 255));
        searchRoom.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Room"));
        searchRoom.setPreferredSize(new java.awt.Dimension(495, 320));
        searchRoom.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                searchRoomAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel42.setText("Room No.");

        btnSearchRoom.setText("Search Room");
        btnSearchRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchRoomActionPerformed(evt);
            }
        });

        lblAvailablity.setText("Availability:");

        tfAvailability.setEditable(false);

        lblType.setText("Type:");

        tfRoomType.setEditable(false);

        lblCost.setText("Cost/Night:");

        tfCost.setEditable(false);
        tfCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCostActionPerformed(evt);
            }
        });

        lblUnder.setText("Booked Under:");

        tfFN.setEditable(false);

        lblFrom.setText("Available From:");

        tfAvailable.setEditable(false);

        tfCustID.setEditable(false);

        lblCustID.setText("ID:");

        tfSN.setEditable(false);

        javax.swing.GroupLayout searchRoomLayout = new javax.swing.GroupLayout(searchRoom);
        searchRoom.setLayout(searchRoomLayout);
        searchRoomLayout.setHorizontalGroup(
            searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchRoomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator10)
                    .addGroup(searchRoomLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addComponent(roomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchRoomLayout.createSequentialGroup()
                        .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAvailablity)
                            .addComponent(lblFrom)
                            .addComponent(lblUnder))
                        .addGap(27, 27, 27)
                        .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchRoomLayout.createSequentialGroup()
                                .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCost)
                                    .addComponent(lblType))
                                .addGap(10, 10, 10))
                            .addGroup(searchRoomLayout.createSequentialGroup()
                                .addComponent(tfFN, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSN, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 10, Short.MAX_VALUE)))
                        .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCost)
                            .addComponent(tfRoomType)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchRoomLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblCustID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(tfCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        searchRoomLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfAvailability, tfAvailable});

        searchRoomLayout.setVerticalGroup(
            searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchRoomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(roomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchRoom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvailablity)
                    .addComponent(tfAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType)
                    .addComponent(tfRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFrom)
                    .addComponent(tfAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCost)
                    .addComponent(tfCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUnder)
                    .addGroup(searchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCustID))
                    .addComponent(tfCustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(719, Short.MAX_VALUE))
        );
        searchScreenLayout.setVerticalGroup(
            searchScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchGuest, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addComponent(searchRoom, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        checkOutScreen.setBackground(new java.awt.Color(255, 255, 255));
        checkOutScreen.setPreferredSize(new java.awt.Dimension(1000, 736));

        CheckOutViaRoomNo.setBackground(new java.awt.Color(255, 255, 255));
        CheckOutViaRoomNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Guest Check Out"));

        jLabel53.setText("Room Number:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Checkout");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel54.setText("Guest Id:");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CheckOutViaRoomNoLayout = new javax.swing.GroupLayout(CheckOutViaRoomNo);
        CheckOutViaRoomNo.setLayout(CheckOutViaRoomNoLayout);
        CheckOutViaRoomNoLayout.setHorizontalGroup(
            CheckOutViaRoomNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckOutViaRoomNoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CheckOutViaRoomNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CheckOutViaRoomNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CheckOutViaRoomNoLayout.createSequentialGroup()
                            .addComponent(jLabel54)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CheckOutViaRoomNoLayout.createSequentialGroup()
                            .addComponent(jLabel53)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CheckOutViaRoomNoLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(92, 92, 92)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        CheckOutViaRoomNoLayout.setVerticalGroup(
            CheckOutViaRoomNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckOutViaRoomNoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(CheckOutViaRoomNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CheckOutViaRoomNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Bill"));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel57.setText("Discount:");

        jLabel56.setText("Extras:");

        jToggleButton1.setText("Print Invoice");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel55.setText("Room Cost:");

        jLabel58.setText("Food:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jButton6.setText("My Button");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel57))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(jButton6))
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jToggleButton1))
                        .addGap(0, 104, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );

        abiPanel.setBackground(new java.awt.Color(255, 255, 255));
        abiPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Abi border"));

        jButton7.setText("jButton7");

        jLabel18.setText("This is a label");

        jTextField7.setText("This is a text field");

        javax.swing.GroupLayout abiPanelLayout = new javax.swing.GroupLayout(abiPanel);
        abiPanel.setLayout(abiPanelLayout);
        abiPanelLayout.setHorizontalGroup(
            abiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abiPanelLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abiPanelLayout.setVerticalGroup(
            abiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout checkOutScreenLayout = new javax.swing.GroupLayout(checkOutScreen);
        checkOutScreen.setLayout(checkOutScreenLayout);
        checkOutScreenLayout.setHorizontalGroup(
            checkOutScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkOutScreenLayout.createSequentialGroup()
                .addGroup(checkOutScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, checkOutScreenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(abiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(CheckOutViaRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(checkOutScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        checkOutScreenLayout.setVerticalGroup(
            checkOutScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkOutScreenLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(checkOutScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckOutViaRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(checkOutScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        layerPane.setLayer(checkinScreen, javax.swing.JLayeredPane.POPUP_LAYER);
        layerPane.setLayer(homeScreen, javax.swing.JLayeredPane.DRAG_LAYER);
        layerPane.setLayer(searchScreen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerPane.setLayer(checkOutScreen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layerPaneLayout = new javax.swing.GroupLayout(layerPane);
        layerPane.setLayout(layerPaneLayout);
        layerPaneLayout.setHorizontalGroup(
            layerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerPaneLayout.createSequentialGroup()
                .addGroup(layerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 1754, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 1171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 692, Short.MAX_VALUE))
            .addGroup(layerPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkinScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 1251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layerPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(checkOutScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 1764, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(670, Short.MAX_VALUE)))
        );
        layerPaneLayout.setVerticalGroup(
            layerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkinScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
            .addComponent(searchScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
            .addComponent(homeScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
            .addGroup(layerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layerPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(checkOutScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(layerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 1680, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dragBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragBarMouseDragged
        // TODO add your handling code here:
        
        // Used to drag the JFrame around
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - (xMouse+210), y - yMouse);
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

    private void checkOutPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkOutPanelMouseMoved
        // TODO add your handling code here:
         homePanel.setBackground(new java.awt.Color(34,104,153));
         checkPanel.setBackground(new java.awt.Color(34,104,153));
         searchPanel.setBackground(new java.awt.Color(34,104,153));
         quitPanel.setBackground(new java.awt.Color(34,104,153));
         checkOutPanel.setBackground(new java.awt.Color(84,140,196));
         
    }//GEN-LAST:event_checkOutPanelMouseMoved

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
        thread1.interrupt();
        rs.interrupt();
        dispose();
        System.exit(0);
    }//GEN-LAST:event_quitPanelMouseClicked

    private void closeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseMoved
        // TODO add your handling code here:
        close.setOpaque(true);
        mini.setOpaque(false);
        repaint();
    }//GEN-LAST:event_closeMouseMoved
    public void loadGuestHomeTable(){
        ArrayList<Guest> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel)guestTable.getModel();
        
         try{
        // list.clear();
         String sql = "SELECT DISTINCT * FROM `guest`,`rooms`";
         list = display.displayGuestTable(sql);
         for(int i=0;i<list.size();i++){
         Object[] row = new Object[9];
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
         list.clear();
         }
         catch(Exception e){
         System.out.print(e.getMessage());
         }    
         // Bookings
         DefaultTableModel model2 = (DefaultTableModel)bookingTable.getModel();
          try{
         String sql = "SELECT DISTINCT * FROM `guest`, `rooms` WHERE  guest.id = rooms.id HAVING `booked` = 1";
         list = display.displayGuestTable(sql);
         Object[] row = new Object[10];
         for(int i=0;i<list.size();i++){
            row [0] = list.get(i).getId();
            row [1] = list.get(i).getRoomNumber();
            row [2] = list.get(i).getTitle();
            row [3] = list.get(i).getfName();
            row [4] = list.get(i).getsName();
            row [5] = list.get(i).getAddress();
            row [6] = list.get(i).getPhoneNo();
            row [7] = list.get(i).getEmailAddress();
            row [8] = list.get(i).getCheckIn();
            row [9] = list.get(i).getCheckOut();
            model2.addRow(row);
            }
         }
         catch(Exception e){
         System.out.print("ERROR!!");
         }    
    }
    
    private void closeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_closeFocusLost
        // TODO add your handling code here:
       // close.setOpaque(false);
    }//GEN-LAST:event_closeFocusLost
    
    private void bannerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bannerMouseMoved
        // TODO add your handling code here:
        restartThread();
        close.setOpaque(false);
        mini.setOpaque(false);
        repaint();
    }//GEN-LAST:event_bannerMouseMoved

    private void miniMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseMoved
        // TODO add your handling code here:
        close.setOpaque(false);
        mini.setOpaque(true);
        repaint();
    }//GEN-LAST:event_miniMouseMoved

    private void bookButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtActionPerformed
        // TODO add your handling code here:
             checkValidInput(true); 
    }//GEN-LAST:event_bookButtActionPerformed

    private void checkInButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInButtActionPerformed
        // TODO add your handling code here: 
              checkValidInput(false);
    }//GEN-LAST:event_checkInButtActionPerformed
    
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        clearGuestFields();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        thread1.interrupt();
        rs.interrupt();
        dispose();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void paymentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_paymentItemStateChanged
        // TODO add your handling code here:
        
        if(payment.getSelectedItem().equals("Cash")){
            addCard.setEnabled(false);
        }
        else{
        addCard.setEnabled(true);
        }
    }//GEN-LAST:event_paymentItemStateChanged

    private void room406ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room406ActionPerformed
        // TODO add your handling code here:
        roomText.setText("406");
        roomType.setText("Executive");
        roomPriceTotal.setText(""+bill.getExecutive());
        roomCost.setText(""+bill.getExecutive());
        c = room406.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room406ActionPerformed

    private void room405ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room405ActionPerformed
        // TODO add your handling code here:
        roomText.setText("405");
        roomType.setText("Executive");
        roomPriceTotal.setText(""+bill.getExecutive());
        roomCost.setText(""+bill.getExecutive());
        c = room405.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room405ActionPerformed

    private void room404ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room404ActionPerformed
        // TODO add your handling code here:
        roomText.setText("404");
        roomType.setText("Executive");
        roomPriceTotal.setText(""+bill.getExecutive());
        roomCost.setText(""+bill.getExecutive());
        c = room404.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room404ActionPerformed

    private void room403ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room403ActionPerformed
        // TODO add your handling code here:
        roomText.setText("403");
        roomType.setText("Executive");
        roomPriceTotal.setText(""+bill.getExecutive());
        roomCost.setText(""+bill.getExecutive());
        c = room403.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room403ActionPerformed

    private void room402ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room402ActionPerformed
        // TODO add your handling code here:
        roomText.setText("402");
        roomType.setText("Executive");
        roomPriceTotal.setText(""+bill.getExecutive());
        roomCost.setText(""+bill.getExecutive());
        c = room402.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room402ActionPerformed

    private void room401ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room401ActionPerformed
        // TODO add your handling code here:
        roomText.setText("401");
        roomType.setText("Executive");
        roomPriceTotal.setText(""+bill.getExecutive());
        roomCost.setText(""+bill.getExecutive());
        c = room401.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room401ActionPerformed

    private void room306ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room306ActionPerformed
        // TODO add your handling code here:
        roomText.setText("306");
        roomType.setText("Double");
        roomPriceTotal.setText(""+bill.getDoubleR());
        roomCost.setText(""+bill.getDoubleR());
        c = room306.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room306ActionPerformed

    private void room305ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room305ActionPerformed
        // TODO add your handling code here:
        roomText.setText("305");
        roomType.setText("Double");
        roomPriceTotal.setText(""+bill.getDoubleR());
        roomCost.setText(""+bill.getDoubleR());
        c = room305.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room305ActionPerformed

    private void room303ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room303ActionPerformed
        // TODO add your handling code here:
        roomText.setText("303");
        roomType.setText("Double");
        roomPriceTotal.setText(""+bill.getDoubleR());
        roomCost.setText(""+bill.getDoubleR());
        c = room303.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room303ActionPerformed

    private void room301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room301ActionPerformed
        // TODO add your handling code here:
        roomText.setText("301");
        roomType.setText("Double");
        roomPriceTotal.setText(""+bill.getDoubleR());
        roomCost.setText(""+bill.getDoubleR());
        c = room301.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room301ActionPerformed

    private void room207ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room207ActionPerformed
        // TODO add your handling code here:
        roomText.setText("207");
        roomType.setText("Single");
        roomPriceTotal.setText(""+bill.getSingleR());
        roomCost.setText(""+bill.getSingleR());
        c = room207.getBackground();
        int x =  rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room207ActionPerformed

    private void room206ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room206ActionPerformed
        // TODO add your handling code here:
        roomText.setText("206");
        roomType.setText("Single");
        roomPriceTotal.setText(""+bill.getSingleR());
        roomCost.setText(""+bill.getSingleR());
        c = room206.getBackground();
        int x =rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room206ActionPerformed

    private void room205ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room205ActionPerformed
        // TODO add your handling code here:
        roomText.setText("205");
        roomType.setText("Single");
        roomPriceTotal.setText(""+bill.getSingleR());
        roomCost.setText(""+bill.getSingleR());
        c = room205.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);

    }//GEN-LAST:event_room205ActionPerformed

    private void room204ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room204ActionPerformed
        // TODO add your handling code here:
        roomText.setText("204");
        roomType.setText("Single");
        roomPriceTotal.setText(""+bill.getSingleR());
        roomCost.setText(""+bill.getSingleR());
        c = room204.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room204ActionPerformed

    private void room203ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room203ActionPerformed
        // TODO add your handling code here:
        roomText.setText("203");
        roomType.setText("Single");
        roomPriceTotal.setText(""+bill.getSingleR());
        roomCost.setText(""+bill.getSingleR());
        c = room203.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room203ActionPerformed

    private void room202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room202ActionPerformed
        // TODO add your handling code here:
        roomText.setText("202");
        roomType.setText("Single");
        roomPriceTotal.setText(""+bill.getSingleR());
        roomCost.setText(""+bill.getSingleR());
        c = room202.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room202ActionPerformed

    private void room201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room201ActionPerformed
        // TODO add your handling code here:
        roomText.setText("201");
        roomType.setText("Single");
        roomPriceTotal.setText(""+bill.getSingleR());
        roomCost.setText(""+bill.getSingleR());
        c = room201.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room201ActionPerformed

    private void room200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room200ActionPerformed
        // TODO add your handling code here:
        
        roomText.setText("200");
        roomType.setText("Single");
        roomCost.setText(""+bill.getSingleR());
        roomPriceTotal.setText(""+bill.getSingleR());
        c = room200.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
        
    }//GEN-LAST:event_room200ActionPerformed

    private void room100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room100ActionPerformed
        // TODO add your handling code here:
        roomText.setText("100");
        roomType.setText("Bridal");
        roomPriceTotal.setText(""+bill.getBridal());
        roomCost.setText(""+bill.getBridal());
        c = room100.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room100ActionPerformed

    private void room101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room101ActionPerformed
        // TODO add your handling code here:
        roomText.setText("101");
        roomType.setText("Bridal");
        roomPriceTotal.setText(""+bill.getBridal());
        roomCost.setText(""+bill.getBridal());
        c = room101.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room101ActionPerformed

    private void room103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room103ActionPerformed
        // TODO add your handling code here:
        roomText.setText("103");
        roomType.setText("Bridal");
        roomPriceTotal.setText(""+bill.getBridal());
        roomCost.setText(""+bill.getBridal());
        c = room103.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room103ActionPerformed

    //**SEARCH - FIND GUEST**//
    private void findGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findGuestActionPerformed

        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;

        String guest = tfFindGuest.getText();
        String [] guests = guest.split(" ");

        String user = "root";
        String pass = "password";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/hotel_db", user, pass);

            //FOR NEW DB    
            //pstmt = conn.prepareStatement("select * from customer, room, booking, roombooking where booking.BookNumber=roombooking.BookNumber and customer.FName=? and customer.SName=?"); 
            
           //***FOR OLD VERSION OF DB***//
            pstmt = conn.prepareStatement("select * from guest, rooms where guest.fname=? and guest.surname=?"); 
            pstmt.setString(1, guests[0]);
            pstmt.setString(2, guests[1]);
            rs = pstmt.executeQuery();
                  
              //***FOR OLD VERSION OF DB***//
            while(rs.next()){
                
                String getFname = rs.getString("fname");
                String getSname = rs.getString("surname");
                String getGuests = getFname+" "+getSname;

                
                    lbRno.setVisible(true);   
                    lbFN.setVisible(true);
                    lblPh.setVisible(true);    
                    lbAdd.setVisible(true);   
                    lbCI.setVisible(true);   
                    lbID.setVisible(true);
                    lbSN.setVisible(true);  
                    lbEmail.setVisible(true);   
                    lbType.setVisible(true);   
                    lbNoP.setVisible(true);
                    lbChild.setVisible(true);  
                    lbAdult.setVisible(true);  

                    tfRoom.setVisible(true);  
                    tfFname.setVisible(true);   
                    tfPhone.setVisible(true);   
                    ta.setVisible(true);
                    tfCheckin.setVisible(true);  
                    tfID.setVisible(true);   
                    tfSurname.setVisible(true);   
                    tfEmail.setVisible(true);
                    tfType.setVisible(true);  
                    tfNoP.setVisible(true);
                    tfChildren.setVisible(true);
                    tfAdults.setVisible(true);  

                    
                    tfRoom.setText(rs.getString("roomno"));
                    tfID.setText(rs.getString("id"));
                    tfFname.setText(rs.getString("fname"));
                    tfSurname.setText(rs.getString("surname"));
                    tfPhone.setText(rs.getString("phone"));
                    tfEmail.setText(rs.getString("email"));
                    tfType.setText("N/A");
                    tfCheckin.setText(rs.getString("checkin"));
                    tfChildren.setText(rs.getString("children"));
                    tfAdults.setText(rs.getString("adults"));
                    
                    String getChild= rs.getString("children");
                    int child = Integer.parseInt(getChild);
                    String getAdult= rs.getString("adults");
                    int adult = Integer.parseInt(getAdult);    
                    int NoP = (child+adult);
                    String people = Integer.toString(NoP);
                    
                    tfNoP.setText(people);

                
//                tfRoom.setText(rs.getString("roomno"));
//                tfID.setText(rs.getString("id"));
//                tfFname.setText(rs.getString("fname"));
//                tfSurname.setText(rs.getString("surname"));
//                tfPhone.setText(rs.getString("phone"));
//                tfEmail.setText(rs.getString("email"));
//                ta.setText(rs.getString("address"));
//                String roomT = roomType.getText();
//                tfType.setText(roomT);
//                tfCheckin.setText(rs.getString("checkin"));
//                tfNoP.setText(rs.getString("adults"));
//                tfChildren.setText(rs.getString("children"));

            }
            
   
            
                  //FOR NEW DB  
//
//                while(rs.next()){    

//                String getFname = rs.getString("customer.FName");
//                String getSname = rs.getString("customer.SName");
//                String getGuests = getFname+" "+getSname;

//                tfRoom.setText(rs.getString("roombooking.RoomNumber"));
//                tfID.setText(rs.getString("CustNumber"));
//                tfFname.setText(rs.getString("FName"));
//                tfSurname.setText(rs.getString("SName"));
//                tfPhone.setText(rs.getString("PhoneNumber"));
//                tfEmail.setText(rs.getString("Email"));
//                
//                //ta.setText(rs.getString("address"));
//                
//                tfType.setText(rs.getString("RoomType"));
//                tfCheckin.setText(rs.getString("CheckInDate"));
//                tfAdults.setText(rs.getString("No of people"));
//                
//                }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"No Customer Found!");
        }
        finally{
            try {
                conn.close();
                pstmt.close();
                rs.close();
            }
            catch(Exception e)
            {
                //JOptionPane.showMessageDialog(null,"No Customer Found!");
            }
        }
    }//GEN-LAST:event_findGuestActionPerformed

    private void tfCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCostActionPerformed

    }//GEN-LAST:event_tfCostActionPerformed

    private void btnSearchRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchRoomActionPerformed

        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String user = "root";
        String pass = "password";
      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/hotel_db", user, pass);
            //FOR NEW DB
             //pstmt = conn.prepareStatement("select * from customer, room, booking, roombooking where booking.BookNumber=roombooking.BookNumber and room.RoomNumber=?"); 

            //***FOR OLDER VERSION OF DB***//
            pstmt = conn.prepareStatement("select * from guest, rooms where guest.id = rooms.id AND rooms.roomno=?");

            pstmt.setString(1, roomNo.getText());
            
            rs = pstmt.executeQuery();
            
            String rText= roomNo.getText();//get user input of room no
            int inputNo = Integer.parseInt(rText);//convert user input to int
                

            while(rs.next()){                        
                
                int booked= rs.getInt("booked");
                int getRoom = rs.getInt("roomno"); //get room no from db
                
                if(inputNo==getRoom) {
                    
                    tfAvailability.setVisible(true);
                    tfRoomType.setVisible(true);
                    tfAvailable.setVisible(true);
                    tfCost.setVisible(true);  
                    lblAvailablity.setVisible(true);
                    lblType.setVisible(true);
                    lblFrom.setVisible(true);
                    lblCost.setVisible(true);
                    
                    if(booked==1)
                        {
                        lblCustID.setVisible(true);
                        tfCustID.setVisible(true);
                        tfFN.setVisible(true); 
                        tfSN.setVisible(true); 
                        lblUnder.setVisible(true); 
                        tfAvailability.setText("Not Available");
                        tfFN.setText(rs.getString("fname"));
                        tfSN.setText(rs.getString("surname"));
                        tfCustID.setText(rs.getString("id"));
                        }
                    else{
                        lblCustID.setVisible(false);
                        tfCustID.setVisible(false);
                        tfFN.setVisible(false); 
                        lblUnder.setVisible(false);
                        tfFN.setVisible(false); 
                        tfSN.setVisible(false);
                        
                        tfAvailability.setText("Available");
                        } 
                        tfAvailable.setText(rs.getString("checkout"));
                        tfRoomType.setText("N/A");
                        tfCost.setText("N/A");
                              
                }
                
                else{
                    JOptionPane.showMessageDialog(null,"No Room Found!");
                }         

                
                //FOR NEW DB
                //int booked= rs.getInt("roombooking.RoomNumber");
                //int getRoom = rs.getInt("room.RoomNumber"); //get room no from db

               
//                if(inputNo!=getRoom)
//                    //JOptionPane.showMessageDialog(null,"No Room Found!");
//                    System.out.print("No Room");

//                if(inputNo==getRoom) {
//                    
//                    tfAvailability.setVisible(true);
//                    tfRoomType.setVisible(true);
//                    tfAvailable.setVisible(true);
//                    tfCost.setVisible(true);  
//
//                    lbA.setVisible(true);
//                    lbT.setVisible(true);
//                    lbF.setVisible(true);
//                    lbC.setVisible(true);
//                    
//                    if(inputNo==booked)
//                        {
//                        lblCustID.setVisible(true);
//                        tfCustID.setVisible(true);
//                        tfFN.setVisible(true);  
//                        tfSN.setVisible(true); 
//                        lblUnder.setVisible(true);   
//                        
//                        tfAvailability.setText("Not Available");
//                        tfFN.setText(rs.getString("FName"));
//                        tfSN.setText(rs.getString("SName"));
//                        tfCustID.setText(rs.getString("CustNumber"));
//                        }
//                    else{
//                        lblCustID.setVisible(false);
//                        tfCustID.setVisible(false);
//                        tfFN.setVisible(false); 
//                        tfSN.setVisible(false); 
//                        lblUnder.setVisible(false);
//                        
//                        tfAvailability.setText("Available");
//                        }
//                    //String roomT = roomType.getText();
//                    //tfRoomType.setText(roomT); 
//                    tfAvailable.setText(rs.getString("CheckOutDate"));
//                    tfRoomType.setText(rs.getString("RoomType"));
//                    tfCost.setText(rs.getString("CostPerNight"));                                      
//                }
//                
//                else{
//                    //JOptionPane.showMessageDialog(null,"No Room Found!");
//                }
                
            }
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please enter a valid room number!");
        }
        finally{
            try {
                conn.close();
                pstmt.close();
                rs.close();
            }
            catch(Exception e)
            {
                //JOptionPane.showMessageDialog(null,"No Room Found!");
            }
        }
    }//GEN-LAST:event_btnSearchRoomActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void checkOutDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_checkOutDatePropertyChange
        // TODO add your handling code here:
      
       // Check to see if check-out date is correct
       if(checkOutDate.getDate() != null){
            if(checkOutDate.getDate().before(checkInDate.getDate())){
            JOptionPane.showMessageDialog(null, "Check-out date cannot be earlier than check-in date!!", "Check-Out Error", JOptionPane.ERROR_MESSAGE);
            checkOutDate.setDate(null);
            }
       }
       // Get the totla number of days guest is staying
       if(checkInDate.getDate() != null && checkOutDate.getDate() != null){
           getDays();
       }
       
    }//GEN-LAST:event_checkOutDatePropertyChange
    public void getDays(){
       Date startDate = checkInDate.getDate();
       Date endDate = checkOutDate.getDate();
       sT = startDate.getTime();
       eT = endDate.getTime();
       long difftime = sT - eT;
       diffDays = difftime / (1000*60*60*24);
       diffDays *= -1;
       DateFormat dateFormat = DateFormat.getDateInstance();
       System.out.println("The difference between "+
       dateFormat.format(startDate)+" and "+
       dateFormat.format(endDate)+" is "+
       diffDays+" days.");
       nightsStay.setText(""+(int)diffDays);
    }
    public void mouseClicked(MouseEvent e) {
    if (e.getClickCount() == 2) {
      JTable target = (JTable)e.getSource();
      int row = target.getSelectedRow();
      int column = target.getSelectedColumn();
      // do some action if appropriate column
      addCard.setEnabled(false);
    }
  }
    private void room302ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room302ActionPerformed
        // TODO add your handling code here:
        
        roomText.setText("302");
        roomType.setText("Double");
        roomPriceTotal.setText(""+bill.getDoubleR());
        roomCost.setText(""+bill.getDoubleR());
        c = room302.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room302ActionPerformed

    private void room304ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room304ActionPerformed
        // TODO add your handling code here:
        
        roomText.setText("304");
        roomType.setText("Double");
        roomPriceTotal.setText(""+bill.getDoubleR());
        roomCost.setText(""+bill.getDoubleR());
        c = room304.getBackground();
        int x = rep.checkRoomStatus(c);
        setCheckRoomBoolean(x);
        updateCheckMark(x);
    }//GEN-LAST:event_room304ActionPerformed

    private void discountTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountTotalActionPerformed

    private void fixedTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixedTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fixedTotalActionPerformed

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

    private void americanRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_americanRadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_americanRadActionPerformed

    private void addCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCardActionPerformed
        // TODO add your handling code here:
        warnLabel.setVisible(false);
        DefaultTableModel model = (DefaultTableModel)cardTable.getModel();

        // Check to see if all fields have been filled in...
        if(roomText.getText().equals("") || fName.getText().equals("") || sName.getText().equals("") || address.getText().equals("") || (checkInDate.getDate() == null)
            || (checkOutDate.getDate() == null) ){
            JOptionPane.showMessageDialog(null, "Fill in all fields", "Fills blank", JOptionPane.ERROR_MESSAGE);
        }
        else{
            // Get values from jtable
            String fname = (String) cardTable.getModel().getValueAt(0, 0);
            String sname = (String) cardTable.getModel().getValueAt(0, 1);
            long cardno = (long)cardTable.getModel().getValueAt(0, 2);
            String date = (String) cardTable.getModel().getValueAt(0, 3);
            int cvc = (int)cardTable.getModel().getValueAt(0, 4);

            // Check the radio buttons for card type
            String cardType;
            if(visaRad.isSelected()){
                cardType = visaRad.getText();
            }
            else if(americanRad.isSelected()){
                cardType = americanRad.getText();
            }
            else{
                cardType = masterRad.getText();
            }
            // Pass into CreditCard constructor
            card = new CreditCard(Integer.valueOf(guestId.getText()),fname,sname,cardno,date,cvc,cardType);
            JOptionPane.showMessageDialog(null, "Success!\nBook or check-in guest to store card on database", "Credit Card Information", JOptionPane.INFORMATION_MESSAGE);

            // Reset JTable
            cardTable.getModel().setValueAt("", 0, 0);
            cardTable.getModel().setValueAt("", 0, 1);
            cardTable.getModel().setValueAt("", 0, 2);
            cardTable.getModel().setValueAt("", 0, 3);
            cardTable.getModel().setValueAt("", 0, 4);
            cardAdded = true;
            payProcess.setVisible(true);
            payment.setEnabled(false);
        }
    }//GEN-LAST:event_addCardActionPerformed

    private void addCardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCardMouseEntered
        // TODO add your handling code here:
        if(!addCard.isEnabled()){
            warnLabel.setVisible(true);
        }
    }//GEN-LAST:event_addCardMouseEntered

    private void cardTableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardTableMouseExited
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel)cardTable.getModel();
        if(cardTable.getModel().getValueAt(0, 0) != null
            && cardTable.getModel().getValueAt(0, 1)!= null
            && cardTable.getModel().getValueAt(0, 2)!= null
            && cardTable.getModel().getValueAt(0, 3) != null
            && cardTable.getModel().getValueAt(0, 4) != null){
            addCard.setEnabled(true);
        }
    }//GEN-LAST:event_cardTableMouseExited

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        // TODO add your handling code here:
        new Help().setVisible(true);
    }//GEN-LAST:event_jLabel10MousePressed

    private void packageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageButtonActionPerformed
        // TODO add your handling code here:
       pack = new CustomPackages();
       pack.setVisible(true);
    }//GEN-LAST:event_packageButtonActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       JOptionPane.showMessageDialog(null,"Room *** is empty " ,"Information",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1MouseClicked

    private void roomCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomCostActionPerformed

    private void packageCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_packageCostActionPerformed

    private void totalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalCostActionPerformed

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
        // TODO add your handling code here:
        thread1.interrupt();
        rs.interrupt();
        dispose();
        System.exit(0);
    }//GEN-LAST:event_closeMousePressed

    private void homePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMousePressed
        // TODO add your handling code here:
        checkinScreen.setVisible(false);
        homeScreen.setVisible(true);
        dataTabPane.setVisible(true);
        currentGuest.setVisible(true);
        bannerTitle.setText("Home");
        searchScreen.setVisible(false);
    }//GEN-LAST:event_homePanelMousePressed

    private void checkPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkPanelMousePressed
        // TODO add your handling code here:
         warnLabel.setVisible(false);
         addCard.setEnabled(false);
        // update id on checkin screen
         updateGuestId();
         checkinScreen.setVisible(true);
         searchScreen.setVisible(false);
         homeScreen.setVisible(false);
         dataTabPane.setVisible(false);
         currentGuest.setVisible(false);
         bannerTitle.setText("Check-In");
         roomText.setText("");
    }//GEN-LAST:event_checkPanelMousePressed

    private void searchPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchPanelMousePressed
        // TODO add your handling code here:
         checkinScreen.setVisible(false);
         homeScreen.setVisible(false);
         searchScreen.setVisible(true);
         bannerTitle.setText("Search");
    }//GEN-LAST:event_searchPanelMousePressed

    private void checkOutPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkOutPanelMousePressed
        // TODO add your handling code here:
         checkinScreen.setVisible(false);
         homeScreen.setVisible(false);
         searchScreen.setVisible(false);
         checkOutScreen.setVisible(true);
         bannerTitle.setText("Check-Out");
    }//GEN-LAST:event_checkOutPanelMousePressed

    private void dbStatusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbStatusMousePressed
        // TODO add your handling code here:
          if(thread1.getStatus() || !flag2 ){
        JOptionPane.showMessageDialog(null, "Database: "+thread1.getDatabase(), "Connections:", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(flag2){
         JOptionPane.showMessageDialog(null, "No connection!", "Connections:", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_dbStatusMousePressed

    private void clearCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCardActionPerformed
        // TODO add your handling code here:
        
            cardTable.getModel().setValueAt("", 0, 0);
            cardTable.getModel().setValueAt("", 0, 1);
            cardTable.getModel().setValueAt("", 0, 2);
            cardTable.getModel().setValueAt("", 0, 3);
            cardTable.getModel().setValueAt("", 0, 4);
    }//GEN-LAST:event_clearCardActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentActionPerformed

    private void checkInDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_checkInDatePropertyChange
        // TODO add your handling code here:
        try{
            if(checkInDate.getDate() != null){
                if(checkInDate.getDate().after(checkOutDate.getDate()) || checkInDate.equals(checkOutDate)){
                JOptionPane.showMessageDialog(null, "Check-in date cannot be later than check-out date!!", "Check-Out Error", JOptionPane.ERROR_MESSAGE);
                checkInDate.setDate(null);
                }
             }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_checkInDatePropertyChange

    private void checkGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkGuestActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM gueststore WHERE `email` = '"+email.getText()+"'";
        try{
        ArrayList<Guest> list;
        list = cus.checkForGuest(sql, email.getText());
        String tempEmail= email.getText();
            if(!list.isEmpty()){
                JOptionPane.showMessageDialog(null, "Customer details have been found in database...", "Found Customer", JOptionPane.INFORMATION_MESSAGE);
                clearGuestFields();
            
                title.setSelectedItem(list.get(0).getTitle());
                fName.setText(list.get(0).getfName());
                sName.setText(list.get(0).getsName());
                address.setText(list.get(0).getAddress());
                phone.setText(list.get(0).getPhoneNo());
                email.setText(tempEmail);
            }
            else{
                JOptionPane.showMessageDialog(null, "Customer not found in database", "New Guest...", JOptionPane.WARNING_MESSAGE);     
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }   
    }//GEN-LAST:event_checkGuestActionPerformed

    private void searchRoomAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_searchRoomAncestorAdded
        
        lblAvailablity.setVisible(false);
        lblFrom.setVisible(false);
        lblCost.setVisible(false);
        lblType.setVisible(false); 
        tfAvailability.setVisible(false);   
        tfAvailable.setVisible(false); 
        tfCost.setVisible(false);   
        tfRoomType.setVisible(false);
        
        
        tfFN.setVisible(false);  
        tfSN.setVisible(false);   
        lblUnder.setVisible(false);   
        lblCustID.setVisible(false);
        tfCustID.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_searchRoomAncestorAdded

    private void searchGuestAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_searchGuestAncestorAdded
        
        lbRno.setVisible(false); 
        lbFN.setVisible(false); 
        lblPh.setVisible(false); 
        lbAdd.setVisible(false); 
        lbCI.setVisible(false); 
        lbID.setVisible(false); 
        lbSN.setVisible(false); 
        lbEmail.setVisible(false); 
        lbType.setVisible(false); 
        lbNoP.setVisible(false); 
        lbChild.setVisible(false); 
        lbAdult.setVisible(false); 


        tfRoom.setVisible(false); 
        tfFname.setVisible(false); 
        tfPhone.setVisible(false); 
        ta.setVisible(false); 
        tfCheckin.setVisible(false); 
        tfID.setVisible(false); 
        tfSurname.setVisible(false); 
        tfEmail.setVisible(false); 
        tfType.setVisible(false); 
        tfNoP.setVisible(false); 
        tfChildren.setVisible(false); 
        tfAdults.setVisible(false);

    }//GEN-LAST:event_searchGuestAncestorAdded

    private void loggedOnAlertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggedOnAlertActionPerformed
             
    }//GEN-LAST:event_loggedOnAlertActionPerformed

    private void addRecepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecepActionPerformed
      
      JTextField IdField = new JTextField(5);
      JTextField fNameField = new JTextField(15);
      JTextField surnameField = new JTextField(15);  
      JTextField passwordField = new JPasswordField(15);
      JButton ok = new JButton("OK");
      JButton cancel = new JButton("Cancel");
      
      JFrame r = new JFrame("Add new receptionist details");
        r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        r.setSize(300, 200);
        r.setResizable(false);
        r.setLocationByPlatform(true);
        r.setVisible(true);
        r.setBackground(Color.blue); 
     
        
      JPanel addRecep = new JPanel();
      JPanel addRecep2 = new JPanel();
      JPanel addRecep3 = new JPanel();
      JPanel addRecep4 = new JPanel();
      JPanel addRecep5 = new JPanel();
      JPanel addRecep6 = new JPanel();
      JPanel addRecep7 = new JPanel();
      JPanel addRecep8 = new JPanel();
      JPanel addRecep9 = new JPanel();
      JPanel addRecep10 = new JPanel();
      
      addRecep.add(new JLabel("ID: "));
      addRecep2.add(IdField = new JTextField(10));
      addRecep3.add(new JLabel("First Name: "));
      addRecep4.add(fNameField = new JTextField(10));
      addRecep5.add(new JLabel("Surname: "));
      addRecep6.add(surnameField = new JTextField(10));
      addRecep7.add(new JLabel("Password: "));
      addRecep8.add(passwordField = new JPasswordField(10));
      addRecep9.add(ok);
      addRecep10.add(cancel);
      
      String s1 = IdField.getText();
      String s2 = fNameField.getText();
      String s3 = surnameField.getText();
        //char[] pass = passwordField.getPassword();
        //String pwd = String.copyValueOf(pass);  
      String s4 = passwordField.getText();
      
      r.add(addRecep);
      r.add(addRecep2);
      r.add(addRecep3);
      r.add(addRecep4);
      r.add(addRecep5);
      r.add(addRecep6);
      r.add(addRecep7);
      r.add(addRecep8);
      r.add(addRecep9);
      r.add(addRecep10);
      r.setLayout(new GridLayout(5,2));
      
      // ListenerClass listener = new ListenerClass();  
      
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
            });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
            });
    }//GEN-LAST:event_addRecepActionPerformed

    
    private void removeRecepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRecepActionPerformed
        
       String s1 = (String)JOptionPane.showInputDialog(null, "Please enter receptionist ID to delete :\n");
     try {  
            String user = "root";
            String pass2 = "password";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_db", user, pass2); 
            PreparedStatement st = conn.prepareStatement("DELETE FROM receptionist WHERE id = ?");
            st.setString(1,s1);
            st.executeUpdate(); 
            conn.close();
            JOptionPane.showMessageDialog(null, "Receptionist details have removed from database", "Deleted receptionist", JOptionPane.INFORMATION_MESSAGE);   
     }
     catch(Exception e)
     {
            JOptionPane.showMessageDialog(null, "Error in deleting receptionist, details not found in database", "Error", JOptionPane.WARNING_MESSAGE);     
            System.out.println(e);
     }
    }//GEN-LAST:event_removeRecepActionPerformed
    
    private void roomPriceTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomPriceTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomPriceTotalActionPerformed
    private void okActionPerformed(java.awt.event.ActionEvent evt) {                                              
      JTextField IdField = new JTextField();
      JTextField fNameField = new JTextField();
      JTextField surnameField = new JTextField();  
      JTextField passwordField = new JPasswordField();
      
      String s1 = IdField.getText();
      String s2 = fNameField.getText();
      String s3 = surnameField.getText();
      String s4 = passwordField.getText();

        //char[] pass = passwordField.getPassword();
        //String pwd = String.copyValueOf(pass);  
        //String s4 = pwd;
        
      //IdField.setText(""+IdField.getText());
      //fNameField.setText(""+fNameField.getText());
      //surnameField.setText(""+surnameField.getText());
      //passwordField.setText(""+passwordField.getText());
      
        try{
            String user = "root";
            String pass2 = "password";
        
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_db", user, pass2); 
            String sql1 = "INSERT INTO receptionist (id, fname, surname, password) VALUES (?, ?, ?, ?)";
            PreparedStatement pst1 = conn.prepareStatement(sql1);
            pst1.setString(1, s1);
            pst1.setString(2, s2);
            pst1.setString(3, s3);
            pst1.setString(3, s4); 
            pst1.executeUpdate("INSERT INTO receptionist (id, fname, surname, password)" + "VALUES ('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "')");
            conn.close();
            JOptionPane.showMessageDialog(null, "Receptionist details have been successfully added into database", "Added Receptionist", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in creating new receptionist", "Error", JOptionPane.WARNING_MESSAGE);     
            System.out.println(e.getMessage());
        }    
    }    
    
     private void cancelActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
    } 
        
    private void extraTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_extraTextActionPerformed

    private void calculateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBillActionPerformed
        // If the user has selected a room
        if(roomText.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please select a room type for the guest...", "Select a room type", JOptionPane.INFORMATION_MESSAGE); 
        }
        else if(nightsStay.getText().equals("0")){
            JOptionPane.showMessageDialog(null, "Please enter dates.", "Check dates", JOptionPane.WARNING_MESSAGE);
        } 
        else{
         bill.setTotalBill(Double.parseDouble(roomPriceTotal.getText())
                   ,Double.parseDouble(fixedTotal.getText())
                   ,Double.parseDouble(extraText.getText())
                   ,Integer.parseInt(discountTotal.getText())
                   ,Integer.parseInt(nightsStay.getText()));
         totalCost.setText(""+bill.getTotalBill());
        }
    }//GEN-LAST:event_calculateBillActionPerformed

    private void packageCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_packageCheckItemStateChanged
        // TODO add your handling code here:
       
        if(packageCheck.isSelected()){
     
            discountTotal.setText(""+pack.getPackage().getTotalBill());
            fixedTotal.setText(""+pack.getPackage().getFixIncrease());
            extraText.setText(""+pack.getPackage().getExtras());
        }
    }//GEN-LAST:event_packageCheckItemStateChanged

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        
        dispose();
        frame = new LogOnPage();
        frame.setVisible(true);

    }//GEN-LAST:event_LogOutButtonActionPerformed

    public void setColor(javax.swing.JPanel panel){
        panel.setBackground(new java.awt.Color(153, 53, 200));
    }
    public void resetColor(javax.swing.JPanel panel){
        panel.setBackground(new java.awt.Color(67,73,159));
    }
    public void updateBill(){
       CustomPackages custom = new CustomPackages();
       Packages pack;
       pack = custom.getPackage();
       double total;
       discountTotal.setText(""+pack.getTotalBill());
       extraText.setText(""+pack.getExtras());
       fixedTotal.setText(""+(pack.getFixIncrease()+ pack.getFixDecrease()));
       packageCost.setText(""+(pack.getExtras()+pack.getFixIncrease()+pack.getFixDecrease()));
       totalCost.setText(""+(pack.getExtras()+pack.getFixIncrease()+pack.getFixDecrease())*(int)diffDays);
    }
    public static void setPackageCheck(){
        packageCheck.setEnabled(true);
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
    
   public void checkValidInput(boolean booking){
       
    boolean allGood =true;
    boolean validBooking = false;
    CustomPackages cusPack = new CustomPackages();
    
     bill.setTotalBill(Double.parseDouble(roomPriceTotal.getText())
                   ,Double.parseDouble(fixedTotal.getText())
                   ,Double.parseDouble(extraText.getText())
                   ,Integer.parseInt(discountTotal.getText())
                   ,Integer.parseInt(nightsStay.getText()));
     
      totalCost.setText(""+bill.getTotalBill());
    
        // Check if fields are blank
        System.out.print(roomText.getText());
        if(roomText.getText().equals("") || fName.getText().equals("") || sName.getText().equals("") || address.getText().equals("") || (checkInDate.getDate() == null)  
                || (checkOutDate.getDate() == null || email.getText().equals("")) ){
            JOptionPane.showMessageDialog(null, "Fill in all fields", "Fills blank", JOptionPane.ERROR_MESSAGE); 
            allGood = false;    
        }
        if(!roomAvailable && test == 0){
           if(booking){
           allGood = true;
           }
           else if(!booking){
            JOptionPane.showMessageDialog(null, "Room not available..", "Fills blank", JOptionPane.ERROR_MESSAGE);
            allGood = false;
           }      
        }
        
        // If there is no fields left blank then add in the info
        if(allGood){  
            
            // Pass in data from the textfields into our Guest constructor
            Guest checkIn = new Guest((String)title.getSelectedItem(),
            fName.getText(),sName.getText(),address.getText(),
            phone.getText(),email.getText(),Integer.parseInt(roomText.getText()),checkInDate.getDate(),
            checkOutDate.getDate());
            
            // We pass in our boolean "booking"
            Rooms room = new Rooms(Integer.valueOf(guestId.getText()),booking,Integer.valueOf(roomText.getText()),(Integer)adults.getValue(),(Integer)children.getValue());
            
            // Show confirmation box
            int x = JOptionPane.showConfirmDialog(null, (
                    "First Name: "+fName.getText()
                    +"\nSurname: "+sName.getText()
                    +"\nAddress: "+address.getText()
                    +"\nPhone: " +phone.getText()
                    +"\nEmail: "+email.getText()
                    +"\n\n-------------------------------\n"
                    +"Room Number: "+ roomText.getText()
                    +"\nCheck-In: "+checkInDate.getDate()
                    +"\nCheck-Out: "+checkOutDate.getDate()
                    +"\n\n" ), "Check & Confim Details", JOptionPane.OK_CANCEL_OPTION);
            
            // Check to see if room is booked
         
                    try{
                    validBooking = ValidBooking.checkForDoubleBook(checkInDate.getDate(),checkOutDate.getDate(), Integer.valueOf(roomText.getText()));
                    }
                    catch(Exception e){
                    System.out.print(e.getMessage());
                    }
          
            // If OK was selected...add guest to database
            if(x == 0){
                payProcess.setVisible(false);
                payment.setEnabled(true);
                // If the dates are not conflicting & its a booking...
                if(validBooking && booking){
                    rep.addGuest(checkIn);
                    JOptionPane.showMessageDialog(null, "Guest booked in...", "Confirmed", JOptionPane.INFORMATION_MESSAGE);
                    updateGuestId(); 
                    rep.addRoom(room);
                    // check if they wish to book in again
                    if(!bookAgain()){
                        clearGuestFields();
                    }
                    // Add card if card payment type is selected
                    if(addCard.isEnabled()){
                             rep.addCreditCard(card);
                     }
                    if(packageCheck.isSelected()){
                         System.out.println("Package Added..");
                         packageCheck.setEnabled(false);
                         packageCheck.setSelected(false);
                         cusPack.addPackageToDB(Integer.valueOf(guestId.getText())-1);
                     }
                }
                  // If the dates are not conflicting & its a check-in...
                if(!booking && validBooking){
                        rep.addGuest(checkIn);
                        JOptionPane.showMessageDialog(null, "Guest added", "Confirmed", JOptionPane.INFORMATION_MESSAGE);
                        updateGuestId(); 
                        clearGuestFields();
                        rep.addRoom(room);
                     // Add card if card payment type is selected
                     if(addCard.isEnabled()){
                        rep.addCreditCard(card);
                     }
                     if(packageCheck.isSelected()){
                         
                        System.out.println("Package Added..");
                        packageCheck.setEnabled(false);
                        packageCheck.setSelected(false);
                        cusPack.addPackageToDB(Integer.valueOf(guestId.getText())-1);
                     }
                }
                  // If the dates conflict..then display error message
                else if(!validBooking){
                    JOptionPane.showMessageDialog(null, "Invalid dates!!\nPlease re-check booking...", "Invalid dates selected", JOptionPane.ERROR_MESSAGE);
                }    
            }
         }       
   }   
   public boolean bookAgain(){
       boolean bookAgain;
       int x = JOptionPane.showConfirmDialog(null, "Book guest into another room?", "Book another room", JOptionPane.NO_OPTION);
       if(x != 1){
           bookAgain = true;
           // roomPrice,fixedTotal,extraText
           // discountTotal,** nightsStay
           bill.setTotalBill(Double.parseDouble(roomPriceTotal.getText())
                   ,Double.parseDouble(fixedTotal.getText())
                   ,Double.parseDouble(extraText.getText())
                   ,Integer.parseInt(discountTotal.getText())
                   ,Integer.parseInt(nightsStay.getText()));
           totalCost.setText(""+bill.getTotalBill());
           
       }
       else{
           bookAgain =false;
       }
       return bookAgain;
   }
    // Set the boolean used in guest checkin
    public void setCheckRoomBoolean(int x){
     switch(x){
            case 1:
                roomAvailable = true;
                test = 0;
                break;
            case 2:
                roomAvailable = false;
                test = 0;
                break;
            case 3:
                roomBooked = true;
                test = 1;
                break;
        }
    }
    // Refresh the guest id on check in page
    public void updateGuestId(){
    
        try{
            // Query for guest id
            id.getGuestId();
            boolean failed = id.getFailed();
        
        // If server offline....disable Check-In button
            if(failed){
            checkInButt.setEnabled(false);
            bookButt.setEnabled(false);
            addCard.setEnabled(false);
            }
            else if(!failed){
            checkInButt.setEnabled(true);
            bookButt.setEnabled(true);
       
            }
        
        guestId.setText(""+id.getId());
        }
        catch(Exception e){
        System.out.print("Error updating id..");
        }
    }
    public static String getCurrentRoomNo(){
    return roomText.getText();
    }
    // This method takes in a hash map from the RoomStatus class,
    // and keeps getting called in the thread created every 5 sec's.
    // It will set the correct colors for the room jButtons
    // Author J.Fallon
    public static void setRoomButtons(HashMap<Integer,Boolean> room){
        
      // Get the jbuttons located in the parent component and palce in an array
      Component s[] = singlePanel.getComponents();
      Component d[] = doublePanel.getComponents();
      Component b[] = bridalPanel.getComponents();
      Component e[] = executivePanel.getComponents();
 
      // Single rooms start at 200
      int roomNo = 200;
    
      // Loop over single rooms and check status
      System.out.print("\n[Thread 2:] Checking single rooms..");
      for(int i=0;i<8;i++){
        
           // Occupied (Pink)
          if(room.containsKey(roomNo) && room.get(roomNo).equals(room.containsValue(1))){
          s[i].setBackground(new Color(255,204,204));
          }
          // Booked (blue)
          else if(room.containsKey(roomNo) && room.containsValue(true)){
          s[i].setBackground(new Color(102,153,255));
          }
          // Available (Green)
          else if(!room.containsKey(roomNo)){
          s[i].setBackground(new Color(153,255,153));
          }
          roomNo++;
      } // <== Code just stops here....
      System.out.print("\n[Thread 2:] Checking double rooms..");
      
        // Loop over double rooms to check their status
       roomNo = 301;
       for(int i=0;i<6;i++){
        
           // Occupied (Pink)
          if(room.containsKey(roomNo) && room.get(roomNo).equals(room.containsValue(1))){
          d[i].setBackground(new Color(255,204,204));
          }
          // Booked (blue)
          else if(room.containsKey(roomNo) && room.containsValue(true)){
          d[i].setBackground(new Color(102,153,255));
          }
          // Available (Green)
          else if(!room.containsKey(roomNo)){
          d[i].setBackground(new Color(153,255,153));
          }
          roomNo++;
      }  
        // Loop over bridal rooms to check their status
         roomNo = 100;
        System.out.print("\n[Thread 2:] Checking bridal rooms..");
        for(int i=0;i<3;i++){
        
           // Occupied (Pink)
          if(room.containsKey(roomNo) && room.get(roomNo).equals(room.containsValue(1))){
          b[i].setBackground(new Color(255,204,204));
          }
          // Booked (blue)
          else if(room.containsKey(roomNo) && room.containsValue(true)){
          b[i].setBackground(new Color(102,153,255));
          }
          // Available (Green)
          else if(!room.containsKey(roomNo)){
          b[i].setBackground(new Color(153,255,153));
          }
          roomNo++;
      }  
        
        // Loop over executive rooms to check their status
        roomNo = 401;
         System.out.print("\n[Thread 2:] Checking executive rooms..\n");
         for(int i=0;i<6;i++){
        
           // Occupied (Pink)
          if(room.containsKey(roomNo) && room.get(roomNo).equals(room.containsValue(1))){
          e[i].setBackground(new Color(255,204,204));
          }
          // Booked (blue)
          else if(room.containsKey(roomNo) && room.containsValue(true)){
          e[i].setBackground(new Color(102,153,255));
          }
          // Available (Green)
          else if(!room.containsKey(roomNo)){
          e[i].setBackground(new Color(153,255,153));
          }
          roomNo++;
      }  
       String stamp = new SimpleDateFormat("HH:mm:ss a").format(new Date());
       System.out.println("Success!!  "+stamp);
    }
    public static void setPackageText(String name){
    packageText.setText(name);
    }
    public static String getPackageCost() {
        return packageCost.getText();
    }
    public static String getRoomCost() {
        return roomCost.getText();
    }
    public static void setTotal(double total){
        totalCost.setText(""+total);
    }   
    // Method to update the JLabel check mark when selecting a room on checkin screen
    public void updateCheckMark(int x){
        switch(x){
            case 1:
                checkMark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CheckMark_16px.png")));
                break;
            case 2:
                 checkMark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete_16px.png")));
                break;
            default:
                 checkMark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CheckMark_Blue_16px.png")));
                 break;
        }
    }
    
    // Method that changes the server status icon on the footer -- RED / GREEN
    public static void setStatus(boolean flag){
    if(flag){
        dbStatus.setIcon(new javax.swing.ImageIcon(MainFrame.class.getResource("/images/Filled Circle_Green_16px.png")));
         checkInButt.setEnabled(true);
         bookButt.setEnabled(true);
       
        }
    else{
        dbStatus.setIcon(new javax.swing.ImageIcon(MainFrame.class.getResource("/images/Filled Circle_Red_16px.png")));
        checkInButt.setEnabled(false);
        bookButt.setEnabled(false);
      
        flag2 = true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CheckOutViaRoomNo;
    private javax.swing.JPanel abiPanel;
    private static javax.swing.JButton addCard;
    private javax.swing.JButton addRecep;
    private javax.swing.JTextArea address;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JSpinner adults;
    private javax.swing.JRadioButton americanRad;
    private javax.swing.JPanel banner;
    private javax.swing.JLabel bannerTitle;
    private static javax.swing.JButton bookButt;
    private javax.swing.JTable bookingTable;
    private static javax.swing.JPanel bridalPanel;
    private javax.swing.JButton btnSearchRoom;
    private javax.swing.JButton calculateBill;
    private javax.swing.ButtonGroup cardGroup;
    private javax.swing.JTable cardTable;
    private javax.swing.JButton checkGuest;
    private static javax.swing.JButton checkInButt;
    private static com.toedter.calendar.JDateChooser checkInDate;
    private javax.swing.JLabel checkInIcon;
    private javax.swing.JLabel checkInLabel;
    private javax.swing.JLabel checkMark;
    private static com.toedter.calendar.JDateChooser checkOutDate;
    private javax.swing.JLabel checkOutIcon1;
    private javax.swing.JLabel checkOutLab;
    private javax.swing.JPanel checkOutPanel;
    private javax.swing.JPanel checkOutScreen;
    private javax.swing.JPanel checkPanel;
    private javax.swing.JLabel checkinLab;
    private javax.swing.JPanel checkinScreen;
    private javax.swing.JSpinner children;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton clearCard;
    private javax.swing.JLabel close;
    private javax.swing.JPanel currentGuest;
    private javax.swing.JTabbedPane dataTabPane;
    private static javax.swing.JLabel dbStatus;
    public void setStatus(){
        dbStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Filled Circle_Green_16px.png")));
    }
    private javax.swing.ButtonGroup dealsGroup;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JTextField discountTotal;
    private static javax.swing.JPanel doublePanel;
    private javax.swing.JLabel dragBar;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel euroLabel;
    private javax.swing.JLabel euroLabel1;
    private javax.swing.JLabel euroLabel3;
    private javax.swing.JLabel euroLabel4;
    private static javax.swing.JPanel executivePanel;
    private javax.swing.JLabel existLabel;
    private javax.swing.JTextField extraText;
    private javax.swing.JTextField fName;
    private javax.swing.JLabel fNameLablel;
    private javax.swing.JButton findGuest;
    private javax.swing.JTextField fixedTotal;
    private javax.swing.JPanel footer;
    private javax.swing.JTextField guestId;
    private javax.swing.JLabel guestNo;
    private javax.swing.JTable guestTable;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel homeScreen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
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
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLayeredPane layerPane;
    private javax.swing.JLabel lbAdd;
    private javax.swing.JLabel lbAdult;
    private javax.swing.JLabel lbCI;
    private javax.swing.JLabel lbChild;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbFN;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbNoP;
    private javax.swing.JLabel lbRno;
    private javax.swing.JLabel lbSN;
    private javax.swing.JLabel lbType;
    private javax.swing.JLabel lblAvailablity;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblCustID;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblPh;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblUnder;
    private javax.swing.JTextField loggedOnAlert;
    private javax.swing.JLabel lotusText;
    private javax.swing.JRadioButton masterRad;
    private javax.swing.JLabel mini;
    private javax.swing.JTextField nightsStay;
    private javax.swing.JButton packageButton;
    public static javax.swing.JCheckBox packageCheck;
    private static javax.swing.JTextField packageCost;
    public static javax.swing.JTextField packageText;
    private javax.swing.JLabel payProcess;
    private javax.swing.JComboBox<String> payment;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JPanel quitPanel;
    private javax.swing.JButton removeRecep;
    private static javax.swing.JButton room100;
    private static javax.swing.JButton room101;
    private static javax.swing.JButton room103;
    private static javax.swing.JButton room200;
    private static javax.swing.JButton room201;
    private static javax.swing.JButton room202;
    private static javax.swing.JButton room203;
    private static javax.swing.JButton room204;
    private static javax.swing.JButton room205;
    private static javax.swing.JButton room206;
    private static javax.swing.JButton room207;
    private javax.swing.JButton room301;
    private javax.swing.JButton room302;
    private javax.swing.JButton room303;
    private javax.swing.JButton room304;
    private javax.swing.JButton room305;
    private javax.swing.JButton room306;
    private javax.swing.JButton room401;
    private javax.swing.JButton room402;
    private javax.swing.JButton room403;
    private javax.swing.JButton room404;
    private javax.swing.JButton room405;
    private javax.swing.JButton room406;
    private static javax.swing.JTextField roomCost;
    private javax.swing.JPanel roomInfo;
    private javax.swing.JTextField roomNo;
    private javax.swing.JTextField roomPriceTotal;
    private static javax.swing.JTabbedPane roomTab;
    private static javax.swing.JTextField roomText;
    private static javax.swing.JTextField roomType;
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
    public static javax.swing.JPanel singlePanel;
    private java.awt.TextArea ta;
    private javax.swing.JTextField tfAdults;
    private javax.swing.JTextField tfAvailability;
    private javax.swing.JTextField tfAvailable;
    private javax.swing.JTextField tfCheckin;
    private javax.swing.JTextField tfChildren;
    private javax.swing.JTextField tfCost;
    private javax.swing.JTextField tfCustID;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFN;
    private javax.swing.JTextField tfFindGuest;
    private javax.swing.JTextField tfFname;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNoP;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfRoom;
    private javax.swing.JTextField tfRoomType;
    private javax.swing.JTextField tfSN;
    private javax.swing.JTextField tfSurname;
    private javax.swing.JTextField tfType;
    private javax.swing.JComboBox<String> title;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel topPanel;
    private static javax.swing.JTextField totalCost;
    private javax.swing.JRadioButton visaRad;
    private javax.swing.JLabel warnLabel;
    // End of variables declaration//GEN-END:variables

}
