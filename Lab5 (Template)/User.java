package lab5_template;

class User extends TemplateProcess {

    void getData() {
        Notifications.receiveData();
    }

    void validateData() {
        Notifications.verifyData();
    }

    void saveData() {
    	int email_status = 1;
    	if (email_status != 0) {
    		Notifications.informUser();
    	}
    	else {
    		Notifications.sendRequest();
    	}
    }
    
    void sendReport() {
        Notifications.setStatus();
    }
}