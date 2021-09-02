import java.io.IOException;
import java.util.Deque;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
 

public class MainMercado {
 
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int qntFuncionarios, qntClientes;
        int[] funcionarios;
        int[] itens;
        int[] resultados;
        int menor = 1000;
        int tempo = 0;
        int somaResultante;
        int somaItens;

        qntFuncionarios = scan.nextInt();
        qntClientes = scan.nextInt();
        
        funcionarios = new int[qntFuncionarios];
        itens = new int[qntFuncionarios];
        resultados = new int[qntFuncionarios];

        Queue<Integer> clientes = new LinkedList<Integer>();

        for (int i = 0; i < qntFuncionarios; i++) {
            funcionarios[i] = scan.nextInt();
        }

        /////// Fila
        for (int i = 0; i < qntClientes; i++) {
            clientes.add(scan.nextInt());
        }
        for (int i = 0; i < qntFuncionarios; i++) {
            if(clientes.isEmpty()){
                itens[i] = 0;
            }else{
                itens[i] = clientes.poll();
            }
        }

        do{
            for (int i = 0; i < qntFuncionarios; i++) {
                int multiplicando = funcionarios[i];
                int multiplicador = itens[i];
                resultados[i] = multiplicando*multiplicador;
            }

            for (int i = 0; i < qntFuncionarios; i++) {
                    if (resultados[i] <= menor && resultados[i] != 0) {
                        menor = resultados[i];
                    }  
            }

            tempo += menor;
            
            for (int i = 0; i < qntFuncionarios; i++) {
                if(resultados[i] > 0){
                    int resultado = resultados[i]-menor;
                    resultados[i] = resultado;
                }  
            }

            for (int i = 0; i < qntFuncionarios; i++) {
                if (resultados[i] == 0) {
                    if(clientes.isEmpty()){
                        itens[i] = 0;
                    }else{
                        itens[i] = clientes.poll();
                    }
                }
            }
            somaResultante = somaVetor(resultados, qntFuncionarios);
            somaItens = somaVetor(itens, qntFuncionarios);
            menor = 1000;
        }while(somaResultante != 0 || somaItens != 0);

        System.out.print(tempo);
 
    }

    static int somaVetor(int[] resultados, int tamanho){
        int somas = 0;
        for (int i = 0; i < tamanho; i++) {
                somas += resultados[i];
        }
        return somas;
    }


 
}