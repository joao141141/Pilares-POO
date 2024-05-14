package Padrao.Apps;

public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    public abstract void salvarHistoricomensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
}
