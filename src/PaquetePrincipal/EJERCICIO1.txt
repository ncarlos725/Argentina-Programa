/*
1. Vamos a practicar operaciones básicas con números
    a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
    y “b”. Su código puede arrancar (por ejemplo):
    int numeroInicio = 5;
    int numeroFin = 14;
        // Se deberían mostrar los números:
           5,6,7,8,9,10,11,12,13,14
    b. A lo anterior, solo muestre los números pares
    c. A lo anterior, con una variable extra, elija si se deben mostrar los números
    pares o impares
    d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden

 */


package PaquetePrincipal;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Scanner leer = new Scanner(System.in);
        int a = 2;
        int b = 8;
        String opcion = "par";//Cambiar a impar para mostrar n° impares
        while (a <= b) {
            System.out.println(a + " ");
            a++;
        }

        System.out.println("Mostrar numeros pares ");
        a = 2;
        b = 8;
        while (a <= b) {
            if (a % 2 == 0) {
                
                
                System.out.println(a);
            }
            a++;
        }

        System.out.println("Mostrar de mayor a menor");

        a = 2;
        b = 8;
        while (b >= a) {
            System.out.println(b);
            b--;

        }
        System.out.println("A lo anterior, con una variable extra, elija si se deben mostrar los números\n");
        while (a <= b) {
            if (opcion.equals("par") && a % 2 == 0) {
                System.out.print(a + " ");
            } else if (opcion.equals("impar") && a % 2 != 0) {
                System.out.print(a + " ");
            }
            a++;
        }

    }// fin main

}
