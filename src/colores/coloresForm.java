
package colores;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Hernández Gómez
 */
public class coloresForm extends javax.swing.JFrame {


    public coloresForm() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jDialog1 = new javax.swing.JDialog();
          warning = new javax.swing.JLabel();
          jLabel1 = new javax.swing.JLabel();
          jComboBox1 = new javax.swing.JComboBox<>();
          jComboBox2 = new javax.swing.JComboBox<>();
          Resultado = new javax.swing.JLabel();
          convianr = new javax.swing.JButton();

          warning.setText("jLabel2");

          javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
          jDialog1.getContentPane().setLayout(jDialog1Layout);
          jDialog1Layout.setHorizontalGroup(
               jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 400, Short.MAX_VALUE)
               .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                         .addGap(0, 0, Short.MAX_VALUE)
                         .addComponent(warning)
                         .addGap(0, 0, Short.MAX_VALUE)))
          );
          jDialog1Layout.setVerticalGroup(
               jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 300, Short.MAX_VALUE)
               .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                         .addGap(0, 0, Short.MAX_VALUE)
                         .addComponent(warning)
                         .addGap(0, 0, Short.MAX_VALUE)))
          );

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setBackground(new java.awt.Color(255, 204, 255));

          jLabel1.setBackground(new java.awt.Color(255, 204, 255));
          jLabel1.setText("Generador de colores");

          jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Amarillo", "Azul" }));

          jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Amarillo", "Azul" }));

          convianr.setText("Convinar");
          convianr.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    convianrActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(65, 65, 65))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(124, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(102, 102, 102))
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                              .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(121, 121, 121))))
               .addGroup(layout.createSequentialGroup()
                    .addGap(160, 160, 160)
                    .addComponent(convianr)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(50, 50, 50)
                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(convianr)
                    .addContainerGap(64, Short.MAX_VALUE))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

    private void convianrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convianrActionPerformed
        // TODO add your handling code here:
        String color1;
        String color2;
        //String cuidado= "Los colores deben ser distintos";
        color1= jComboBox1.getSelectedItem().toString();
        color2= jComboBox2.getSelectedItem().toString();
        
        if(color1==color2)
        {
             JOptionPane.showMessageDialog(null,"Los colores deben ser distintos");
        
        }
        else if((color1=="Amarillo" & color2=="Rojo")|(color1=="Rojo" & color2=="Amarillo"))
        {
            Resultado.setVisible(true);
            Resultado.setText(" Anaranjado ");
            Resultado.setBackground(Color.orange);
            Resultado.setOpaque(true);
            jDialog1.dispose();
        }
    else if((color1=="Azul" & color2=="Rojo")|(color1=="Rojo" & color2=="Azul"))
        {
            Resultado.setVisible(true);
            Resultado.setText(" Morado ");
            Resultado.setBackground(Color.magenta);
            Resultado.setOpaque(true);
            jDialog1.dispose();
        }
        else if((color1=="Amarillo" & color2=="Azul")|(color1=="Azul" & color2=="Amarillo"))
        {
            Resultado.setVisible(true);
            Resultado.setText(" Verde ");
            Resultado.setBackground(Color.green);
            Resultado.setOpaque(true);
            jDialog1.dispose();
        }
    }//GEN-LAST:event_convianrActionPerformed

  
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
            java.util.logging.Logger.getLogger(coloresForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(coloresForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(coloresForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(coloresForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new coloresForm().setVisible(true);
            }
        });
    }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JLabel Resultado;
     private javax.swing.JButton convianr;
     private javax.swing.JComboBox<String> jComboBox1;
     private javax.swing.JComboBox<String> jComboBox2;
     private javax.swing.JDialog jDialog1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel warning;
     // End of variables declaration//GEN-END:variables
}
