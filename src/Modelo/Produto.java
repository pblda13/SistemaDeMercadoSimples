package Modelo;

import utils.Utils;

public class Produto {

    private static int count = 1;

    private int id;
    private String nome;
    private double preço;

    public Produto(String nome, double preço) {
        this.id = count;
        this.nome = nome;
        this.preço = preço;
        Produto.count += 1;
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String toString(){
        return "\nId: " + this.getId() +
                "\nNome: " + this.getNome() +
                "\nPreço: " + Utils.doubleToString(this.getPreço());
    }
}
