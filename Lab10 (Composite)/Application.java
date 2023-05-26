package lab10_composite;

public class Application {
    public static void main(String args[]) {
        Form loginForm = new LoginForm();
        Form orderForm = new OrderForm();
        MainForm mainForm = new MainForm(0, "");
        
        System.out.println("Creating a new HTML forms in Main Form:");
        mainForm.addForm(loginForm);
        mainForm.addForm(orderForm);
        mainForm.printFormName();
        System.out.println("Process completed.");
    }
}
