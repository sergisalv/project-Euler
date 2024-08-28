public class ProjectEuler4 {
    public static void main(String[] args) {
        largestPalindromeProduct();
    }

    public static void largestPalindromeProduct(){
        //Inicializamos las variables
        int num1 = 0;
        int num2 = 0;
        int product = 0;
        int palindrome = 0;

        //Itereamos el nº1 desde el 100 hasta el 999
        for (num1 = 100; num1 <= 999; num1++){

            //Itereamos el nº2
            for (num2 = 100; num2 <= 999; num2++){

                product = num1*num2;

                if(product == reverseNumber(product) && product > palindrome){
                    palindrome = product;
                }

            }

        }

        System.out.println("El mayor palíndormo hecho por el producto de 3 números de dos dígitos es: " + palindrome);

    }

    public static Integer reverseNumber(int product){
        int  invertido = 0, resto;

        while (product > 0) {
            resto = product % 10;
            invertido = invertido * 10 + resto;
            product /= 10;
        }
        return invertido;

    }


}
