package create.single;

/**
 * 懒汉式
 *
 */
public class LazySingleton {

    //保证多线程的可见性
    private static volatile LazySingleton singleton;

    //私有化构造函数
    private LazySingleton(){};

    /**
     * 避免多实例
     * 缺点：等待时间长，使用双锁可以解决
     * @return
     */
    public static synchronized LazySingleton getInstance(){

        if(singleton == null){
            singleton = new LazySingleton();
        }

        return singleton;

    }

}
