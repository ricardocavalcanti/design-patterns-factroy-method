package br.com.pattern.factory;

public class EmailNotificacaoFactory extends NotificacaoFactory {

    @Override
    public Notificacao createNotification() {
        return new EmailNotificacao();
    }
}
