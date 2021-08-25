package Test;
/*
* 冒泡排序
* */
public class maopaoSort {
    public static void main(String[] args) {
        int[] arr =new int[]{1,14,25,30,8,12,4,9};
        int temp = 0;
        for (int i =1;i<=arr.length;i++){
            for (int j =1;j<=arr.length-i;j++){
                if (arr[j-1]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
