

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author josuel Sanches
 */

public class Principal {

    public static void main(String[] args) {
        int op = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha a opção");
        while (op != 0) {
            System.out.println("1 - cadastrar");
            System.out.println("2 - atualizacao");
            System.out.println("3 - exclusao");
            System.out.println("4 - consulta");

            op = input.nextInt();

            if (op == 1) {
                cadastrar();
            } else if(op == 4){
                //consulta();
            }
        }

    }

    public static void cadastrar() {
        Imovel imovel = new Imovel();
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o tipo de imovel.");
        String tipo = input.next();
        imovel.setTipo(tipo);

        System.out.println("Insira a area(m²): ");
        int area = input.nextInt();
        imovel.setArea(area);

        System.out.println("Insira a cor do imovel: ");
        String cor = input.next();
        imovel.setCor(cor);

        System.out.println("Insira a Quantidade de comodos: ");
        int comodo = input.nextInt();
        imovel.setQuant_comodos(comodo);

        System.out.println("Insira o endereço: ");
        input.nextLine();
        String endereco = input.nextLine();
        imovel.setEndereco(endereco);

        System.out.println("Insira o valor: ");
        double valor = input.nextDouble();
        imovel.setValor(valor);

        System.out.println("Disponibilidade:[digite 1 para disponivel ou 0 para indisponivel] ");
        int opBoolean = input.nextInt();
        if ((opBoolean == 1)) {
            imovel.setVendido(true);
        } else if ((opBoolean == 0)) {
            imovel.setVendido(false);
        }
        ImovelDb imovelDb = new ImovelDb();
        imovelDb.insere(imovel);
    }

    

    }
