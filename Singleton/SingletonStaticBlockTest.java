public class SingletonStaticBlockTest {

    public static void main(String [] args){
        SingletonStaticBlock instance1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock instance2 = SingletonStaticBlock.getInstance();
    
        //instance is the same no matter how many times we access it 
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
