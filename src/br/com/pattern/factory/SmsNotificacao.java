package br.com.pattern.factory;

public class SmsNotificacao implements Notificacao {
    @Override
    public void notificarUsuario() {
        System.out.println("Enviando notificação por SMS");
    }
}
