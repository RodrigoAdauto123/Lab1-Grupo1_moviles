package lab1;

import com.sun.istack.internal.localization.NullLocalizable;
import jdk.nashorn.internal.ir.CatchNode;

import javax.print.attribute.standard.NumberUp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Matematica matematica = new Matematica();
        while (true){
            System.out.println("Opcion1. Numero Primo");
            System.out.println("Opcion2. Extraer MCD");
            System.out.println("Opcion3. Serie Fibonacci");
            System.out.println("Opcion4. Factorial");

            System.out.println("Opción:");
            String opcion = sc.nextLine();
            int option = Integer.valueOf(opcion);

            switch (option){

                case 1:
                    String numero1 = sc.nextLine();
                    List list1 = new ArrayList();
                    list1.add(numero1);
                    try { if ( list1.size() ==1) {
                        try {
                            int verif = Integer.valueOf(numero1);
                            matematica.Fibonacci(verif);
                        } catch (NumberFormatException e) {
                            System.out.println("Inserte un numero:");
                        }
                    } } catch (NullPointerException e) {System.out.println("Escriba solo un elemento"); }
                    break;

                case 2:

                    String numero2 = sc.nextLine();
                    List list2 = new ArrayList();
                    list2.add(numero2);
                    try {
                        if (list2.size() == 1) {
                            try {
                                int verif = Integer.valueOf(numero2);
                                matematica.Fibonacci(verif);
                            } catch (NumberFormatException e) {
                                System.out.println("Inserte un numero:");
                            }
                        }
                    } catch (NullPointerException e) {System.out.println("Escriba solo un elemento"); }


                    break;

                case 3:

                    String numero3 = sc.nextLine();
                    List list3 = new ArrayList();
                    list3.add(numero3);
                    try {
                        if (list3.size() == 1) {
                    try { int verif = Integer.valueOf(numero3);
                        matematica.Fibonacci(verif); }
                    catch (NumberFormatException e)
                    { System.out.println("Inserte un numero:"); } } }
                    catch (NullPointerException e) {System.out.println("Escriba solo un elemento"); }
                    break;

                case 4:
                    String numero4 = sc.nextLine();
                    List list4 = new ArrayList();
                    list4.add(numero4);
                    try {
                        if (list4.size() == 1) {
                    try { int verif = Integer.valueOf(numero4);
                        matematica.Factorial(verif); }
                    catch (NumberFormatException e)
                    { System.out.println("Inserte un numero:"); } } }
                    catch (NullPointerException e) {System.out.println("Escriba solo un elemento"); }
                    break;



            }



        }
    }
}
