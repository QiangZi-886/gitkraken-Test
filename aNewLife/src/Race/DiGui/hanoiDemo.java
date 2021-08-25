package Race.DiGui;

public class hanoiDemo {
    public static void main(String[] args) {
        hanoiDemo h = new hanoiDemo();
        h.hanoi(2,"1","2","3");
    }
    public void hanoi(int n,String one,String two,String three){
        if (n==1){
            System.out.println(one+"-->"+three);
        }
        else {
            hanoi(n-1,one,three,two);
            System.out.println(one+"-->"+three);
            hanoi(n-1,two,one,three);
        }
    }
}
