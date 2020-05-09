package lab1;

import java.util.Scanner;

import static lab1.Matematica.verificarSiEsPrimo;

public class App {
    public static void main(String[] args) {
        while (true){
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
}
