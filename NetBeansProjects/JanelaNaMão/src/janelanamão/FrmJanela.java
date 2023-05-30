/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelanamão;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author josuel Sanches
 */
public class FrmJanela extends JFrame {

    /**
     */
    public FrmJanela(){
        initComponents();
    }
    private void initComponentes(){
        setDefaltCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Janela de login");
        setSize(400, 300);
        
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER,20, 20));
        
        JLabel lblLogin = new JLabel("login: ");
        getContentPane().add(lblLogin);
        
        JTextField txtLogin = new JTextField(25);
        getContentPane().add(txtLogin);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        FrmJanela janela = new FrmJanela();
        janela.setVisible(true);
    }
}
