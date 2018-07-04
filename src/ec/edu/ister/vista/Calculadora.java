
package ec.edu.ister.vista;


 
public class Calculadora extends javax.swing.JFrame {

 
    
    public Calculadora () {
        initComponents();
    }
    
    String numero1= " ";
    String numero2= " ";
    int cuenta = 0;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnpunto = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btnsuma = new javax.swing.JButton();
        btnmultiplica = new javax.swing.JButton();
        btndivide = new javax.swing.JButton();
        resul = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("CALCULADORA ");

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(6, 2, 0, 4));

        btn1.setBackground(new java.awt.Color(153, 153, 255));
        btn1.setFont(new java.awt.Font("Yu Gothic", 3, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(204, 0, 0));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);

        btn2.setBackground(new java.awt.Color(153, 153, 255));
        btn2.setFont(new java.awt.Font("Yu Gothic", 3, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(204, 0, 0));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);

        btn3.setBackground(new java.awt.Color(153, 153, 255));
        btn3.setFont(new java.awt.Font("Yu Gothic", 3, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(204, 0, 0));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);

        btn4.setBackground(new java.awt.Color(153, 153, 255));
        btn4.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(204, 0, 0));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);

        btn5.setBackground(new java.awt.Color(153, 153, 255));
        btn5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(153, 0, 0));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5);

        btn6.setBackground(new java.awt.Color(153, 153, 255));
        btn6.setFont(new java.awt.Font("Yu Gothic", 3, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(204, 0, 0));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6);

        btn7.setBackground(new java.awt.Color(153, 153, 255));
        btn7.setFont(new java.awt.Font("Yu Gothic", 3, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(204, 0, 0));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7);

        btn8.setBackground(new java.awt.Color(153, 153, 255));
        btn8.setFont(new java.awt.Font("Yu Gothic", 3, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(204, 0, 51));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8);

        resta.setBackground(new java.awt.Color(153, 153, 255));
        resta.setFont(new java.awt.Font("Yu Gothic UI", 3, 48)); // NOI18N
        resta.setForeground(new java.awt.Color(204, 0, 0));
        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });
        jPanel1.add(resta);

        btn9.setBackground(new java.awt.Color(153, 153, 255));
        btn9.setFont(new java.awt.Font("Yu Gothic", 3, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(153, 0, 51));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9);

        btn0.setBackground(new java.awt.Color(153, 153, 255));
        btn0.setFont(new java.awt.Font("Yu Gothic", 3, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(204, 0, 0));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0);

        btnpunto.setBackground(new java.awt.Color(153, 153, 255));
        btnpunto.setFont(new java.awt.Font("Yu Gothic", 3, 48)); // NOI18N
        btnpunto.setForeground(new java.awt.Color(204, 51, 0));
        btnpunto.setText(".");
        btnpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuntoActionPerformed(evt);
            }
        });
        jPanel1.add(btnpunto);

        btnborrar.setBackground(new java.awt.Color(153, 153, 255));
        btnborrar.setFont(new java.awt.Font("Yu Gothic", 3, 18)); // NOI18N
        btnborrar.setForeground(new java.awt.Color(204, 51, 0));
        btnborrar.setText("C");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnborrar);

        btnsuma.setBackground(new java.awt.Color(153, 153, 255));
        btnsuma.setFont(new java.awt.Font("Yu Gothic", 3, 24)); // NOI18N
        btnsuma.setForeground(new java.awt.Color(204, 51, 0));
        btnsuma.setText(" +");
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });
        jPanel1.add(btnsuma);

        btnmultiplica.setBackground(new java.awt.Color(153, 153, 255));
        btnmultiplica.setFont(new java.awt.Font("Yu Gothic", 3, 18)); // NOI18N
        btnmultiplica.setForeground(new java.awt.Color(204, 0, 0));
        btnmultiplica.setText("*");
        btnmultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicaActionPerformed(evt);
            }
        });
        jPanel1.add(btnmultiplica);

        btndivide.setBackground(new java.awt.Color(153, 153, 255));
        btndivide.setFont(new java.awt.Font("Yu Gothic", 3, 18)); // NOI18N
        btndivide.setForeground(new java.awt.Color(204, 0, 0));
        btndivide.setText("/");
        btndivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivideActionPerformed(evt);
            }
        });
        jPanel1.add(btndivide);

        resul.setBackground(new java.awt.Color(153, 153, 255));
        resul.setFont(new java.awt.Font("Yu Gothic", 3, 18)); // NOI18N
        resul.setForeground(new java.awt.Color(204, 0, 0));
        resul.setText("=");
        resul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resulActionPerformed(evt);
            }
        });
        jPanel1.add(resul);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
       if(!lbl3.getText().equals("")||cuenta !=0){
           operaciones();
           lbl2.setText("+");  
       }
    }//GEN-LAST:event_btnsumaActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
       if(!lbl3.getText().equals("")||cuenta !=0){
           operaciones();
           lbl2.setText("-");  
       }
    }//GEN-LAST:event_restaActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        numero1 += "1";
        lbl3.setText(numero1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        numero1 += "2";
        lbl3.setText(numero1);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        numero1 += "3";
        lbl3.setText(numero1);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        numero1 += "4";
        lbl3.setText(numero1);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        numero1 += " 5 ";
        lbl3.setText(numero1);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        numero1 += "6";
        lbl3.setText(numero1);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        numero1 += "7";
        lbl3.setText(numero1);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        numero1 += "8";
        lbl3.setText(numero1);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        numero1 += "9";
        lbl3.setText(numero1);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        numero1 += "0";
        lbl3.setText(numero1);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuntoActionPerformed
        numero1 += ".";
        lbl3.setText(numero1);
    }//GEN-LAST:event_btnpuntoActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        numero1="";
        numero2="";
        lbl1.setText("");
        lbl2.setText("");
        lbl3.setText("");
        cuenta= 0;
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnmultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicaActionPerformed
        if(!lbl3.getText().equals("")||cuenta !=0){
           operaciones();
           lbl2.setText("*");  
       }
    }//GEN-LAST:event_btnmultiplicaActionPerformed

    private void btndivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivideActionPerformed
         if(!lbl3.getText().equals("")||cuenta !=0){
           operaciones();
           lbl2.setText("/");  
       }
    }//GEN-LAST:event_btndivideActionPerformed

    private void resulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resulActionPerformed
         if(!lbl3.getText().equals("")||cuenta !=0){
           operaciones();
           lbl2.setText("");  
       }
    }//GEN-LAST:event_resulActionPerformed

    void operaciones(){
        double n1,n2;
        if(!lbl3.getText().equals("")){
            if(cuenta==0){
                numero2=numero1;
                lbl2.setText(numero2);
            }
            if(numero2.equals("")){
                numero2= "0";
            }
            n1= Double.valueOf(numero2);
            n2= Double.valueOf(numero1);
            if(lbl2.getText().equals("+")){
                numero2=String.valueOf(n1+n2);
                
            }
             if(lbl2.getText().equals("-")){
                numero2=String.valueOf(n1-n2);
                
            }
              if(lbl2.getText().equals("*")){
                numero2=String.valueOf(n1*n2); 
            }
               if(lbl2.getText().equals("/")){
                numero2=String.valueOf(n1/n2);  
            }
               lbl3.setText("");
               numero1= "";
               cuenta++;
               lbl1.setText(numero2);  
        }
    }
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btndivide;
    private javax.swing.JButton btnmultiplica;
    private javax.swing.JButton btnpunto;
    private javax.swing.JButton btnsuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JButton resta;
    private javax.swing.JButton resul;
    // End of variables declaration//GEN-END:variables
}
