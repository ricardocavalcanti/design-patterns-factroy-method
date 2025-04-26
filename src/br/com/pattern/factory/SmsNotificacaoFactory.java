package br.com.pattern.factory;

public class SmsNotificacaoFactory extends NotificacaoFactory {

    @Override
    public Notificacao createNotification() {
        return new SmsNotificacao();
    }
}
