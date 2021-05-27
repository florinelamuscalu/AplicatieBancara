package singleton;

public class SingletonPattern {
    private static SingletonPattern insSingletonPattern;
     private SingletonPattern (){}

    public static SingletonPattern getInstance(){
        if (insSingletonPattern == null){
            insSingletonPattern = new SingletonPattern();
        }
        return insSingletonPattern;
    }
}




