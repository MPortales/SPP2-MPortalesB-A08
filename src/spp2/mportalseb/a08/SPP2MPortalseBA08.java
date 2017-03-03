/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mportalseb.a08;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPP2MPortalseBA08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        // Este programa promedia las posiciones pares y suma el contenido de las posiciones nones de un arreglo
        int promedio,sumaPar=0,sumaNon=0,cont=0;
        int[][] matrix ={{10,30,89,48,56},
                         {32,23,84,20,10},
                         {72,108,71,402,8}};
    
    //i inicia en 0, el ciclo se ejecuta mientras i< al tamaño del arreglo
      //i se incrementa de 2 en 2
      //matrix donde este i
        for(int i=0; i<matrix.length; i++){
          for(int j=0;j<matrix[i].length;j=j+2){
              sumaPar=sumaPar + matrix[i][j];
              cont++; 
          }
          }
      promedio=sumaPar/cont;
        System.out.println("El promedio es igual a  "+ promedio);
       //int j=1 para nones
        for(int i=0; i<matrix.length; i++){
          for(int j=1;j<matrix[i].length;j=j+2){
              sumaNon=sumaNon + matrix[i][j];
                   cont++; 
    }
        }
        System.out.println("La sumatoria de los nones es igual a "+sumaNon);
    }
    

    }
    

