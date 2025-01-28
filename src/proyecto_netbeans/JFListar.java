/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_netbeans;

import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class JFListar extends javax.swing.JFrame {

    /**
     * Creates new form Agregar
     */
    public JFListar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        MostrarBB = new javax.swing.JButton();
        VOLVER = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MostrarT = new javax.swing.JTextArea();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 32)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("LISTAR PRODUCTOS");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, 40));

        MostrarBB.setBackground(new java.awt.Color(102, 102, 255));
        MostrarBB.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        MostrarBB.setForeground(new java.awt.Color(0, 0, 0));
        MostrarBB.setText("MOSTRAR PRODUCTOS");
        MostrarBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarBBActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        VOLVER.setBackground(new java.awt.Color(255, 51, 51));
        VOLVER.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        VOLVER.setForeground(new java.awt.Color(0, 0, 0));
        VOLVER.setText("VOLVER");
        VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLVERActionPerformed(evt);
            }
        });
        getContentPane().add(VOLVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 150, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID     NOMBRE      PRECIO      STOCK      MARCA      ORIGEN      CATEGORIA       CODIGO         GARANTIA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 670, 30));

        MostrarT.setColumns(20);
        MostrarT.setRows(5);
        getContentPane().add(MostrarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 690, 280));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_imagenes/fondos.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 730, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //FORMATO
    public String darformato_decimal(float decimal, int max){
        return String.format("%-"+max+".2f", decimal);
    }
    public String darformato_entero(int entero, int max){
        return String.format("%-"+max+"d", entero);
    }
    public String darformato_cadena(String cadena, int max){
        if (cadena==null) {
            cadena = "";
        }
        if (cadena.length()>=max) {
            return cadena.substring(0, max-3)+"..";
        } else {
            return String.format("%-" + max + "s", cadena);
        }
    }
    public void Mostrar(){
        MostrarT.setText(""); //Aca lo limpie pero en plan regreso al menu y vuelvo a listar y se duplica ;(
        int contador = 0;
        if (Ferreteria.cantidad!=0) {
            for (int i = 0; i < Ferreteria.cantidad; i++) {
            contador++;
            MostrarT.append(darformato_cadena(contador + "        " + Ferreteria.nombre[i], 18) + "\t         "
                    + darformato_decimal(Ferreteria.precio[i], 10) + "\t    "
                    + darformato_entero(Ferreteria.stock[i], 7) + "\t"
                    + darformato_cadena(Ferreteria.marca[i], 8) + "\t"
                    + darformato_cadena(Ferreteria.origen[i], 10) + "\t"
                    + darformato_cadena(Ferreteria.categoría[i], 12) + "\t"
                    + darformato_cadena(Ferreteria.código[i], 11) + "\t"
                    + darformato_entero(Ferreteria.garantía[i], 5) + "\n");
        }
        } else {
            JOptionPane.showMessageDialog(null, "< NO HAY PRODUCTOS PARA LISTAR >");
        }
    }
    private void MostrarBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarBBActionPerformed
        Mostrar(); 
    }//GEN-LAST:event_MostrarBBActionPerformed

    private void VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLVERActionPerformed
        Ferreteria ferreteria = new Ferreteria();
        ferreteria.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VOLVERActionPerformed

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
            java.util.logging.Logger.getLogger(JFListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFListar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton MostrarBB;
    private javax.swing.JTextArea MostrarT;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton VOLVER;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
