//classe País


import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nome;
    private String capital;
    private double dimensao;
    private List<Pais> fronteiras;

    public Pais(String nome, String capital, double dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
        this.fronteiras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public double getDimensao() {
        return dimensao;
    }

    public boolean equals(final Pais outro) {
        return this.nome.equals(outro.nome) && this.capital.equals(outro.capital);
    }

    public void definirFronteira(Pais pais) {
        if (!this.equals(pais)) {
            fronteiras.add(pais);
            pais.fronteiras.add(this);
        }
    }

    public List<Pais> getPaisesFronteira() {
        return fronteiras;
    }

    public List<Pais> getVizinhosComuns(Pais outro) {
        List<Pais> vizinhosComuns = new ArrayList<>();
        for (Pais pais : fronteiras) {
            if (outro.fronteiras.contains(pais)) {
                vizinhosComuns.add(pais);
            }
        }
        return vizinhosComuns;
    }
}


//Objeto pais

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro país:");
        String nomePais1 = scanner.nextLine();
        System.out.println("Digite o nome da capital do primeiro país:");
        String capitalPais1 = scanner.nextLine();
        System.out.println("Digite a dimensão em Km² do primeiro país:");
        double dimensaoPais1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o nome do segundo país:");
        String nomePais2 = scanner.nextLine();
        System.out.println("Digite o nome da capital do segundo país:");
        String capitalPais2 = scanner.nextLine();
        System.out.println("Digite a dimensão em Km² do segundo país:");
        double dimensaoPais2 = scanner.nextDouble();

        Pais pais1 = new Pais(nomePais1, capitalPais1, dimensaoPais1);
        Pais pais2 = new Pais(nomePais2, capitalPais2, dimensaoPais2);

        System.out.println("Países criados:");
        System.out.println("País 1:");
        System.out.println("Nome: " + pais1.getNome());
        System.out.println("Capital: " + pais1.getCapital());
        System.out.println("Dimensão: " + pais1.getDimensao() + " Km²");
        System.out.println("País 2:");
        System.out.println("Nome: " + pais2.getNome());
        System.out.println("Capital: " + pais2.getCapital());
        System.out.println("Dimensão: " + pais2.getDimensao() + " Km²");

        System.out.println();

        pais1.definirFronteira(pais2);

        System.out.println("Países que fazem fronteira com " + pais1.getNome() + ":");
        for (Pais paisFronteira : pais1.getPaisesFronteira()) {
            System.out.println(paisFronteira.getNome());
        }

        System.out.println();

        System.out.println("Países que fazem fronteira com " + pais2.getNome() + ":");
        for (Pais paisFronteira : pais2.getPaisesFronteira()) {
            System.out.println(paisFronteira.getNome());
        }

        System.out.println();

        System.out.println("Vizinhos comuns entre " + pais1.getNome() + " e " + pais2.getNome() + ":");
        for (Pais vizinhoComum : pais1.getVizinhosComuns(pais2)) {
            System.out.println(vizinhoComum.getNome());
        }
    }
}
