package Test;
/*
* 直接选择排序
* */
public class zhijieSort {
    public static void main(String[] args) {
        int[] arr =new int[]{1,5,13,8,28,30,4};
        for (int i = 0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
