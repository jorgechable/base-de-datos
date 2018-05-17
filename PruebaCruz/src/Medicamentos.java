
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jorch
 */
public class Medicamentos extends javax.swing.JFrame {
DefaultTableModel model;
Connection con;
Statement sent;

    

    /**
     * Creates new form Medicamentos
     */
    public Medicamentos() {
        initComponents();  //aqui se crean las columnas de las tablas
        setLocationRelativeTo(null);
        con = Conexion.geConnection();
        setResizable(false);
        setTitle("Medicamentos");
        mostrar();
        
        
        /*model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Laboratorio");
        model.addColumn("Direccion");
        this.tabladedatos.setModel(model);*/

    }
PreparedStatement preparedStatement;
    ResultSet resultSet;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c_codigo = new javax.swing.JTextField();
        c_nombredemedicamento = new javax.swing.JTextField();
        c_nombredelaboratorio = new javax.swing.JTextField();
        c_direccionlaboratorio = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btneliminartodo = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btninicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladedatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Laboratorio");

        jLabel4.setText("Direccion");

        c_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_codigoActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btneliminartodo.setText("Eliminar Todo");
        btneliminartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminartodoActionPerformed(evt);
            }
        });

        btnsalir.setText("salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 18)); // NOI18N
        jLabel5.setText("Medicamentos");

        btninicio.setText("Inicio");
        btninicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninicioActionPerformed(evt);
            }
        });

        tabladedatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladedatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btnguardar)
                .addGap(34, 34, 34)
                .addComponent(btnnuevo)
                .addGap(36, 36, 36)
                .addComponent(btneliminar)
                .addGap(34, 34, 34)
                .addComponent(btneliminartodo)
                .addGap(43, 43, 43)
                .addComponent(btnsalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btninicio)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(c_direccionlaboratorio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(c_nombredelaboratorio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_codigo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_nombredemedicamento, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(c_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(c_nombredemedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(c_nombredelaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(c_direccionlaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo)
                    .addComponent(btnguardar)
                    .addComponent(btneliminar)
                    .addComponent(btneliminartodo)
                    .addComponent(btnsalir)
                    .addComponent(btninicio))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
try {
String sql = "INSERT INTO medicamentos (txtcodigo, txtnombredemedicamento, txtnombredelaboratorio, txtdireccionlaboratorio)" + "VALUES (?,?,?,?)";
PreparedStatement ps = con.prepareCall(sql);
ps.setString(1, c_codigo.getText()); 
ps.setString(2, c_nombredemedicamento.getText());
ps.setString(3, c_nombredelaboratorio.getText());
ps.setString(4, c_direccionlaboratorio.getText());

int n = ps.executeUpdate();
if (n>0) {
 JOptionPane.showMessageDialog(null, "Medicamento Guardado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Guardar Medicamento");

        
mostrar();
        
    }   
        //codigo de arreglo 
        //String[] agregar = new String[4];
        //agregar[0] = c_codigo.getText();
        //agregar[1] = c_nombredemedicamento.getText();
        //agregar[2] = c_nombredelaboratorio.getText();
        //agregar[3] = c_direccionlaboratorio.getText();
        //model.addRow(agregar);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed

// TODO add your handling code here:
        c_codigo.setText("");
        c_nombredemedicamento.setText("");
        c_nombredelaboratorio.setText("");
        c_direccionlaboratorio.setText("");

    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        int eli = tabladedatos.getSelectedRowCount();
        if (eli >= 0) {
            model.removeRow(eli);
        } else {
            JOptionPane.showMessageDialog(null, "No hay Datos Que Eliminar");

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btneliminartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminartodoActionPerformed
        int elitotal = tabladedatos.getRowCount();
        for (int i = elitotal - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminartodoActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed

        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btninicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninicioActionPerformed
Inicio obj=new Inicio();
     obj.setVisible(true);  dispose();        

        // TODO add your handling code here:
    }//GEN-LAST:event_btninicioActionPerformed

    private void c_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_codigoActionPerformed

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
            java.util.logging.Logger.getLogger(Medicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btneliminartodo;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btninicio;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JTextField c_codigo;
    private javax.swing.JTextField c_direccionlaboratorio;
    private javax.swing.JTextField c_nombredelaboratorio;
    private javax.swing.JTextField c_nombredemedicamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladedatos;
    // End of variables declaration//GEN-END:variables


    private void mostrar (){//codigo para mostrar el contenido de la tabla
try {
con = Conexion.geConnection();
String[]titulos ={"codigo","nombre","laboratorio","direccion"};
String sql = "SELECT * FROM medicamentos";
model = new DefaultTableModel(null,titulos);
sent = con.createStatement();
ResultSet rs = sent.executeQuery(sql);

String []fila=new String[4];
while(rs.next()){
  fila[0]=rs.getString("txtcodigo");
  fila[1]=rs.getString("txtnombredemedicamento");
  fila[2]=rs.getString("txtnombredelaboratorio");
  fila[3]=rs.getString("txtdireccionlaboratorio");

  model.addRow(fila);
}
tabladedatos.setModel(model);
} catch (Exception e) {

e.printStackTrace();
}
}
}


