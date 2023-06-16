public class SingletonTheadSafe {
    // instantiate variable 
    private static SingletonTheadSafe threadSafeInstance; 

    //create constructor 
    private SingletonTheadSafe() {};

    public static SingletonTheadSafe getInstance(String [] args ){
        synchronized(SingletonTheadSafe.class){
            if(threadSafeInstance == null){
                threadSafeInstance = new SingletonTheadSafe();
            }
        }
        return threadSafeInstance;
    }

}
