package pack;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2
 * @since 23/10/2020
 */
public class GUIMain extends javax.swing.JFrame {
    
    Pessoa objPessoa = new Pessoa();
    
    public GUIMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldVisor = new javax.swing.JTextField();
        jButtonRaizCubica = new javax.swing.JButton();
        jButtonZero = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonDois = new javax.swing.JButton();
        jButtonUm = new javax.swing.JButton();
        jButtonTres = new javax.swing.JButton();
        jButtonQuatro = new javax.swing.JButton();
        jButtonCinco = new javax.swing.JButton();
        jButtonSeis = new javax.swing.JButton();
        jButtonSete = new javax.swing.JButton();
        jButtonOito = new javax.swing.JButton();
        jButtonNove = new javax.swing.JButton();
        jButtonVezes = new javax.swing.JButton();
        jButtonDivide = new javax.swing.JButton();
        jButtonMenos = new javax.swing.JButton();
        jButtonMais = new javax.swing.JButton();
        jButtonRaizQuadrada = new javax.swing.JButton();
        jButtonPotencia = new javax.swing.JButton();
        jButtonPorcento = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(0, 0));

        jTextFieldVisor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldVisor.setEnabled(false);

        jButtonRaizCubica.setBackground(new java.awt.Color(244, 243, 191));
        jButtonRaizCubica.setText("∛");
        jButtonRaizCubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRaizCubicaActionPerformed(evt);
            }
        });

        jButtonZero.setBackground(new java.awt.Color(172, 162, 162));
        jButtonZero.setText("0");
        jButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZeroActionPerformed(evt);
            }
        });

        jButtonIgual.setBackground(new java.awt.Color(177, 202, 165));
        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButtonDois.setBackground(new java.awt.Color(172, 162, 162));
        jButtonDois.setText("2");
        jButtonDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoisActionPerformed(evt);
            }
        });

        jButtonUm.setBackground(new java.awt.Color(172, 162, 162));
        jButtonUm.setText("1");
        jButtonUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUmActionPerformed(evt);
            }
        });

        jButtonTres.setBackground(new java.awt.Color(172, 162, 162));
        jButtonTres.setText("3");
        jButtonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTresActionPerformed(evt);
            }
        });

        jButtonQuatro.setBackground(new java.awt.Color(172, 162, 162));
        jButtonQuatro.setText("4");
        jButtonQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuatroActionPerformed(evt);
            }
        });

        jButtonCinco.setBackground(new java.awt.Color(172, 162, 162));
        jButtonCinco.setText("5");
        jButtonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCincoActionPerformed(evt);
            }
        });

        jButtonSeis.setBackground(new java.awt.Color(172, 162, 162));
        jButtonSeis.setText("6");
        jButtonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeisActionPerformed(evt);
            }
        });

        jButtonSete.setBackground(new java.awt.Color(172, 162, 162));
        jButtonSete.setText("7");
        jButtonSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeteActionPerformed(evt);
            }
        });

        jButtonOito.setBackground(new java.awt.Color(172, 162, 162));
        jButtonOito.setText("8");
        jButtonOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOitoActionPerformed(evt);
            }
        });

        jButtonNove.setBackground(new java.awt.Color(172, 162, 162));
        jButtonNove.setText("9");
        jButtonNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNoveActionPerformed(evt);
            }
        });

        jButtonVezes.setBackground(new java.awt.Color(244, 243, 191));
        jButtonVezes.setText("*");
        jButtonVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVezesActionPerformed(evt);
            }
        });

        jButtonDivide.setBackground(new java.awt.Color(244, 243, 191));
        jButtonDivide.setText("/");
        jButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivideActionPerformed(evt);
            }
        });

        jButtonMenos.setBackground(new java.awt.Color(244, 243, 191));
        jButtonMenos.setText("-");
        jButtonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenosActionPerformed(evt);
            }
        });

        jButtonMais.setBackground(new java.awt.Color(244, 243, 191));
        jButtonMais.setText("+");
        jButtonMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaisActionPerformed(evt);
            }
        });

        jButtonRaizQuadrada.setBackground(new java.awt.Color(244, 243, 191));
        jButtonRaizQuadrada.setText("√");
        jButtonRaizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRaizQuadradaActionPerformed(evt);
            }
        });

        jButtonPotencia.setBackground(new java.awt.Color(244, 243, 191));
        jButtonPotencia.setText("x¹");
        jButtonPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPotenciaActionPerformed(evt);
            }
        });

        jButtonPorcento.setBackground(new java.awt.Color(244, 243, 191));
        jButtonPorcento.setText("%");
        jButtonPorcento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorcentoActionPerformed(evt);
            }
        });

        jButtonLimpar.setBackground(new java.awt.Color(177, 202, 165));
        jButtonLimpar.setText("CE");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldVisor)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonUm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonDois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jButtonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(jButtonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonRaizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonRaizCubica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPorcento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonOito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonNove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRaizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRaizCubica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPorcento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonUm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonDois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        
        switch(objPessoa.getOp()){
            case '+':
                
                objPessoa.setValor2(Double.parseDouble(jTextFieldVisor.getText()));
                jTextFieldVisor.setText(String.valueOf(objPessoa.calcularSoma(objPessoa.getValor1(), objPessoa.getValor2())));
                
                break;
            case '-':
                
                objPessoa.setValor2(Double.parseDouble(jTextFieldVisor.getText()));
                jTextFieldVisor.setText(String.valueOf(objPessoa.calcularSubtracao(objPessoa.getValor1(), objPessoa.getValor2())));
                
                break;
            case '*':
                
                objPessoa.setValor2(Double.parseDouble(jTextFieldVisor.getText()));
                jTextFieldVisor.setText(String.valueOf(objPessoa.calcularMultiplicacao(objPessoa.getValor1(), objPessoa.getValor2())));
                
                break;
            case '/':
                
                objPessoa.setValor2(Double.parseDouble(jTextFieldVisor.getText()));
                jTextFieldVisor.setText(String.valueOf(objPessoa.calcularDivisao(objPessoa.getValor1(), objPessoa.getValor2())));
                
                break;
            case 'p':
                
                objPessoa.setValor2(Double.parseDouble(jTextFieldVisor.getText()));
                jTextFieldVisor.setText(String.valueOf(objPessoa.calcularPotenciacao(objPessoa.getValor1(), objPessoa.getValor2())));
                
                break;
            case '%':
                
                objPessoa.setValor2(Double.parseDouble(jTextFieldVisor.getText()));
                jTextFieldVisor.setText(String.valueOf(objPessoa.calcularPorcentagem(objPessoa.getValor1(), objPessoa.getValor2())));
                
                break;
        }
        
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoisActionPerformed
        
        objPessoa.setValorNullo(jTextFieldVisor.getText());
        jTextFieldVisor.setText(objPessoa.getValorNullo() + "2");
        
    }//GEN-LAST:event_jButtonDoisActionPerformed

    private void jButtonUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUmActionPerformed
        
        objPessoa.setValorNullo(jTextFieldVisor.getText());
        jTextFieldVisor.setText(objPessoa.getValorNullo() + "1");
        
    }//GEN-LAST:event_jButtonUmActionPerformed

    private void jButtonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTresActionPerformed
        
        objPessoa.setValorNullo(jTextFieldVisor.getText());
        jTextFieldVisor.setText(objPessoa.getValorNullo() + "3");
        
    }//GEN-LAST:event_jButtonTresActionPerformed

    private void jButtonQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuatroActionPerformed
        
        objPessoa.setValorNullo(jTextFieldVisor.getText());
        jTextFieldVisor.setText(objPessoa.getValorNullo() + "4");
        
    }//GEN-LAST:event_jButtonQuatroActionPerformed

    private void jButtonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCincoActionPerformed
        
        objPessoa.setValorNullo(jTextFieldVisor.getText());
        jTextFieldVisor.setText(objPessoa.getValorNullo() + "5");
        
    }//GEN-LAST:event_jButtonCincoActionPerformed

    private void jButtonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeisActionPerformed
        
        objPessoa.setValorNullo(jTextFieldVisor.getText());
        jTextFieldVisor.setText(objPessoa.getValorNullo() + "6");
        
    }//GEN-LAST:event_jButtonSeisActionPerformed

    private void jButtonSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeteActionPerformed
        
        objPessoa.setValorNullo(jTextFieldVisor.getText());
        jTextFieldVisor.setText(objPessoa.getValorNullo() + "7");
        
    }//GEN-LAST:event_jButtonSeteActionPerformed

    private void jButtonOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOitoActionPerformed
        
        objPessoa.setValorNullo(jTextFieldVisor.getText());
        jTextFieldVisor.setText(objPessoa.getValorNullo() + "8");
        
    }//GEN-LAST:event_jButtonOitoActionPerformed

    private void jButtonNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNoveActionPerformed
        
        objPessoa.setValorNullo(jTextFieldVisor.getText());
        jTextFieldVisor.setText(objPessoa.getValorNullo() + "9");
        
    }//GEN-LAST:event_jButtonNoveActionPerformed

    private void jButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZeroActionPerformed
        
        objPessoa.setValorNullo(jTextFieldVisor.getText());
        jTextFieldVisor.setText(objPessoa.getValorNullo() + "0");
        
    }//GEN-LAST:event_jButtonZeroActionPerformed

    private void jButtonMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaisActionPerformed
        
        objPessoa.setOp('+');
        objPessoa.setValor1(Double.parseDouble(jTextFieldVisor.getText()));
        jTextFieldVisor.setText("");
        
    }//GEN-LAST:event_jButtonMaisActionPerformed

    private void jButtonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenosActionPerformed
        
        objPessoa.setOp('-');
        objPessoa.setValor1(Double.parseDouble(jTextFieldVisor.getText()));
        jTextFieldVisor.setText("");
        
    }//GEN-LAST:event_jButtonMenosActionPerformed

    private void jButtonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivideActionPerformed
        
        objPessoa.setOp('/');
        objPessoa.setValor1(Double.parseDouble(jTextFieldVisor.getText()));
        jTextFieldVisor.setText("");
        
    }//GEN-LAST:event_jButtonDivideActionPerformed

    private void jButtonVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVezesActionPerformed
        
        objPessoa.setOp('*');        
        objPessoa.setValor1(Double.parseDouble(jTextFieldVisor.getText()));
        jTextFieldVisor.setText("");
        
    }//GEN-LAST:event_jButtonVezesActionPerformed

    private void jButtonRaizQuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRaizQuadradaActionPerformed
        
        objPessoa.setValor1(Double.parseDouble(jTextFieldVisor.getText()));
        jTextFieldVisor.setText(String.valueOf(objPessoa.calcularRaizQuadrada(objPessoa.getValor1())));
        
    }//GEN-LAST:event_jButtonRaizQuadradaActionPerformed

    private void jButtonRaizCubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRaizCubicaActionPerformed
        
        objPessoa.setValor1(Double.parseDouble(jTextFieldVisor.getText()));
        jTextFieldVisor.setText(String.valueOf(objPessoa.calcularRaizCubica(objPessoa.getValor1())));
        
    }//GEN-LAST:event_jButtonRaizCubicaActionPerformed

    private void jButtonPorcentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorcentoActionPerformed
        
        objPessoa.setOp('%');
        objPessoa.setValor1(Double.parseDouble(jTextFieldVisor.getText()));
        jTextFieldVisor.setText("");
        
    }//GEN-LAST:event_jButtonPorcentoActionPerformed

    private void jButtonPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPotenciaActionPerformed
        
        objPessoa.setOp('p');
        objPessoa.setValor1(Double.parseDouble(jTextFieldVisor.getText()));
        jTextFieldVisor.setText("");
        
    }//GEN-LAST:event_jButtonPotenciaActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        
        jTextFieldVisor.setText("");
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCinco;
    private javax.swing.JButton jButtonDivide;
    private javax.swing.JButton jButtonDois;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonMais;
    private javax.swing.JButton jButtonMenos;
    private javax.swing.JButton jButtonNove;
    private javax.swing.JButton jButtonOito;
    private javax.swing.JButton jButtonPorcento;
    private javax.swing.JButton jButtonPotencia;
    private javax.swing.JButton jButtonQuatro;
    private javax.swing.JButton jButtonRaizCubica;
    private javax.swing.JButton jButtonRaizQuadrada;
    private javax.swing.JButton jButtonSeis;
    private javax.swing.JButton jButtonSete;
    private javax.swing.JButton jButtonTres;
    private javax.swing.JButton jButtonUm;
    private javax.swing.JButton jButtonVezes;
    private javax.swing.JButton jButtonZero;
    private javax.swing.JTextField jTextFieldVisor;
    // End of variables declaration//GEN-END:variables
}
