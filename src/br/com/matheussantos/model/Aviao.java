package br.com.matheussantos.model;

import java.util.ArrayList;
import java.util.List;

public class Aviao extends Personagem implements ArmamentoVip{
    protected String tipo;

    public Aviao(int id, int pontuacao, boolean abatido) {
        super(id, pontuacao, abatido);
    }

    public Aviao() {
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
            novosPersonagens.add(new Aviao(size+i+1, 50, false));
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
        return "Aviao{" +
                "id=" + id +
                ", pontuacao=" + pontuacao +
                ", abatido=" + abatido +
                '}';
    }
}
