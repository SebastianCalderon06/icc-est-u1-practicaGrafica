package models;

public class MetodosDeOrdenamiento {
    public static void burbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
    public static void burbujaOptimizada(int[] arreglo) {
        int n = arreglo.length; 
        for(int i=0; i<n-i;i++){
            for (int j = 0; j<n-1-i ; j++){
                if (arreglo [j] > arreglo[j+1]){    
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1]= aux;
                }
            }
        }
    }
    public static void shell(int[] arreglo) {
        int n = arreglo.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arreglo[i];
                int j = i;
                while (j >= gap && arreglo[j - gap] > temp) {
                    arreglo[j] = arreglo[j - gap];
                    j -= gap;
                }
                arreglo[j] = temp;
            }
        }
    }
    public static void insercion(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int key = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > key) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = key;
        }
    }
    public static void seleccion(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arreglo[minIdx];
            arreglo[minIdx] = arreglo[i];
            arreglo[i] = temp;
        }
    }
}



