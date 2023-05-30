
import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.List;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josuel Sanches
 */
public class Casa {
    public static void main(String[] args){
        int op = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha sua opção:");
        System.out.println("1 - Cadastro de imoveis ");
        System.out.println("2 - Atualizar imovel ");
        System.out.println("3 - Consultar imovel ");
        System.out.println("4 - Apagar imovel ");
        op = input.nextInt();
        
        if (op == 1){
            
        }else if(op == 2){
            
        }else if (op == 3){
            
        }else if (op ==4){
            
        }
                
    }
    public static void cadastro(){
        Imovel imovel = new Imovel();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o tipo de imovel: ");
        String tipo = scanner.next();
        imovel.setTipo(tipo);
        
        System.out.println("Insira a area do imovel: ");
        int area = scanner.nextInt();
        imovel.setArea(area);
        
        System.out.println("Insira a cor do imovel: ");
        String cor = scanner.next();
        imovel.setCor(cor);
        
        System.out.println("Quantos comodos: ");
        int comodo = scanner.nextInt();
        imovel.setComodo(comodo);
        
        System.out.println("Insira o endeco: ");
        scanner.nextLine();
        String endereco = scanner.nextLine();
        imovel.setEndereco(endereco);
        
        System.out.println("Digite o valor: ");
        float valor = scanner.nextFloat();
        imovel.setValor(valor);
        
        System.out.println("Disponibilidade [1- para disponivel, 0 para nao disponivel]: ");
        int resp = scanner.nextInt();
        if (resp == 1){
            imovel.setSituacao(true);
        }else if(resp == 0){
            imovel.setSituacao(false);
        }
        String sql = "INSERT INTO imoveis(tipo, area, cor, comodo, endereco, valor, situacao) VALUES ('"+ imovel.getTipo() +"', '"+ imovel.getArea() +"', '"+ imovel.getCor() +"','"+ imovel.getComodo +"',,'"+ imovel.getEndereco +"', '"+ imovel.getValor() +"', "+ imovel.isSituacao() +")";
        Connection connection = ConnectionDB.getConnection();
        try {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        int retorno = preparedStatement.executeUpdate(sql);
        if (retorno != 0){
            System.out.println("Cadastro feito!");
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
