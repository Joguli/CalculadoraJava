/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextField;

/**
 *
 * @author jogul
 */
public class JFrTela extends javax.swing.JFrame {

    /**
     * Creates new form JFrTela
     */
    public JFrTela() {
        initComponents();
    }

    double num1, num2, result;
    String opr;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btLimpar = new javax.swing.JButton();
        btB = new javax.swing.JButton();
        btPercentual = new javax.swing.JButton();
        btDivisao = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        btMultiplicacao = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        btSubtracao = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btSoma = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        btPontoFinal = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        btIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BasicCalculator ");

        jPanel2.setBackground(new java.awt.Color(236, 250, 253));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(236, 250, 253));
        jTextField1.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setToolTipText("");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(340, 500));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        btLimpar.setBackground(new java.awt.Color(236, 250, 253));
        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btn1.png"))); // NOI18N
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btLimpar);

        btB.setBackground(new java.awt.Color(236, 250, 253));
        btB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btB.setText("B->");
        btB.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btn1.png"))); // NOI18N
        btB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBActionPerformed(evt);
            }
        });
        jPanel1.add(btB);

        btPercentual.setBackground(new java.awt.Color(236, 250, 253));
        btPercentual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPercentual.setText("%");
        btPercentual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btn1.png"))); // NOI18N
        btPercentual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPercentualActionPerformed(evt);
            }
        });
        jPanel1.add(btPercentual);

        btDivisao.setBackground(new java.awt.Color(236, 250, 253));
        btDivisao.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btDivisao.setText("/");
        btDivisao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btn1.png"))); // NOI18N
        btDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDivisaoActionPerformed(evt);
            }
        });
        jPanel1.add(btDivisao);

        bt7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt7.setText("7");
        bt7.setBorderPainted(false);
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        jPanel1.add(bt7);

        bt8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt8.setText("8");
        bt8.setBorderPainted(false);
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        jPanel1.add(bt8);

        bt9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt9.setText("9");
        bt9.setBorderPainted(false);
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        jPanel1.add(bt9);

        btMultiplicacao.setBackground(new java.awt.Color(236, 250, 253));
        btMultiplicacao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btMultiplicacao.setText("*");
        btMultiplicacao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btn1.png"))); // NOI18N
        btMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicacaoActionPerformed(evt);
            }
        });
        jPanel1.add(btMultiplicacao);

        bt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt4.setText("4");
        bt4.setBorderPainted(false);
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        jPanel1.add(bt4);

        bt5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt5.setText("5");
        bt5.setBorderPainted(false);
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        jPanel1.add(bt5);

        bt6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt6.setText("6");
        bt6.setBorderPainted(false);
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        jPanel1.add(bt6);

        btSubtracao.setBackground(new java.awt.Color(236, 250, 253));
        btSubtracao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSubtracao.setText("-");
        btSubtracao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btn1.png"))); // NOI18N
        btSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubtracaoActionPerformed(evt);
            }
        });
        jPanel1.add(btSubtracao);

        bt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt1.setText("1");
        bt1.setBorderPainted(false);
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt1);

        bt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt2.setText("2");
        bt2.setBorderPainted(false);
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt2);

        bt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt3.setText("3");
        bt3.setBorderPainted(false);
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        jPanel1.add(bt3);

        btSoma.setBackground(new java.awt.Color(236, 250, 253));
        btSoma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSoma.setText("+");
        btSoma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btn1.png"))); // NOI18N
        btSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSomaActionPerformed(evt);
            }
        });
        jPanel1.add(btSoma);

        bt0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt0.setText("0");
        bt0.setBorderPainted(false);
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });
        jPanel1.add(bt0);

        btPontoFinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPontoFinal.setText(".");
        btPontoFinal.setBorderPainted(false);
        btPontoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPontoFinalActionPerformed(evt);
            }
        });
        jPanel1.add(btPontoFinal);

        btFechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btFechar.setText("Fechar");
        btFechar.setBorderPainted(false);
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btFechar);

        btIgual.setBackground(new java.awt.Color(236, 250, 253));
        btIgual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btIgual.setText("=");
        btIgual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btn1.png"))); // NOI18N
        btIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIgualActionPerformed(evt);
            }
        });
        jPanel1.add(btIgual);

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 340, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btPercentualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPercentualActionPerformed
        num1 = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        opr = "%";
    }//GEN-LAST:event_btPercentualActionPerformed

    private void btSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubtracaoActionPerformed
        num1 = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        opr = "-";
    }//GEN-LAST:event_btSubtracaoActionPerformed

    private void btSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSomaActionPerformed
        //jTextField1.setText(jTextField1.getText() + "+");
        num1 = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        opr = "+";
    }//GEN-LAST:event_btSomaActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        jTextField1.setText(jTextField1.getText() + "1");
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed
        jTextField1.setText(jTextField1.getText() + "0");
    }//GEN-LAST:event_bt0ActionPerformed

    private void btPontoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPontoFinalActionPerformed
        jTextField1.setText(jTextField1.getText() + ".");
    }//GEN-LAST:event_btPontoFinalActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        jTextField1.setText(jTextField1.getText() + "2");
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        jTextField1.setText(jTextField1.getText() + "3");
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        jTextField1.setText(jTextField1.getText() + "4");
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        jTextField1.setText(jTextField1.getText() + "6");
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        jTextField1.setText(jTextField1.getText() + "7");
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        jTextField1.setText(jTextField1.getText() + "8");
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        jTextField1.setText(jTextField1.getText() + "9");
    }//GEN-LAST:event_bt9ActionPerformed

    private void btBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBActionPerformed
    //    jTextField1.setText(jTextField1.getText() + "AC");
        
        String AC = null;
        if(jTextField1.getText().length() > 0){
            StringBuilder s = new StringBuilder(jTextField1.getText());
            s.deleteCharAt(jTextField1.getText().length() - 1);
            AC = s.toString();
            jTextField1.setText(AC);
        }
    }//GEN-LAST:event_btBActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        //jTextField1.setText(jTextField1.getText() + "+/-");
        jTextField1.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDivisaoActionPerformed
        num1 = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        opr = "/";
    }//GEN-LAST:event_btDivisaoActionPerformed

    private void btMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicacaoActionPerformed
        num1 = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        opr = "*";
    }//GEN-LAST:event_btMultiplicacaoActionPerformed

    private void btIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIgualActionPerformed
        num2 = Double.parseDouble(jTextField1.getText());
        if(opr == "+"){
            result = num1 + num2;
            jTextField1.setText(Double.toString(result));
        }else if(opr == "-"){
            result = num1 - num2;
            jTextField1.setText(Double.toString(result));
        }else if(opr == "*"){
            result = num1 * num2;
            jTextField1.setText(Double.toString(result));
        }else if(opr == "/"){
            result = num1 / num2;
            jTextField1.setText(Double.toString(result));
        }else{
            result = (num1 * num2) / 100;
            jTextField1.setText(Double.toString(result));
        }
    }//GEN-LAST:event_btIgualActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btFecharActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        jTextField1.setText(jTextField1.getText() + "5");
    }//GEN-LAST:event_bt5ActionPerformed
   // public String tfValor;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btB;
    private javax.swing.JButton btDivisao;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btMultiplicacao;
    private javax.swing.JButton btPercentual;
    private javax.swing.JButton btPontoFinal;
    private javax.swing.JButton btSoma;
    private javax.swing.JButton btSubtracao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
