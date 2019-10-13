package offer;

/**
 * 1.饿汉式单例类
 */
//public class SingletonClass {
//    private static final SingletonClass instance = new SingletonClass();
//    private SingletonClass(){}
//    public static SingletonClass getInstance(){
//        return instance;
//    }
//}

/**
 * 懒汉式单例类
 */
public class SingletonClass {
    private static SingletonClass instance = null;
    private SingletonClass(){}
    public synchronized static SingletonClass getInstance(){
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}