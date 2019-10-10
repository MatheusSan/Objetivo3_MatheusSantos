package br.com.matheussantos.model;

import java.util.ArrayList;
import java.util.List;

public class Tanque extends Personagem{
    public Tanque(int id, int populacao, boolean abatido) {
        super(id, populacao, abatido);
    }

    public Tanque() {
    }

    @Override
    public List<Personagem> gerar(int quantidade, int size) {
        List<Personagem> novosPersonagens = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            novosPersonagens.add(new Tanque(size+i, 0, false));
        }
        return novosPersonagens;
    }

    @Override
    public String toString() {
        return "Tanque{" +
                "id=" + id +
                ", pontuacao=" + pontuacao +
                ", abatido=" + abatido +
                '}';
    }
}
