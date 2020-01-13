package struct.proxy;

/**
 * 真实主题
 * 实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象
 */
class RealSubject implements Subject {
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}
