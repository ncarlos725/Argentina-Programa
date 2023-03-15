/*

 */
package PaquetePrincipal;


public class Ejercicio2 {

   public static void main(String[] args) {
        float ingresos = 550000; // ejemplo de ingresos mensuales
        int vehiculos = 4; // ejemplo de número de vehículos con antigüedad menor a 5 años
        int inmuebles = 2; // ejemplo de número de inmuebles
        boolean activosSocietarios = true; // ejemplo de poseer activos societarios que demuestren capacidad económica plena

        if (ingresos >= 489083 || vehiculos >= 3 || inmuebles >= 3 || activosSocietarios) {
            System.out.println("La persona pertenece al segmento de ingresos altos.");
        } else {
            System.out.println("La persona no pertenece al segmento de ingresos altos.");
        }
    }
}
