/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kelompok3.app.pasien;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author fauza
 */
public class kamar extends javax.swing.JFrame {
    boolean sidePaneHidden = false;

    /**
     * Creates new form kamar
     */
    
    String checkNull(String field) {
        if (field == null) {
            field = "Tidak Ada";
        }
        
        return field;
    }
    
    public void showTableKamar(String sql) {
    DefaultTableModel tb = new DefaultTableModel();
    tb.addColumn("kode kamar");
    tb.addColumn("id pasien");
    tb.addColumn("status");
    tb.addColumn("");
    tb.addColumn("");
        try {
            String query = "SELECT * FROM kamar";
            java.sql.Connection conn=(Connection)DBconnection.configDB();
            java.sql.Statement s = conn.createStatement();
            java.sql.ResultSet r = s.executeQuery(query);
            while (r.next()){
                tb.addRow(new Object[]{
                    r.getString(1),checkNull(r.getString(2)),r.getString(3), "ø kosongkan", "🗑️ delete"
                });
            }
            tabel_kamar.setModel(tb);
            setTableModel setTableModel = new setTableModel().setFirst(100).setLast(70).setLastTwo(90).build(tabel_kamar);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void clean(){
        in_kamar.setText(null);
    }
    
    public kamar() {
        initComponents();
        showTableKamar("SELECT * FROM kamar");
        clean();
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
        in_kamar = new javax.swing.JTextField();
        labelNama = new javax.swing.JLabel();
        b_tambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_kamar = new javax.swing.JTable();
        labelCari = new javax.swing.JLabel();
        fieldCari = new javax.swing.JTextField();

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

        iconKamar.setBackground(new java.awt.Color(54, 79, 205));
        iconKamar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconKamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_bed_16px_9.png"))); // NOI18N
        iconKamar.setOpaque(true);

        labelMenu2.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
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

        iconAdmin.setBackground(new java.awt.Color(21, 25, 28));
        iconAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_microsoft_admin_16px.png"))); // NOI18N
        iconAdmin.setOpaque(true);

        labelMenu4.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
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

        in_kamar.setBackground(new java.awt.Color(255, 255, 255));
        contentPane.add(in_kamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 250, 39));

        labelNama.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        labelNama.setForeground(new java.awt.Color(255, 255, 255));
        labelNama.setText("Kode Kamar");
        contentPane.add(labelNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        b_tambah.setBackground(new java.awt.Color(21, 25, 28));
        b_tambah.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        b_tambah.setForeground(new java.awt.Color(255, 255, 255));
        b_tambah.setText("Tambah");
        b_tambah.setBorder(null);
        b_tambah.setOpaque(true);
        b_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tambahActionPerformed(evt);
            }
        });
        contentPane.add(b_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 250, 49));

        jScrollPane1.setBackground(new java.awt.Color(35, 40, 44));
        jScrollPane1.setBorder(null);

        tabel_kamar.setForeground(new java.awt.Color(0, 0, 0));
        tabel_kamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "kode_kamar", "id_pasien", "status"
            }
        ));
        tabel_kamar.setToolTipText("");
        tabel_kamar.setOpaque(false);
        tabel_kamar.setSelectionForeground(new java.awt.Color(21, 25, 28));
        tabel_kamar.setShowGrid(true);
        tabel_kamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_kamarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_kamar);
        if (tabel_kamar.getColumnModel().getColumnCount() > 0) {
            tabel_kamar.getColumnModel().getColumn(0).setHeaderValue("kode_kamar");
        }

        contentPane.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 510, 540));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(35,40,44));

        labelCari.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        labelCari.setForeground(new java.awt.Color(255, 255, 255));
        labelCari.setText("Cari");
        contentPane.add(labelCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, 40));

        fieldCari.setBackground(new java.awt.Color(255, 255, 255));
        fieldCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldCariKeyReleased(evt);
            }
        });
        contentPane.add(fieldCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 320, 39));

        background.add(contentPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 820, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void b_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tambahActionPerformed
        if(in_kamar.equals("")){
            JOptionPane.showMessageDialog(null, "kode_kamar tidak boleh kosong");
        }else{
            try {
                String sql = "INSERT INTO kamar VALUES ('"+in_kamar.getText()+"', NULL,'Kosong')";
                java.sql.Connection conn=(Connection)DBconnection.configDB();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
                showTableKamar("SELECT * FROM kamar");
                clean();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Tambah Data Gagal");
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_b_tambahActionPerformed

    private void tabel_kamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_kamarMouseClicked
        int row = tabel_kamar.rowAtPoint(evt.getPoint());
        int col = tabel_kamar.columnAtPoint(evt.getPoint());
        
        if(row >= 0 && col >= 0) {
            Object getKd = tabel_kamar.getValueAt(row, 0);
            String kd_kamar = String.valueOf(getKd);
            if(col == tabel_kamar.getColumnCount() - 2){
                int res = JOptionPane.showConfirmDialog(null, "Apakah kamu yakin ingin mengosongkan kamar?", "Kosongkan Kamar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(res == JOptionPane.YES_OPTION) {
                    try {
                        String sql = "UPDATE kamar SET id_pasien = NULL WHERE kode_kamar = ?";
                    
                        Connection con = DBconnection.configDB();
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setString(1, kd_kamar);
                        ps.executeUpdate();
                        
                        showTableKamar("SELECT * FROM kamar");
                        JOptionPane.showMessageDialog(null, "Berhasil dikosongkan", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                    catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Something went wrong: " + e, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else if(res == JOptionPane.NO_OPTION) {
                    System.out.println("kosongkan.abort");
                }
                else {
                    System.out.println("kosongkan.cancel");
                }
            }
            else if(col == tabel_kamar.getColumnCount() - 1) {
                int res = JOptionPane.showConfirmDialog(null, "Apakah kamu yakin ingin mengosongkan kamar?", "Kosongkan Kamar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(res == JOptionPane.YES_OPTION) {
                    try {
                        String sql = "DELETE FROM kamar WHERE kode_kamar = ?";

                        Connection con = DBconnection.configDB();
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setString(1, kd_kamar);
                        ps.executeUpdate();

                        showTableKamar("SELECT * FROM kamar");
                        JOptionPane.showMessageDialog(null, "Delete Success", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                    catch(Exception e) {
                        JOptionPane.showMessageDialog(null, "Something went wrong: " + e, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else if(res == JOptionPane.NO_OPTION) {
                    System.out.println("delete.abort");
                }
                else {
                    System.out.println("delete.cancel");
                }
            }
        }
    }//GEN-LAST:event_tabel_kamarMouseClicked

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

    private void itemSidebar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSidebar4MouseClicked
        new admin().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_itemSidebar4MouseClicked

    private void itemSidebar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSidebar5MouseClicked
        new login().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_itemSidebar5MouseClicked

    private void fieldCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCariKeyReleased
        String sql = "SELECT * FROM kamar WHERE kode_dokter LIKE '%" + fieldCari.getText() + "%'";
        showTableKamar(sql);
    }//GEN-LAST:event_fieldCariKeyReleased
    
    
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
            java.util.logging.Logger.getLogger(kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_tambah;
    private javax.swing.JPanel background;
    private javax.swing.JPanel contentPane;
    private javax.swing.JTextField fieldCari;
    private javax.swing.JLabel iconAdmin;
    private javax.swing.JLabel iconAdmin1;
    private javax.swing.JLabel iconDokter;
    private javax.swing.JLabel iconKamar;
    private javax.swing.JLabel iconPasien;
    private javax.swing.JLabel iconTitle;
    private javax.swing.JTextField in_kamar;
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
    private javax.swing.JLabel labelNama;
    private javax.swing.JPanel sidePane;
    private javax.swing.JTable tabel_kamar;
    // End of variables declaration//GEN-END:variables
}
