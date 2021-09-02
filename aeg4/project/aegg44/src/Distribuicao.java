import java.util.Arrays;

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
            int bucket[][]=new int[10][10];  
            int bucket_count[]=new int[10];  
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


        static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
 
    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
 
        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;
 
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
 
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
 
    // The main function to that sorts arr[] of size n using
    // Radix Sort
    static void radixsort(int arr[], int n)
    {
        // Find the maximum number to know number of digits
        int m = getMax(arr, n);
 
        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }
          
    
    }

