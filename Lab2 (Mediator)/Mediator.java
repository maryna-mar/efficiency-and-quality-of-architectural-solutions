package lab2_mediator;

public interface Mediator {
    void sendMessage(String message, Notification notification);
    void addNotification(Notification notification);
}