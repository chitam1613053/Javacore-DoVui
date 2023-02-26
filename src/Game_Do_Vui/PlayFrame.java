/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Game_Do_Vui;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class PlayFrame extends javax.swing.JFrame {

    /**
     * Creates new form PlayFrame
     */
    int Score=0,index=0;
    List<Question> QuestionList = ModifyQuestion.GetList();
    public PlayFrame() {
        initComponents();
       
        Question question = QuestionList.get(0);
        txtScore.setText(String.valueOf(Score));
        txtQuestionNo.setText("Question:"+String.valueOf(index+1));
        txtQuestion.setText(question.getTitle());
        txtA.setText(question.getOption1());
        txtB.setText(question.getOption2());
        txtC.setText(question.getOption3());
        txtD.setText(question.getOption4());
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtQuestion = new javax.swing.JLabel();
        txtScore = new javax.swing.JLabel();
        txtB = new javax.swing.JLabel();
        txtC = new javax.swing.JLabel();
        txtD = new javax.swing.JLabel();
        txtA = new javax.swing.JLabel();
        btnC = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        txtQuestionNo = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 250));

        txtQuestion.setText("txtQuestion");
        txtQuestion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtScore.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtScore.setText("txtScore");

        txtB.setText("jLabel1");

        txtC.setText("jLabel1");

        txtD.setText("jLabel1");

        txtA.setText("jLabel1");

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnA.setText("A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        btnB.setText("B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnD.setText("D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        txtQuestionNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtQuestionNo.setText("txtQuestionNo");

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnA, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(txtQuestionNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQuestionNo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNext)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC)
                    .addComponent(btnD))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        
        index++;
        if(index>=QuestionList.size()){
            JOptionPane.showMessageDialog(rootPane, "Congrastulation!! Your Socer is:"+Score);
            String name = Modify.CurrentUserName;
            List<UserData> datalist =Modify.GetDataList();
            for (UserData userData : datalist) {
                if(userData.getUserName().equals(name)){
                    userData.setScore(Score);
                    if(userData.getScore()>userData.getHighScore()){
                        userData.setHighScore(Score);
                        Modify.UpdateUserData(userData);
                    }
                }
                
                
            }
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Userframe().setVisible(true);
            }
        });
            setVisible(false);
            dispose();
        }else{
        Question question = QuestionList.get(index);
        txtScore.setText(String.valueOf(Score));
        txtQuestionNo.setText("Question:"+String.valueOf(index+1));
        txtQuestion.setText(question.getTitle());
        txtA.setText(question.getOption1());
        txtB.setText(question.getOption2());
        txtC.setText(question.getOption3());
        txtD.setText(question.getOption4());
        btnNext.setEnabled(false);
        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        Question question = QuestionList.get(index);
        if(question.getAnswer().equals("A")){
            JOptionPane.showMessageDialog(rootPane, "Correct");
            Score+=10;
            txtScore.setText(String.valueOf(Score));
        }else{
            JOptionPane.showMessageDialog(rootPane, "Incorrect");
        }
        btnNext.setEnabled(true);
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        Question question = QuestionList.get(index);
        if(question.getAnswer().equals("B")){
            JOptionPane.showMessageDialog(rootPane, "Correct");
            Score+=10;
            txtScore.setText(String.valueOf(Score));
        }else{
            JOptionPane.showMessageDialog(rootPane, "Incorrect");
        }
        btnNext.setEnabled(true);
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        Question question = QuestionList.get(index);
        if(question.getAnswer().equals("C")){
            JOptionPane.showMessageDialog(rootPane, "Correct");
            Score+=10;
            txtScore.setText(String.valueOf(Score));
        }else{
            JOptionPane.showMessageDialog(rootPane, "Incorrect");
        }
        btnNext.setEnabled(true);
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
      Question question = QuestionList.get(index);
        if(question.getAnswer().equals("D")){
            JOptionPane.showMessageDialog(rootPane, "Correct");
            Score+=10;
            txtScore.setText(String.valueOf(Score));
        }else{
            JOptionPane.showMessageDialog(rootPane, "Incorrect");
        }
        btnNext.setEnabled(true);
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
    }//GEN-LAST:event_btnDActionPerformed

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
            java.util.logging.Logger.getLogger(PlayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel txtA;
    private javax.swing.JLabel txtB;
    private javax.swing.JLabel txtC;
    private javax.swing.JLabel txtD;
    private javax.swing.JLabel txtQuestion;
    private javax.swing.JLabel txtQuestionNo;
    private javax.swing.JLabel txtScore;
    // End of variables declaration//GEN-END:variables
}
