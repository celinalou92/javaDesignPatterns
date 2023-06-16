public class SingletonEagerTest{
    public static void main(String [] args){
        SingletonEager eagerInstance1 = SingletonEager.getEagerInstance();
        SingletonEager eagerInstance2 = SingletonEager.getEagerInstance();

        //instance is the same no matter how many times we access it 
        System.out.println(eagerInstance1);
        System.out.println(eagerInstance2);
    }
}