package calculadora;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaPrincipal {
    public static void main(String[] args) {
      Stack<String> pilha = new Stack<String>();  // pilha para Caracteres
      Stack<Double> pilha2 = new Stack<Double>(); // pilha para numeros
       ArrayList<String> listaNomes = new ArrayList<>(); // lista de nomes;
       
       
        JFrame tela = new JFrame("Calculadora");
        
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
        tela.setSize(350, 500);
        tela.setLayout(new BorderLayout());
        JTextField texto = new JTextField();
      
          
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

        JButton btnVirgula = new JButton(",");
        JButton btnResultado = new JButton("=");
        JButton btnSoma = new JButton("+");
        JButton btnSubtracao = new JButton("-");
        JButton btnMutiplicacao = new JButton("*");
        JButton btnDivisao = new JButton("/");
        JButton btnLimpar = new JButton("<-");
        JButton btnLimparTudo = new JButton("C");
        JButton btnSobre = new JButton("SOBRE");
        //  btnSobre.setSize(50, 50);
        //btnSubtracao.setForeground(new java.awt.Color(204, 2,2));

        tela.add(BorderLayout.NORTH, texto);

        JPanel painelDeBotoes = new JPanel();
        painelDeBotoes.setLayout(new GridLayout(6, 6));

        painelDeBotoes.add(btn1);
        painelDeBotoes.add(btn2);
        painelDeBotoes.add(btn3);
        painelDeBotoes.add(btnLimpar);

        painelDeBotoes.add(btn4);
        painelDeBotoes.add(btn5);
        painelDeBotoes.add(btn6);
        painelDeBotoes.add(btnSoma);

        painelDeBotoes.add(btn7);
        painelDeBotoes.add(btn8);
        painelDeBotoes.add(btn9);
        painelDeBotoes.add(btnSubtracao);

        painelDeBotoes.add(btnVirgula);
        painelDeBotoes.add(btn0);
        painelDeBotoes.add(btnLimparTudo);
        painelDeBotoes.add(btnMutiplicacao);
        //.addPainelDebotoes(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE,51, javax.swing.GroupLayout.PREFERRED_SIZE);
        //.addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
       
  
     
        painelDeBotoes.add(btnSobre);
        painelDeBotoes.add(btnResultado);
       painelDeBotoes.add(btnDivisao);

        tela.add(BorderLayout.CENTER, painelDeBotoes);
        

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             int btn0 = 0;
               texto.setText(texto.getText()+btn0);
                
            }
        });
        
           btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int btn1 = 1;
               texto.setText(texto.getText()+btn1);
            }
        });
        
          btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             int btn2 = 2;
               texto.setText(texto.getText()+btn2);
            }
        });
          btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int btn3 = 3;
               texto.setText(texto.getText()+btn3);
            }
        });
         
             btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              int btn4 = 4;
               texto.setText(texto.getText()+btn4);
            }
        });
             btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              int btn5 = 5;
               texto.setText(texto.getText()+btn5);
            }
        });
               btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             int btn6 = 6;
               texto.setText(texto.getText()+btn6); 
            }
        });
               btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              int btn7 = 7;
               texto.setText(texto.getText()+btn7);  
            }
        });
              btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int btn8 = 8;
               texto.setText(texto.getText()+btn8);  
            }
        });
              btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              int btn9 = 9;
               texto.setText(texto.getText()+btn9); 
            }
        });
              btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
               texto.setText(texto.getText()+"+");
              
            }
        });
              btnMutiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              texto.setText(texto.getText()+"*");
                
            }
        });
            btnSubtracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              texto.setText(texto.getText()+"-");
                 
            }
        });
           btnDivisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              texto.setText(texto.getText()+"/");
                 
            }
        });
           btnResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             texto.setText(texto.getText()+"=");
             
            }
        });
          btnVirgula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              texto.setText(texto.getText()+",");
                 
            }
        });
                btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           //  texto.setText("");
           String s = texto.getText().substring(0, texto.getText().length()-1);
                texto.setText(s);
            }
        });
           btnLimparTudo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               texto.setText("");
              
                 
            }
        });
             btnSobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaNomes.add(texto.getText());
                JOptionPane.showMessageDialog(null, "Equipe: \n"+
                                                                      "Roberto de Oliveira Rodrigues \n" +
                                                                      "Rubens Sergio Monfredo Gomes \n" +
                                                                       "Eula Katia Franco Dos Santos  \n"+
                                                                       "José Ailson Viana Moia \n"+
                                                                        "Aline Machado Rodrigues");
                 
            }
        });
             
   

       
    }
}
