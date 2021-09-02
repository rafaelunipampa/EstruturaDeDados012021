

public class Insercao{

    
    void insertionSort(int[] lista){
        int n = lista.length;  
        for (int j = 1; j < n; j++) {  
            int key = lista[j];  
            int i = j-1;  
            while ( (i > -1) && ( lista [i] > key ) ) {  
                lista [i+1] = lista [i];  
                i--;  
            }  
            lista[i+1] = key;  
        }
    }

    void shell(int[] lista){
        int inta, i, aux;
		boolean band;
		inta = lista.length;
		while(inta > 0){
			inta = inta / 2;
			band = true;
			while(band){
				band = false;
				i = 0;
				while ((i+inta) <=lista.length-1){//2.1.1
					if (lista[i] > lista[i + inta]){
						aux = lista[i];
						lista[i] = lista[i+inta];
						lista[i+inta] = aux;
						band = true;
					}
					i = i +1;
				}
			}
		}

    }
    
}
