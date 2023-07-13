import java.util.Scanner;

public class Notas {
    private double trabalho1;
    private double trabalho2;
    private double trabalho3;
    private double trabalho4;
    private double prova1;
    private double prova2;

    public double getTrabalho1() {
        return trabalho1;
    }

    public void setTrabalho1(double trabalho1) {
        this.trabalho1 = trabalho1;
    }

    public double getTrabalho2() {
        return trabalho2;
    }

    public void setTrabalho2(double trabalho2) {
        this.trabalho2 = trabalho2;
    }

    public double getTrabalho3() {
        return trabalho3;
    }

    public void setTrabalho3(double trabalho3) {
        this.trabalho3 = trabalho3;
    }

    public double getTrabalho4() {
        return trabalho4;
    }

    public void setTrabalho4(double trabalho4) {
        this.trabalho4 = trabalho4;
    }

    public double getProva1() {
        return prova1;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public double calcularMediaFinal() {
        double mediaTrabalhos = (trabalho1 + trabalho2 + prova1) / 3.0;
        double mediaProvas = (trabalho3 + trabalho4 + prova2) / 3.0;
        double mediaFinal = (mediaTrabalhos + mediaProvas) / 2.0;
        return mediaFinal;
    }

    public boolean verificarAprovacao() {
        double mediaFinal = calcularMediaFinal();
        return mediaFinal >= 6.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Notas notas = new Notas();

        System.out.println("Informe a nota do Trabalho 1:");
        double notaTrabalho1 = scanner.nextDouble();
        notas.setTrabalho1(notaTrabalho1);

        System.out.println("Informe a nota do Trabalho 2:");
        double notaTrabalho2 = scanner.nextDouble();
        notas.setTrabalho2(notaTrabalho2);

        System.out.println("Informe a nota do Trabalho 3:");
        double notaTrabalho3 = scanner.nextDouble();
        notas.setTrabalho3(notaTrabalho3);

        System.out.println("Informe a nota do Trabalho 4:");
        double notaTrabalho4 = scanner.nextDouble();
        notas.setTrabalho4(notaTrabalho4);

        System.out.println("Informe a nota da Prova 1:");
        double notaProva1 = scanner.nextDouble();
        notas.setProva1(notaProva1);

        System.out.println("Informe a nota da Prova 2:");
        double notaProva2 = scanner.nextDouble();
        notas.setProva2(notaProva2);

        System.out.println("Média Final: " + notas.calcularMediaFinal());

        if (notas.verificarAprovacao()) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");
        }
    }
}
