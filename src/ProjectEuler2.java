public class ProjectEuler2 {
    public static void main(String[] args) {

        evenFibonacciNumbers();
    }

    public static void evenFibonacciNumbers(){

        //Inicializamos las variables
            int actualNum = 1;
            int previousNum = 0;
            int nextNum = 0;
            int sum = 0;

        //Itereamos hasta el 4.000.000

        for (int i = 0; actualNum <= 4000000; i++){


            //El valor nextNum será la suma de los dos anteriores
            nextNum = actualNum + previousNum;

            //Volvemos a asignar los valores a las variables
            actualNum = previousNum;
            previousNum = nextNum;

            //Comprobamos que sea par para sumarlo
            if (actualNum % 2 == 0){
                sum += actualNum;
            }


        }

        System.out.println("El resultado de sumar los números pares de Fibonacci es: " + sum);


    }


}
