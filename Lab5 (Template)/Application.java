package lab5_template;

class Application {
    public static void main(String[] args) {
        System.out.println("Product:");
        TemplateProcess product = new Product();
        product.updateObject();

        System.out.println("\nUser:");
        TemplateProcess user = new User();
        user.updateObject();
        
        System.out.println("\nOrder:");
        TemplateProcess order = new Order();
        order.updateObject();
    }
}