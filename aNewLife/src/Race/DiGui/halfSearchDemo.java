package Race.DiGui;
/*
* 有序数组的折半查找
*
*
* */

public class halfSearchDemo {
    public static void main(String[] args) {
        halfSearchDemo h = new halfSearchDemo();
        int a[] = {1,2,5,9,10,14,26};
        h.search(a,0,6,14);
    }
    public void search(int a[], int start,int end,int m){
        int temp = (start+end)/2;
        if (start>=end && a[temp]!=m){
            System.out.println("该数组中没有"+m+"这个元素!");
        }
        else if (a[temp] == m){
            System.out.println("该元素在数组中的第"+(temp)+"个位置");
        }
        else {
            if (a[temp]>m){
                search(a,start,temp-1,m);
            }
            else {
                search(a,temp+1,end,m);
            }
        }
    }
}
