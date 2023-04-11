package lab3_memento;

import java.util.ArrayList;
import java.util.List;
 
public class Caretaker {
    private List<Memento> AlertList = new ArrayList<Memento>();
    public void add(Memento alert){
        AlertList.add(alert);
    }
    public Memento set(int index){
       return AlertList.get(index);
    }
}
