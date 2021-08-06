import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFila {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in); 
        int tamanho;
        int tamanhoDel;

        tamanho = scan.nextInt();

        ArrayList<Integer> fila = new ArrayList<>();

        for (int i = 0; i < tamanho; i++) {
            fila.add(scan.nextInt());
        }

        tamanhoDel = scan.nextInt();

        for(int i = 0; i < tamanhoDel; i++){
            int remover = scan.nextInt();
            fila.remove((Object) remover);
        }

        for(int i = 0; i < (tamanho - tamanhoDel); i++){
            if(i == 0)
                System.out.print(fila.get(i));
            else{
                System.out.print(" " + fila.get(i));
            }
        }
        System.out.println();
        scan.close();
    }
}