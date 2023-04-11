package lab3_memento;

public class Memento {
    String name;
    public Memento(Alerts alerts) {
        this.name = alerts.name;
    }
    public String getAlert() {
        return name;
    }
    public void setAlert(String name) {
        this.name = name;
    }
}