package lab5_template;

class Product extends TemplateProcess {

    void getData() {
        Notifications.receiveData();
    }

    void validateData() {
    	int validation_status = 0;
    	if (validation_status == 0) {
    		Notifications.informAdmin();
    	}
    	else {
    		Notifications.verifyData();
    	}
    }

    void saveData() {
        Notifications.sendRequest();
    }
    
    void sendReport() {
        Notifications.setStatus();
    }
}
