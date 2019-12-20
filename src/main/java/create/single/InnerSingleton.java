package create.single;

/**
 * 静态内部类
 * 优点：延迟性  外部类初始化时不会被创建，用的时候才会被创建
 *      安全    静态成员变量
 *
 */
public class InnerSingleton {

    public static class Singleton{
        private static final InnerSingleton instance = new InnerSingleton();
    }

    private InnerSingleton(){}

    public static InnerSingleton getInstance(){
        return Singleton.instance;
    }

}
