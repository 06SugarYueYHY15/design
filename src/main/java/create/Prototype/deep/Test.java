package create.Prototype.deep;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Prototype prototype1 = new Prototype();
        Feild f1 = new Feild();
        f1.setId(1);
        prototype1.setFeild(f1);

        Prototype prototype2 = prototype1.clone();

        System.out.println(prototype1.getFeild() == prototype2.getFeild());


    }



}
