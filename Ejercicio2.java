package MasEjerciciosTema3;

public class Ejercicio2 {
    // Imprimir los números primos entre 2 y 100

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {

            boolean hayDivisores=false; // semáforo de si he encontrado un divisor
            for (int j = 2; j <= Math.sqrt(i) && !hayDivisores; j++) {
                if(i % j == 0) {
                    hayDivisores=true;
                }
            }
            if (!hayDivisores){ // he encontrado algún divisor
                System.out.print(i + " ");
            }
        }
    }
}
