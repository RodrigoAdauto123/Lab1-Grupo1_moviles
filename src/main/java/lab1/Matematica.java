package lab1;

public class Matematica {

public static boolean verificarSiEsPrimo(int numero){

    double raiz=Math.sqrt(numero);
    for (int i=2;i<raiz; i++ ){

        int res=numero%i;
        if (res==0){
            return false;
        }



    }
return true;


    }

}
