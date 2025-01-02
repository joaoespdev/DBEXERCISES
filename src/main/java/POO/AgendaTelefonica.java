package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaTelefonica {

    private ArrayList<String> contatos;

    public AgendaTelefonica() {
        this.contatos = new ArrayList<>();
    }

    //    Referenciando tipo
    public ArrayList<String> getContatos() {
        return contatos;
    }

    // Criando variável no métdo para receber o valor do atributo contatos (this.contatos)
    public void setContatos(ArrayList<String> contatos) {
        this.contatos = contatos;
    }

    public void AdicionarContatos(String numero) {
        contatos.add(numero);
    }

    public void ListarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A lista de contatos está vazia!");
        } else {
            for (int i = 0; i < contatos.size(); i++) {
                System.out.println(1 + i + ". " + contatos.get(i));
            }
        }
    }

    public void ExcluirContatos(int numero) {
        if (numero >= 0 && numero < contatos.size()) {
            contatos.remove(numero - 1);
        } else {
            System.out.println("Número da lista inválido.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AgendaTelefonica agendaTelefonica = new AgendaTelefonica();

        while (true) {

            System.out.println("-- Bem-vindo a sua Agenda Telefônica --");
            System.out.println("Para acessar as funções, basta escolher um número:");
            System.out.println("1. Listar Contato");
            System.out.println("2. Adicionar Contato");
            System.out.println("3. Excluir Contato");
            System.out.println("4. Encerrar Programa");
            int escolhaUsuario = scanner.nextInt();
            scanner.nextLine(); //Limpando buffer do Scanner

            if (escolhaUsuario == 1) {
                agendaTelefonica.ListarContatos();
            } else if (escolhaUsuario == 2) {
                System.out.println("Digite um número para adicionar:");
                String numero = scanner.nextLine();
                agendaTelefonica.AdicionarContatos(numero);
                System.out.println("Número adicionado com sucesso!");
            } else if (escolhaUsuario == 3) {
                System.out.println("Escolha o contato que deseja excluir (ex: 1, 2, 3...");
                int numero = scanner.nextInt();
                agendaTelefonica.ExcluirContatos(numero);
                System.out.println("Contato removido com sucesso!");
            } else if (escolhaUsuario == 4) {
                System.out.println("Saindo da Agenda Telefônica...");
                break;
            }

        }

    }
}
