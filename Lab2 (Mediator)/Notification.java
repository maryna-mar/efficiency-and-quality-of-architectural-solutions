package lab2_mediator;

public abstract class Notification {
    protected Mediator mediator;
    protected String notification;
    public Notification(Mediator mediator, String notification) {
        this.mediator = mediator;
        this.notification = notification;
    }
    public abstract boolean send(String message);
    public abstract void receive(String message);
}