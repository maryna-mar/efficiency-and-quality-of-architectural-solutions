package lab5_template;

class Order extends TemplateProcess {

    void getData() {
        Notifications.receiveData();
    }

    void validateData() {
        Notifications.verifyData();
    }

    void saveData() {
        Notifications.sendRequest();
    }
    
    void sendReport() {
        Notifications.setStatus();
        Notifications.informOrder();
    }
}
