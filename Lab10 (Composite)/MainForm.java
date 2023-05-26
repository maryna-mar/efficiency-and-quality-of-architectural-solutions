package lab10_composite;

import java.util.ArrayList;
import java.util.List;

public class MainForm implements Form {
    private Integer id;
    private String name;

    private List<Form> childForms;

    public MainForm(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childForms = new ArrayList<>();
    }

    public void printFormName() {
        childForms.forEach(Form::printFormName);
    }

    public void addForm(Form form) {
        childForms.add(form);
    }

    public void removeForm(Form form) {
        childForms.remove(form);
    }
}
