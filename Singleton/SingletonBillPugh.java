public class SingletonBillPugh {
    private SingletonBillPugh(){}
    private static class InnerStaticClass {
        private static final SingletonBillPugh billPughInstnace = new SingletonBillPugh();
    }
    public static SingletonBillPugh getInstance(){
        return InnerStaticClass.billPughInstnace;
    }
}
