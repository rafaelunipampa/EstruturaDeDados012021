import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ParesEImpares {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int impares[] = new int[n];
        int pares[] = new int[n];
        int np = 0;
        int ni = 0;

        for (int i = 0; i < pares.length; i++) {
            int num = scan.nextInt();
            if (num%2 ==0) {
                pares[np] = num;
                np++;
            } else {
                impares[ni] = num;
                ni++;
            }
        }

        Arrays.sort(impares,0, ni);
        Arrays.sort(pares,0, np);

        for (int i = 0; i < np; i++) {
            
            System.out.println(pares[i]);
            
        }
        for (int i = --ni; i >= 0; i--) {
            System.out.println(impares[i]);   
        }


    }
}
