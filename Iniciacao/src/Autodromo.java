
public class Autodromo {

    public static void main(String[] args) {
        Carro testarossa = new Carro();

        testarossa.ligar();

        testarossa.setChassi("123456");

        Moto RD350 = new Moto();

        RD350.ligar();
        RD350.setChassi("654321");

        RD350.ligar();

        Veiculo coringa = testarossa;
        coringa.ligar();

    }

}
