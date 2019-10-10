package br.com.matheussantos.control;

import br.com.matheussantos.model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Personagem aviao1 = new Aviao(1, 50, false);
        Personagem aviao2 = new Aviao(2, 50, false);
        Personagem aviao3 = new Aviao(3, 50, false);
        Personagem navio1 = new Navio(4, 100, false);
        Personagem navio2 = new Navio(5, 100, false);
        Personagem navio3 = new Navio(6, 100, false);
        Personagem tanque1 = new Tanque(7, 10, false);
        Personagem tanque2 = new Tanque(8, 10, false);
        Personagem tanque3 = new Tanque(9, 10, false);

        List<Personagem> listaPersonagem = new ArrayList<>();
        listaPersonagem.add(aviao1);
        listaPersonagem.add(aviao2);
        listaPersonagem.add(aviao3);
        listaPersonagem.add(navio1);
        listaPersonagem.add(navio2);
        listaPersonagem.add(navio3);
        listaPersonagem.add(tanque1);
        listaPersonagem.add(tanque2);
        listaPersonagem.add(tanque3);

        listaPersonagem.forEach(personagem -> {
            System.out.println(personagem);
        });

        //List<Personagem> novos = new ArrayList<>();
        //aviao1.gerar();


        listaPersonagem.forEach(personagem -> {
            if((personagem instanceof Aviao || personagem instanceof Navio) && personagem.isAbatido() == false){
                personagem.setPontuacao(((ArmamentoVip) personagem).anexar(personagem.getPontuacao(), "Missil teleguiado"));
            }
        });

        listaPersonagem.forEach(personagem -> {
            if(personagem.isAbatido() == false){
                personagem.setAbatido(true);
                System.out.println(personagem);
            }
        });

        List<Personagem> listaCrePont = listaPersonagem;

        listaCrePont.sort(Comparator.comparingInt(Personagem::getPontuacao).reversed());
        System.out.println(listaCrePont);

        listaCrePont.forEach(personagem -> {
            if (personagem.isAbatido() == false){
                System.out.println(personagem);
            }
        });

        listaCrePont.forEach(personagem -> {
            if (personagem.isAbatido() == false && personagem instanceof Aviao){
                System.out.println(personagem);
            }
        });


    }
}
