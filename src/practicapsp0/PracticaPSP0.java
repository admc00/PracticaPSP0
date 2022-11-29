/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicapsp0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author antonio diego
 */
public class PracticaPSP0 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = "C:\\Users\\antonio diego\\OneDrive - UNIVERSIDAD DE HUELVA\\Documentos\\UNI\\CMEPPS\\palabras.txt";
        Scanner scan = new Scanner(new File(fileName));

        String desordenada1 = "", desordenada2 = "", palabra;
        int random = 0;
        while (scan.hasNextLine()) {
            desordenada1 = scan.nextLine();
            palabra = desordenada1;
            for (int i = desordenada1.length(); i >= 2; i--) {
                random = (int) (Math.random() * i + 1);
                desordenada2 = desordenada2 + desordenada1.substring(random - 1, random);
                desordenada1 = desordenada1.substring(0, random - 1) + desordenada1.substring(random, i);
            }
            System.out.println("Palabra desordenada: " + desordenada2 + desordenada1);
            juego(palabra);
            desordenada2 = "";
        }

    }

    public static void juego(String palabra) {
        Scanner leer = new Scanner(System.in);
        String intento;
        int numIntentos;
        Boolean acertado = false;
        numIntentos = 1;
        while (!acertado) {
            System.out.println("Jugador 1, Intento " + numIntentos);
            intento = leer.nextLine();
            if (intento.equals(palabra)) {
                System.out.println("Verdadero");
                acertado = true;
                break;
            } else {
                System.out.println("Falso");
            }
            System.out.println("Jugador 2, Intento " + numIntentos);
            intento = leer.nextLine();
            if (intento.equals(palabra)) {
                System.out.println("Verdadero");
                acertado = true;
                break;
            } else {
                System.out.println("Falso");
            }

            numIntentos++;
        }
        acertado = false;
    }
}
