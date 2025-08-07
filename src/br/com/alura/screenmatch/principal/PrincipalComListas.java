package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.Classificavel;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoVinicius = new Filme("Dogville", 2003);
        filmeDoVinicius.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoVinicius;


        List<Titulo> listaDeAssistidos = new LinkedList<>();
        listaDeAssistidos.add(filmeDoVinicius);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);

        for (Titulo item: listaDeAssistidos ){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());

            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Maria");
        buscaPorArtista.add("João");

        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);
        System.out.println("Lista de titulos ordenados: ");
        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);

        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " + listaDeAssistidos);

    }
}
