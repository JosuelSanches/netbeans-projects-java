
import java.util.ArrayList;

/**
 *
 * @author josuel Sanches
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Professor> professores = new ArrayList<>();
        Professor p1 = new Professor();
        p1.setNome("Eliezer");
        p1.setFaculdade("Sistemas de informacao");
        p1.setCh(40);
        p1.setIdade(26);
        
        professores.add(p1);
        
        Professor p2 = new Professor();
        p2.setNome("Fabricio");
        p2.setFaculdade("Sistemas de informacao");
        p2.setCh(40);
        p2.setIdade(32);
        
        professores.add(p2);
        
        Professor p3 = new Professor();
        p3.setNome("Alan");
        p3.setFaculdade("Sistemas de informacao");
        p3.setCh(40);
        p3.setIdade(40);
        
        professores.add(p3);
        
        for (int i = 0; i < professores.size(); i++){
            System.out.println("Nome: "+ professores.get(i).getNome());
            System.out.println("Faculdade: "+ professores.get(i).getFaculdade());
            System.out.println("CH: "+ professores.get(i).getCh());
            System.out.println("Idade: "+ professores.get(i).getIdade());
        }
    }
    
}
