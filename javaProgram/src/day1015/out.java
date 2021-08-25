package day1015;

public class out {
        public static void main(String[] args) {

            int[] a = new int[20];
            a[0] = 1;
            a[1] = 2;
            int i;
            for (i = 2; i < 20; i++) {
                a[i] = a[i - 2] + a[i - 1];
            }
            //for (i = 0; i < 20; i++) {
                System.out.println(a[i] + " ");
            //}
        }

    }


