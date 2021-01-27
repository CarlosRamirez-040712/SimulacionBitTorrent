package clientpeer;

import java.io.IOException;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class Interfaz extends javax.swing.JFrame 
{
    static String Ipp;
    static String Archiv;
    static String Direccion;
    
    public Interfaz() 
    {
        initComponents();
        MyIp.setEditable(false);
        name.setEditable(false);
        try 
        {
            MyIp.setText(ClientPeer.IP); 
            name.setText(ClientPeer.nombre_usuario);
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
        Ipp= MyIp.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        NombreArchivo = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        ArchivosDisp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Descargar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        MyIp = new javax.swing.JTextField();
        name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        NombreArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreArchivoActionPerformed(evt);
            }
        });

        Registrar.setText("Registrar Archivo");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nombre del Archivo:");

        Buscar.setText("Buscar Archivo");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        ArchivosDisp.setText("Archivos Disponibles en la red");
        ArchivosDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivosDispActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Descargar.setText("Descargar Archivo");
        Descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescargarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Datos del Cliente (Nombre/IP):");

        MyIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyIpActionPerformed(evt);
            }
        });

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Registrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Descargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MyIp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(ArchivosDisp))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MyIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registrar)
                    .addComponent(Descargar)
                    .addComponent(Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ArchivosDisp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreArchivoActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        ClientFullDuplex Cliente = new ClientFullDuplex();
        String Resultado = null;
        try 
        {
            Resultado=Cliente.Preguntar("Busqueda/Registrar");
        } catch (IOException ex) 
        {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(Resultado.equals("No existe el archivo en red"))
        {
            JOptionPane.showMessageDialog(null, "No se encuentra activo el servidor Registrar");
        }else
        {
            if(!NombreArchivo.getText().equals(""))
            {
                ClientPeer.Archivos.put(NombreArchivo.getText(), 100);

                try 
                {
                    Cliente.Preguntar("RegAr/" + MyIp.getText() + "/" + NombreArchivo.getText() + "/" + "100");
                } catch (IOException ex) 
                {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }  
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Ingrese un nombre de archivo");
            }
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        ClientFullDuplex Cliente = new ClientFullDuplex();
        String Resultado = null;
        try 
        {
            Resultado=Cliente.Preguntar("Busqueda/Busqueda");
        } catch (IOException ex) 
        {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(Resultado.equals("No existe el archivo en red"))
        {
            JOptionPane.showMessageDialog(null, "No se encuentra activo el servidor Busqueda");
        }else
        {
            if(!NombreArchivo.getText().equals("")){
            try 
            {
                Resultado=Cliente.Preguntar("Busqueda/" + NombreArchivo.getText());
            } catch (IOException ex) 
            {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(Resultado.equals("No existe el archivo en red"))
            {
                JOptionPane.showMessageDialog(null, "No existe el archivo en red");
            }else
            {
                Resultado = Resultado.substring(0, Resultado.length() - 1);
                String[] parts = Resultado.split(" ");
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("Direcciones para Descargar", parts);
                jTable1.setModel(modelo); 
            }
            }else
            {
                JOptionPane.showMessageDialog(null, "Ingrese un nombre de archivo");
            }
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void DescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescargarActionPerformed
        ClientFullDuplex Cliente = new ClientFullDuplex();
        String Resultado = null;
        try 
        {
            Resultado=Cliente.Preguntar("Busqueda/Descarga");
        } catch (IOException ex) 
        {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(Resultado.equals("No existe el archivo en red"))
        {
            JOptionPane.showMessageDialog(null, "No se encuentra activo el servidor Descargar");
        }else
        {
        
            if(!NombreArchivo.getText().equals(""))
            {
                ClientPeer.Archivos.put(NombreArchivo.getText(), 0);
                Cliente = new ClientFullDuplex();
                try 
                {
                    Cliente.Preguntar("RegAr/" + MyIp.getText() + "/" + NombreArchivo.getText() + "/" + "100");
                    Archiv= NombreArchivo.getText();
                    Direccion = (String) jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn());
                    Descarga x =new Descarga();
                    x.start();
                    
                } catch (IOException ex) 
                {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }else
            {
                JOptionPane.showMessageDialog(null, "Ingrese un nombre de archivo");
            }
        }
    }//GEN-LAST:event_DescargarActionPerformed

    private void ArchivosDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivosDispActionPerformed
        ClientFullDuplex Cliente = new ClientFullDuplex();
        String Resultado = null;
        try 
        {
            Resultado=Cliente.Preguntar("Busqueda/Disponibles");
        } catch (IOException ex) 
        {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(Resultado.equals("No existe el archivo en red"))
        {
            JOptionPane.showMessageDialog(null, "No se encuentra activo el servidor Archivos Disponibles");
        }else
        {
            Cliente = new ClientFullDuplex();
            Resultado="";
            try 
            {
                Resultado=Cliente.Preguntar("Tabla");
            } catch (IOException ex) 
            {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(Resultado.equals("No hay Archivos en red"))
            {
                JOptionPane.showMessageDialog(null, "No hay Archivos en red");
            }else
            {
                Resultado = Resultado.substring(0, Resultado.length() - 1);
                String[] parts = Resultado.split(" ");
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("Archivos en red", parts);
                jTable1.setModel(modelo); 
            }
        }
    }//GEN-LAST:event_ArchivosDispActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void MyIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyIpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MyIpActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ClientFullDuplex Cliente = new ClientFullDuplex();
        String Resultado = null;
        try 
            {
                Cliente.Preguntar("terminar/" + MyIp.getText());
                //JOptionPane.showMessageDialog(null, "Gracias");
            } catch (IOException ex) 
            {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ClientFullDuplex Cliente = new ClientFullDuplex();
        String Resultado = null;
        try 
            {
                Cliente.Preguntar("iniciar/" + MyIp.getText());
                //JOptionPane.showMessageDialog(null, "Gracias");
            } catch (Exception ex) 
            {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ArchivosDisp;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Descargar;
    private javax.swing.JTextField MyIp;
    private javax.swing.JTextField NombreArchivo;
    private javax.swing.JButton Registrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
