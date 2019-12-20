package create.single;

/**
 * 双锁
 *
 */
public class DoubleLockSingleton {

    private static volatile DoubleLockSingleton instance;

    private DoubleLockSingleton(){}

    public DoubleLockSingleton getInstance(){

        if(instance == null){

            synchronized (DoubleLockSingleton.class){

                if(instance == null){

                    instance = new DoubleLockSingleton();
                }

            }

        }

        return instance;

    }




}
