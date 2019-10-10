package br.com.matheussantos.model;

import java.util.List;

public abstract class Personagem {
    protected int id;
    protected int pontuacao;
    protected boolean abatido;

    public Personagem(int id, int pontuacao, boolean abatido) {
        this.id = id;
        this.pontuacao = pontuacao;
        this.abatido = abatido;
    }
    public Personagem(){}

    public abstract List<Personagem> gerar(int quantidade, int size);

    public void abater(boolean abater){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int populacao) {
        this.pontuacao = populacao;
    }

    public boolean isAbatido() {
        return abatido;
    }

    public void setAbatido(boolean abatido) {
        this.abatido = abatido;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", pontuacao=" + pontuacao +
                ", abatido=" + abatido +
                '}';
    }
}
