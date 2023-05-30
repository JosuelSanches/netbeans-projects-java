
/**
 *
 * @author josuel Sanches
 */
public class DataTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data data = new Data(9,90,2020);
        System.out.println("Data: "+ data.getDia()+"/"+data.getMes()+"/"+data.getAno());
    }
    
}
