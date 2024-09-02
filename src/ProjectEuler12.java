import java.util.ArrayList;

public class ProjectEuler12 {
    public static void main(String[] args) {
        triangularNumber();
    }
    //Tarda mucho en realizarse

    public static void triangularNumber() {
        //Vamos calculando todos los números triangulares
        long triangularNumber = 0L;
       for (long i = 1; i >= i; i++) {
            triangularNumber += i;
            //Los enviamos a este método para calcular sus divisores
            divisor2(triangularNumber);
            }
        }






    public static void divisor2(long numerous){
        ArrayList<Long> list = new ArrayList<>();
        for(long i = 1 ; i <= numerous ; i++){
            //ArrayList<Integer> list = new ArrayList<>();
            if(numerous%i==0){
                //añadimos sus divisores al Array
                list.add(i);

            }

        }
        //Si el array es mayor o igual a 500 imprimimos el número.
        if(list.size() >= 500){
            System.out.println("El número es: " + numerous);  //76576500

        }

    }

}
