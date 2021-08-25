package day1015;
//输出一个10行的杨辉三角
public class yangHuiTest {
    public static void main(String[] args){
        //声明并初始化yangHui二维数组
        int[][] yangHui=new int [10][];
        //给二维数组赋值
        for(int i=0;i<yangHui.length;i++){
            yangHui[i]=new int[i + 1];
            //给每行首末元素赋值
            yangHui[i][0]=yangHui[i][i]=1;
            //给每行非首末元素赋值
            if(i>1){
                for(int j=1;j<yangHui[i].length-1;j++){    //限制给每行的非零元素赋值，所以列数从第二列开始，到倒数第二列结束
                    yangHui[i][j]=yangHui[i-1][j-1]+yangHui[i-1][j];
                }
            }
        }
        //遍历二维数组
        for(int i=0;i<yangHui.length;i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
