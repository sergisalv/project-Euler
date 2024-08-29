public class ProjectEuler5 {
    public static void main(String[] args) {
        smallestNumber();
    }

    public static void smallestNumber() {

        int div;
        int num;

        //Creamos un loop en el que se vayan incrementando los números
        outerLoop:
        for (num = 1; num >= num; num++) {

            //Creamos un loop interno en el que incrementemos el divisor si la división es entera.
            for (div = 1; num % div == 0; div++) {
                //Si el divisor es 20 imprimimos el número y salimos del loop
                if (div == 20) {
                    System.out.println("El meno número es: " + num);
                    break outerLoop;
                }
            }
        }
    }




}
