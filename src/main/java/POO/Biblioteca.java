package POO;

import java.util.Date;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa a emprestar o livro:");
        String nomePessoa = scanner.nextLine();
        System.out.println("Digite o CPF dessa pessoa:");
        String cpfPessoa = scanner.nextLine();
        System.out.println("Agora digite o endereço:");
        String enderecoPessoa = scanner.nextLine();

        Pessoa pessoaLida = new Pessoa(nomePessoa, cpfPessoa, enderecoPessoa);

        Livro livro1 = new Livro("O senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro3 = new Livro("Dom Quixote", "Miguel de Cervantes Saavedra");
        Livro livro4 = new Livro("Breves Respostas Para Grandes Questões", "Stephen Hawking");

        System.out.println("Selecione um dos livros disponíveis a emprestar:");
        System.out.println("1 - O Senhor dos Anéis");
        System.out.println("2 - Dom Casmurro");
        System.out.println("3 - Dom Quixote");
        System.out.println("4 - Breves respostas para grandes questões");
        int escolhaLivro = scanner.nextInt();

        Livro livroEmprestado = null;

        if (escolhaLivro == 1) {
            livroEmprestado = livro1;
        } else if (escolhaLivro == 2) {
            livroEmprestado = livro2;
        } else if (escolhaLivro == 3) {
            livroEmprestado = livro3;
        } else if (escolhaLivro == 4) {
            livroEmprestado = livro4;
        } else {
            return;
        }

        Emprestimo novoEmprestimo = new Emprestimo(pessoaLida, livroEmprestado);

        if (escolhaLivro == 1) {
            System.out.println("O livro foi emprestado para " + nomePessoa + " de CPF " + cpfPessoa + " cujo endereço é " + enderecoPessoa + " na data " + novoEmprestimo.dataEmprestimo);
            System.out.println("Livro a ser devolvido: " + livro1.titulo + "; escrito por: " + livro1.autor);
        } else if (escolhaLivro == 2) {
            System.out.println("O livro foi emprestado para " + nomePessoa + " de CPF " + cpfPessoa + " cujo endereço é " + enderecoPessoa + " na data " + novoEmprestimo.dataEmprestimo);
            System.out.println("Livro a ser devolvido: " + livro2.titulo + "; escrito por: " + livro2.autor);
        } else if (escolhaLivro == 3) {
            System.out.println("O livro foi emprestado para " + nomePessoa + " de CPF " + cpfPessoa + " cujo endereço é " + enderecoPessoa + " na data " + novoEmprestimo.dataEmprestimo);
            System.out.println("Livro a ser devolvido: " + livro3.titulo + "; escrito por: " + livro3.autor);
        } else if (escolhaLivro == 4) {
            System.out.println("O livro foi emprestado para " + nomePessoa + " de CPF " + cpfPessoa + " cujo endereço é " + enderecoPessoa + " na data " + novoEmprestimo.dataEmprestimo);
            System.out.println("Livro a ser devolvido: " + livro4.titulo + "; escrito por: " + livro4.autor);
        }
    }




    static class Pessoa {
        String nome;
        String cpf;
        String endereco;


        Pessoa(String nomeVa, String cpfVa, String enderecoVa) {
        this.nome = nomeVa;
        this.cpf = cpfVa;
        this.endereco = enderecoVa;
    }}

    static class Livro {
        String titulo;
        String autor;

        Livro(String tituloVa, String autorVa) {
            this.titulo = tituloVa;
            this.autor = autorVa;
        }
    }

    static class Emprestimo {
        Pessoa pessoa;
        Livro livro;
        Date dataEmprestimo;
        boolean emprestado;

//Esse constructor vai puxar a pessoa, o livro, a data atual e registrar a data em
//que o livro foi emprestado.
        Emprestimo(Pessoa pessoaVa, Livro livroVa) {
            this.pessoa = pessoaVa;
            this.livro = livroVa;
            this.dataEmprestimo = new Date();
            this.emprestado = true;
        }
    }







}