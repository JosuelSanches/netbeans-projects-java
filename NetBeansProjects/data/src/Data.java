

/**
 *
 * @author josuel Sanches
 */
public class Data {
    private int dia, mes, ano;
    

    public Data(int dia, int mes, int ano) {
        if (dia > 31 || mes > 12){
            System.out.println("A data é invalida!");
        }else{
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
}
