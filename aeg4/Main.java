

public class Main {

    static Insercao insercao =  new Insercao();
    static Distribuicao distribuicao =  new Distribuicao();
    public static void main(String[] args) {
        
        int arrayAleatorio100[] = gerarVetoraAleatorio(100);
        int arrayAleatorio10K[] = gerarVetoraAleatorio(10000);
        int arrayAleatorio1M[] = gerarVetoraAleatorio(1000000);

        insertionTest(arrayAleatorio100);


        

    }

    static int[] gerarVetoraAleatorio(int max){
        int array[] = new array[max];
        for (int i = 0; i < max; i++) {
            array[i] = new Math.random();
        }
        return array;
    }

    static void insertionTest(int[] array){
        long inicio = System.currentTimeMillis();  
        insercao.insertionSort(lista);
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
        metodo();  
        long fim  = System.currentTimeMillis();  
        System.out.println("O metodo Counting Sort teve  este tempo " + (fim - inicio) + " para um array de tamanho " + array.length );
    
    }
    static void radixTest(int[] array){
        long inicio = System.currentTimeMillis();  
        metodo();  
        long fim  = System.currentTimeMillis();  
        System.out.println("O metodo Radix Sort teve  este tempo " + (fim - inicio) + " para um array de tamanho " + array.length );
    
    }



    
}
