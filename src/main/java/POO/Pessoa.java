package POO;

public class Pessoa {

    String nome;
    int idade;
    Pessoa pai;
    Pessoa mae;

    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }




    public static void main(String[] args) {

        System.out.println("\n-- Árvore Genealógica --\n");

        AvoPaterno avoPaterno = new AvoPaterno("José Arlindo Filho", 75, null, null);
        AvoPaterna avoPaterna = new AvoPaterna("Camila Colchões dos Santos", 60, null, null);

        AvoMaterno avoMaterno = new AvoMaterno("Robson Caminhões", 68, null, null);
        AvoMaterna avoMaterna = new AvoMaterna("Neide da Silva Pinheiro", 66, null, null);

        Pai pai = new Pai("Rafael dos Santos", 33, avoPaterno, avoPaterna);
        Mae mae = new Mae("Júlia Caminhões da Silva", 25, avoMaterno, avoMaterna);

        Filho filho = new Filho("Nicolas dos Santos", 4, pai, mae);
        Filha filha = new Filha("Amanda Caminhões da Silva", 2, pai, mae);


    }


    static class AvoPaterno extends Pessoa {
        public AvoPaterno(String nome, int idade, Pessoa pai, Pessoa mae) {
            super(nome, idade, pai, mae);

            System.out.println("Nome do Avô Paterno: " + nome);
            System.out.println("Idade Registrada: " + idade);
        }
    }

    static class AvoMaterno extends Pessoa {
        public AvoMaterno(String nome, int idade, Pessoa pai, Pessoa mae) {
            super(nome, idade, pai, mae);

            System.out.println("Nome do Avô Materno: " + nome);
            System.out.println("Idade Registrada: " + idade);
        }
    }

    static class AvoPaterna extends Pessoa {
        public AvoPaterna(String nome, int idade, Pessoa pai, Pessoa mae) {
            super(nome, idade, pai, mae);

            System.out.println("Nome da Avó Paterna: " + nome);
            System.out.println("Idade Registrada: " + idade + "\n");
        }
    }

    static class AvoMaterna extends Pessoa {
        public AvoMaterna(String nome, int idade, Pessoa pai, Pessoa mae) {
            super(nome, idade, pai, mae);

            System.out.println("Nome da Avó Materna: " + nome);
            System.out.println("Idade Registrada: " + idade + "\n");
        }
    }

    static class Pai extends Pessoa {
        public Pai(String nome, int idade, Pessoa pai, Pessoa mae) {
            super(nome, idade, pai, mae);

            System.out.println("Nome do Pai: " + nome);
            System.out.println("Idade Registrada: " + idade);
            System.out.println("Filho de: " + pai.nome + " & " + mae.nome + "\n");
        }
    }

    static class Mae extends Pessoa {
        public Mae(String nome, int idade, Pessoa pai, Pessoa mae) {
            super(nome, idade, pai, mae);

            System.out.println("Nome da Mãe: " + nome);
            System.out.println("Idade Registrada: " + idade);
            System.out.println("Filha de: " + pai.nome + " & " + mae.nome + "\n");
        }
    }

    static class Filho extends Pessoa {
        public Filho(String nome, int idade, Pessoa pai, Pessoa mae) {
            super(nome, idade, pai, mae);

            System.out.println("Nome do Filho: " + nome);
            System.out.println("Idade Registrada: " + idade);
            System.out.println("Filho de: " + pai.nome + " & " + mae.nome + "\n");
        }
    }

    static class Filha extends Pessoa {
        public Filha(String nome, int idade, Pessoa pai, Pessoa mae) {
            super(nome, idade, pai, mae);

            System.out.println("Nome da Filha: " + nome);
            System.out.println("Idade Registrada: " + idade);
            System.out.println("Filha de: " + pai.nome + " & " + mae.nome + "\n");
        }
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }


}
