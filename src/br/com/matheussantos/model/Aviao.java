package br.com.matheussantos.model;

import java.util.ArrayList;
import java.util.List;

public class Aviao extends Personagem implements ArmamentoVip{
    public Aviao(int id, int pontuacao, boolean abatido) {
        super(id, pontuacao, abatido);
    }

    public Aviao() {
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
    public int anexar(int quatidade, String tipo) {
        if(tipo == "Missil teleguiado") {
            return quatidade*2;
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
