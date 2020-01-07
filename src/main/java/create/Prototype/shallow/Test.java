package create.Prototype.shallow;

public class Test {

    public static void main(String[] args) {
        Prototype p1 = new CreateProtype();
        Prototype p2 = p1.clone();
        assert p1 != p2;
    }

}
