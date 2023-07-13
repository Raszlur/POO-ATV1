public class Data {
    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String exibeData() {
        return dia + "/" + mes + "/" + ano;
    }
}

//Agora em outro arquivo faça

public class DataTeste {
    public static void main(String[] args) {
        Data data = new Data(6, 22, 2023);

        System.out.println("Data: " + data.exibeData());

        data.setAno(2024);
        data.setMes(12);
        data.setDia(31);

        System.out.println("Nova Data: " + data.exibeData());
    }
}
