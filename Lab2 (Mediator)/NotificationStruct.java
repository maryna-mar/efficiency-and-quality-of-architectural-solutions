package lab2_mediator;

public class NotificationStruct extends Notification {
    public NotificationStruct(Mediator mediator, String notification) {
        super(mediator, notification);
    }
    public boolean send(String message) {
        System.out.println(this.notification + " sending: " + message);
        this.mediator.sendMessage(message, this);
		return false;
    }
    public void receive(String message) {
        System.out.println(this.notification + " receiving: " + message);
    }
}
