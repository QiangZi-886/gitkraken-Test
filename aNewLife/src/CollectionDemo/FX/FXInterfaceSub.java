package CollectionDemo.FX;

//public class FXInterfaceSub<String> implements FXInterface<String>
public class FXInterfaceSub<Integer> implements FXInterface<Integer>{
    @Override
    public Integer test() {
        return null;
    }

    @Override
    public void test2(Integer o) {
        System.out.println(o);
    }
}
