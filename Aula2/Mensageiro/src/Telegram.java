
public class Telegram extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();

        System.out.println("Enviando Mensagem");

        salvarHIstoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHIstoricoMensagem() {
        System.out.println("Salvando Historico de mensagens");
    }

}
