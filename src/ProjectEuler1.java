public class ProjectEuler1 {
    public static void main(String[] args) {
        multiples3or5();

    }

    public static void multiples3or5(){

        //Inicializamos el primer número, el último, así como la suma de los múltiplos
        int firstnum = 0;
        int lastnum = 999;
        int sum = 0;

        //Recorremos todos los números buscando los que son múltiplos y los sumamos

        for (int i = firstnum; i <= lastnum ; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum = sum + i;
            }
        }

        System.out.println("El resultado de sumar los múltiplos de 3 y 5 menores de 1000 es: " + sum);


    }

}
