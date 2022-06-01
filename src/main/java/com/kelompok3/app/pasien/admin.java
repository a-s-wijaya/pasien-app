/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kelompok3.app.pasien;

import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fauza
 */
public class admin extends javax.swing.JFrame {
    boolean sidePaneHidden = false;
    private String id_user = null;
    
    /**
     * Creates new form user
     */
    public admin() {
        initComponents();
        ShowTableAdmin("SELECT id, username, LENGTH(password) FROM admin");
        clean();
        btnCancelEdit.setVisible(false);
        edit.setEnabled(false);
    }
    
    String censorPass(String count) {
        String censored = "";
//        for (int i = 0; i < Integer.parseInt(count); i++) {
//            censored = censored + "*";
//        }
        censored = new String(new char[Integer.parseInt(count)]).replace("\0", "*");
        return censored;
    }
    
    public void ShowTableAdmin (String query) {
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("ID");
        tb.addColumn("Username");
        tb.addColumn("Password");
        tb.addColumn("");
        tb.addColumn("");
        
        try {
            java.sql.Connection conn =(Connection)DBconnection.configDB();
            java.sql.Statement s = conn.createStatement();
            java.sql.ResultSet r = s.executeQuery(query);
            
            while (r.next()){
                tb.addRow(new Object[]{
                    r.getString(1),r.getString(2), censorPass(r.getString(3)), "📝 edit", "🗑️ delete"
                });
                tabel_admin.setModel(tb);
            }
            setTableModel setTableModel = new setTableModel(tabel_admin);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e);
            System.out.println("at: " + e.getStackTrace()[0] + e);
        }
    }
    
    private void clean(){
        username.setText("");
        pass.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sidePane = new javax.swing.JPanel();
        itemSidebar3 = new javax.swing.JPanel();
        iconDokter = new javax.swing.JLabel();
        labelMenu3 = new javax.swing.JLabel();
        itemSidebar1 = new javax.swing.JPanel();
        iconPasien = new javax.swing.JLabel();
        labelMenu1 = new javax.swing.JLabel();
        itemSidebar0 = new javax.swing.JPanel();
        iconTitle = new javax.swing.JLabel();
        labelMenu0 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        itemSidebar2 = new javax.swing.JPanel();
        iconKamar = new javax.swing.JLabel();
        labelMenu2 = new javax.swing.JLabel();
        itemSidebar4 = new javax.swing.JPanel();
        iconAdmin = new javax.swing.JLabel();
        labelMenu4 = new javax.swing.JLabel();
        itemSidebar5 = new javax.swing.JPanel();
        iconAdmin1 = new javax.swing.JLabel();
        labelMenu5 = new javax.swing.JLabel();
        contentPane = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        fieldCari = new javax.swing.JTextField();
        labelCari = new javax.swing.JLabel();
        labelSpesialis1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_admin = new javax.swing.JTable();
        labelSpesialis2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        btnCancelEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        background.setBackground(new java.awt.Color(35, 40, 44));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePane.setBackground(new java.awt.Color(21, 25, 28));
        sidePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemSidebar3.setBackground(new java.awt.Color(21, 25, 28));
        itemSidebar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemSidebar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemSidebar3MouseClicked(evt);
            }
        });

        iconDokter.setBackground(new java.awt.Color(21, 25, 28));
        iconDokter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconDokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_stethoscope_16px.png"))); // NOI18N
        iconDokter.setOpaque(true);

        labelMenu3.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        labelMenu3.setForeground(new java.awt.Color(255, 255, 255));
        labelMenu3.setText("Data Dokter");

        javax.swing.GroupLayout itemSidebar3Layout = new javax.swing.GroupLayout(itemSidebar3);
        itemSidebar3.setLayout(itemSidebar3Layout);
        itemSidebar3Layout.setHorizontalGroup(
            itemSidebar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemSidebar3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(iconDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMenu3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );
        itemSidebar3Layout.setVerticalGroup(
            itemSidebar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemSidebar3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(itemSidebar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelMenu3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(iconDokter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        sidePane.add(itemSidebar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, 80));

        itemSidebar1.setBackground(new java.awt.Color(21, 25, 28));
        itemSidebar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemSidebar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemSidebar1MouseClicked(evt);
            }
        });

        iconPasien.setBackground(new java.awt.Color(21, 25, 28));
        iconPasien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_wheelchair_16px.png"))); // NOI18N
        iconPasien.setOpaque(true);

        labelMenu1.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        labelMenu1.setForeground(new java.awt.Color(255, 255, 255));
        labelMenu1.setText("Data Pasien");

        javax.swing.GroupLayout itemSidebar1Layout = new javax.swing.GroupLayout(itemSidebar1);
        itemSidebar1.setLayout(itemSidebar1Layout);
        itemSidebar1Layout.setHorizontalGroup(
            itemSidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemSidebar1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(iconPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        itemSidebar1Layout.setVerticalGroup(
            itemSidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemSidebar1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(itemSidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(iconPasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        sidePane.add(itemSidebar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        itemSidebar0.setBackground(new java.awt.Color(21, 25, 28));
        itemSidebar0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemSidebar0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemSidebar0MouseClicked(evt);
            }
        });

        iconTitle.setBackground(new java.awt.Color(21, 25, 28));
        iconTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_hospital_32px.png"))); // NOI18N
        iconTitle.setOpaque(true);

        labelMenu0.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        labelMenu0.setForeground(new java.awt.Color(255, 255, 255));
        labelMenu0.setText("Pasien-App");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout itemSidebar0Layout = new javax.swing.GroupLayout(itemSidebar0);
        itemSidebar0.setLayout(itemSidebar0Layout);
        itemSidebar0Layout.setHorizontalGroup(
            itemSidebar0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemSidebar0Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(iconTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMenu0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemSidebar0Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        itemSidebar0Layout.setVerticalGroup(
            itemSidebar0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemSidebar0Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(itemSidebar0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelMenu0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sidePane.add(itemSidebar0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        itemSidebar2.setBackground(new java.awt.Color(21, 25, 28));
        itemSidebar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemSidebar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemSidebar2MouseClicked(evt);
            }
        });

        iconKamar.setBackground(new java.awt.Color(21, 25, 28));
        iconKamar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconKamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_bed_16px_9.png"))); // NOI18N
        iconKamar.setOpaque(true);

        labelMenu2.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        labelMenu2.setForeground(new java.awt.Color(255, 255, 255));
        labelMenu2.setText("Data Kamar");

        javax.swing.GroupLayout itemSidebar2Layout = new javax.swing.GroupLayout(itemSidebar2);
        itemSidebar2.setLayout(itemSidebar2Layout);
        itemSidebar2Layout.setHorizontalGroup(
            itemSidebar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemSidebar2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(iconKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        itemSidebar2Layout.setVerticalGroup(
            itemSidebar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemSidebar2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(itemSidebar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(iconKamar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        sidePane.add(itemSidebar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        itemSidebar4.setBackground(new java.awt.Color(21, 25, 28));
        itemSidebar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemSidebar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemSidebar4MouseClicked(evt);
            }
        });

        iconAdmin.setBackground(new java.awt.Color(54, 79, 205));
        iconAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_microsoft_admin_16px.png"))); // NOI18N
        iconAdmin.setOpaque(true);

        labelMenu4.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        labelMenu4.setForeground(new java.awt.Color(255, 255, 255));
        labelMenu4.setText("Data Admin");

        javax.swing.GroupLayout itemSidebar4Layout = new javax.swing.GroupLayout(itemSidebar4);
        itemSidebar4.setLayout(itemSidebar4Layout);
        itemSidebar4Layout.setHorizontalGroup(
            itemSidebar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemSidebar4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(iconAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMenu4, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        itemSidebar4Layout.setVerticalGroup(
            itemSidebar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemSidebar4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(itemSidebar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelMenu4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(iconAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        sidePane.add(itemSidebar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, -1));

        itemSidebar5.setBackground(new java.awt.Color(21, 25, 28));
        itemSidebar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemSidebar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemSidebar5MouseClicked(evt);
            }
        });

        iconAdmin1.setBackground(new java.awt.Color(21, 25, 28));
        iconAdmin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconAdmin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_shutdown_16px.png"))); // NOI18N
        iconAdmin1.setOpaque(true);

        labelMenu5.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        labelMenu5.setForeground(new java.awt.Color(255, 255, 255));
        labelMenu5.setText("Logout");

        javax.swing.GroupLayout itemSidebar5Layout = new javax.swing.GroupLayout(itemSidebar5);
        itemSidebar5.setLayout(itemSidebar5Layout);
        itemSidebar5Layout.setHorizontalGroup(
            itemSidebar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemSidebar5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(iconAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMenu5, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        itemSidebar5Layout.setVerticalGroup(
            itemSidebar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemSidebar5Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(itemSidebar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelMenu5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(iconAdmin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        sidePane.add(itemSidebar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, -1, -1));

        background.add(sidePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 660));

        contentPane.setBackground(new java.awt.Color(35, 40, 44));
        contentPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(255, 255, 255));
        contentPane.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 250, 39));

        simpan.setBackground(new java.awt.Color(21, 25, 28));
        simpan.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        simpan.setForeground(new java.awt.Color(255, 255, 255));
        simpan.setText("Tambah");
        simpan.setBorder(null);
        simpan.setOpaque(true);
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        contentPane.add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 109, 49));

        edit.setBackground(new java.awt.Color(21, 25, 28));
        edit.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Ubah");
        edit.setBorder(null);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        contentPane.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 109, 49));

        fieldCari.setBackground(new java.awt.Color(255, 255, 255));
        fieldCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldCariKeyReleased(evt);
            }
        });
        contentPane.add(fieldCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 320, 39));

        labelCari.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        labelCari.setForeground(new java.awt.Color(255, 255, 255));
        labelCari.setText("Cari");
        contentPane.add(labelCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, 40));

        labelSpesialis1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        labelSpesialis1.setForeground(new java.awt.Color(255, 255, 255));
        labelSpesialis1.setText("Username");
        contentPane.add(labelSpesialis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(35, 40, 44));
        jScrollPane1.setBorder(null);

        tabel_admin.setForeground(new java.awt.Color(0, 0, 0));
        tabel_admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Username", "Password", "  ", "  "
            }
        ));
        tabel_admin.setToolTipText("");
        tabel_admin.setOpaque(false);
        tabel_admin.setSelectionForeground(new java.awt.Color(21, 25, 28));
        tabel_admin.setShowGrid(true);
        tabel_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_adminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_admin);

        contentPane.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 470, 530));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(35,40,44));

        labelSpesialis2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        labelSpesialis2.setForeground(new java.awt.Color(255, 255, 255));
        labelSpesialis2.setText("Password");
        contentPane.add(labelSpesialis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        pass.setBackground(new java.awt.Color(255, 255, 255));
        contentPane.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 250, 39));

        btnCancelEdit.setBackground(new java.awt.Color(21, 25, 28));
        btnCancelEdit.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCancelEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Close_16px_1.png"))); // NOI18N
        btnCancelEdit.setText("Batal Penyuntingan");
        btnCancelEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelEditActionPerformed(evt);
            }
        });
        contentPane.add(btnCancelEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, 30));

        background.add(contentPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 820, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemSidebar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSidebar3MouseClicked
        new dokter().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_itemSidebar3MouseClicked

    private void itemSidebar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSidebar1MouseClicked
        new pasien().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_itemSidebar1MouseClicked

    private void itemSidebar0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSidebar0MouseClicked
        // 200
        if(sidePaneHidden == false) {
            sidePane.setBounds(sidePane.getX(), sidePane.getY(), 72, sidePane.getHeight());
            contentPane.setBounds(contentPane.getX() - 72, contentPane.getY(), contentPane.getWidth() + 72 , contentPane.getHeight());
            sidePaneHidden = true;
        }
        else {
            sidePane.setBounds(sidePane.getX(), sidePane.getY(), 200, sidePane.getHeight());
            contentPane.setBounds(contentPane.getX() + 72, contentPane.getY(), contentPane.getWidth() - 72 , contentPane.getHeight());
            sidePaneHidden = false;
        }
    }//GEN-LAST:event_itemSidebar0MouseClicked

    private void itemSidebar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSidebar4MouseClicked
//        new admin().setVisible(true);
//        this.setVisible(false);
//        this.dispose();
    }//GEN-LAST:event_itemSidebar4MouseClicked

    private void itemSidebar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSidebar5MouseClicked
        new login().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_itemSidebar5MouseClicked

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        String usernm = username.getText();
        String password = pass.getText();
        
        if(username.equals("")){
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
        } else if (pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");
        } else {
            try {
                String sql = "INSERT INTO admin VALUES (NULL,'"+usernm+"','"+password+"')";
                java.sql.Connection conn =(Connection)DBconnection.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
                ShowTableAdmin("SELECT id, username, LENGTH(password) FROM admin");
                clean();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Ditambahkan");
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        String usernm = username.getText();
        String password = pass.getText();
        
        if(username.equals("")){
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
        } else if (pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");
        } else {
            try {
                String Q = "UPDATE admin SET username = '"+usernm+"', password = '"+password+"' WHERE id = '" + this.id_user + "'";
                java.sql.Connection conn = (Connection)DBconnection.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(Q);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
                ShowTableAdmin("SELECT id, username, LENGTH(password) FROM admin");
                clean();
                simpan.setEnabled(true);
                btnCancelEdit.setVisible(false);
                edit.setEnabled(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_editActionPerformed

    private void fieldCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCariKeyReleased
                String sql = "SELECT id, username, LENGTH(password) FROM admin WHERE id LIKE '%" + fieldCari.getText() + "%' OR username LIKE '%" + fieldCari.getText() + "%'";
                ShowTableAdmin(sql);
    }//GEN-LAST:event_fieldCariKeyReleased

    private void tabel_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_adminMouseClicked
        int row = tabel_admin.rowAtPoint(evt.getPoint());
        int col = tabel_admin.columnAtPoint(evt.getPoint());
        
        if(row >= 0 && col >= 0) {
            Object getId = tabel_admin.getModel().getValueAt(row, 0);
            Object getUsername = tabel_admin.getModel().getValueAt(row, 1);
            String getPassword = "";
            if(col == tabel_admin.getColumnModel().getColumnCount() - 2) {
                edit.setEnabled(true);
                this.id_user = "" + getId;
                try {
                    String query = "SELECT password FROM admin WHERE id = '" + this.id_user + "' LIMIT 1";
                    java.sql.Connection conn =(Connection)DBconnection.configDB();
                    java.sql.Statement s = conn.createStatement();
                    java.sql.ResultSet r = s.executeQuery(query);
                    
                    while(r.next()) {
                        getPassword = "" + r.getString("password");
                    }
//                    System.out.println("Password = " + getPassword);
                } catch(Exception e) {
                    System.out.println("Get password failed: " + e);
                }
                
                username.setText("" + getUsername);
                pass.setText("" + getPassword);
                simpan.setEnabled(false);
                btnCancelEdit.setVisible(true);
            } else if(col == tabel_admin.getColumnModel().getColumnCount() - 1) {
                this.id_user = "" + getId;
                int res = JOptionPane.showConfirmDialog(null, "Are you sure want to delete? Deleted data cannot be recovered", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (res == JOptionPane.YES_OPTION) {
                    try {
                        String Q = "DELETE FROM admin WHERE id = '" + this.id_user + "'";
                        java.sql.Connection conn = (Connection)DBconnection.configDB();
                        java.sql.PreparedStatement pst = conn.prepareStatement(Q);
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Delete Success", "Success", JOptionPane.INFORMATION_MESSAGE);
                        ShowTableAdmin("SELECT id, username, LENGTH(password) FROM admin");
                        clean();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Data Gagal Dihapus", "Error", JOptionPane.ERROR_MESSAGE);
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
                }
                else if(res == JOptionPane.NO_OPTION) {
                    System.out.println("deleteAdmin.abort");
                }
                else {
                    System.out.println("deleteAdmin.cancel");
                }
            }
        }
        
//        this.id_user = tabel_admin.getValueAt(row, 0).toString();
//        String usernm = tabel_admin.getValueAt(row, 1).toString();
//        username.setText(usernm);
//        String password = tabel_admin.getValueAt(row, 2).toString();
//        pass.setText(password);
    }//GEN-LAST:event_tabel_adminMouseClicked

    private void itemSidebar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSidebar2MouseClicked
        new kamar().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_itemSidebar2MouseClicked

    private void btnCancelEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelEditActionPerformed
        clean();
        btnCancelEdit.setVisible(false);
        simpan.setEnabled(true);
        edit.setEnabled(false);
    }//GEN-LAST:event_btnCancelEditActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCancelEdit;
    private javax.swing.JPanel contentPane;
    private javax.swing.JButton edit;
    private javax.swing.JTextField fieldCari;
    private javax.swing.JLabel iconAdmin;
    private javax.swing.JLabel iconAdmin1;
    private javax.swing.JLabel iconDokter;
    private javax.swing.JLabel iconKamar;
    private javax.swing.JLabel iconPasien;
    private javax.swing.JLabel iconTitle;
    private javax.swing.JPanel itemSidebar0;
    private javax.swing.JPanel itemSidebar1;
    private javax.swing.JPanel itemSidebar2;
    private javax.swing.JPanel itemSidebar3;
    private javax.swing.JPanel itemSidebar4;
    private javax.swing.JPanel itemSidebar5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCari;
    private javax.swing.JLabel labelMenu0;
    private javax.swing.JLabel labelMenu1;
    private javax.swing.JLabel labelMenu2;
    private javax.swing.JLabel labelMenu3;
    private javax.swing.JLabel labelMenu4;
    private javax.swing.JLabel labelMenu5;
    private javax.swing.JLabel labelSpesialis1;
    private javax.swing.JLabel labelSpesialis2;
    private javax.swing.JTextField pass;
    private javax.swing.JPanel sidePane;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel_admin;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
