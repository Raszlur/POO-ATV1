//Crie um arquivo chamado TesteCadernoDeEnderecos.java e insira o seguinte código(Certifique-se de que o arquivo TesteCadernoDeEnderecos.java esteja no mesmo diretório que o arquivo CadernoDeEnderecos.java)

import java.util.Scanner;

class CadernoDeEnderecos {
    private String nome;
    private String telefone;
    private String email;
    private String dataAniversario;
    private String endereco;

    public CadernoDeEnderecos(String nome, String telefone, String email, String dataAniversario, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataAniversario = dataAniversario;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

public class TesteCadernoDeEnderecos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();

        System.out.println("Digite o email:");
        String email = scanner.nextLine();

        System.out.println("Digite a data de aniversário:");
        String dataAniversario = scanner.nextLine();

        System.out.println("Digite o endereço:");
        String endereco = scanner.nextLine();

        CadernoDeEnderecos caderno = new CadernoDeEnderecos(nome, telefone, email, dataAniversario, endereco);

        System.out.println("\nInformações do caderno de endereços:");
        System.out.println("Nome: " + caderno.getNome());
        System.out.println("Telefone: " + caderno.getTelefone());
        System.out.println("Email: " + caderno.getEmail());
        System.out.println("Data de Aniversário: " + caderno.getDataAniversario());
        System.out.println("Endereço: " + caderno.getEndereco());

        scanner.close();
    }
}
