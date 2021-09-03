package diagnosticoia;
import java.net.Socket;
import java.util.Scanner;

public class DiagnosticoIA {

    public static void main(String[] args) {
        Ejercicios ej = new Ejercicios();
        int arreglo[][] = new int[3][3];
        int arreglo2[][] = new int[3][3];

        Scanner leer = new Scanner(System.in);
        /*int caseSwitch = 0, edad = 0, costoGasolina, kilometrosRecorridos, rendimiento;
        String genero;
        float arreglo[]=new float [10];            
        }*/
        System.out.println("Dame los 9 datos del primera matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arreglo[i][j] = leer.nextInt();
            }
        }
        System.out.println("Dame los 9 datos del segunda matriz 2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
             arreglo2[i][j] = leer.nextInt();
            }
        }
        ej.ejercicio8(arreglo,arreglo2);
        
    }
}
