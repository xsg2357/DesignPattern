package singleton_pattern;

public class SingleObject {

    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMsg(){
        System.out.println("我是单例模式---实例加载");
    }

}
