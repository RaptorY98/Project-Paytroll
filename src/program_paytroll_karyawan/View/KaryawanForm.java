/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_paytroll_karyawan.View;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import program_paytroll_karyawan.Controller.KaryawanController;
import program_paytroll_karyawan.Model.ComboBoxModel;
import program_paytroll_karyawan.Model.LoginModel;

/**
 *
 * @author lincbp
 */
public class KaryawanForm extends javax.swing.JPanel {
    private KaryawanController controller;
    private LoginModel loginData;
    /**
     * Creates new form KaryawanForm
     */
    public KaryawanForm(LoginModel loginModel) {
        initComponents();
        loginData = loginModel;
        controller = new KaryawanController(this);
        controller.isiTable();
        
        controller.initRoleValue();
        controller.initActive();
        controller.initLocation();
        
        this.idTxt.setVisible(false);
        this.idDisplay.setVisible(false);
    }
    
    public LoginModel accessLoginData(){
        return loginData;
    }
    public JTextField getSearch(){
        return searchInput;
    }
        
    public JTextField getIdTxt(){
        return idTxt;
    }
    public JTable getTable() {
        return dataTable;
    }
    
    public JTextField getEmployeName(){
        return employeNameTxt;
    }
    
    public JDateChooser getDob(){
        return dateOfBirthTxt;
    }
    
    public JTextField getNik(){
        return nikTxt;
    }
    
    public JTextField getUsername(){
        return usernameTxt;
    }
    
    public JPasswordField getPassword(){
        return passwordTxt;
    }
    
    public JComboBox getRole(){
        return roleCombo;
    }
    
    public JTextField getSalary(){
        return salaryTxt;
    }
    
    public JComboBox getLocationCombo(){
        return locationCombo;
    }
    
    public JComboBox getDepartementCombo(){
        return departementCombo;
    }
    
    public JComboBox getDivisionCombo(){
        return divisionCombo;
    }
    
    public JComboBox getIsActive(){
        return isActiveTxt;
    }
    
    public JButton getButtonEdit(){
        return editButton;
    }
    public JButton getButtonSave(){
        return saveButton;
    }
    
    public void moveToForm(){
        cardLayout.removeAll();
        cardLayout.repaint();
        cardLayout.revalidate();
        
        cardLayout.add(formPanel);
        cardLayout.repaint();
        cardLayout.revalidate();
    }
    
    public void moveToTable(){
        cardLayout.removeAll();
        cardLayout.repaint();
        cardLayout.revalidate();
        
        cardLayout.add(masterPanel);
        cardLayout.repaint();
        cardLayout.revalidate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardLayout = new javax.swing.JPanel();
        masterPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        searchInput = new javax.swing.JTextField();
        addNavButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        formPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        backNavButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        idDisplay = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        employeNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nikTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        salaryTxt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        isActiveTxt = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        locationCombo = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        departementCombo = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        divisionCombo = new javax.swing.JComboBox<>();
        editButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        roleCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        cardLayout.setLayout(new java.awt.CardLayout());

        masterPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Master Data > Karyawan");

        jLabel3.setText("Search");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_paytroll_karyawan/Assets/Icons/audience.png"))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
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
        dataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataTable);

        addNavButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        addNavButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_paytroll_karyawan/Assets/Icons/Plus.png"))); // NOI18N
        addNavButton.setText("Tambah");
        addNavButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNavButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout masterPanelLayout = new javax.swing.GroupLayout(masterPanel);
        masterPanel.setLayout(masterPanelLayout);
        masterPanelLayout.setHorizontalGroup(
            masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addGroup(masterPanelLayout.createSequentialGroup()
                        .addComponent(addNavButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masterPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masterPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))))
                .addContainerGap())
        );
        masterPanelLayout.setVerticalGroup(
            masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterPanelLayout.createSequentialGroup()
                .addGroup(masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addNavButton)
                    .addGroup(masterPanelLayout.createSequentialGroup()
                        .addGroup(masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardLayout.add(masterPanel, "card2");

        formPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Master Data > Karyawan > Update");

        backNavButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_paytroll_karyawan/Assets/Icons/Back.png"))); // NOI18N
        backNavButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backNavButton1ActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(360, 211));

        idDisplay.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        idDisplay.setForeground(new java.awt.Color(102, 102, 102));
        idDisplay.setText("Id");

        idTxt.setToolTipText("");

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Nama Karyawan");

        employeNameTxt.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Tanggal Lahir");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("NIK");

        nikTxt.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Username");

        usernameTxt.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Password");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeNameTxt)
                    .addComponent(idTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nikTxt)
                    .addComponent(usernameTxt)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idDisplay)
                            .addComponent(jLabel16)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(0, 243, Short.MAX_VALUE))
                    .addComponent(passwordTxt))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idDisplay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(49, 49, 49)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nikTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Role");

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Salary");

        salaryTxt.setToolTipText("");
        salaryTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salaryTxtKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Active");

        isActiveTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Location");

        locationCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        locationCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                locationComboItemStateChanged(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Departement");

        departementCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                departementComboItemStateChanged(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Division");

        editButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editButton.setText("Update");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        roleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 193, Short.MAX_VALUE)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton))
                    .addComponent(roleCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salaryTxt)
                    .addComponent(isActiveTxt, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(locationCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(departementCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(divisionCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isActiveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(departementCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(divisionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(editButton))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_paytroll_karyawan/Assets/Icons/audience.png"))); // NOI18N

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(backNavButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(backNavButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardLayout.add(formPanel, "card4");

        add(cardLayout, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void addNavButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNavButtonActionPerformed
        // TODO add your handling code here:

        this.moveToForm();
        usernameTxt.setEditable(true);
        editButton.setVisible(false);
//        controller.reset();
    }//GEN-LAST:event_addNavButtonActionPerformed

    private void dataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMouseClicked
        // TODO add your handling code here:
        controller.selectedRow();
    }//GEN-LAST:event_dataTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        controller.getData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        controller.edit();
    }//GEN-LAST:event_editButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        controller.insert();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void backNavButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backNavButton1ActionPerformed
        // TODO add your handling code here:
        this.moveToTable();
        controller.reset();
    }//GEN-LAST:event_backNavButton1ActionPerformed

    private void salaryTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salaryTxtKeyTyped
        // TODO add your handling code here:
        // Only Accept Integer Value        
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_salaryTxtKeyTyped

    private void roleComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleComboActionPerformed

    private void locationComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_locationComboItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED){
            departementCombo.getModel().setSelectedItem(new ComboBoxModel("",""));
            divisionCombo.getModel().setSelectedItem(new ComboBoxModel("", ""));
            controller.getDepartement();
        }
    }//GEN-LAST:event_locationComboItemStateChanged

    private void departementComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_departementComboItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            divisionCombo.getModel().setSelectedItem(new ComboBoxModel("", ""));
            controller.getDivision();
        }
    }//GEN-LAST:event_departementComboItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNavButton;
    private javax.swing.JButton backNavButton1;
    private javax.swing.JPanel cardLayout;
    private javax.swing.JTable dataTable;
    private javax.swing.JComboBox<String> departementCombo;
    private javax.swing.JComboBox<String> divisionCombo;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField employeNameTxt;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel idDisplay;
    private javax.swing.JTextField idTxt;
    private javax.swing.JComboBox<String> isActiveTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> locationCombo;
    private javax.swing.JPanel masterPanel;
    private javax.swing.JTextField nikTxt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JComboBox<String> roleCombo;
    private javax.swing.JTextField salaryTxt;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField searchInput;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
