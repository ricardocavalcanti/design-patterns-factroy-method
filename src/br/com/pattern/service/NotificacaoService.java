package br.com.pattern.service;

import br.com.pattern.factory.Notificacao;
import br.com.pattern.factory.NotificacaoFactory;

public class NotificacaoService {
    private final NotificacaoFactory factory;


    public NotificacaoService(NotificacaoFactory factory) {
        this.factory = factory;
    }

    public void processarNotificacao(){
        Notificacao notificacao = factory.createNotification();
        notificacao.notificarUsuario();
    }
}
