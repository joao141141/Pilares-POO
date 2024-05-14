package Padrao.Apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

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

    private void salvarHIstoricoMensagem() {
        System.out.println("Salvando Historico de mensagens");
    }

}
