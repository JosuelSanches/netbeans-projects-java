/**
 * Crie uma interface chamada OperacoesFuncionarios com a assinatura dos metodos 
 * receberSalario, mudarSetor e entrarDeFerias. Criar as classes Professor, Diretor
 * e Zelador que implementam a interface e imprimem uma mensagem de acordo com a classe 
 * que está implementando. Exemplo: "Professor esta recebendo aumento..". Criar classe 
 * teste.
 */

/**
 *
 * @author josuel Sanches
 */
public class Professor implements OperacoesFuncionarios {

    @Override
    public void receberSalario() {
        System.out.println("O professor esta recebendo salario...");
    }

    @Override
    public void mudarDeSetor() {
        System.out.println("O professor esta mudadando de setor...");
    }

    @Override
    public void entrarDeFerias() {
        System.out.println("O professor esta entrando de ferias...");
    }

   
    
}
