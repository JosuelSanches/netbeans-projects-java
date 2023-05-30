/*
 2) Crie uma classe Circulo com os atributos privados raio(double)
e cor(String) inicializados no construtor padrao com os valores 1.0
e "azul" respectivamente. Criar dois construtores - um construtor padrao
sem argumento e um construtor que recebe um argumento double para o raio.
Criar tres metodos publicos getRaio(), setCor() e getArea() que deve retornar
o raio do circulo, a cor e a area, respectivamente. Para calcular a area, utilizar
a constante do java Math.PI. Crie tambem um metodo para imprimir as informacoes do 
circulo. Crie um metodo para teste.
 */

/**
 *
 * @author josuel Sanches
 */

public class Circulo {
    private double raio;
    private String cor;
    private double area;

    public Circulo() {
        this.raio = 1.0;
        this.cor = "Azul";
    }
    public Circulo(double raio){
        this.raio = raio;
        this.cor = "azul";
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setArea(){
        this.area = (Math.PI*(raio*raio));
    }
    public double getArea(){
        return area;
    }
    public void Imprimir(){
        System.out.println("O circulo é "+cor+" de raio : "+raio+" Tem: "+area+ " de area.");
    }
}
