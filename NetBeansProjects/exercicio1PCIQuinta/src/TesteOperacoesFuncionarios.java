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
public class TesteOperacoesFuncionarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.receberSalario();
        professor.mudarDeSetor();
        professor.entrarDeFerias();
        //professor.recuperar();
        
        System.out.println("...................................................");
        
        Diretor diretor = new Diretor();
        diretor.receberSalario();
        diretor.mudarDeSetor();
        diretor.entrarDeFerias();
        
        System.out.println("...................................................");
        
        Zelador zelador = new Zelador();
        zelador.receberSalario();
        zelador.mudarDeSetor();
        zelador.entrarDeFerias();
        
        System.out.println("...................................................");
    }
    
}
