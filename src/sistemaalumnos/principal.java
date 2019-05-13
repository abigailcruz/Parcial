package sistemaalumnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;
//importacion de las lbreria necesarias para la ejecucion 


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROSY BONITA
 */
public class principal extends javax.swing.JFrame {//Para declarar la herencia en Java usamos la palabra clave extends. aqui utilizamos una herencia de la clase principal al Jframe

       Connection con = null;//declaracion de variables que no retonan nada
       Statement stmt =null;
        public principal() {// creacion de metodos o constructores,el cual hace la llamada automaticamente cuando se crean objetos en esta clase.
                initComponents();
                this.setTitle("Ficha de Captura de Estudiantes");
                this.setLocation(175,200);
                bloquear_cajas();//metodos creados para bloquear las cjas de texto del formulario
                 desbloquear();
        }
public void  bloquear_cajas()//metodos para aplicar en los jtext del jframe
    {
       NIE1.setEnabled(false);
       NOMBRE.setEnabled(false);
       APELLIDO.setEnabled(false);
        NAC.setEnabled(false);            
       jComboBox1.setEnabled(false); 
       RESP.setEnabled(false);
       TELF.setEnabled(false);
       
    }

        
public void  desbloquear()////metodos para aplicar en los jtext del jframe
    {
       NIE1.setEnabled(true);
       NOMBRE.setEnabled(true);
       APELLIDO.setEnabled(true);
      NAC.setEnabled(true);            
       jComboBox1.setEnabled(true); 
       RESP.setEnabled(true);
       TELF.setEnabled(true);
     
    }
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel2 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                APELLIDO = new javax.swing.JTextField();
                NOMBRE = new javax.swing.JTextField();
                NIE = new javax.swing.JTextField();
                NAC = new javax.swing.JTextField();
                TELF = new javax.swing.JTextField();
                RESP = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                nuevo = new javax.swing.JButton();
                agregar = new javax.swing.JButton();
                jComboBox1 = new javax.swing.JComboBox<>();
                jLabel11 = new javax.swing.JLabel();
                NIE1 = new javax.swing.JTextField();
                jLabel10 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel2.setBackground(new java.awt.Color(255, 255, 255));
                jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize()+13f));
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Sistema de Registro de Estudiantes");
                getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, 39));

                jLabel1.setText("N°  NIE");
                getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

                jLabel3.setFont(jLabel3.getFont());
                jLabel3.setText("Nombre ");
                getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

                jLabel4.setFont(jLabel4.getFont());
                jLabel4.setText("Apellidos");
                getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

                jLabel5.setFont(jLabel5.getFont());
                jLabel5.setText("Telefono");
                getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

                jLabel6.setFont(jLabel6.getFont());
                jLabel6.setText("Fecha de Nacimiento ");
                getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

                jLabel7.setFont(jLabel7.getFont());
                jLabel7.setText("Responsables");
                getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
                getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 129, -1, -1));

                jLabel8.setFont(jLabel8.getFont());
                jLabel8.setText("Grado a cursar");
                getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

                APELLIDO.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                APELLIDOActionPerformed(evt);
                        }
                });
                APELLIDO.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                APELLIDOKeyTyped(evt);
                        }
                });
                getContentPane().add(APELLIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 140, -1));

                NOMBRE.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                NOMBREActionPerformed(evt);
                        }
                });
                NOMBRE.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                NOMBREKeyTyped(evt);
                        }
                });
                getContentPane().add(NOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, -1));

                NIE.setEditable(false);
                NIE.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                NIEActionPerformed(evt);
                        }
                });
                NIE.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                NIEKeyTyped(evt);
                        }
                });
                getContentPane().add(NIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 60, 20));

                NAC.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                NACActionPerformed(evt);
                        }
                });
                NAC.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                NACKeyTyped(evt);
                        }
                });
                getContentPane().add(NAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 140, -1));

                TELF.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                TELFActionPerformed(evt);
                        }
                });
                getContentPane().add(TELF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 130, -1));

                RESP.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                RESPActionPerformed(evt);
                        }
                });
                RESP.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                RESPKeyTyped(evt);
                        }
                });
                getContentPane().add(RESP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 140, 30));

                jButton1.setText("Salir");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });
                getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 120, 30));

                nuevo.setText("Nuevo Registro");
                nuevo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                nuevoActionPerformed(evt);
                        }
                });
                getContentPane().add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 120, 30));

                agregar.setText("Agregar");
                agregar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                agregarActionPerformed(evt);
                        }
                });
                getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 120, 30));

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preparatoria", "Primer Grado", "Segundo Grado", "Tercer Grado", "Cuarto Grado", "Quinto Grado", "Sexto Grado}", " " }));
                getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

                jLabel11.setText("Correlativo");
                getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

                NIE1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                NIE1ActionPerformed(evt);
                        }
                });
                NIE1.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                NIE1KeyTyped(evt);
                        }
                });
                getContentPane().add(NIE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 140, -1));

                jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/84583195ffa4083.JPG"))); // NOI18N
                getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBREActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_NOMBREActionPerformed

        private void APELLIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APELLIDOActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_APELLIDOActionPerformed

        private void NACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NACActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_NACActionPerformed

        private void NIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIEActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_NIEActionPerformed

        private void TELFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TELFActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_TELFActionPerformed

        private void RESPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESPActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_RESPActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                this.dispose();
        }//GEN-LAST:event_jButton1ActionPerformed

        private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
               desbloquear();
                 NIE.requestFocus();
        }//GEN-LAST:event_nuevoActionPerformed

        private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        //metodos y consructores que permiten llevar  cabo la accion de agregar un nuevo registro a la base de datos de mysql
       String cadena2,cadena3,cadena4,cadena5,cadena6,cadena7,cadena8;
        
                cadena8 = NIE1.getText();
                cadena3 = NOMBRE.getText();
                cadena4 = APELLIDO.getText();
                cadena5 = NAC.getText();
                cadena6 = RESP.getText();
                cadena7 = TELF.getText();
                cadena2 = jComboBox1.getSelectedItem().toString();

        if (NOMBRE.getText().equals("") || (NIE1.getText().equals("")) || (APELLIDO.getText().equals("")) || (RESP.getText().equals("")) || (TELF.getText().equals("")) || (NAC.getText().equals("")) || ( jComboBox1.getSelectedItem() == null)); {          
 javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                NOMBRE.requestFocus();  
        }
         
           try {
                        
                String url = "jdbc:mysql://localhost:3306/sistemaalumnos";//importancion de la base de datos de Mysql
                String usuario = "root";//usuario y contraseña de mysql
                String contraseña = "1428";

                Class.forName("com.mysql.jdbc.Driver").newInstance(); 
                con = DriverManager.getConnection(url,usuario,contraseña); 
                if ( con != null ) 
                System.out.println("Se ha establecido una conexión a la base de datos " + "\n " + url ); 
                stmt = con.createStatement(); 
                stmt.executeUpdate("INSERT INTO principal VALUES('" + 0 + "','"+cadena8+"','"+cadena3+"','"+cadena4+"','"+cadena5+"','"+cadena6+"','"+cadena7+"','"+cadena2+",");
                System.out.println("Los valores han sido agregados a la base de datos ");

               } catch (InstantiationException ex) {
                   Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
               } catch (IllegalAccessException ex) {
                   Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
               } catch (ClassNotFoundException ex) {
                   Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
               } catch (SQLException ex) {
                   Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
               }

                            finally {
                        if (con != null) {
                            try {
                                con.close();
                                stmt.close();
                            } catch ( SQLException e ) { 
                                            System.out.println( e.getMessage());
                                   }
                               }
                           }

                            javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);


                            this.NIE1.setText("");
                            this.NOMBRE.setText("");
                            this.APELLIDO.setText("");
                            this.RESP.setText("");
                            this.TELF.setText("");
                            this.NAC.setText("");
                            this.jComboBox1.setSelectedItem(""); 
        
        
        
        }//GEN-LAST:event_agregarActionPerformed

        private void NOMBREKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NOMBREKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a'|| c>'z') && ((c<'A') || c>'Z') && (c<' ' || c>' ')) evt.consume();
        }//GEN-LAST:event_NOMBREKeyTyped

        private void NIEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIEKeyTyped
                char c =evt.getKeyChar();
    if (c<'0' || c>'9') evt.consume();
        }//GEN-LAST:event_NIEKeyTyped

        private void APELLIDOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_APELLIDOKeyTyped
                char c = evt.getKeyChar();
        if ((c<'a'|| c>'z') && ((c<'A') || c>'Z') && (c<' ' || c>' ')) evt.consume();
        }//GEN-LAST:event_APELLIDOKeyTyped

        private void RESPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RESPKeyTyped
                char c = evt.getKeyChar();
        if ((c<'a'|| c>'z') && ((c<'A') || c>'Z') && (c<' ' || c>' ')) evt.consume();
        }//GEN-LAST:event_RESPKeyTyped

        private void NACKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NACKeyTyped
                char c =evt.getKeyChar();
    if (c<'0' || c>'9') evt.consume();
        }//GEN-LAST:event_NACKeyTyped

        private void NIE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIE1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_NIE1ActionPerformed

        private void NIE1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIE1KeyTyped
                // TODO add your handling code here:
        }//GEN-LAST:event_NIE1KeyTyped

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
                        java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(() -> {
                        new principal().setVisible(true);
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField APELLIDO;
        private javax.swing.JTextField NAC;
        private javax.swing.JTextField NIE;
        private javax.swing.JTextField NIE1;
        private javax.swing.JTextField NOMBRE;
        private javax.swing.JTextField RESP;
        private javax.swing.JTextField TELF;
        private javax.swing.JButton agregar;
        private javax.swing.JButton jButton1;
        private javax.swing.JComboBox<String> jComboBox1;
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
        private javax.swing.JButton nuevo;
        // End of variables declaration//GEN-END:variables

  

        
}
