package diagnosticoia;


/**
 *
 * @author Carlos
 */
public class Ejercicios {

    public static void ejercicio2(int edad, String genero) {
        int edadVacuna = 0, Vueltas;
        int edadInicio = 0, anooVacunas = 0;

        if (genero.equals("M")) {
            edadInicio = 5;
            anooVacunas = 4;
        } else if (genero.equals("F")) {
            edadInicio = 4;
            anooVacunas = 6;
        } else {
            System.out.println("No se identifica este genero");
        }

        if (edad < edadInicio) {
            System.out.println("Es la primera vacuana en " + (edadInicio - edad)+" años");
        } else if (edad == edadInicio) {
            System.out.println("La vacuna te toca ahora ");
        } else {
            Vueltas = (edad - edadInicio) / anooVacunas;
            edadVacuna = edadInicio;

            for (int i = 0; i < Vueltas; i++) {
                edadVacuna = edadVacuna + anooVacunas;
            }
            if (edadVacuna == edad) {
                System.out.println("Te toca vacuna ahora mismo");
            } else {
                System.out.println("Te toca la vacuna " + ((edadVacuna + anooVacunas) - edad) + " años");
            }
        }

    }

    public static void ejercicio3(int costoGasolina, int recorrido, int rendimiento) {
        float costo = 0, consumoGasolina;
        costo = (recorrido / rendimiento) * costoGasolina;
        consumoGasolina = (recorrido / rendimiento);
        System.out.println("Los litros de gasolina son: " + consumoGasolina + " , costo total es: " + costo);
    }

    public static void ejercicio5(float arreglo[]) {
        float[] arregloOrdenado;
        Extrras xx = new Extrras();
        float suma = 0, promedio = 0, mediana = 0, varianza, varianzat = 0, desviacionEsta;

        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        promedio = suma / arreglo.length;
        arregloOrdenado = xx.burbuja(arreglo);
        mediana = (arregloOrdenado[4] + arregloOrdenado[5]) / 2;

        for (int i = 0; i < arregloOrdenado.length; i++) {
            varianza = (float) Math.pow((arregloOrdenado[i] - promedio), 2);
            varianzat = varianza + varianzat;
        }
        varianza = varianzat / arreglo.length;
        desviacionEsta = (float) Math.sqrt(varianza);

        System.out.println("Suma ; " + suma + " , Promedio: " + promedio + ", Mediana:" + mediana + " Varianza: " + varianza + " Desviacion estandar: " + desviacionEsta);

    }

    public static void ajercicio6(int arreglo[], int arreglo2[]) {
        int arregloSuma[] = new int[10];
        int arregloMultiplicaion[] = new int[10];

        for (int i = 0; i < 10; i++) {
            arregloSuma[i] = (arreglo[i] + arreglo2[i]);
            arregloMultiplicaion[i] = (arreglo[i] * arreglo2[i]);
        }
        System.out.println("Este es el arreglo sumado");
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + arregloSuma[i] + "]");
        }
        System.out.println("");
        System.out.println("Este es el arreglo Multiplicado");
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + arregloMultiplicaion[i] + "]");
        }
    }

    public static void ejercicio7(int matrix[][], int matrix2[][]) {
        int matrixSuma[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixSuma[i][j] = (matrix[i][j] + matrix2[i][j]);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrixSuma[i][j] + "] ");
            }
            System.out.println("");
        }
    }

    public static void ejercicio8(int matrix[][], int matrix2[][]) {
        int[][] matrixMulti = new int[matrix.length][matrix2[0].length];
        if (matrix[0].length == matrix2.length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix[0].length; k++) {
                        // aquí se multiplica la matriz
                        matrixMulti[i][j] += matrix[i][k] * matrix2[k][j];
                    }
                }
            }
        }
        System.out.println("Matriz A");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrix[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("Matriz B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrix[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("Matriz Multiplicada A * B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrixMulti[i][j] + "] ");
            }
            System.out.println("");
        }

    }

}
