
package pilavector;

import java.util.Scanner;

public class PilaVector {

    int[] pila;
    int tope, tamaño;

    public PilaVector(int tamaño) {
        this.tamaño = tamaño;
        pila = new int[tamaño];
        tope = -1;
    }

    void apilar(int valor) {
        if (estaLlena()) {
            System.out.println("Pila llena");
        } else {
            pila[++tope] = valor;
        }
    }

    int desapilar() {
        if (estaVacia()) {
            System.out.println("Pila vacía");
            return -1;
        } else {
            return pila[tope--];
        }
    }

    int obtenerTope() {
        if (estaVacia()) {
            System.out.println("Pila vacía");
            return -1;
        } else {
            return pila[tope];
        }
    }

    void mostrarPila() {
        if (estaVacia()) {
            System.out.println("Pila vacía");
        } else {
            System.out.println("Pila: ");
            for (int i = 0; i <= tope; i++) {
                System.out.print(pila[i] + " ");
            }
            System.out.println();
        }
    }

    boolean estaVacia() {
        return tope == -1;
    }

    boolean estaLlena() {
        return tope == tamaño - 1;
    }

    int obtenerTamaño() {
        return tamaño;
    }

    void vaciarPila() {
        tope = -1;
        System.out.println("Pila vaciada");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la pila: ");
        int tamaño = scanner.nextInt();
        PilaVector pila = new PilaVector(tamaño);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Apilar");
            System.out.println("2. Desapilar");
            System.out.println("3. Obtener tope");
            System.out.println("4. Mostrar pila");
            System.out.println("5. Verificar si está vacía");
            System.out.println("6. Verificar si está llena");
            System.out.println("7. Obtener tamaño");
            System.out.println("8. Vaciar pila");
            System.out.println("9. Salir");

            System.out.print("Ingrese una opción: ");
            int opción = scanner.nextInt();

            switch (opción) {
                case 1:
                    System.out.print("Ingrese valor a apilar: ");
                    pila.apilar(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Valor desapilado: " + pila.desapilar());
                    break;
                case 3:
                    System.out.println("Tope de la pila: " + pila.obtenerTope());
                    break;
                case 4:
                    pila.mostrarPila();
                    break;
                case 5:
                    System.out.println("Pila vacía? " + pila.estaVacia());
                    break;
                case 6:
                    System.out.println("Pila llena? " + pila.estaLlena());
                    break;
                case 7:
                    System.out.println("Tamaño de la pila: " + pila.obtenerTamaño());
                    break;
                case 8:
                    pila.vaciarPila();
                    break;
                case 9:
                    System.out.println("Adiós");
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}


