/*
1) Escreva um programa para imprimir a area de um retangulo
criando uma classe chamada Area com dois metodos. O primeiro
chamado setDim() recebe o comprimento e largura do retangulo
como parametro e o segundo metodo chamado getArea() retorna
a area do retangulo. O comprimento e a largura do retangulo 
sao inseridos atraves do teclado e por meio de uma classe teste.
 */

/**
 *
 * @author josuel Sanches
 */
public class Area {
   
    private int comprimento;
    private int largura;
    private int area;
    
    public void setDim(int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    public int getArea(){
        area = (this.comprimento * this.largura);
        return area;
    }
    
}
