package aula11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Alunos extends javax.swing.JFrame {

    public Alunos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        try{
            jTextField1.setDocument(new TeclasLetras());
        }
        catch (Exception e){
        }
        jTextField2 = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##)#####-####");
            jTextField2 = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        try{
            jTextField4.setDocument(new aula11.TeclasNumeros());
        }
        catch (Exception e){
        }
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Inserir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Excluir");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Celular");

        jLabel3.setText("E-mail:");

        jLabel4.setText("Matrícula:");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton5.setText("Limpar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setText("Alterar");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Cadastro de Alunos do SENAI - SANTOS / SP");

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton7.setText("Listar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addGap(101, 101, 101))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(79, 79, 79))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        try{
            if (jTextField4.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "O número de matrícula é obrigatório!!!");
            }else{
                Class.forName("org.apache.derby.jdbc.ClientDriver"); 
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_turmasabado");
                Statement declara = con.createStatement();
                ResultSet resultado = declara.executeQuery("Select * from tb_aluno where al_matricula = "+Integer.parseInt(jTextField4.getText())); 
                System.out.println(resultado);
                
                if(resultado.next()){
                    jButton1.setEnabled(false);
                    jButton2.setEnabled(false);
                    jButton3.setEnabled(true);
                    jButton4.setEnabled(true);
                    jButton5.setEnabled(true);
                    jTextField1.setEnabled(true);
                    jTextField2.setEnabled(true);
                    jTextField3.setEnabled(true);
                    jTextField4.setEnabled(false);
                    jTextField1.setText(resultado.getString("al_nome"));
                    jTextField2.setText(resultado.getString("al_celular"));
                    jTextField3.setText(resultado.getString("al_email"));
                }else{
                    jButton1.setEnabled(true);
                    jButton2.setEnabled(true);
                    jButton3.setEnabled(false);
                    jButton4.setEnabled(false);
                    jButton5.setEnabled(true);
                    jTextField1.setEnabled(true);
                    jTextField2.setEnabled(true);
                    jTextField3.setEnabled(true);
                    jTextField4.setEnabled(true);
                    jTextField4.setText("");
                    JOptionPane.showMessageDialog(null, "Aluno não cadastrado!!!");
                }
                resultado.close();
                declara.close();
                con.close();
            }    
        }catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver"); 
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_turmasabado");
            Statement declara = con.createStatement();
            
            if (jTextField4.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "O número de matrícula é obrigatório!!!");
            }else{
                ResultSet resultcons = declara.executeQuery("Select * from tb_aluno where al_matricula = "+jTextField4.getText()); 
                if(resultcons.next()){
                    JOptionPane.showMessageDialog(null, "Aluno já cadastrado!!!");
                }else{                
                    if (jTextField1.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "O nome do aluno é obrigatório!!!");
                    }else{
                        String expressao =     jTextField4.getText()+",";
                        expressao+= "'"+jTextField1.getText().toUpperCase()+"',";
                        expressao+= "'"+jTextField2.getText().toUpperCase()+"',";
                        expressao+= "'"+jTextField3.getText().toUpperCase()+"')";  

                        TrataEmail te = new TrataEmail();
                        int resultado = te.validaEmail(jTextField3.getText());

                        if (resultado==1){
                            JOptionPane.showMessageDialog(null, "E-mail Inválido");
                        }else{
                            int resultupd = declara.executeUpdate("Insert Into tb_aluno (al_matricula,al_nome,al_celular,al_email) Values ("+expressao);
                            if(resultupd>0){
                                JOptionPane.showMessageDialog(null, "Registro incluído!!!");
                                jButton1.setEnabled(false);
                                jButton2.setEnabled(false);
                                jButton3.setEnabled(false);
                                jButton4.setEnabled(false);
                                jButton5.setEnabled(true);
                                jButton7.setEnabled(false);
                                jTextField4.setEnabled(false);
                                jTextField1.setEnabled(false);
                                jTextField2.setEnabled(false);
                                jTextField3.setEnabled(false);
                            }else{
                                JOptionPane.showMessageDialog(null, "Erro na inclusão!!!");
                            }
                        }
                    }    
                }        
            }            
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver"); 
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_turmasabado");
            Statement declara = con.createStatement(); 

            String expressão = jTextField4.getText();
            int resultado = declara.executeUpdate("Delete from tb_aluno where al_matricula ="+expressão); 
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "Registro excluído!!!");
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(true);
                jButton7.setEnabled(false);
                jTextField4.setEnabled(false);
                jTextField1.setEnabled(false);
                jTextField2.setEnabled(false);
                jTextField3.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(null, "Erro na exclusão!!!");
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

            jList1.setModel(new DefaultListModel());

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");  
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
            jButton5.setEnabled(true);
            jButton7.setEnabled(true);
            jTextField1.setEnabled(true);
            jTextField2.setEnabled(true);
            jTextField3.setEnabled(true);
            jTextField4.setEnabled(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            
            TrataEmail te = new TrataEmail();
            int ret = te.validaEmail(jTextField3.getText());
                    
            if (ret==1){
                JOptionPane.showMessageDialog(null, "E-mail Inválido");
            }else{
            
                Class.forName("org.apache.derby.jdbc.ClientDriver"); 
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_turmasabado");
                Statement declara = con.createStatement(); 

                if (jTextField1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "O nome do aluno é obrigatório!!!");
                }else{
                    int resultado = declara.executeUpdate("Update tb_aluno set al_nome ="+"'"+jTextField1.getText().toUpperCase()+"',"+"al_celular ="+"'"+jTextField2.getText().toUpperCase()+"',"+"al_email ="+"'"+jTextField3.getText().toUpperCase()+"',"+"al_matricula ="+jTextField4.getText()+"where al_matricula ="+jTextField4.getText());
                    if(resultado>0){
                        JOptionPane.showMessageDialog(null, "Registro alterado!!!");
                        jButton1.setEnabled(false);
                        jButton2.setEnabled(false);
                        jButton3.setEnabled(false);
                        jButton4.setEnabled(false);
                        jButton5.setEnabled(true);
                        jButton7.setEnabled(false);
                        jTextField4.setEnabled(false);
                        jTextField1.setEnabled(false);
                        jTextField2.setEnabled(false);
                        jTextField3.setEnabled(false);
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro na alteração!!!");
                    }
                }  
            }
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

        try{
            
            Class.forName("org.apache.derby.jdbc.ClientDriver"); 
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_turmasabado");
            Statement declara = con.createStatement(); 
            ResultSet resultado = declara.executeQuery("Select * from tb_aluno where al_nome = "+"'"+jList1.getSelectedValue().toString()+"'");
            
            if (resultado.next()){
                jTextField1.setText(resultado.getString("al_nome"));
                jTextField2.setText(resultado.getString("al_celular"));
                jTextField3.setText(resultado.getString("al_email"));
                jTextField4.setText(resultado.getString("al_matricula"));
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(true);
                jButton4.setEnabled(true);
                jButton5.setEnabled(true);
                jButton7.setEnabled(false);            
                jTextField1.setEnabled(true);
                jTextField2.setEnabled(true);
                jTextField3.setEnabled(true);
                jTextField4.setEnabled(false);
            }  
            resultado.close();
            declara.close();
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        try{
            
            ArrayList <String> filtro = new ArrayList();
            
            Class.forName("org.apache.derby.jdbc.ClientDriver"); 
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_turmasabado");
            Statement declara = con.createStatement(); 
            ResultSet rs = declara.executeQuery("Select * from tb_aluno where al_nome like "+"'%"+jTextField1.getText().toUpperCase()+"%'");            
            
            while (rs.next()) {
                filtro.add(rs.getString("al_nome"));
            }    
            
            DefaultListModel listModel = new DefaultListModel();
            for (String percorrer : filtro) {
               listModel.addElement(percorrer);
            }
            jList1.setModel(listModel);

            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
            jButton7.setEnabled(false);            
            jButton5.setEnabled(true);

            jTextField4.setEnabled(false);
            jTextField1.setEnabled(false);
            jTextField2.setEnabled(false);
            jTextField3.setEnabled(false);
            
            rs.close();
            declara.close();
            con.close();
        }
        catch(Exception e){
             System.out.println(e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}