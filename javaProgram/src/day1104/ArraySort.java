package day1104;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr=new int[]{3,5,6,2,1,8,9,7,4};


        //冒泡排序的实现：
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int x=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=x;

                }
            }
        }


        //直接选择排序：     相较冒泡排序而言，直接选择排序的逻辑更简单。
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){   //直接选择排序，使用两层for循环，来同时两位两位进行对比从数组第一位起的元素。
                if (arr[i]>arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }



        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
