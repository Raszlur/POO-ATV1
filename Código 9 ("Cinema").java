//Certifique-se de salvar o arquivo com o nome EntradaDeCinema.java

import java.time.LocalDate;

public class EntradaDeCinema {
    private LocalDate dataFilme;
    private String horario;
    private String sala;
    private double valor;

    public EntradaDeCinema(LocalDate dataFilme, String horario, String sala, double valor) {
        this.dataFilme = dataFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }

    public void calculaDesconto(LocalDate dataNascimento) {
        LocalDate hoje = LocalDate.now();
        int idade = hoje.getYear() - dataNascimento.getYear();

        if (idade < 12) {
            valor *= 0.5;
        }
    }

    public void calculaDesconto(LocalDate dataNascimento, int numeroCarteiraEstudante) {
        LocalDate hoje = LocalDate.now();
        int idade = hoje.getYear() - dataNascimento.getYear();

        if (idade >= 12 && idade <= 15) {
            valor *= 0.6;
        } else if (idade >= 16 && idade <= 20) {
            valor *= 0.7;
        } else if (idade > 20) {
            valor *= 0.8;
        }
    }

    public void calculaDescontoHorario() {
        String[] partesHorario = horario.split(":");
        int horas = Integer.parseInt(partesHorario[0]);
        if (horas < 16) {
            valor *= 0.9;
        }
    }

    @Override
    public String toString() {
        return "Entrada de Cinema:" +
                "\nData do Filme: " + dataFilme +
                "\nHorário: " + horario +
                "\nSala: " + sala +
                "\nValor: " + valor;
    }
}
