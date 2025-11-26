package be.ucll.craftsmanship.cleanCode.notification;

public class EmailService {
    public void send(EmailMessage message) {
        System.out.println("===================");
        System.out.println("To: " + message.getRecipient());
        System.out.println("Subject: " + message.getSubject());
        System.out.println("Body: " + message.getBody());
        System.out.println("===================");
    }
}
