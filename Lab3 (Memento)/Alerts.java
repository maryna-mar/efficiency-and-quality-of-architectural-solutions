package lab3_memento;

public class Alerts {
    String name;
    public Alerts(String name) {
        super();
        this.name = name;
    }
    public String getAlert() {
        return name;
    }
    public void setAlert(String name) {
        this.name = name;
    }
    public void printAlert(){
        String list_print = "Alerts: " + this.name + ".";
        System.out.println(list_print);
    }
    public Memento createMemento() {
        return new Memento(this);
    }
    public void restoreMemento(Memento memento) {
        this.name = memento.getAlert();
    }
}
