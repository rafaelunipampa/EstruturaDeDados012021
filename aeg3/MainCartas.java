import java.io.IOException;
import java.util.Deque;
import java.util.Scanner;
import java.util.LinkedList;
 

public class Main3 {
 
    public static void main(String[] args) throws IOException {
 
       int numero;
       Scanner scan = new Scanner(System.in);

       while(true){
           numero = scan.nextInt();
           if(numero == 0) break;
           Deque<Integer> cartas = new LinkedList<Integer>();
           for (int j = 1; j <= numero; j++) {
               cartas.addLast(j);
           }
           System.out.print("Discarded cards: ");
           while (cartas.size() > 1) {
               if (cartas.size() != 2) {
                   System.out.print(cartas.getFirst() + ", ");
               } else {
                   System.out.println(cartas.getFirst());
               }
               cartas.removeFirst();
               cartas.addLast(cartas.getFirst());
               cartas.removeFirst();
           }
           System.out.println("Remaining card: " + cartas.getFirst());

       }
    }
 
}