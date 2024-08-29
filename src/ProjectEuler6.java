public class ProjectEuler6 {
    public static void main(String[] args) {
        solution();
    }

    //Método para calcular la raiz cuadrada
    public static int getSquare(int num){
        return num * num;
    }

    //Calculamos la suma de las raices cuadradas(vamos sumando las raices cuadradas de cada número)
    public static int sumOfTheSquare(){
        int totalSum = 0;

        for (int i = 1; i <= 100; i++){
            totalSum += getSquare(i);
        }

        return totalSum;

    }

    //Calculamos la raíz cuadrada de la suma(primero sumamos todos los números para después calcular su raíz cuadrada)
    public static int squareOfTheSum(){
        int totalSum = 0;

        for (int i= 1; i <= 100; i++){
            totalSum += i;
        }

        return getSquare(totalSum);

    }

    //Por último realizamos la resta.
    public static void solution(){
        int solution = squareOfTheSum() - sumOfTheSquare();

        System.out.println("La solucion es: " + solution);
    }
}
