/**
 *
 * @author josuel Sanches
 */
public class Usuario implements OperacoesFace {

    @Override
    public void inserir(Object object) {
        System.out.println("Criando novo usuario...");
    }

    @Override
    public void excluir(Object object) {
        System.out.println("Excluindo o usuario...");
    }

    @Override
    public void editar(Object object) {
        System.out.println("Editando o usuario...");
    }

    @Override
    public Object recuperar() {
        System.out.println("Recuperando o usuario...");
        return null;
    }
    
    
}
