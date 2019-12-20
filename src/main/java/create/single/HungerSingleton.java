package create.single;

/**
 * 饿汉式
 * 类初始化时即创建实例化
 *
 *
 */
public class HungerSingleton {

    //final保证不会被更改
    private static final HungerSingleton instance = new HungerSingleton();

    private HungerSingleton(){}

    public static HungerSingleton getInstance(){
        return instance;
    }


}
