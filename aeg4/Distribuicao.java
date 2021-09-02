public class Distribuicao {
    

    void countingSort(int[] lista){


        int[] output = new int[lista.length + 1];

        // Find the largest element of the array
        int max = lista[0];
        for (int i = 1; i < lista.length; i++) {
        if (lista[i] > max)
            max = lista[i];
        }
        int[] count = new int[max + 1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max; ++i) {
        count[i] = 0;
        }

        // Store the count of each element
        for (int i = 0; i < lista.length; i++) {
        count[lista[i]]++;
        }

        // Store the cummulative count of each array
        for (int i = 1; i <= max; i++) {
        count[i] += count[i - 1];
        }

        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = lista.length - 1; i >= 0; i--) {
        output[count[lista[i]] - 1] = lista[i];
        count[lista[i]]--;
        }

        // Copy the sorted elements into original array
        for (int i = 0; i < lista.length; i++) {
            lista[i] = output[i];
        }
        }

    static int largest(int a[]) {     
            int larger=a[0], i;   
            for(i=1;i<10;i++)  
            {  
                if(a[i]>larger)  
                larger = a[i];  
            }  
            return larger;  
    }  
    static void radix_sort(int a[]) {  
            int bucket[][]=newint[10][10];  
            int bucket_count[]=newint[10];  
            int i, j, k, remainder, NOP=0, divisor=1, larger, pass;  
            larger = largest(a);  
            while(larger>0)  
            {  
                NOP++;  
                larger/=10;  
            }  
            for(pass=0;pass<NOP;pass++) // Initialize the buckets  
            {  
                for(i=0;i<10;i++)  
                bucket_count[i]=0;  
                for(i=0;i<10;i++)  
                {  
                    // sort the numbers according to the digit at passth place            
                    remainder = (a[i]/divisor)%10;  
                    bucket[remainder][bucket_count[remainder]] = a[i];  
                    bucket_count[remainder] += 1;  
                }  
                // collect the numbers after PASS pass  
                i=0;  
                for(k=0;k<10;k++)  
                {  
                    for(j=0;j<bucket_count[k];j++)  
                    {  
                        a[i] = bucket[k][j];  
                        i++;  
                    }  
                }  
                divisor *= 10;  
            }  
        }  
    
    }

