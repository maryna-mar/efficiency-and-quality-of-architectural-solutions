package lab2_mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorStruct implements Mediator {
    private List<Notification> notifications;
    public MediatorStruct() {
        notifications = new ArrayList<>();
    }
    public void sendMessage(String message, Notification notification) {
        for (Notification n : this.notifications) {
            if (n != notification) {
                n.receive(message);
            }
        }
    }
    public void addNotification(Notification notification) {
        this.notifications.add(notification);
    }
}