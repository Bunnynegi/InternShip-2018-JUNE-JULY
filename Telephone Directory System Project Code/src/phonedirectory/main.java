package phonedirectory;
  
import java.awt.HeadlessException;
import java.sql.*; 
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class main extends javax.swing.JFrame {  
    
    static Connection conn;
    static Statement st;
    static String a1,b1,c1,d1,e1,f1,g1,h1,i1,j1,k1;
    
    public main() {
        initComponents(); 
        dataentry();      
    } 
    private static void dataentry(String finder){
    try {
               DefaultTableModel model = new DefaultTableModel(new String[]{"Serial_NO", "Telephone", "CA_NO", "Name","Designation","Facility","O_R_F","Address_location","Mobile_NO","Ownership","Email_Address"}, 0);
                
                Class.forName("com.mysql.jdbc.Driver"); 
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/phonedirectory", "root", "root");
                st = conn.createStatement();
                 String stmt="SELECT Serial_NO,Telephone,CA_NO,Name,Designation,Facility,O_R_F,Address_location,Mobile_NO,Ownership,Email_Address  From directory WHERE Serial_NO LIKE '%" + finder +
                        "%' or Telephone LIKE '%"+finder+
                        "%' or CA_NO LIKE '%" + finder +
                        "%' or Name LIKE '%" + finder +
                        "%' or Designation LIKE '%" + finder +
                        "%' or Facility LIKE '%" + finder +
                        "%' or O_R_F LIKE '%" + finder +
                        "%' or Address_location LIKE '%" + finder +
                        "%' or Mobile_NO LIKE '%" + finder +
                        "%' or Ownership LIKE '%" + finder +
                        "%' or Email_Address LIKE '%" + finder + "%'";
                st.executeQuery(stmt);  
                String sql=stmt;
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {     
                    String a = rs.getString("Serial_NO");
                    String b = rs.getString("Telephone");
                    String c = rs.getString("CA_NO");
                    String d = rs.getString("Name");
                    String e = rs.getString("Designation");
                    String f = rs.getString("Facility");
                    String g = rs.getString("O_R_F");
                    String h = rs.getString("Address_location"); 
                    String i = rs.getString("Mobile_NO");
                    String j = rs.getString("Ownership"); 
                    String k = rs.getString("Email_Address"); 
                    model.addRow(new Object[]{a,b,c,d,e,f,g,h,i,j,k});
                }
               
               jTable1.setModel(model);
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
           } 
    }
    private static void dataentry(){ 
           try {
               DefaultTableModel model = new DefaultTableModel(new String[]{"Serial_NO", "Telephone", "CA_NO", "Name","Designation","Facility","O_R_F","Address_location","Mobile_NO","Ownership","Email_Address"}, 0);
               
                String myDriver = "com.mysql.jdbc.Driver";
                String myUrl = "jdbc:mysql://localhost:3306/phonedirectory";
                Class.forName("com.mysql.jdbc.Driver"); 
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/phonedirectory", "root", "root");
                st = conn.createStatement();
                String stmt="SELECT * FROM directory where Remarks !='Archives'";
                st.executeQuery(stmt);  
                String sql=stmt;
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {     
                    String a = rs.getString("Serial_NO");
                    String b = rs.getString("Telephone");
                    String c = rs.getString("CA_NO");
                    String d = rs.getString("Name");
                    String e = rs.getString("Designation");
                    String f = rs.getString("Facility");
                    String g = rs.getString("O_R_F");
                    String h = rs.getString("Address_location"); 
                    String i = rs.getString("Mobile_NO");
                    String j = rs.getString("Ownership"); 
                    String k = rs.getString("Email_Address"); 
                    model.addRow(new Object[]{a,b,c,d,e,f,g,h,i,j,k});
                }
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jTextField13.setText("");
               jTable1.setModel(model);
           } catch (ClassNotFoundException | SQLException e) {
               JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
           } 
           
    }
   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTextField12 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jTextField12.setText("Serial_NO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phone Directory");
        setBackground(new java.awt.Color(50, 148, 212));
        setIconImages(null);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(50, 148, 212));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phonedirectory/header.jpg"))); // NOI18N

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setFont(new java.awt.Font("Tahoma", 2, 11));
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search : ");

        jButton1.setText("Refresh");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 11)); 
        jTextField2.setText("Serial_NO");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 11)); 
        jTextField3.setText("Telephone");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 11)); 
        jTextField4.setText("CA_NO");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 11)); 
        jTextField5.setText("Name");

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 11)); 
        jTextField6.setText("Designation");

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 11)); 
        jTextField7.setText("Facility");

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 11)); 
        jTextField8.setText("O_R_F");

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 11)); 
        jTextField9.setText("Address_location");

        jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 11)); 
        jTextField10.setText("Mobile_NO");

        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 11)); 
        jTextField11.setText("Ownership");

        jTextField13.setFont(new java.awt.Font("Segoe UI", 0, 11)); 
        jTextField13.setText("Email_Address");

        jButton2.setText("Add New Data");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Update");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {
        dataentry(jTextField1.getText()); 
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        dataentry();
        jTextField1.setText("");
        jButton3.setEnabled(false); jButton4.setEnabled(false);
    }
        
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
            a1 = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            b1 = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
            c1 = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            d1 = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
            e1 = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
            f1 = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
            g1 = jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString();
            h1 = jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString();
            i1 = jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString();
            j1 = jTable1.getValueAt(jTable1.getSelectedRow(), 9).toString();
            k1 = jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString(); 
            jTextField2.setText(a1);
            jTextField3.setText(b1);
            jTextField4.setText(c1);
            jTextField5.setText(d1);
            jTextField6.setText(e1);
            jTextField7.setText(f1);
            jTextField8.setText(g1);
            jTextField9.setText(h1);
            jTextField10.setText(i1);
            jTextField11.setText(j1);
            jTextField13.setText(k1);
            jButton2.setEnabled(true);jButton3.setEnabled(true); jButton4.setEnabled(true);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
         new update().setVisible(true);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        Connection con = null;
        Statement st = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/phonedirectory","root","root");
            st = con.createStatement();
            String sqlconn = "UPDATE `directory` SET `Serial_NO` = '" +jTextField2.getText() +
                    "',`Telephone` = '" + jTextField3.getText() +
                    "',`CA_NO` = '" + jTextField4.getText() + 
                    "',`Name` = '" +jTextField5.getText() + 
                    "',`Designation` = '" +jTextField6.getText() + 
                    "',`Facility` = '" + jTextField7.getText() + 
                    "',`O_R_F` = '" + jTextField8.getText() + 
                    "',`Address_location` = '" +jTextField9.getText()+ 
                    "',`Mobile_NO` = '" + jTextField10.getText() + 
                    "',`Ownership` = '" + jTextField11.getText() + 
                    "',`Email_Address` = '" + jTextField13.getText() + 
                    
                    "' WHERE `directory`.`Serial_NO` = '" + a1 + 
                    "' and `Telephone` = '" + b1 +
                    "' and `CA_NO` = '" + c1 +
                    "' and `Name` = '" + d1 +
                    "' and `Designation` = '" + e1 +
                    "' and `Facility` = '" + f1 +
                    "' and `O_R_F` = '" + g1 +
                    "' and `Address_location` = '" + h1 + 
                    "' and `Mobile_NO` = '" + i1 + 
                    "' and `Ownership` = '" + j1 + 
                    "' and `Email_Address` = '" + k1 + "'";
            st.executeUpdate(sqlconn);
          
            dataentry(); 
          
      }catch(HeadlessException | SQLException ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      }  
    }
    private static void archive(){
        Connection con = null;
        Statement st = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/phonedirectory","root","root");
            st = con.createStatement();
            String sqlconn = "UPDATE `directory` SET `Remarks` = 'Archives' WHERE `directory`.`Serial_NO` = '" + a1 + 
                    "' and `Telephone` = '" + b1 +
                    "' and `CA_NO` = '" + c1 +
                    "' and `Name` = '" + d1 +
                    "' and `Designation` = '" + e1 +
                    "' and `Facility` = '" + f1 +
                    "' and `O_R_F` = '" + g1 +
                    "' and `Address_location` = '" + h1 + 
                    "' and `Mobile_NO` = '" + i1 + 
                    "' and `Ownership` = '" + j1 + 
                    "' and `Email_Address` = '" + k1 + "'";
            
            st.executeUpdate(sqlconn);
          
            dataentry(); 
          
      }catch(HeadlessException | SQLException ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      } 
    }
    private static void archiveview(){
         try {
               DefaultTableModel model = new DefaultTableModel(new String[]{"Serial_NO", "Telephone", "CA_NO", "Name","Designation","Facility","O_R_F","Address_location","Mobile_NO","Ownership","Email_Address"}, 0);
               
                String myDriver = "com.mysql.jdbc.Driver";
                String myUrl = "jdbc:mysql://localhost:3306/phonedirectory";
                Class.forName("com.mysql.jdbc.Driver"); 
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/phonedirectory", "root", "root");
                st = conn.createStatement();
                String stmt="SELECT * FROM directory where Remarks = 'Archives'";
                st.executeQuery(stmt);  
                String sql=stmt;
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {     
                    String a = rs.getString("Serial_NO");
                    String b = rs.getString("Telephone");
                    String c = rs.getString("CA_NO");
                    String d = rs.getString("Name");
                    String e = rs.getString("Designation");
                    String f = rs.getString("Facility");
                    String g = rs.getString("O_R_F");
                    String h = rs.getString("Address_location"); 
                    String i = rs.getString("Mobile_NO");
                    String j = rs.getString("Ownership"); 
                    String k = rs.getString("Email_Address"); 
                    model.addRow(new Object[]{a,b,c,d,e,f,g,h,i,j,k});
                }
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jTextField13.setText("");
               jTable1.setModel(model);
           } catch (ClassNotFoundException | SQLException e) {
               JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
           } 
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete "+jTextField2.getText()+" record ?", "System Notification", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            
         Connection con = null;
        Statement st = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/phonedirectory","root","root");
            st = con.createStatement();
            String sqlconn = "delete from `directory` where `Serial_NO` = '" + a1 + 
                    "' and `Telephone` = '" + b1 +
                    "' and `CA_NO` = '" + c1 +
                    "' and `Name` = '" + d1 +
                    "' and `Designation` = '" + e1 +
                    "' and `Facility` = '" + f1 +
                    "' and `O_R_F` = '" + g1 +
                    "' and `Address_location` = '" + h1 + 
                    "' and `Mobile_NO` = '" + i1 + 
                    "' and `Ownership` = '" + j1 + 
                    "' and `Email_Address` = '" + k1 + "'";
            st.executeUpdate(sqlconn);
          
            dataentry(); 
            
      }catch(HeadlessException | SQLException ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      }  
        }
        else { 
        }  
    }

    
    public static void main(String args[]) {   
        try { 
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(() -> {
            new main().setVisible(true);
        });
    } 
 
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField10;
    private static javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private static javax.swing.JTextField jTextField13;
    private static javax.swing.JTextField jTextField2;
    private static javax.swing.JTextField jTextField3;
    private static javax.swing.JTextField jTextField4;
    private static javax.swing.JTextField jTextField5;
    private static javax.swing.JTextField jTextField6;
    private static javax.swing.JTextField jTextField7;
    private static javax.swing.JTextField jTextField8;
    private static javax.swing.JTextField jTextField9;
 
}