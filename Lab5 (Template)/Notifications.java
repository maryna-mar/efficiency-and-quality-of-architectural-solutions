package lab5_template;

class Notifications {

	static void receiveData() {
        System.out.println("Data received.");
    }
	
	static void verifyData() {
        System.out.println("Data verified.");
    }
	
	static void sendRequest() {
        System.out.println("Request sent.");
    }
	
	static void setStatus() {
        System.out.println("Data status set.");
    }
	
	static void informAdmin() {
        System.out.println("The product has not been validated.");
    }

    static void informUser() {
        System.out.println("Email cannot be changed.");
    }

    static void informOrder() {
        System.out.println("The order is saved as JSON.");
    }
}
