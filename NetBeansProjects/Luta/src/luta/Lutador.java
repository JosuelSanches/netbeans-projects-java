/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luta;

/**
 *Crie uma classe Lutador com os atributos encapsulados nome e life. 
 * Crie um método construtor que receberá o nome do lutador por parâmetro.
 * Toda vez que a classe Lutador for instanciada, 
 * o life deve ser inicializado com 100 (todo lutador iniciará com a vida 100%).
 * A classe Lutador deverá implementar a interface Acoes que contém 
 * os métodos darChute(Lutador) e darSoco(Lutador), 
 * os métodos recebem por parâmetro um Lutador adversário. 
 * Crie a lógica para reduzir o life de cada lutador ao receber uma ação de outro lutador.
 * A ação de dar chute deve reduzir 20 do life do adversário, enquanto a dar soco reduz 10.
 * 
 * @author josuel Sanches
 */
public class Lutador implements Acoes{
    private String nome;
    private int life;

    public Lutador(String nome) {
        this.nome = nome;
        this.life = 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public void darChute(Lutador adversario) {
        adversario.setLife(adversario.getLife() - 20);
    }

    @Override
    public void darSoco(Lutador adversario) {
        adversario.setLife(adversario.getLife() - 10);
    }
    
}
