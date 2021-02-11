package ec.edu.ups.interfaz;

import ec.edu.ups.Logica.Busqueda;
import java.util.Scanner;
import ec.edu.ups.Logica.Ordenamiento;
import java.util.Arrays;
import java.util.Random;

/**
 * @since 2018
 * @version v 0.1
 * @author cesc_
 */
public class Interfaz {    

    Ordenamiento orden;
    Busqueda busca;
    int []arreglo;
    int []arregloOriginal;
    int db;
    long tiempoIni, tiempoFin;
    double tiempoTotal;
    
    
    public static void main(String[]args) {
        
        String op = "s";
        int opc = 0;
        int n;
        
        Interfaz interfaz = new Interfaz();
        interfaz.busca= new Busqueda();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Universidad Politecnica Salesiana\n"
                + "Computacion\n"
                + "Estructura de Datos\n");
        
        while(op.equals("s")){
            
            System.out.print("Menu:\n"
                    + "1. Ordenamiento\n"
                    + "2. Busqueda\n"
                    + "3. Prueba\n"
                    + "Opcion > ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:
                    System.out.println("\n\t* ORDENAMIENTO");
                    System.out.print("\nIngrese el tamanio del Arreglo:");
                    n = Integer.parseInt(sc.nextLine());
                    /**
                     * Ordenamiento Burbuja
                     */
                    System.out.println("\n\tOrdenamiento BURBUJA");

                    //Llena el vector con numeros Random y los muestra
                    interfaz.llenarArreglo(n);

                    //Ordena el arrelo

                    interfaz.tiempoIni = System.nanoTime();
                    interfaz.ordearBurbuja();
                    interfaz.tiempoFin = System.nanoTime();

                    //Muestra el arreglo ordenado
                    //interfaz.mostrarArreglo();

                    interfaz.tiempoTotal = interfaz.tiempoFin - interfaz.tiempoIni;
                    interfaz.tiempoTotal = interfaz.tiempoTotal/1000000;
                    System.out.println("TIEMPO: " + interfaz.tiempoTotal + " ms");

                    /**
                     * Ordenamiento Seleccion
                     */
                    System.out.println("\n\tOrdenamiento SELECCION");

                    //Llena el vector con numeros Random y los muestra
                    interfaz.reiniciarArreglo();

                    //Ordena el arrelo
                    interfaz.tiempoIni = System.nanoTime();
                    interfaz.ordenarSeleccion();
                    interfaz.tiempoFin = System.nanoTime();

                    //Muestra el arreglo ordenado
                    //interfaz.mostrarArreglo();

                    interfaz.tiempoTotal = interfaz.tiempoFin - interfaz.tiempoIni;
                    interfaz.tiempoTotal = interfaz.tiempoTotal/1000000;
                    System.out.println("TIEMPO: " + interfaz.tiempoTotal + " ms");

                    /**
                     * Ordenamiento Insercion
                     */
                    System.out.println("\n\tOrdenamiento INSERCION");

                    //Llena el vector con numeros Random y los muestra
                    interfaz.reiniciarArreglo();

                    //Ordena el arrelo
                    interfaz.tiempoIni = System.nanoTime();
                    interfaz.ordenarInsercion();
                    interfaz.tiempoFin = System.nanoTime();

                    //Muestra el arreglo ordenado
                    //interfaz.mostrarArreglo();

                    interfaz.tiempoTotal = interfaz.tiempoFin - interfaz.tiempoIni;
                    interfaz.tiempoTotal = interfaz.tiempoTotal/1000000;
                    System.out.println("TIEMPO: " + interfaz.tiempoTotal + " ms");


                    /**
                     * Ordenamiento Marge Sort (Mezcla)
                     */
                    System.out.println("\n\tOrdenamiento MERGE SORT");

                    //Llena el vector con numeros Random y los muestra
                    interfaz.reiniciarArreglo();

                    //Ordena el arrelo
                    interfaz.tiempoIni = System.nanoTime();
                    interfaz.ordenarMergeSort();
                    interfaz.tiempoFin = System.nanoTime();
                    System.out.println(Arrays.toString(interfaz.arreglo));

                    //Muestra el arreglo ordenado
                    //interfaz.mostrarArreglo();

                    interfaz.tiempoTotal = interfaz.tiempoFin - interfaz.tiempoIni;
                    interfaz.tiempoTotal = interfaz.tiempoTotal/1000000;
                    System.out.println("TIEMPO: " + interfaz.tiempoTotal + " ms");

                    /**
                     * Ordenamiento Quik Sort (Rapido)
                     */
                    System.out.println("\n\tOrdenamiento QUIK SORT");

                    //Llena el vector con numeros Random y los muestra
                    interfaz.reiniciarArreglo();

                    //Ordena el arrelo
                    interfaz.tiempoIni = System.nanoTime();
                    interfaz.ordenarQuikSort();
                    interfaz.tiempoFin = System.nanoTime();

                    //Muestra el arreglo ordenado
                    //interfaz.mostrarArreglo();

                    interfaz.tiempoTotal = interfaz.tiempoFin - interfaz.tiempoIni;
                    interfaz.tiempoTotal = interfaz.tiempoTotal/1000000;
                    System.out.println("TIEMPO: " + interfaz.tiempoTotal + " ms");
                    
                case 2:
                    
                    int[] vec = {9,4,5,2};
                    int dato;
                    int dato2;
                    
                    System.out.println("\n\t\tBUSQUEDA");
                    System.out.print("Ingrese el tamanio del vector: ");
                    n = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese el dato: ");
                    dato = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese el dato para el vector [9,4,5,2]: ");
                    dato2 = Integer.parseInt(sc.nextLine());
                    
                    //Ingreso del elemento a Buscar
                    interfaz.llenarArreglo(n);
                    
                    /**
                     * Busqueda Secuencial
                     */
                    System.out.println("\n----------Busqueda Secuencial----------");
                    
                    //Busqueda del dato en el vector predeterminado
                    System.out.println("\n ** Busqueda vector [9,4,5,2] ** ");
                    interfaz.arreglo = new int[4];
                    interfaz.arreglo = vec;
                    System.out.println(Arrays.toString(interfaz.arreglo));
                    interfaz.tiempoIni = System.nanoTime();
                    interfaz.busquedaSecuencial(dato2);
                    interfaz.tiempoFin = System.nanoTime();
                    
                    if (interfaz.busca.getPosicion() == -1) {
                        System.out.println("> No se encontro el elemento\n");
                    }else{
                        System.out.println("> El elemento se encuentra en la posicion: " 
                                + interfaz.busca.getPosicion() + "\n");
                    }
                        
                    interfaz.tiempoTotal = interfaz.tiempoFin - interfaz.tiempoIni;
                    interfaz.tiempoTotal = interfaz.tiempoTotal/1000000;
                    System.out.println("TIEMPO: " + interfaz.tiempoTotal + " ms");
                    
                    
                    System.out.println("\n ** Busqueda vector aleatorio ** \n");
                    //Reinicia el vector
                    interfaz.reiniciarArreglo();
                    
                    //Busqueda del dato en el vector aleatorio
                    System.out.println(Arrays.toString(interfaz.arreglo));
                    interfaz.tiempoIni = System.nanoTime();
                    interfaz.busquedaSecuencial(dato);
                    interfaz.tiempoFin = System.nanoTime();
                    
                    if (interfaz.busca.getPosicion() == -1) {
                        System.out.println("> No se encontro el elemento\n");
                    }else{
                        System.out.println("> El elemento se encuentra en la posicion: " 
                                + interfaz.busca.getPosicion() + "\n");
                    }
                    
                    interfaz.tiempoTotal = interfaz.tiempoFin - interfaz.tiempoIni;
                    interfaz.tiempoTotal = interfaz.tiempoTotal/1000000;
                    System.out.println("TIEMPO: " + interfaz.tiempoTotal + " ms");
                    
                    /**
                     * Busqueda Binaria
                     */
                    System.out.println("\n----------Busqueda Binaria----------");
                    
                    //Busqueda del dato en el vector predeterminado
                    System.out.println("\n ** Busqueda vector [9,4,5,2] ** \n");
                    interfaz.arreglo = new int[4];
                    interfaz.arreglo = vec;
                    interfaz.ordenarQuikSort();     //Ordena el vector
                    System.out.println(Arrays.toString(interfaz.arreglo));
                    interfaz.tiempoIni = System.nanoTime();
                    interfaz.busquedaBinaria(dato2);
                    interfaz.tiempoFin = System.nanoTime();
                    
                    if (interfaz.busca.getPosicion() == -1) {
                        System.out.println("> No se encontro el elemento\n");
                    }else{
                        System.out.println("> El elemento se encuentra en la posicion: " 
                                + interfaz.busca.getPosicion() + "\n");
                    }
                    
                    interfaz.tiempoTotal = interfaz.tiempoFin - interfaz.tiempoIni;
                    interfaz.tiempoTotal = interfaz.tiempoTotal/1000000;
                    System.out.println("TIEMPO: " + interfaz.tiempoTotal + " ms");
                    
                    
                    System.out.println("\n ** Busqueda vector aleatorio ** \n");
                    //Reinicia el vector
                    interfaz.reiniciarArreglo();
                    
                    //Busqueda del dato en el vector aleatorio
                    interfaz.ordenarQuikSort();     //Ordena el vector
                    System.out.println(Arrays.toString(interfaz.arreglo));
                    interfaz.tiempoIni = System.nanoTime();
                    interfaz.busquedaBinaria(dato);
                    interfaz.tiempoFin = System.nanoTime();
                    
                    if (interfaz.busca.getPosicion() == -1) {
                         System.out.println("> No se encontro el elemento\n");
                    }else{
                         System.out.println("> El elemento se encuentra en la posicion: " 
                                 + interfaz.busca.getPosicion() + "\n");
                    }
                    
                    interfaz.tiempoTotal = interfaz.tiempoFin - interfaz.tiempoIni;
                    interfaz.tiempoTotal = interfaz.tiempoTotal/1000000;
                    System.out.println("TIEMPO: " + interfaz.tiempoTotal + " ms");
                    
                case 3: 
                    System.out.print("\n > Ingrese el tamanio del vector: ");
                    n = Integer.parseInt(sc.nextLine());
                    
                    interfaz.llenarArreglo(n);
                    
                    
                    System.out.println("\n ** Arreglo: ");
                    System.out.println(Arrays.toString(interfaz.arreglo));
                    
                    interfaz.ordenarQuikSort();
                    
                    System.out.println("\n ** Ordenado: ");
                    System.out.println(Arrays.toString(interfaz.arreglo));
                    
                    
                    System.out.print("\n > Ingrese el dato: ");
                    dato = Integer.parseInt(sc.nextLine());
                    
                    interfaz.tiempoIni = System.nanoTime();
                    interfaz.busquedaEliminacion(dato);
                    interfaz.tiempoFin = System.nanoTime();
                    
                    System.out.println("\n ** Resultado: ");
                    System.out.println(Arrays.toString(interfaz.arreglo));
                    interfaz.tiempoTotal = interfaz.tiempoFin - interfaz.tiempoIni;
                    interfaz.tiempoTotal = interfaz.tiempoTotal/1000000;
                    System.out.println("\nTIEMPO: " + interfaz.tiempoTotal + " ms");
                    
            }
            System.out.print("\nDesea CONTINUAR? (s/n): ");
            op = sc.nextLine();
        }
    }
    
    public void llenarArreglo(int n) {
        int a;
        
        Random r = new Random();
        
        arreglo = new int[n];
        arregloOriginal = new int [n];
        //System.out.println("\nArreglo Original:");
        for (int i = 0; i < n; i++) {
            a = r.nextInt(n)+1;
            arreglo[i] = a;
            arregloOriginal[i] = a;
            //System.out.print(" | " + arreglo[i]);
        }
        //System.out.println(" |");
    }
    
    public void ordearBurbuja(){
        orden = new Ordenamiento();
        
        orden.ordenarBurbuja(arreglo);
    }
    
    public void ordenarSeleccion(){
        orden = new Ordenamiento();
        
        orden.ordenarSeleccion(arreglo);
    }
    
    public void ordenarInsercion() {
        orden = new Ordenamiento();
        
        orden.ordenarInsercion(arreglo);
    }
    
    public void ordenarMergeSort(){
        orden = new Ordenamiento();
        
        int n = arreglo.length;
        orden.setBT(n);
        orden.mergeSort(arreglo, 0, (n - 1));

    }
    
    public void ordenarQuikSort(){
        orden = new Ordenamiento();
        
        orden.ordenarQuikSort(arreglo, 0, (arreglo.length - 1));
    }
    
    public void busquedaSecuencial(int dato) {
        busca = new Busqueda();
        
        //Busqueda vector determinado
        int n = arreglo.length;
        busca.busquedaSecuencial(arreglo, dato, n);
        
    }
    
    public void busquedaBinaria(int dato) {
        busca = new Busqueda();
        
        int n = arreglo.length;
        busca.busquedaBinaria(arreglo, dato, n);
    }
    
    public void busquedaEliminacion(int dato){
        busca = new Busqueda();
        
        int n = arreglo.length;
        busca.busquedaEliminar(arreglo, dato, n);
    }
    
    public void reiniciarArreglo(){
        int n = arregloOriginal.length;
        arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = arregloOriginal[i];
        }
    }
    
    public void mostrarArreglo() {
        int[] arregloOrdenado = orden.getA();
        int n = arregloOrdenado.length;
        System.out.println("\nArreglo Ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.print(" | " + arregloOrdenado[i]);
        }
        System.out.println(" |");
    }
}
