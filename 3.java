import java.util.Scanner;

class Pessoa {
    private String cpf;
    private String nome;
    private int idade;

    public Pessoa(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

class Aluno extends Pessoa {
    private String curso;
    private Disciplina[] disciplinas;

    public Aluno(String cpf, String nome, int idade, String curso, Disciplina[] disciplinas) {
        super(cpf, nome, idade);
        this.curso = curso;
        this.disciplinas = disciplinas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }
}

class Disciplina {
    private String nome;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o curso: ");
        String curso = scanner.nextLine();

        System.out.print("Digite a quantidade de disciplinas: ");
        int quantidadeDisciplinas = scanner.nextInt();
        scanner.nextLine();

        Disciplina[] disciplinas = new Disciplina[quantidadeDisciplinas];
        for (int i = 0; i < quantidadeDisciplinas; i++) {
            System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
            String nomeDisciplina = scanner.nextLine();
            disciplinas[i] = new Disciplina(nomeDisciplina);
        }

        Aluno aluno = new Aluno(cpf, nome, idade, curso, disciplinas);

        System.out.println("\nDados do Aluno:");
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Disciplinas:");
        for (Disciplina disciplina : aluno.getDisciplinas()) {
            System.out.println("- " + disciplina.getNome());
        }

        scanner.close();
    }
}
