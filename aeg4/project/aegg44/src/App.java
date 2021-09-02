import java.util.Random;

public class App {

    static Insercao insercao =  new Insercao();
    static Distribuicao distribuicao =  new Distribuicao();
    static Random random = new Random();

    public static void main(String[] args) throws Exception {
        

        
        int arrayAleatorio100[] = gerarVetoraAleatorio(100000);
        int arrayAleatorio10K[] = gerarVetoraAleatorio(50000);
        int arrayAleatorio1M[] = gerarVetoraAleatorio(70000);
        int arrayAleatorio100M[] = gerarVetoraAleatorio(90000);

        insertionTest(arrayAleatorio100);
        insertionTest(arrayAleatorio10K);
        insertionTest(arrayAleatorio1M);
        insertionTest(arrayAleatorio100M);

        shellTest(arrayAleatorio100);
        shellTest(arrayAleatorio10K);
        shellTest(arrayAleatorio1M);
        shellTest(arrayAleatorio100M);

        countingTest(arrayAleatorio100);
        countingTest(arrayAleatorio10K);
        countingTest(arrayAleatorio1M);
        countingTest(arrayAleatorio100M);

        radixTest(arrayAleatorio100);
        radixTest(arrayAleatorio10K);
        radixTest(arrayAleatorio1M);
        radixTest(arrayAleatorio100M);

    }
        
    static int[] gerarVetoraAleatorio(int max){
        int array[] = new int[max];
        for (int i = 0; i < max; i++) {
            array[i] = new Random().nextInt(10);
        }
        return array;
    }

    static void insertionTest(int[] array){
        long inicio = System.currentTimeMillis();  
        insercao.insertionSort(array);
        long fim  = System.currentTimeMillis();  
        System.out.println("O metodo Insertion Sort teve  este tempo " + (fim - inicio) + " para um array de tamanho " + array.length );
    }
    static void shellTest(int[] array){
        long inicio = System.currentTimeMillis();  
        insercao.shell(array); 
        long fim  = System.currentTimeMillis();  
        System.out.println("O metodo shell teve  este tempo " + (fim - inicio) + " para um array de tamanho " + array.length );
    
    }
    static void countingTest(int[] array){
        long inicio = System.currentTimeMillis();  
        distribuicao.countingSort(array);  
        long fim  = System.currentTimeMillis();  
        System.out.println("O metodo Counting Sort teve  este tempo " + (fim - inicio) + " para um array de tamanho " + array.length );
    
    }
    static void radixTest(int[] array){
        long inicio = System.currentTimeMillis();  
        distribuicao.radixsort(array, array.length);;  
        long fim  = System.currentTimeMillis();  
        System.out.println("O metodo Radix Sort teve  este tempo " + (fim - inicio) + " para um array de tamanho " + array.length );
    
    }

}

