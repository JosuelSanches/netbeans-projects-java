/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imovel;

/**
 *
 * @author josuel Sanches
 */
public class Imovel {
    String tipo;
    int area;
    String cor;
    int comodo;
    String endereco;
    float valor;
    boolean situacao;
    int id;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getComodo() {
        return comodo;
    }

    public void setComodo(int comodo) {
        this.comodo = comodo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Imovel_2{" + "tipo=" + tipo + ", area=" + area + ", cor=" + cor + ", comodo=" + comodo + ", endereco=" + endereco + ", valor=" + valor + ", situacao=" + situacao + ", id=" + id + '}';
    }
    
    }
