import java.util.ArrayList;
import java.util.List;

public class ProjectEuler7 {
    public static void main(String[] args) {
        System.out.println(addAndCheckPrime(10001));
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

    //Añadimos los número primos a un ArrayList
    public static Integer addAndCheckPrime(int numberOfPrime) {
        List<Integer> prime = new ArrayList<>();

        //Vamos avanzando números y solo guardamos los primos en el Array
        for (int i = 0; i >= i; i++) {
            if (isPrime(i)) {
                prime.add(i);
            }
            //Si el número del array es igual al número que buscamos  devolovemos esa posición menos 1 puesto que el array empieza en 0
            if (prime.size() == numberOfPrime) {
                return prime.get(numberOfPrime - 1);
            }

        }

        return null;
    }

}
