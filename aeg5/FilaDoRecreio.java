import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FilaDoRecreio {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int m = scan.nextInt();
            int arr1[] = new int[m];
            int arr2[] = new int[m];
            for (int j = 0; j < m; j++) {
                int num = scan.nextInt();
                arr1[j] = num;
                arr2[j] = num;
            }
            Arrays.sort(arr2);
            int count =  0;
            m--;
            for (int j : arr2) {
                
                if (j == arr1[m]) {
                    count++;
                }
                m--;
                
            }
            System.out.println(count);
        }
    }
}
