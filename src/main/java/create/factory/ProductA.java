package create.factory;

/**
 * 具体产品类
 * 定义生产的具体产品
 *
 */
public class ProductA extends Product{


    @Override
    public void Show() {
        System.out.println("ProductA has been create");
    }

}
