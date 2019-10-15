package br.com.matheussantos.model;

import java.util.ArrayList;
import java.util.List;

public class Navio extends Personagem implements ArmamentoVip{
    protected String tipo;

    public Navio(int id, int pontuacao, boolean abatido) {
        super(id, pontuacao, abatido);
    }

    public Navio() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public List<Personagem> gerar(int quantidade, int size) {
        List<Personagem> novosPersonagens = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            novosPersonagens.add(new Navio(size+i+1, 100, false));
        }
        return novosPersonagens;
    }

    @Override
    public int anexar(int quantidade, String tipo) {
        if(tipo == "Missil teleguiado") {
            this.tipo = tipo;
            return quantidade*2;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Navio{" +
                "id=" + id +
                ", pontuacao=" + pontuacao +
                ", abatido=" + abatido +
                '}';
    }
}
