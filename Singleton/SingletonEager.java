public class SingletonEager {
    // as soon as class is created we have our instance
    private static SingletonEager eagerInstance = new SingletonEager();
    //constructure 
    private SingletonEager(){

    }

    public static SingletonEager getEagerInstance(){
        //return instance on demand 
        return eagerInstance;
    }
}