package create.AbstractFactory;

public class Factory2 implements AbstractFactory{
    @Override
    public Product1 newProduct1() {
        return new Product12();
    }

    @Override
    public Product2 newProduct2() {
        return new Product22();
    }
}
