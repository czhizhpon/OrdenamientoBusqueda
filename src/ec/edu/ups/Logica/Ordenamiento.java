/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Logica;
import java.util.Random;

/**
 * @since 2018
 * @version v 0.1
 * @author cesc_
 */
public class Ordenamiento {
    
    private int[] a;
    private int[] b;
    
    //Random ran = new Random();
    
    
    public void setBT(int n){
        this.b = new int [n];
    }
    
    public void ordenarBurbuja( int[] arreglo) {
        
        this.a = arreglo;
        int n =  arreglo.length;
        int aux;
        for (int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++){
                if(a[j] < a[i]){
                aux = arreglo[i];
                a[i] = a[j];
                a[j] = aux;
                }
            }
        }
    }

    public void ordenarSeleccion(int[] arreglo) {
        int indiceMenor;
        int aux;
        int n = arreglo.length;
        this.a = arreglo;
        
        for (int i = 0; i < n; i++) {
            indiceMenor = i;
            for (int j = i+1; j < n; j++) {
                if (a[j] < a[indiceMenor]){
                    indiceMenor = j;
                }
            }
            if (i != indiceMenor){
                aux = a[indiceMenor];
                a[indiceMenor] = a[i];
                a[i] = aux;
            }
        }
    }
    
    public void ordenarInsercion(int[] arreglo) {
        int aux = 0;
        int j = 0;
        this.a = arreglo;
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            j = i;
            aux = a[i];
            while ((j > 0) && (aux < a[j-1])){
                a[j] = a[j-1];
                j = j - 1;
            }
            a[j] = aux;
        }
    }
    
    public void mergeSort(int[] arreglo, int izq, int der) {
        int m;
        a = arreglo;
        if (izq<der){
            m = (izq+der)/2;
            mergeSort(a, izq, m);
            mergeSort(a, m+1,der);
            merge(a,izq,m,der);
        }
    }
    
    public void merge(int[] arreglo, int izq, int m, int der) {
        a = arreglo;
        //int b[]= new int[a.length]; 
        for (int i = izq; i <= der; i++) {
            b[i] = a[i];
        }
        int i = izq;
        int j = m + 1;
        int k = izq;
        while((i <= m) && (j<=der) ) {
            if(b[i] <= b[j]){
                a[k++] = b[i++];
            } else{
                a[k++] = b[j++];
            }
        }
        while(i<=m){
            a[k++] = b[i++];
        }
        
    }
    
    public void ordenarQuikSort(int[] arreglo, int primero, int ultimo) {
        
        this.a = arreglo;
        
        int central = (primero + ultimo)/2;
        int pivote = a[central];
        int i = primero;
        int j = ultimo;
        int aux;
        do{
            while (a[i]<pivote)i++;
            while (a[j]>pivote)j--;
            if(i<=j){
                aux = a[i];
                a[i] = a[j];
                a[j] = aux;
                i++;
                j--;
            }
        }while(i<=j);
        if(primero < j){
            ordenarQuikSort(a, primero, j);
        }
        if(i < ultimo){
            ordenarQuikSort(a, i, ultimo);
        }
    }
    
    public int[] getA() {
        return a;
    }

}
