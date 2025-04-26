import br.com.pattern.factory.EmailNotificacaoFactory;
import br.com.pattern.factory.SmsNotificacaoFactory;
import br.com.pattern.service.NotificacaoService;

public class Main {
    public static void main(String[] args) {
        NotificacaoService emailService = new NotificacaoService(new EmailNotificacaoFactory());
        emailService.processarNotificacao();

        NotificacaoService smsService = new NotificacaoService(new SmsNotificacaoFactory());
        smsService.processarNotificacao();
    }
}
