import java.util.ArrayList;
import java.util.List;

public class ProjectEuler10 {
    public static void main(String[] args) {
        primesSum();
    }


    public static void primesSum(){
        List<Integer> primes = new ArrayList<>();
        long sum = 0L;
        //Buscamos los primos menores de 2 millones
        for (int i = 0; i < 2000000; i++){
            if(isPrime(i)){
                //sumamos los primos a sum
                sum += i;

            }

        }
        System.out.println("La suma es: " + sum);

    }



    //Comprobar si un número es primo
    public static boolean isPrime(int n){
        if (n == 2){
            return true;
        }
        //revisa si n es multiplo de 2 o es 1
        if (n%2==0 || n==1) return false;
        //si no, solo revisa los impares (se calcula i*i <= n porque si el cuadrado del número primo es mayor ya hemos terminado)
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }

        return true;

    }
}
