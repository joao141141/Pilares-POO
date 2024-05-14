
import java.util.Locale;
import java.util.Scanner;

public class Moto extends Veiculo {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    double combustivel;
    boolean ligado = false;

    @Override
    public void ligar() {
        conferirCambio();
        conferirCombustivel();

        System.out.println("Carro desligado!");
        if (ligado == false) {
            System.out.println("Ligando carro");
            System.out.println("Carro ligado!");
        } else {
            System.out.println("O carro ja está ligado");
        }
    }

    private void conferirCombustivel() {
        System.out.println("Digite a quantidade de combustivel: ");
        combustivel = scanner.nextDouble();
        System.out.println("Conferindo combustivel");

        if (combustivel > 25) {
            System.out.println("Combustivel OK");
        } else {
            System.out.println("Combustivel baixo");
        }
    }

    private void conferirCambio() {
        System.out.println("Conferindo cambio");
        System.out.println("Cambio OK");
    }

}
