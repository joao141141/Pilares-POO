
public class SimulacaoDeUmUser {

    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();

        msn.enviarMensagem();

        msn.receberMensagem();

        FacebookMessenger fcb = new FacebookMessenger();

        fcb.enviarMensagem();

        fcb.receberMensagem();

        Telegram tel = new Telegram();

        tel.enviarMensagem();

        tel.receberMensagem();
    }
}
