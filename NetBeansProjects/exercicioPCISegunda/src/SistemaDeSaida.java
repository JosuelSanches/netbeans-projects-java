/*
 Crie uma classe SistemaDeSaida, onde atraves dela voce devera criar metodos de classe(estaticos)
para imprimir mensagens. Um metodo será printarQuebrandoLinha(String string) o outro 
será printar(String string). Esse ultimo nao devera quebrar linha apos a mensagem passada por parametro.
Crie uma classe com o metodo main para testar os metodos da classe SistemasDeSaida.
 */

/**
 *
 * @author josuel Sanches
 */
public class SistemaDeSaida {
    String string;
    public static void printarQuebrandoLinha(String string){
        System.out.println("A palavra digitada foi: " +string);
        System.out.println("Quebrou linha!");
    }
    public static void printar(String string){
        System.out.print("A palavra digitada foi: "+string);
        System.out.print("Não quebrou linha!");
    }
    
}
