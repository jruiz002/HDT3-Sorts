import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class DataManager {
    public  static void numerosRandom(String nombreArchivo, int cantidadNumeros) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            Random random = new Random();
            for (int i = 0; i < cantidadNumeros; i++) {
                int numero = random.nextInt(100) + 1; // Generar número aleatorio entre 1 y 100
                writer.write(Integer.toString(numero));
                writer.write(" "); // Separar por espacio
            }
            System.out.println("Archivo generado exitosamente: " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Método para guardar "x" números en un Array
    public static Integer[] saveNumbers(int amount, String nombreArchivo) {
        Integer[] numeros = new Integer[amount];

        try (Scanner scanner = new Scanner(new File(nombreArchivo))) {
            int contador = 0;

            while (scanner.hasNext() && contador < amount) {
                String numeroStr = scanner.next();
                try {
                    int numero = Integer.parseInt(numeroStr);
                    numeros[contador] = numero;
                    contador++;
                } catch (NumberFormatException e) {
                    System.out.println("Error al convertir a entero: " + numeroStr);
                    // Puedes manejar el error de conversión como desees
                }
            }

            return numeros;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return numeros;
    }
}
