public class SingletonLazy {
    private static SingletonLazy lazyInstance; 
    //constructor
    private SingletonLazy(){

    }

    public static SingletonLazy getInstance(){
        //instantiate first time we need it by checking if its null when the method is getting called 
        if(lazyInstance == null){
            lazyInstance = new SingletonLazy();
        }
        return lazyInstance;
        // if method is called a second time the instance already exists so we don't create a new one
    }
}
