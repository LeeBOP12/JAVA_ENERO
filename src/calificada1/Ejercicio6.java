/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calificada1;

import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio6 extends javax.swing.JFrame {

    int paso = 0;

    /**
     * Creates new form Ejercicio1
     */
    public Ejercicio6() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TITULO = new javax.swing.JLabel();
        OPERAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MOSTRAR = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Edad = new javax.swing.JTextField();
        EDAD4 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        TITULO.setBackground(new java.awt.Color(153, 204, 255));
        TITULO.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        TITULO.setForeground(new java.awt.Color(0, 0, 0));
        TITULO.setText("BIENVENIDO AL \"PARQUE AVENTURAS\"");

        OPERAR.setBackground(new java.awt.Color(204, 204, 204));
        OPERAR.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        OPERAR.setForeground(new java.awt.Color(0, 0, 0));
        OPERAR.setText("CONTINUAR / INSCRIBIRSE");
        OPERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPERARActionPerformed(evt);
            }
        });

        MOSTRAR.setBackground(new java.awt.Color(204, 204, 204));
        MOSTRAR.setColumns(20);
        MOSTRAR.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        MOSTRAR.setForeground(new java.awt.Color(0, 0, 0));
        MOSTRAR.setRows(5);
        jScrollPane1.setViewportView(MOSTRAR);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE");

        Edad.setBackground(new java.awt.Color(255, 255, 255));
        Edad.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Edad.setForeground(new java.awt.Color(204, 204, 204));
        Edad.setText("Edad");
        Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadActionPerformed(evt);
            }
        });

        EDAD4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        EDAD4.setForeground(new java.awt.Color(0, 0, 0));
        EDAD4.setText("EDAD");

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Nombre.setForeground(new java.awt.Color(204, 204, 204));
        Nombre.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ACTIVIDADES");

        Nombre1.setBackground(new java.awt.Color(255, 255, 255));
        Nombre1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Nombre1.setForeground(new java.awt.Color(204, 204, 204));
        Nombre1.setText("Actividades");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(OPERAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(EDAD4)
                                .addGap(18, 18, 18)
                                .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TITULO)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TITULO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OPERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EDAD4)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdadActionPerformed

    private void OPERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPERARActionPerformed
        /*
        Ejercicio 6: En este ejercicio, tendrán total libertad para elegir la problemática y la mejor solución. Cada grupo podrá
        decidir su propio enfoque y desarrollar el software según sus criterios. El grupo que presente la mejor solución
        será el único en recibir los 60 puntos asignados a esta pregunta. ¡Buena suerte! (60P)
         */

        switch (paso) {
            case 0: // Paso 0: Mostrar saludo y pedir nombre
                MOSTRAR.setText("NOTA: AL RELLENAR LOS DATOS PRESIONE CONTINUAR\n\nBIENVENIDO AL PARQUE AVENTURAS, INDICANOS TU NOMBRE :D\n");
                paso++; // Avanzar al siguiente paso
                break;

            case 1: // Paso 1: Leer nombre y pedir edad
                String nombre = Nombre.getText().trim(); // Leer el campo de texto "Nombre"
                if (nombre.isEmpty()) {
                    MOSTRAR.append("Nombre.\n");
                    return; // Detener si no se ingresa el nombre
                }
                MOSTRAR.append("Hola " + nombre + ", estamos encantados de recibirte en nuestro Parque de Aventuras.\n");
                MOSTRAR.append("\nPor favor, ingresa tu edad.\n");
                paso++; // Avanzar al siguiente paso
                break;

            case 2: // Paso 2: Leer edad y determinar precio

                int edad = Integer.parseInt(Edad.getText().trim()); // Leer el campo de texto "Edad"
                if (edad < 0) {
                    MOSTRAR.append("Ingrese una edad valida.\n");
                    return;
                }
                int precioEntrada = 0;
                if (edad < 5) {
                    MOSTRAR.append("Tu entrada es gratuita.\n");
                } else if (edad <= 12) {
                    precioEntrada = 7;
                    MOSTRAR.append("Tu entrada cuesta S/.7.\n");
                } else if (edad <= 17) {
                    precioEntrada = 10;
                    MOSTRAR.append("Tu entrada cuesta S/.10.\n");
                } else {
                    precioEntrada = 15;
                    MOSTRAR.append("Tu entrada cuesta S/.15.\n");
                }
                paso++; // Avanzar al siguiente paso
                break;

            case 3: // Paso 3: Solicitar actividades
                MOSTRAR.append("\nAHORA SELECCIONE SUS ACTIVIDADES.\n");
                MOSTRAR.append("1. Tirolesa (S/.10 por persona)\n");
                MOSTRAR.append("2. Escalada en muro (S/.7 por persona)\n");
                MOSTRAR.append("3. Recorrido guiado por la naturaleza (S/.5 por persona)\n");
                MOSTRAR.append("4. Circuito de cuerdas (S/.12 por persona)\n");
                MOSTRAR.append("Indica cuántas actividades deseas realizar en el campo correspondiente y presiona CONTINUAR nuevamente.\n");
                paso++; // Avanzar al siguiente paso
                break;

            case 4: // Paso 4: Procesar actividades

                int cantidadActividades = Integer.parseInt(jLabel2.getText().trim());
                int costoActividades = 0;

                for (int i = 1; i <= cantidadActividades; i++) {
                    String actividadd = JOptionPane.showInputDialog("Selecciona la actividad " + i + " (Escribe el número de la actividad):");
                    int actividad = Integer.parseInt(actividadd);
                    switch (actividad) {
                        case 1:
                            costoActividades += 10;
                            break;
                        case 2:
                            costoActividades += 7;
                            break;
                        case 3:
                            costoActividades += 5;
                            break;
                        case 4:
                            costoActividades += 12;
                            break;
                        default:
                            MOSTRAR.append("Actividad no válida. No se sumará ninguna actividad.\n");
                    }
                }
                MOSTRAR.append("El costo total de las actividades es: S/." + costoActividades + "\n");
                MOSTRAR.append("Gracias por completar el proceso. ¡Disfruta tu día en el parque!\n");
                paso = 0; // Reiniciar el flujo
                break;

            default:
                MOSTRAR.setText("Algo salió mal. Por favor, reinicia la aplicación.\n");
                paso = 0; // Reiniciar en caso de error
        }
    }//GEN-LAST:event_OPERARActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Ejercicio6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EDAD4;
    private javax.swing.JTextField Edad;
    private javax.swing.JTextArea MOSTRAR;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Nombre1;
    private javax.swing.JButton OPERAR;
    private javax.swing.JLabel TITULO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
