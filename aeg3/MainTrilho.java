import java.io.IOException;
import java.util.*;

public class MainRails{
    	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int vagoes = scan.nextInt();

			if(vagoes != 0){
				while(true) {
					int proximo = scan.nextInt();
					if(proximo == 0) break;
					else {
						Stack<Integer> vagoesPilha = new Stack();
						int[] saida = new int[vagoes];
						saida[0] = proximo;
						for(int i = 1; i < vagoes; i++) {
							saida[i] = scan.nextInt();
						}
						int contB = 0;
						int contA = 1;
						while(contA <= vagoes) {
							if(!vagoesPilha.empty() && vagoesPilha.peek() == saida[contB]) {
								vagoesPilha.pop();
								contB++;
							}
							else {
								vagoesPilha.push(contA);
								contA++;
							}
						}
						while(!vagoesPilha.empty()) {
							if(!vagoesPilha.empty() && vagoesPilha.peek() == saida[contB]) {
								vagoesPilha.pop();
								contB++;
							}
							else 
								break;
						}
						if(vagoesPilha.empty() && contB == vagoes)
							System.out.println("Yes");
						else 
							System.out.println("No");
					}
				}
				if(scan.hasNext())
					System.out.println();
			}
		}
	}
}