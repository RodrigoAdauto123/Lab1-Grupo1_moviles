package lab1;

import java.util.Scanner;

import static lab1.Matematica.verificarSiEsPrimo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

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
                    list1.add(numero2);
                    try { int verif = Integer.valueOf(numero2);
                        matematica.Fibonacci(verif); }
                    catch (NumberFormatException e)
                    { System.out.println("Inserte un numero:"); }
                    break;

                case 3:

                    String numero3 = sc.nextLine();
                    List list3 = new ArrayList();
                    list1.add(numero3);
                    try { int verif = Integer.valueOf(numero3);
                        matematica.Fibonacci(verif); }
                    catch (NumberFormatException e)
                    { System.out.println("Inserte un numero:"); }
                    break;

                case 4:
                    String numero4 = sc.nextLine();
                    List list4 = new ArrayList();
                    list1.add(numero4);
                    try { int verif = Integer.valueOf(numero4);
                        matematica.Factorial(verif); }
                    catch (NumberFormatException e)
                    { System.out.println("Inserte un numero:"); }
                    break;



            }

            Scanner sc =new Scanner(System.in);

            System.out.print("Ingrese un numero:");
            String numeroString=sc.nextLine();
            try {
                int numero=Integer.valueOf(numeroString);

                boolean isPrimo = verificarSiEsPrimo(numero);

                if (isPrimo){
                    System.out.print("Es un número primo");


                }else{
                    System.out.print("No es un número primo");
                }
            }catch( NumberFormatException  e){
                System.out.print("Ingresar un número!");


            }
            catch( Exception  e){
                System.out.print("Ingresar número válido por favor");


            }



            System.out.print("Ingrese un numero para hallar el MCD:");
            String numero1String=sc.nextLine();
            System.out.print("Ingrese otro numero para hallar el MCD:");
            String numero2String=sc.nextLine();

            try {
                int numero1=Integer.valueOf(numero1String);
                int numero2=Integer.valueOf(numero2String);
                while(numero1 != numero2)
                    if(numero1>numero2)
                        numero1= numero1-numero2;
                    else
                        numero2= numero2 -numero1;

                System.out.println("El MCD es:"+numero1);

            }catch (NumberFormatException  e){

            }






        }}


        //Listar Personas
            try {
                // Creo una instancia
                ObjectMapper mapper = new ObjectMapper();

                ListaPersona listaPersona = new ListaPersona();
                // Guardo en el objeto
                listaPersona = mapper.readValue(Paths.get("../resources/personas.json").toFile(), ListaPersona.class);

                // Imprimo
                System.out.println(listaPersona);

            } catch (Exception ex) {
                ex.printStackTrace();
            }





    }
}
