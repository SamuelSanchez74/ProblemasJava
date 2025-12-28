package MasEjerciciosTema3;
import java.util.Scanner;
/* versión 1: busco todos los divisores entre 1 y el número que nos digan
 * Si al final encuentro solo 2 divisores (el 1 y el propio número),
 * entonces es primo, en otro caso, no es primo */

public class Ejercicio1_Primos_v1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número mayor que 1: ");
        int num = sc.nextInt();

        int contador = 0; // contador de divisores
        for (int i = 1; i <= num; i++) {
            if(num % i == 0) {
                contador++;
            }
        }
        if (contador>2){ // hay más de 2 divisores
            System.out.println("El número no es primo");
        } else {
            System.out.println("El número es primo");
        }
    }
}
