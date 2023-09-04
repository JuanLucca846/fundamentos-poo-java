public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("enviando pelo Telegram");
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo pelo Telegram");
    }
}
