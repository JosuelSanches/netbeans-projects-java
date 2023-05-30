/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 *
 * @author josuel Sanches
 */
public class TelaPrincipal {
    public static void main(String[] args) {
        
        JFrame tela = new JFrame("Calculadora");
        tela.setSize(350,500);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
        tela.setLayout(new BorderLayout());;
        JTextField texto = new JTextField();
        String acm = "";
        int reg,reg2,indc;
        
        JButton btn0 = new JButton("0");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btnPonto = new JButton(".");
        JButton btnResultado = new JButton("=");
        JButton btnSoma = new JButton("+");
        JButton btnSubtracao = new JButton("-");
        JButton btnMultiplicacao = new JButton("*");
        JButton btnDivisao = new JButton("/");
       
        
        tela.add(BorderLayout.NORTH, texto);
        JPanel painelDeBotoes = new JPanel();
        painelDeBotoes.setLayout(new GridLayout(4, 4));
        
      

        
        painelDeBotoes.add(btn1);
        painelDeBotoes.add(btn2);
        painelDeBotoes.add(btn3);
        painelDeBotoes.add(btnSoma);
        painelDeBotoes.add(btn4);
        painelDeBotoes.add(btn5);
        painelDeBotoes.add(btn6);
        painelDeBotoes.add(btnSubtracao);
        painelDeBotoes.add(btn7);
        painelDeBotoes.add(btn8);
        painelDeBotoes.add(btn9);
        painelDeBotoes.add(btnMultiplicacao);
        painelDeBotoes.add(btn0);
        painelDeBotoes.add(btnPonto);
        painelDeBotoes.add(btnResultado);
        painelDeBotoes.add(btnDivisao);
        tela.add(BorderLayout.CENTER, painelDeBotoes);
        
        
       
      
        }
    }
    

