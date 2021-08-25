package newLife;

public class fist {
    public static void main(String args[]){
        int[] arr ={10,8,7,2,15,28};
        for(int i=1; i<arr.length; i++){
            for(int j = i; j>0; j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"、");
        }

    }
}
