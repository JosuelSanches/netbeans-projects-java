
//  @author josuel Sanches
 
public class Calculadora {
    float potencia(float base, int expoente){
        float resultado = 1;
        for (int i = 1; i <= expoente; i++){
            resultado *= base;
        }
        return resultado;
    }
    int potencia(int base, int expoente){
        int resultado = 1;
        for (int i = 1; i <= expoente; i++){
            resultado *= base;
        }
        return resultado;
    }
    int somar(int a, int b){
    return a + b; 
}
    float somar(float a, float b){
        return a + b;
    }
    void somar(int a, float b){
        System.out.println((a + b));
    }
}
