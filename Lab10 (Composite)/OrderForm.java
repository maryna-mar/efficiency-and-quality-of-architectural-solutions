package lab10_composite;

public class OrderForm implements Form {
    private Integer id;
    private String name;

    public void printFormName() {
        System.out.println(getClass().getSimpleName());
    }
}