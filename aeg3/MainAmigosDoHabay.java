import java.io.IOException;
import java.util.*;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main5 {
 
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String ans = "ninguem";
        String[] s;
        Set<String> sy = new TreeSet<String>();
        Set<String> sn = new TreeSet<String>();
        int a = 0;
        while (scanner.hasNextLine()) {
            s = new String[2];
            String linha = scanner.nextLine();
            if (linha.equals("FIM")) {
                for (String string : sy) {
                    System.out.println(string);
                }
                for (String string : sn) {
                    System.out.println(string);
                }

                    System.out.println("\nAmigo do Habay:");
                    System.out.print(ans);
            }else{
                s = linha.split(" ", 2);
                if (s[1].equals("YES")) {
                    sy.add(s[0]);
                } else {
                    sn.add(s[0]);
                }
                if (a == 0) {
                    a = s[0].length();
                } else if( a < s[0].length() && s[1].equals("YES")) {
                    a = s[0].length();
                    ans = s[0];
                }
            }
        }

      
    }
 
}