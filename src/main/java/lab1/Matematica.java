package lab1;

public class Matematica {


    public static void Fibonacci (int numero) {

        try { int verificacion = Integer.valueOf(numero);

            int ultimotermino = numero;
            int termino1 = 1; int termino2 = 1 ;int suma = 1;
            for (int serie = 1; serie < ultimotermino; serie++) {
                suma = termino1 + termino2;
                suma = termino2;
                termino1 = termino2;
            System.out.println("La serie Fibonacci:" + suma);}
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un Numero :p");
        }
    }

    public static void Factorial (int numero) {
        try {
            int verificacion = Integer.valueOf(numero);
            int factorial = 1;
            for ( int numeral= 1; numeral < numero; numeral++ ){
                factorial = factorial*numeral;
                System.out.println("El factorial del número es:" + factorial );
            }
        } catch (NumberFormatException e) {
            System.out.println ("Ingrese un numero :p");
        }
    }
}
