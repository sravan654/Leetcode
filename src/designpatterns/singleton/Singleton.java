package designpatterns.singleton;

/**
 * Created by apuris on 04/04/18.
 */
public class Singleton {

    public static Singleton singleton;

    // nobody can instantiate outside the class
    private Singleton(){

    }

    // to stop multiple threads from accessing the code simultaneoulsy and create more than on instance
    public static synchronized Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}