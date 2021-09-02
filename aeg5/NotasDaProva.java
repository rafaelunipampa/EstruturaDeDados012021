import java.util.Scanner;

public class NotasDaProva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int  num = scan.nextInt();
            if (num == 0){
                System.out.println("E");
            }else if (1 <= num && num <= 35) {
                System.out.println("D");
            }else if (36 <= num && num <= 60) {
                System.out.println("C");
            }else if (61 <= num && num <= 85) {
                System.out.println("B");
            }else if (86 <= num && num <= 100) {
                System.out.println("A");
            }
        }
    }
}
