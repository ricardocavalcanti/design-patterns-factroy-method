package br.com.pattern.factory;

public class EmailNotificacao implements Notificacao {
    @Override
    public void notificarUsuario() {
        System.out.println("Enviando notificação por E-MAIL");
    }
}
