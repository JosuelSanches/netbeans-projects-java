package calculadora;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Taylor
 */
public class TelaPrincipal extends JFrame {
    
     private final JMenuBar MenuBar = new JMenuBar();

          private final JMenu Calculadora = new JMenu("Calculadora");
             private final JMenuItem Sobre = new JMenuItem("Sobre a Calculadora");
            
       
    private final GridLayout Layout = new GridLayout(5, 0, 0, 0);
      
    private final Font Fonte_Visor = new Font("Consolas", Font.PLAIN, 30);
    private final JPanel Geral = new JPanel();
    private final JPanel Panel_B = new JPanel();
    private final JPanel Panel = new JPanel();

    private final JLabel Visor = new JLabel("0");

    private final JButton C = new JButton("C");
    private final JButton B_B = new JButton("DEL");
    private final JButton B1 = new JButton("1");
    private final JButton B2 = new JButton("2");
    private final JButton B3 = new JButton("3");
    private final JButton B4 = new JButton("4");
    private final JButton B5 = new JButton("5");
    private final JButton B6 = new JButton("6");
    private final JButton B7 = new JButton("7");
    private final JButton B8 = new JButton("8");
    private final JButton B9 = new JButton("9");
    private final JButton B0 = new JButton("0");
    private final JButton B_I = new JButton("=");
    private final JButton B_V = new JButton(",");
    private final JButton B_Ad = new JButton("+");
    private final JButton B_Sb = new JButton("-");
    private final JButton B_Mt = new JButton("*");
    private final JButton B_Dv = new JButton("/");
    
   
   
    public TelaPrincipal() {
       
        super("Calculadora");
             
        C.setToolTipText("Limpa o visor");
        B_B.setToolTipText("Apaga o último caractere digitado");
            
        B1.setMnemonic(KeyEvent.VK_NUMPAD1);
        B2.setMnemonic(KeyEvent.VK_NUMPAD2);
        B3.setMnemonic(KeyEvent.VK_NUMPAD3);
        B4.setMnemonic(KeyEvent.VK_NUMPAD4);
        B5.setMnemonic(KeyEvent.VK_NUMPAD5);
        B6.setMnemonic(KeyEvent.VK_NUMPAD6);
        B7.setMnemonic(KeyEvent.VK_NUMPAD7);
        B8.setMnemonic(KeyEvent.VK_NUMPAD8);
        B9.setMnemonic(KeyEvent.VK_NUMPAD9);
        B0.setMnemonic(KeyEvent.VK_NUMPAD0);
       
       
        B_Ad.setMnemonic(KeyEvent.VK_ADD);
        B_Sb.setMnemonic(KeyEvent.VK_SUBTRACT);
        B_Mt.setMnemonic(KeyEvent.VK_MULTIPLY);
        B_Dv.setMnemonic(KeyEvent.VK_DIVIDE);
        B_I.setMnemonic(KeyEvent.VK_ENTER);
        B_B.setMnemonic(KeyEvent.VK_BACK_SPACE);
        C.setMnemonic(KeyEvent.VK_DELETE);
       
       
             
        Calculadora.add(Sobre);
        
        MenuBar.add(Calculadora);
    
             
        this.setJMenuBar(MenuBar);

     
        Panel.add(B7);
        Panel.add(B8);
        Panel.add(B9);
        
       
        Panel.add(B_B);
       
        Panel.add(B4);       
        Panel.add(B5);
        Panel.add(B6);
        Panel.add(B_Ad);
        
               
       
        Panel.add(B1);
        Panel.add(B2);
        Panel.add(B3); 
        Panel.add(B_Sb);
        
        Panel.add(B_V);
        Panel.add(B0);
        Panel.add(C);
                      
        
        Panel.add(B_Mt);
        Panel.add(B_I);
        Panel.add(B_Dv);
       
        Panel.setLayout(Layout);
        Visor.setFont(Fonte_Visor);
        
        
         Visor.setHorizontalAlignment(SwingConstants.RIGHT);
             
        Visor.setBorder(BorderFactory.createTitledBorder(""));
        Panel_B.add(Panel);
       
          
        Visor.setPreferredSize(new Dimension (240,30));
       
        Geral.add(Visor);
        Geral.add(Panel_B);
        add(Geral);
       
       
        ButtonHandler Handler = new ButtonHandler();
        B1.addActionListener(Handler);
        B2.addActionListener(Handler);
        B3.addActionListener(Handler);
        B4.addActionListener(Handler);
        B5.addActionListener(Handler);
        B6.addActionListener(Handler);
        B7.addActionListener(Handler);
        B8.addActionListener(Handler);
        B9.addActionListener(Handler);
        B0.addActionListener(Handler);
       
        C.addActionListener(Handler);
        B_B.addActionListener(Handler);
        B_Ad.addActionListener(Handler);
        B_Sb.addActionListener(Handler);
        B_Mt.addActionListener(Handler);
        B_Dv.addActionListener(Handler);
        B_I.addActionListener(Handler);
        B_V.addActionListener(Handler);
       
       
       Sobre.addActionListener(Handler);
       
       
    }
   
   
    private class ButtonHandler implements ActionListener{
       
        String cadeia = "0";
        String copiar = "";
        double Num1, Num2, resultado;
        char Operacao = 'n';
        int Achou, zerar;
       
        @Override
        public void actionPerformed (ActionEvent event){
            
            if (event.getSource() == Sobre){
                               
                new Sobre_Calculadora((int)getLocation().getX(), (int)getLocation().getY(),
                       TelaPrincipal.this, true).setVisible(true);
            }
            
           
            if (event.getSource() == B1){
                               
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "1";
                zerar = 0;
            }
           
           
            if (event.getSource() == B2){
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "2";
                zerar = 0;
            }
           
           
            if (event.getSource() == B3){
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "3";
                zerar = 0;
            }
           
           
            if (event.getSource() == B4){
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "4";
                zerar = 0;
            }
           
           
            if (event.getSource() == B5){
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "5";
                zerar = 0;
            }
           
           
            if (event.getSource() == B6){
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "6";
                zerar = 0;
            }
           
           
            if (event.getSource() == B7){
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "7";
                zerar = 0;
            }
           
           
            if (event.getSource() == B8){
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "8";
                zerar = 0;
            }
           
           
            if (event.getSource() == B9){
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "9";
                zerar = 0;
            }
   
           
            if (event.getSource() == B_V){
                Achou = 0;
                if (zerar ==1) cadeia = "";
               
                for (int i=0; i<cadeia.length(); ++i)
                    if (cadeia.charAt(i) == '.') Achou=1;
               
                if (cadeia.equals("")) cadeia = cadeia + "0.";
                    else
                        if (Achou == 0) cadeia = cadeia + "."; 
               
                zerar = 0;
            }
           
           
            if (event.getSource() == B0){
                if (zerar ==1) cadeia = "";
               
                if (!cadeia.equals("0")){
                    cadeia = cadeia + "0";
                } else zerar = 1;
                //Operacao = 'n';
                zerar = 0;
            }
           
           
            if (event.getSource() == C){
                cadeia = "0";
                zerar = 1;
            }
           
           
            if (event.getSource() == B_B){
                if (cadeia.length()  > 1) cadeia = cadeia.substring(0, cadeia.length()-1);
                   else{
                    cadeia = "0";
                    zerar = 1;
                   }
            }
           
           
       
           
            if (event.getSource() == B_Ad){               
                Num1 = Double.parseDouble(Visor.getText());
                Operacao = '+';
                zerar = 1;
            }
           
           
            if (event.getSource() == B_Sb){               
                Num1 = Double.parseDouble(Visor.getText());
                Operacao = '-';
                zerar = 1;
            }
           
           
            if (event.getSource() == B_Mt){               
                Num1 = Double.parseDouble(Visor.getText());
                Operacao = '*';
                zerar = 1;
            }
           
           
            if (event.getSource() == B_Dv){               
                Num1 = Double.parseDouble(Visor.getText());
                Operacao = '/';
                zerar = 1;
            }
           
           
            if (event.getSource() == B_I){
                // Converte uma String em Double               
                Num2 = Double.parseDouble(Visor.getText());
               
                 switch(Operacao) {
                    
                     case 'n': resultado = Num2;
                     break;
        
                     case '+': resultado = Num1 + Num2;
                     break;
        
                     case '-': resultado = Num1 - Num2;
                     break;
        
                     case '*': resultado = Num1 * Num2;
                     break;
        
                     case '/': resultado = Num1 / Num2;
                     break;
                 }
                 
                  cadeia = String.valueOf(resultado);
                  zerar = 1;
              }
             
                Visor.setText("" + cadeia);
            
         }
    }


    class Sobre_Calculadora extends JDialog{
   
        private Font Fonte = new Font("Tahoma", Font.PLAIN, 15);
   
        private JPanel Geral = new JPanel();
  
        private JPanel Informacoes_do_Programador = new JPanel();
            private GridLayout Layout1 = new GridLayout(5,1);
            private JLabel Aluno_1 = new JLabel("Taylor Costa Alves" );
            private JLabel Aluno_2 = new JLabel("Wenderson Gustavo Silva dos Santos");
            private JLabel Aluno_3 = new JLabel("Josuel de Souza Sanches");
            private JLabel Aluno_4 = new JLabel("Jose Wendel Viana Pantoja");
            private JLabel Aluno_5 = new JLabel("Almix Junior Barbosa Filgueira");

        private int X;
        private int Y;

        public Sobre_Calculadora(int X, int Y, Frame parent, boolean modal) {
            super(parent, modal);
       
            this.X = X;
            this.Y = Y;
           
               
            Aluno_1.setFont(Fonte);
            Aluno_2.setFont(Fonte);
            Aluno_3.setFont(Fonte);
            Aluno_4.setFont(Fonte);
            Aluno_5.setFont(Fonte);
       
       
            Informacoes_do_Programador.setLayout(Layout1);
       
       
            Informacoes_do_Programador.add(Aluno_1);
            Informacoes_do_Programador.add(Aluno_2);
            Informacoes_do_Programador.add(Aluno_3);
            Informacoes_do_Programador.add(Aluno_4);
            Informacoes_do_Programador.add(Aluno_5);
       
       
            Informacoes_do_Programador.setPreferredSize(new Dimension (300,240));
            Informacoes_do_Programador.setBackground(Color.WHITE);
            Informacoes_do_Programador.setBorder(BorderFactory.createTitledBorder(null, "Equipe:",
                TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 1, 16)));
       
       
            Geral.add(Informacoes_do_Programador);
       
            Geral.setFont(Fonte);
            add(Geral);
       
            Geral.setBackground(Color.WHITE);
            
       
       
            this.setTitle("Mensagem");
            this.setSize(400,300);
            this.setResizable(false);
            this.setLocation(X+20,Y+40);
    }
} 
   
   
   
   
    public static void main(String [] args){
  
        TelaPrincipal Propriedades_Calculadora = new TelaPrincipal();
              
            Propriedades_Calculadora.setSize(250,250);
            
            Propriedades_Calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
            Propriedades_Calculadora.setVisible(true);
            
            Propriedades_Calculadora.setResizable(false);
           
            Propriedades_Calculadora.setLocationRelativeTo(null);
    }
}