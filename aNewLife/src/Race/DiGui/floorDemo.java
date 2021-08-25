package Race.DiGui;

public class floorDemo {
    static long arr[] = new long[101];
    public static void main(String[] args) {
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 1;i<=51;i++){
            System.out.println(sum(i));
        }
    }
    public static long sum(int n){
        if (arr[n]==0){
            arr[n] = arr[n-1]+arr[n-2];
        }
        return arr[n];
    }
}
