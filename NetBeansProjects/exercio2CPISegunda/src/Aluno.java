/*
    Crie uma classe aluno com os atributos nome, materia e array
    de notas com 4 posicoes refentes a materia (todos com modificadores private).
    Crie os gets e sets para os atributos da classe e um metodo para imprimir as informacoes
    do aluno juntamente as notas. Crie um classe de teste para inicializar os 
    atributos e chamar os metodos.
 */

/**
 *
 * @author josuel Sanches
 */
public class Aluno {
    private String nome, materia;
    private float[] notas = new float[4];

    public void dadosAluno(){
        System.out.println("Nome: " +getNome());
        System.out.println("Materia: " +getMateria());
        System.out.println("Notas: ");
        for(int i = 0; i < 4; i++){
            System.out.println(getNotas()[i]+" ");
        }
    }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }
    
    
}
