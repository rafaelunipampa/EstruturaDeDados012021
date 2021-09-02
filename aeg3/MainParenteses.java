import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        String linha;
                
        while(scan.hasNextLine()){
            Stack<Character> stack = new Stack<Character>();
            linha = scan.nextLine();
            int tamanho = linha.length();
            char letra;

            for (int i = 0; i < tamanho; i++) {
                letra = linha.charAt(i);
                if (letra == '(') {
                    stack.push(letra);
                }
                if (letra == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        stack.push(letra);
                    }
                }
            }

            if (stack.isEmpty()) {
                System.out.print("correct\n");
            }else{
                System.out.print("incorrect\n");
            }
        }


    }
}