/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1questao3;

/**
 *
 * @author josuel Sanches
 */
public class FilaDeBanco {
    ArrayList<Cliente> clientes = new ArrayList<>();

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void inserir(Cliente c){
        this.clientes.add(c);
    }
    public void remover(){
        this.clientes.remove(0);
    }
    public void exibirFila(){
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("Nome: "+ clientes.get(i).getNome());
            System.out.println("RG: "+ clientes.get(i).getRg());
        }
    }
    
}
