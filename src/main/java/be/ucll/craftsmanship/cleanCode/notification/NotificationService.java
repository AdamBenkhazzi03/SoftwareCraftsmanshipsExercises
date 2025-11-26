package be.ucll.craftsmanship.cleanCode.notification;

import be.ucll.craftsmanship.cleanCode.model.Order;

public class NotificationService {
    private final EmailService emailService;

    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendOrderConfirmation(Order order) {
        String body = String.format(
                "Thank you for your order!%nOrder ID: %s%nTotal: $%.2f",
                order.getId(), order.getTotal()
        );

        EmailMessage message = new EmailMessage(
                order.getCustomer().getEmail(),
                "Order Confirmation",
                body
        );

        emailService.send(message);
    }

    public void sendShippingNotification(Order order, String trackingNumber) {
        String body = String.format(
                "Your order has shipped!%nOrder ID: %s%nTracking: %s",
                order.getId(), trackingNumber
        );

        EmailMessage message = new EmailMessage(
                order.getCustomer().getEmail(),
                "Shipping Notification",
                body
        );

        emailService.send(message);
    }
}
