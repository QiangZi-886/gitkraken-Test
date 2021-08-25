package Test;
/*
* 二维数组
* */
public class TwoSort {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,4,7,9,14},{23,5,68,1,25},{12,99,26,54,75}};
        for (int i=0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
