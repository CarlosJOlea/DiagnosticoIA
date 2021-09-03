/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnosticoia;

/**
 *
 * @author Carlos
 */
public class Extrras {
      public static float[] burbuja (float[] arreglo)
    {
      float auxiliar;
      float[] arregloOrdenado;
      
      for(int i = 0; i < arreglo.length-1; i++) {
        for(int j = 0;j < arreglo.length-1;j++){
          if(arreglo[j] > arreglo[j+1]) {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }
}
