/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Logica;

import java.util.Arrays;

/**
 * Busqueda de un elemento ubicado dentro de un vector o dentro de una base de 
 * datos, clasificadas en dos tipos: Secuencial y binaria.
 * 
 * @author edd
 */
public class Busqueda {
    
    private int posicion;

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    /**
     * Busqueda Secuencial consiste en comparar cada elemento del vector hasta 
     * encontrar el elemnto buscado, o hasta el final del vector.
     * 
     * @param a         int[] a arreglo que contiene los elementos
     * @param dato      int dato elemento a buscar
     * @param n         int n contiene el tamanio del vector
     */
    public void busquedaSecuencial(int a[], int dato, int n){
        posicion = -1;
        //System.out.println(Arrays.toString(a));
        for (int i = 0; i < n; i++) {       //recorre el arreglo
            if (a[i] == dato) {
                this.posicion = i;
                break;
            }
        }
    }
    
    /**
     * Busqueda Binaria consiste en dividir el arreglo a la mitad y buscar el 
     * elemento en cada parte respectiva.
     * 
     * @param a         int[] a arreglo que contiene los elementos
     * @param dato      int dato elemnto a buscar
     * @param n         tamanio del vector
     * @return -1 encaso de no encontrar el elemento en el vetor
     */
    public void busquedaBinaria(int a[], int dato, int n){
        
        int centro = 0;
        int inf = 0;
        int sup = n-1;
        
        posicion = -1;
        
        while (inf <= sup){
            centro = (sup + inf)/2;
            if (a[centro] == dato) {
                posicion = centro;
                break;
            }else{
                if (dato < a[centro]) {
                    sup = centro - 1;
                }else{
                    inf = centro + 1;
                }
            }
        }
        
    }
    
    public void busquedaEliminar(int a[], int dato, int n){
        int centro = 0;
        int inf = 0;
        int sup = n-1;
        
        posicion = -1;
        
        while (inf <= sup){
            centro = (sup + inf)/2;
            if (a[centro] == dato) {
                
                while(centro>=1){
                    centro--;
                    if (a[centro]!=dato) {
                        break;
                    }
                }  
                for (int i = centro; i < n; i++) {
                    if (a[i]==dato) {
                        a[i]=0;
                    }
                }
                
                break;
            }else{
                if (dato < a[centro]) {
                    sup = centro - 1;
                }else{
                    inf = centro + 1;
                }
            }
        }
    }
    
}
