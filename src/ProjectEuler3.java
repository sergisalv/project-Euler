public class ProjectEuler3 {
    public static void main(String[] args) {
    largestPrimeFactor();
    }

    public static void largestPrimeFactor(){

        //Número que vamos a factorizar
        Long num = 600851475143L;
        //Numero primo
        int primeNum;
        //Numero Primo mayor
        int highestNPrimNum = 0;


        // Dividimos entre 2 y los sucesivos número
        for (primeNum = 2; primeNum < num ; primeNum++ ){

            //Dividimos el número entre el que nos de como resultado 0 (Puesto que solo es divisible por ese número y por 1)
            while (num % primeNum == 0){
                num /= primeNum;

            }
        }

        System.out.println("El mayor número primo es: " + primeNum);



    }

}
