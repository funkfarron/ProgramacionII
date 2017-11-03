package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Arreglos y Listas
 * @author arielp
 */
public class TrabajoPractico1 {
    
    public void ejercicio1() {
        String[] palabras = new String[4];
        palabras[0] = "Esto";
        palabras[1] = "es";
        palabras[2] = "una";
        palabras[3] = "frase";
        
        System.out.println("Iterando Arreglos forma 1");
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            System.out.println(palabra);
        }
        System.out.println("\n");
        
        System.out.println("Iterando Arreglos forma 2");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
    
    public void ejercicio2() {
        List<String> palabras = new ArrayList();
        palabras.add("Esto");
        palabras.add("es");
        palabras.add("una");
        palabras.add("frase");
        
        System.out.println("Iterando Listas forma 1");
        for (int i = 0; i < palabras.size(); i++) {
            String palabra = palabras.get(i);
            System.out.println(palabra);
        }
        System.out.println("\n");
        
        System.out.println("Iterando Listas forma 2");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        
        System.out.println("Iterando Listas forma 3 (Iterador)");
        Iterator<String> iterador = palabras.iterator();
        while(iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
    
    /**
     * Crear un arreglo de numeros enteros del 1 al 5, recorrerlos y mostralos de las 2 formas
     */
    public void ejercicio3() {
        int numeros[] = new int[5];
         
        for (int i=0;i<numeros.length;i++){
            numeros[i]=i+1;
        }
    //mostrando el resultado usando la sentencia For
        for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
         
            System.out.println("");
         
    //mostrando el resultado usando la sentencia For each
        for(int num: numeros){
            System.out.println(num);
         }
         
            System.out.println("");
     }
    /**
     * Crear una lista de numeros enteros del 1 al 5, recorrerlos y mostarlos de las 3 formas
     */
    public void ejercicio4() {
        List<Integer> listado = new ArrayList<Integer>();
        listado.add(1);
        listado.add(2);
        listado.add(3);
        listado.add(4);
        listado.add(5);
        
        //mostrando el resultado usando la sentencia For
        for (int i=0;i<listado.size();i++){
            System.out.println(listado.get(i));
        }
         
            System.out.println("Lista generada usando 'For' ");
         
    //mostrando el resultado usando la sentencia For each
        for(Integer list: listado){
            System.out.println(list);
         }
         
            System.out.println("Lista generada usando 'For each'");
            
    //usando Iterator
        Iterator<Integer> iter = listado.iterator();
         
         while(iter.hasNext()){
             System.out.println(iter.next());
         }       
            System.out.println("Lista generada usando 'Iterator'");
    }
     
}