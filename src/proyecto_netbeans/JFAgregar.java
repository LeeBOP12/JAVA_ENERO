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
public class JFAgregar extends javax.swing.JFrame {

    /**
     * Creates new form Agregar
     */
    public JFAgregar() {
        initComponents();
        this.setLocationRelativeTo(null);
        Ferreteria ferreteria = new Ferreteria();
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
        AgregarBB = new javax.swing.JButton();
        Nombre = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        Stock = new javax.swing.JLabel();
        Marca = new javax.swing.JLabel();
        Origen = new javax.swing.JLabel();
        Categoria = new javax.swing.JLabel();
        Codigo = new javax.swing.JLabel();
        Garantia = new javax.swing.JLabel();
        CategoriaCB = new javax.swing.JComboBox<>();
        PrecioT = new javax.swing.JTextField();
        NombreT = new javax.swing.JTextField();
        StockT = new javax.swing.JTextField();
        MarcaT = new javax.swing.JTextField();
        OrigenT = new javax.swing.JTextField();
        CodigoT = new javax.swing.JTextField();
        GarantiaT = new javax.swing.JTextField();
        VOLVER = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 32)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("AGREGAR PRODUCTO");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 40));

        AgregarBB.setBackground(new java.awt.Color(102, 102, 255));
        AgregarBB.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        AgregarBB.setForeground(new java.awt.Color(0, 0, 0));
        AgregarBB.setText(" AGREGAR PRODUCTO");
        AgregarBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBBActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        Nombre.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.setText("Nombre");
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 30));

        Precio.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        Precio.setForeground(new java.awt.Color(0, 0, 0));
        Precio.setText("Precio  (S/)");
        getContentPane().add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 108, -1, 30));

        Stock.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        Stock.setForeground(new java.awt.Color(0, 0, 0));
        Stock.setText("Stock");
        getContentPane().add(Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 148, -1, 30));

        Marca.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        Marca.setForeground(new java.awt.Color(0, 0, 0));
        Marca.setText("Marca");
        getContentPane().add(Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 30));

        Origen.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        Origen.setForeground(new java.awt.Color(0, 0, 0));
        Origen.setText("Origen");
        getContentPane().add(Origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        Categoria.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        Categoria.setForeground(new java.awt.Color(0, 0, 0));
        Categoria.setText("Categoria");
        getContentPane().add(Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 30));

        Codigo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        Codigo.setForeground(new java.awt.Color(0, 0, 0));
        Codigo.setText("Codigo");
        getContentPane().add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 30));

        Garantia.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        Garantia.setForeground(new java.awt.Color(0, 0, 0));
        Garantia.setText("Garantia (meses)");
        getContentPane().add(Garantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 140, 30));

        CategoriaCB.setBackground(new java.awt.Color(204, 204, 255));
        CategoriaCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CategoriaCB.setForeground(new java.awt.Color(0, 0, 0));
        CategoriaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Herramientas", "Construcción", "Pinturas", "Electricidad", "Seguridad", "Jardín", "Accesorios", "Otros" }));
        CategoriaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaCBActionPerformed(evt);
            }
        });
        getContentPane().add(CategoriaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 350, -1));

        PrecioT.setBackground(new java.awt.Color(204, 204, 255));
        PrecioT.setForeground(new java.awt.Color(0, 0, 0));
        PrecioT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioTActionPerformed(evt);
            }
        });
        getContentPane().add(PrecioT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 350, -1));

        NombreT.setBackground(new java.awt.Color(204, 204, 255));
        NombreT.setForeground(new java.awt.Color(0, 0, 0));
        NombreT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTActionPerformed(evt);
            }
        });
        getContentPane().add(NombreT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 350, -1));

        StockT.setBackground(new java.awt.Color(204, 204, 255));
        StockT.setForeground(new java.awt.Color(0, 0, 0));
        StockT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockTActionPerformed(evt);
            }
        });
        getContentPane().add(StockT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 350, -1));

        MarcaT.setBackground(new java.awt.Color(204, 204, 255));
        MarcaT.setForeground(new java.awt.Color(0, 0, 0));
        MarcaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaTActionPerformed(evt);
            }
        });
        getContentPane().add(MarcaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 350, -1));

        OrigenT.setBackground(new java.awt.Color(204, 204, 255));
        OrigenT.setForeground(new java.awt.Color(0, 0, 0));
        OrigenT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrigenTActionPerformed(evt);
            }
        });
        getContentPane().add(OrigenT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 350, -1));

        CodigoT.setBackground(new java.awt.Color(204, 204, 255));
        CodigoT.setForeground(new java.awt.Color(0, 0, 0));
        CodigoT.setCaretColor(new java.awt.Color(0, 0, 0));
        CodigoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoTActionPerformed(evt);
            }
        });
        getContentPane().add(CodigoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 350, -1));

        GarantiaT.setBackground(new java.awt.Color(204, 204, 255));
        GarantiaT.setForeground(new java.awt.Color(0, 0, 0));
        GarantiaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GarantiaTActionPerformed(evt);
            }
        });
        getContentPane().add(GarantiaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 290, -1));

        VOLVER.setBackground(new java.awt.Color(255, 51, 51));
        VOLVER.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        VOLVER.setForeground(new java.awt.Color(0, 0, 0));
        VOLVER.setText("VOLVER");
        VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLVERActionPerformed(evt);
            }
        });
        getContentPane().add(VOLVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 150, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_imagenes/fondos.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 510, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean ochoDigitos (String codigo){
        return codigo.matches("\\d{8}");
    }
    public void agregar(String nombre, float precio, int stock, String marca, String origen, int opcion, String codigo, int garantia) {
        opcion = CategoriaCB.getSelectedIndex();
        String categoria = "";
        switch (opcion) {
            case 0 -> categoria = "Herramientas";
            case 1 -> categoria = "Construcción";
            case 2 -> categoria = "Pinturas";
            case 3 -> categoria = "Electricidad";
            case 4 -> categoria = "Seguridad";
            case 5 -> categoria = "Jardin";
            case 6 -> categoria = "Accesorios";
            case 7 -> categoria = "Otros";
            default -> JOptionPane.showMessageDialog(null, "< OPCION INVALIDA >");
        }
        if (Ferreteria.cantidad < Ferreteria.nombre.length) {
            Ferreteria.nombre[Ferreteria.cantidad] = nombre;
            Ferreteria.precio[Ferreteria.cantidad] = precio;
            Ferreteria.stock[Ferreteria.cantidad] = stock;
            Ferreteria.marca[Ferreteria.cantidad] = marca;
            Ferreteria.origen[Ferreteria.cantidad] = origen;
            Ferreteria.categoría[Ferreteria.cantidad] = categoria;
            if (ochoDigitos(codigo)) {
                Ferreteria.código[Ferreteria.cantidad] = codigo;
            } else {
                JOptionPane.showMessageDialog(null, "< ERROR: CODIGO 8 DIGITOS >");
                return;
            }
            Ferreteria.garantía[Ferreteria.cantidad] = garantia;
            Ferreteria.cantidad++;
            NombreT.setText("");
            PrecioT.setText("");
            StockT.setText("");
            MarcaT.setText("");
            OrigenT.setText("");
            CodigoT.setText("");
            GarantiaT.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "< ALMACEN LLENO >");
        }
    }
    //Boton agregar
    private void AgregarBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBBActionPerformed
        if (!(NombreT.getText().equals("") || PrecioT.getText().equals("") || StockT.getText().equals("") || MarcaT.getText().equals("") || OrigenT.getText().equals("") || CodigoT.getText().equals("") || GarantiaT.getText().equals(""))) {
            try {
                String nombre = NombreT.getText();
                float precio = Float.parseFloat(PrecioT.getText());
                int stock = Integer.parseInt(StockT.getText());
                String marca = MarcaT.getText();
                String origen = OrigenT.getText();
                String codigo = CodigoT.getText();
                int garantia = Integer.parseInt(GarantiaT.getText());
                int opcion = CategoriaCB.getSelectedIndex();
                agregar(nombre, precio, stock, marca, origen, opcion, codigo, garantia); //Metodo agregar, nop 
                if (ochoDigitos(codigo)) {
                    JOptionPane.showMessageDialog(null, "< AGREGADO CORRECTAMENTE >");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "< ERROR: FORMATO NUMERICO INVALIDO >");
            }
        } else {
            JOptionPane.showMessageDialog(null, "< ERROR: CAMPO VACIO >");
        }//Osea los datos agregados manialmente se duplican no se poruqe
    }//GEN-LAST:event_AgregarBBActionPerformed

    private void PrecioTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioTActionPerformed

    private void NombreTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTActionPerformed

    private void StockTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StockTActionPerformed

    private void MarcaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaTActionPerformed

    private void OrigenTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrigenTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrigenTActionPerformed

    private void CodigoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoTActionPerformed

    private void GarantiaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GarantiaTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GarantiaTActionPerformed

    private void CategoriaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaCBActionPerformed

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
            java.util.logging.Logger.getLogger(JFAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBB;
    private javax.swing.JLabel Categoria;
    private javax.swing.JComboBox<String> CategoriaCB;
    private javax.swing.JLabel Codigo;
    private javax.swing.JTextField CodigoT;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Garantia;
    private javax.swing.JTextField GarantiaT;
    private javax.swing.JLabel Marca;
    private javax.swing.JTextField MarcaT;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField NombreT;
    private javax.swing.JLabel Origen;
    private javax.swing.JTextField OrigenT;
    private javax.swing.JLabel Precio;
    private javax.swing.JTextField PrecioT;
    private javax.swing.JLabel Stock;
    private javax.swing.JTextField StockT;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton VOLVER;
    // End of variables declaration//GEN-END:variables
}
