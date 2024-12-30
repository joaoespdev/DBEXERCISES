package POO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EmprestimoLivros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando alguns livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro3 = new Livro("Dom Quixote", "Miguel de Cervantes Saavedra");
        Livro livro4 = new Livro("Breves Respostas Para Grandes Questões", "Stephen Hawking");


        // Lista de empréstimos
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();

        // Interação com o usuário para empréstimo
        System.out.println("--- Cadastro do Empréstimo ---");

        // Entrando com dados da pessoa
        System.out.print("Digite o nome da pessoa: ");
        String nomePessoa = scanner.nextLine();

        System.out.print("Digite o CPF da pessoa: ");
        String cpfPessoa = scanner.nextLine();

        System.out.print("Digite o endereço da pessoa: ");
        String enderecoPessoa = scanner.nextLine();

        // Escolhendo o livro
        System.out.println("Escolha um livro para emprestar: ");
        System.out.println("1 - O Senhor dos Anéis");
        System.out.println("2 - Dom Casmurro");
        System.out.println("3 - Dom Quixote");
        System.out.println("4 - Breves respostas para grandes questões");
        int escolhaLivro = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        //If para escolha do livro
        Livro livroEscolhido;
        if (escolhaLivro == 1) {
            livroEscolhido = livro1;
        } else if (escolhaLivro == 2) {
            livroEscolhido = livro2;
        } else if (escolhaLivro == 3) {
            livroEscolhido = livro3;
        } else if (escolhaLivro == 4) {
            livroEscolhido = livro4;
        } else {
            System.out.println("Opção inválida, tente novamente.");
            return;
        }


        // Criando a pessoa
        Pessoa pessoaEscolhida = new Pessoa(nomePessoa, cpfPessoa, enderecoPessoa);
        // Esses parâmetros irão guardar o valor das 3 primeiras variáveis em pessoa

        // Criando o empréstimo
        Emprestimo novoEmprestimo = new Emprestimo(pessoaEscolhida, livroEscolhido);
        emprestimos.add(novoEmprestimo);

        // Exibindo todos os empréstimos
        exibirEmprestimos(emprestimos);

        scanner.close();
    }

    // Métdo para exibir todos os empréstimos
    public static void exibirEmprestimos(ArrayList<Emprestimo> emprestimos) {
        System.out.println("\n--- Emprestimos Atuais ---");
        for (Emprestimo emprestimo : emprestimos) {
            emprestimo.exibirEmprestimo();
        }
    }

    // Classe Livro
    static class Livro {
        String titulo;
        String autor;

        Livro(String tituloVa, String autorVa) {
            this.titulo = tituloVa;
            this.autor = autorVa;
        }
    }

    // Classe Pessoa
    static class Pessoa {
        String nome;
        String cpf;
        String endereco;

        Pessoa(String nomeVa, String cpfVa, String enderecoVa) {
            this.nome = nomeVa;
            this.cpf = cpfVa;
            this.endereco = enderecoVa;
        }
    }

    // Classe Emprestimo
    static class Emprestimo {
        Pessoa pessoa;
        Livro livro;
        Date dataEmprestimo;
        Date dataDevolucao;
        boolean emprestado;

        Emprestimo(Pessoa pessoaVa, Livro livroVa) {
            this.pessoa = pessoaVa;
            this.livro = livroVa;
            this.dataEmprestimo = new Date();
            this.emprestado = true; // Livro é emprestado quando o empréstimo é criado
        }

        void devolverLivro() {
            this.dataDevolucao = new Date();
            this.emprestado = false; // Marca o livro como devolvido
        }

        void exibirEmprestimo() {
            if (emprestado) {
                System.out.println(pessoa.nome + " (CPF: " + pessoa.cpf + ") está com o livro \"" + livro.titulo + "\" de " + livro.autor + " desde " + dataEmprestimo);
            } else {
                System.out.println(pessoa.nome + " devolveu o livro \"" + livro.titulo + "\" de " + livro.autor + " em " + dataDevolucao);
            }
        }
    }
}
