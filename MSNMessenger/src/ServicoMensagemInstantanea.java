public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet(){
        System.out.println("Checando");
    }

    /*public void enviarMensagem(){
        validarConectandoInternet();
        System.out.println("Enviando mensagem pelo Face");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo");
    }
    private void validarConectandoInternet(){
        System.out.println("Validando conexão");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando Historico");
    }
     */
}
