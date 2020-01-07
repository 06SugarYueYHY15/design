package create.Prototype.shallow;

/**
 * 原型类的抽象类  用于定义实现类的规范
 *
 * 浅克隆  对于field中的非基本类型的字段，仅仅复制其内存地址
 */

public abstract class Prototype implements Cloneable {

    abstract void doSomething();

    public Prototype clone(){
        try {
            return (Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }





}
