package create.bulider;

public class Test {

    public static void main(String[] args) {

        ConcreteBuilder concreteBuilder = new ConcreteBuilder();

        Director director = new Director(concreteBuilder);

        Product product = director.construct();

        product.show();




    }

}
