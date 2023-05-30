
// @author josuel Sanches
 
public class testeAluno {
    
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Josuel de Souza Sanches");
        aluno1.setEndereco("Cametá PA");
        aluno1.setEmail("josueldesouzasanches@gmail.com");
        aluno1.setNumeroMatricula(90909);
        aluno1.setTelefone("91991188082");
        System.out.println("O nome do aluno1 é: "+ aluno1.getNome());
        System.out.println("Ele mora em: " +aluno1.getEndereco());
        System.out.println("Seu numero de celular é: " +aluno1.getTelefone());
        System.out.println("O numero da matricula é: " +aluno1.getNumeroMatricula());
    }
    
}
