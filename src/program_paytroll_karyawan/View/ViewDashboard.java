/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_paytroll_karyawan.View;

import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;
import program_paytroll_karyawan.Model.LoginModel;

/**
 *
 * @author lincbp
 */
public class ViewDashboard extends javax.swing.JPanel {
    private LoginModel loginModel;

    /**
     * Creates new form ViewDashboard
     */
    public ViewDashboard(LoginModel loginModel) {
        initComponents();
        String displayName = loginModel.getEmploye_name()+" - "+loginModel.getRole();
        namaTxt.setText(displayName);
        nikTxt.setText(loginModel.getNik());
        
        getTime();
    }
    public void getTime(){
        Timer t2 = new Timer();
        t2.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                timeTxt.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new java.util.Date()));
            }
        },0,1000);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        namaTxt = new javax.swing.JLabel();
        nikTxt = new javax.swing.JLabel();
        timeTxt = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELAMAT DATANG");

        namaTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namaTxt.setText("jLabel2");

        nikTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nikTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nikTxt.setText("jLabel2");

        timeTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        timeTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        timeTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_paytroll_karyawan/Assets/Icons/Clock.png"))); // NOI18N
        timeTxt.setText("jLabel2");
        timeTxt.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nikTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 372, Short.MAX_VALUE)
                        .addComponent(timeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timeTxt)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namaTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nikTxt)
                .addContainerGap(170, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel namaTxt;
    private javax.swing.JLabel nikTxt;
    private javax.swing.JLabel timeTxt;
    // End of variables declaration//GEN-END:variables
}