package POO;

public class Automovel {

    private String marca;
    private String modelo;

    public Automovel(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void ligarAuto() {
        System.out.println(marca + " modelo " + modelo + " foi ligado corretamente.");
    }

    public static void main(String[] args) {

    //Eu estou utilizando herança com os extends nas classes, a abstração nas características principais dos objetos
    //O encapsulamento foi utilizado tornando os atributos "marca" e "modelo" privados, utilizando os métodos get e set
    // para acessar-los. O Polimorfismo nas classes com multiplas funções.


        Carro carro1 = new Carro("Toyota", "Etios 2018");
        Moto moto1 = new Moto("Honda", "CG 160 FAN");
        MotoPartidaPedal motopedal = new MotoPartidaPedal("Genérico", "Genérico");
        Guincho guincho1 = new Guincho("Ford", "F-550 Super Duty");
        CarroAutomatico carroAuto1 = new CarroAutomatico("Fiat", "Pulse Drive 1.3");

        System.out.println("");
        System.out.println("Ligando a moto: ");
        motopedal.ligarAcelerador();
        System.out.println("Agora, desligando a moto: ");
        motopedal.desligarAcelerador();
        System.out.println("");

        carro1.ligarAuto();
        carroAuto1.ligarCarroAutomatico();
        guincho1.ligarAuto();
        System.out.println("");

        guincho1.Carregar(carro1, null);



    }

    static class Carro extends Automovel {
        public Carro(String marca, String modelo) {
            super(marca, modelo);
        }
    }

    static class Moto extends Automovel {
        public Moto(String marca, String modelo) {
            super(marca, modelo);
        }
    }

    static class Guincho extends Automovel {
        public Guincho(String marca, String modelo) {
            super(marca, modelo);
        }

        public void Carregar(Automovel Carro, Automovel Moto) {
            System.out.println(Carro.getMarca() + " modelo " + Carro.getModelo() + " está com defeito e será levado para a manutenção.");
        }
    }




    static class CarroAutomatico extends Carro {
        boolean freioPressionado = true;
        public CarroAutomatico(String marca, String modelo) {
            super(marca, modelo);
        }

        public void ligarCarroAutomatico() {
            if (freioPressionado == true) {
                System.out.println("O freio está sendo pressionado, logo " + getMarca() + " modelo " + getModelo() + " foi ligado corretamente.");
            }
        }

    }

    static class MotoPartidaPedal extends Moto {
        boolean acelerador = false;
        public MotoPartidaPedal(String marca, String modelo) {
            super(marca, modelo);
        }

        public void ligarAcelerador() {
            acelerador = true;
            ligar();
        }

        public void desligarAcelerador() {
            acelerador = false;
            System.out.println("A sua moto foi desligada com êxito.");
        }

        public void ligar() {
            if (acelerador == true) {
                System.out.println("Moto ligada! O Acelerador foi puxado corretamente.");
            }
        }
    }



}
