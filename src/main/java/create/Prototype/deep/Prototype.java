package create.Prototype.deep;

/**
 * 深度拷贝  原型模式
 *
 * 深度拷贝
 * 1、 重写clone方法
 * 2、 使用序列化
 *
 */
public class Prototype implements Cloneable{

    private Feild feild;

    private int id;

    public Feild getFeild() {
        return feild;
    }

    public void setFeild(Feild feild) {
        this.feild = feild;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {

        Prototype res = (Prototype)super.clone();

        if(res.getFeild() != null){
            res.setFeild((Feild) feild.clone());
        }

        return res;
    }
}
